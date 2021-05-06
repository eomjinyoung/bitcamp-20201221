-- 학생
DROP TABLE IF EXISTS ems_stud RESTRICT;

-- 강사
DROP TABLE IF EXISTS ems_tch RESTRICT;

-- 매니저
DROP TABLE IF EXISTS ems_mgr RESTRICT;

-- 강의
DROP TABLE IF EXISTS ems_lect RESTRICT;

-- 강의실
DROP TABLE IF EXISTS ems_room RESTRICT;

-- 회원
DROP TABLE IF EXISTS ems_memb RESTRICT;

-- 강의실사진
DROP TABLE IF EXISTS ems_room_phot RESTRICT;

-- 교육센터
DROP TABLE IF EXISTS ems_cent RESTRICT;

-- 부서
DROP TABLE IF EXISTS ems_dept RESTRICT;

-- 은행
DROP TABLE IF EXISTS ems_bank RESTRICT;

-- 주소
DROP TABLE IF EXISTS ems_addr RESTRICT;

-- 수강신청
DROP TABLE IF EXISTS ems_appl RESTRICT;

-- 강사배정
DROP TABLE IF EXISTS ems_tch_lect RESTRICT;

-- 학생
CREATE TABLE ems_stud (
  mno       INTEGER      NOT NULL COMMENT '학생번호', -- 학생번호
  work      INTEGER      NOT NULL COMMENT '재직여부', -- 재직여부
  sch_grade VARCHAR(20)  NOT NULL COMMENT '최종학력', -- 최종학력
  sch_nm    VARCHAR(50)  NOT NULL COMMENT '학교명', -- 학교명
  major     VARCHAR(50)  NOT NULL COMMENT '전공', -- 전공
  jno       INTEGER      NULL     COMMENT '주소번호', -- 주소번호
  bno       INTEGER      NULL     COMMENT '은행번호', -- 은행번호
  det_addr  VARCHAR(255) NULL     COMMENT '상세주소', -- 상세주소
  acc_no    VARCHAR(20)  NULL     COMMENT '계좌번호' -- 계좌번호
)
COMMENT '학생';

-- 학생
ALTER TABLE ems_stud
  ADD CONSTRAINT PK_ems_stud -- 학생 기본키
    PRIMARY KEY (
      mno -- 학생번호
    );

-- 학생
ALTER TABLE ems_stud
  ADD CONSTRAINT CK_ems_stud -- 학생 체크 제약
    CHECK (work = 1 or work = 0);

-- 강사
CREATE TABLE ems_tch (
  mno   INTEGER     NOT NULL COMMENT '강사번호', -- 강사번호
  type  VARCHAR(10) NOT NULL COMMENT '계약형태', -- 계약형태
  pay   INTEGER     NOT NULL COMMENT '시급', -- 시급
  major VARCHAR(50) NOT NULL COMMENT '전공' -- 전공
)
COMMENT '강사';

-- 강사
ALTER TABLE ems_tch
  ADD CONSTRAINT PK_ems_tch -- 강사 기본키
    PRIMARY KEY (
      mno -- 강사번호
    );

-- 매니저
CREATE TABLE ems_mgr (
  mno  INTEGER     NOT NULL COMMENT '매니저번호', -- 매니저번호
  dno  INTEGER     NOT NULL COMMENT '부서번호', -- 부서번호
  posi VARCHAR(50) NOT NULL COMMENT '직위' -- 직위
)
COMMENT '매니저';

-- 매니저
ALTER TABLE ems_mgr
  ADD CONSTRAINT PK_ems_mgr -- 매니저 기본키
    PRIMARY KEY (
      mno -- 매니저번호
    );

-- 강의
CREATE TABLE ems_lect (
  lno   INTEGER      NOT NULL COMMENT '강의번호', -- 강의번호
  title VARCHAR(255) NOT NULL COMMENT '강의명', -- 강의명
  cont  LONGTEXT     NOT NULL COMMENT '설명', -- 설명
  sdt   DATE         NOT NULL COMMENT '강의시작일', -- 강의시작일
  edt   DATE         NOT NULL COMMENT '강의종료일', -- 강의종료일
  capa  INTEGER      NOT NULL COMMENT '인원', -- 인원
  mgr   INTEGER      NULL     COMMENT '매니저번호', -- 매니저번호
  crno  INTEGER      NULL     COMMENT '강의실번호' -- 강의실번호
)
COMMENT '강의';

-- 강의
ALTER TABLE ems_lect
  ADD CONSTRAINT PK_ems_lect -- 강의 기본키
    PRIMARY KEY (
      lno -- 강의번호
    );

-- 강의 인덱스
CREATE INDEX IX_ems_lect
  ON ems_lect( -- 강의
    title ASC -- 강의명
  );

ALTER TABLE ems_lect
  MODIFY COLUMN lno INTEGER NOT NULL AUTO_INCREMENT COMMENT '강의번호';

-- 강의실
CREATE TABLE ems_room (
  crno   INTEGER     NOT NULL COMMENT '강의실번호', -- 강의실번호
  cno    INTEGER     NOT NULL COMMENT '교육센터번호', -- 교육센터번호
  capa   INTEGER     NOT NULL COMMENT '수용인원', -- 수용인원
  crname VARCHAR(50) NOT NULL COMMENT '강의실명' -- 강의실명
)
COMMENT '강의실';

-- 강의실
ALTER TABLE ems_room
  ADD CONSTRAINT PK_ems_room -- 강의실 기본키
    PRIMARY KEY (
      crno -- 강의실번호
    );

ALTER TABLE ems_room
  MODIFY COLUMN crno INTEGER NOT NULL AUTO_INCREMENT COMMENT '강의실번호';

-- 회원
CREATE TABLE ems_memb (
  mno   INTEGER      NOT NULL COMMENT '회원번호', -- 회원번호
  name  VARCHAR(50)  NOT NULL COMMENT '이름', -- 이름
  email VARCHAR(40)  NOT NULL COMMENT '이메일', -- 이메일
  pwd   VARCHAR(100) NOT NULL COMMENT '암호', -- 암호
  tel   VARCHAR(30)  NOT NULL COMMENT '전화', -- 전화
  jumin VARCHAR(13)  NULL     COMMENT '주민번호', -- 주민번호
  photo VARCHAR(255) NULL     COMMENT '사진' -- 사진
)
COMMENT '회원';

-- 회원
ALTER TABLE ems_memb
  ADD CONSTRAINT PK_ems_memb -- 회원 기본키
    PRIMARY KEY (
      mno -- 회원번호
    );

-- 회원 유니크 인덱스
CREATE UNIQUE INDEX UIX_ems_memb
  ON ems_memb ( -- 회원
    jumin ASC -- 주민번호
  );

-- 회원 유니크 인덱스2
CREATE UNIQUE INDEX UIX_ems_memb2
  ON ems_memb ( -- 회원
    email ASC -- 이메일
  );

-- 회원 인덱스
CREATE INDEX IX_ems_memb
  ON ems_memb( -- 회원
    name ASC -- 이름
  );

ALTER TABLE ems_memb
  MODIFY COLUMN mno INTEGER NOT NULL AUTO_INCREMENT COMMENT '회원번호';

-- 강의실사진
CREATE TABLE ems_room_phot (
  pno   INTEGER      NOT NULL COMMENT '사진번호', -- 사진번호
  crno  INTEGER      NOT NULL COMMENT '강의실번호', -- 강의실번호
  photo VARCHAR(255) NOT NULL COMMENT '사진' -- 사진
)
COMMENT '강의실사진';

-- 강의실사진
ALTER TABLE ems_room_phot
  ADD CONSTRAINT PK_ems_room_phot -- 강의실사진 기본키
    PRIMARY KEY (
      pno -- 사진번호
    );

ALTER TABLE ems_room_phot
  MODIFY COLUMN pno INTEGER NOT NULL AUTO_INCREMENT COMMENT '사진번호';

-- 교육센터
CREATE TABLE ems_cent (
  cno   INTEGER     NOT NULL COMMENT '교육센터번호', -- 교육센터번호
  cname VARCHAR(50) NOT NULL COMMENT '센터명' -- 센터명
)
COMMENT '교육센터';

-- 교육센터
ALTER TABLE ems_cent
  ADD CONSTRAINT PK_ems_cent -- 교육센터 기본키
    PRIMARY KEY (
      cno -- 교육센터번호
    );

ALTER TABLE ems_cent
  MODIFY COLUMN cno INTEGER NOT NULL AUTO_INCREMENT COMMENT '교육센터번호';

-- 부서
CREATE TABLE ems_dept (
  dno   INTEGER     NOT NULL COMMENT '부서번호', -- 부서번호
  dname VARCHAR(50) NOT NULL COMMENT '부서명' -- 부서명
)
COMMENT '부서';

-- 부서
ALTER TABLE ems_dept
  ADD CONSTRAINT PK_ems_dept -- 부서 기본키
    PRIMARY KEY (
      dno -- 부서번호
    );

ALTER TABLE ems_dept
  MODIFY COLUMN dno INTEGER NOT NULL AUTO_INCREMENT COMMENT '부서번호';

-- 은행
CREATE TABLE ems_bank (
  bno   INTEGER     NOT NULL COMMENT '은행번호', -- 은행번호
  bname VARCHAR(50) NOT NULL COMMENT '은행' -- 은행
)
COMMENT '은행';

-- 은행
ALTER TABLE ems_bank
  ADD CONSTRAINT PK_ems_bank -- 은행 기본키
    PRIMARY KEY (
      bno -- 은행번호
    );

ALTER TABLE ems_bank
  MODIFY COLUMN bno INTEGER NOT NULL AUTO_INCREMENT COMMENT '은행번호';

-- 주소
CREATE TABLE ems_addr (
  jno      INTEGER      NOT NULL COMMENT '주소번호', -- 주소번호
  pst_no   VARCHAR(7)   NOT NULL COMMENT '우편번호', -- 우편번호
  bas_addr VARCHAR(255) NOT NULL COMMENT '기본주소' -- 기본주소
)
COMMENT '주소';

-- 주소
ALTER TABLE ems_addr
  ADD CONSTRAINT PK_ems_addr -- 주소 기본키
    PRIMARY KEY (
      jno -- 주소번호
    );

ALTER TABLE ems_addr
  MODIFY COLUMN jno INTEGER NOT NULL AUTO_INCREMENT COMMENT '주소번호';

-- 수강신청
CREATE TABLE ems_appl (
  mno  INTEGER     NOT NULL COMMENT '학생번호', -- 학생번호
  lno  INTEGER     NOT NULL COMMENT '강의번호', -- 강의번호
  rdt  DATETIME    NOT NULL DEFAULT now() COMMENT '수강신청일', -- 수강신청일
  stat VARCHAR(10) NULL     COMMENT '상태' -- 상태
)
COMMENT '수강신청';

-- 수강신청
ALTER TABLE ems_appl
  ADD CONSTRAINT PK_ems_appl -- 수강신청 기본키
    PRIMARY KEY (
      mno, -- 학생번호
      lno  -- 강의번호
    );

-- 강사배정
CREATE TABLE ems_tch_lect (
  mno INTEGER NOT NULL COMMENT '강사번호', -- 강사번호
  lno INTEGER NOT NULL COMMENT '강의번호' -- 강의번호
)
COMMENT '강사배정';

-- 강사배정
ALTER TABLE ems_tch_lect
  ADD CONSTRAINT PK_ems_tch_lect -- 강사배정 기본키
    PRIMARY KEY (
      mno, -- 강사번호
      lno  -- 강의번호
    );

-- 학생
ALTER TABLE ems_stud
  ADD CONSTRAINT FK_ems_memb_TO_ems_stud -- 회원 -> 학생
    FOREIGN KEY (
      mno -- 학생번호
    )
    REFERENCES ems_memb ( -- 회원
      mno -- 회원번호
    );

-- 학생
ALTER TABLE ems_stud
  ADD CONSTRAINT FK_ems_bank_TO_ems_stud -- 은행 -> 학생
    FOREIGN KEY (
      bno -- 은행번호
    )
    REFERENCES ems_bank ( -- 은행
      bno -- 은행번호
    );

-- 학생
ALTER TABLE ems_stud
  ADD CONSTRAINT FK_ems_addr_TO_ems_stud -- 주소 -> 학생
    FOREIGN KEY (
      jno -- 주소번호
    )
    REFERENCES ems_addr ( -- 주소
      jno -- 주소번호
    );

-- 강사
ALTER TABLE ems_tch
  ADD CONSTRAINT FK_ems_memb_TO_ems_tch -- 회원 -> 강사
    FOREIGN KEY (
      mno -- 강사번호
    )
    REFERENCES ems_memb ( -- 회원
      mno -- 회원번호
    );

-- 매니저
ALTER TABLE ems_mgr
  ADD CONSTRAINT FK_ems_memb_TO_ems_mgr -- 회원 -> 매니저
    FOREIGN KEY (
      mno -- 매니저번호
    )
    REFERENCES ems_memb ( -- 회원
      mno -- 회원번호
    );

-- 매니저
ALTER TABLE ems_mgr
  ADD CONSTRAINT FK_ems_dept_TO_ems_mgr -- 부서 -> 매니저
    FOREIGN KEY (
      dno -- 부서번호
    )
    REFERENCES ems_dept ( -- 부서
      dno -- 부서번호
    );

-- 강의
ALTER TABLE ems_lect
  ADD CONSTRAINT FK_ems_mgr_TO_ems_lect -- 매니저 -> 강의
    FOREIGN KEY (
      mgr -- 매니저번호
    )
    REFERENCES ems_mgr ( -- 매니저
      mno -- 매니저번호
    );

-- 강의
ALTER TABLE ems_lect
  ADD CONSTRAINT FK_ems_room_TO_ems_lect -- 강의실 -> 강의
    FOREIGN KEY (
      crno -- 강의실번호
    )
    REFERENCES ems_room ( -- 강의실
      crno -- 강의실번호
    );

-- 강의실
ALTER TABLE ems_room
  ADD CONSTRAINT FK_ems_cent_TO_ems_room -- 교육센터 -> 강의실
    FOREIGN KEY (
      cno -- 교육센터번호
    )
    REFERENCES ems_cent ( -- 교육센터
      cno -- 교육센터번호
    );

-- 강의실사진
ALTER TABLE ems_room_phot
  ADD CONSTRAINT FK_ems_room_TO_ems_room_phot -- 강의실 -> 강의실사진
    FOREIGN KEY (
      crno -- 강의실번호
    )
    REFERENCES ems_room ( -- 강의실
      crno -- 강의실번호
    );

-- 수강신청
ALTER TABLE ems_appl
  ADD CONSTRAINT FK_ems_stud_TO_ems_appl -- 학생 -> 수강신청
    FOREIGN KEY (
      mno -- 학생번호
    )
    REFERENCES ems_stud ( -- 학생
      mno -- 학생번호
    );

-- 수강신청
ALTER TABLE ems_appl
  ADD CONSTRAINT FK_ems_lect_TO_ems_appl -- 강의 -> 수강신청
    FOREIGN KEY (
      lno -- 강의번호
    )
    REFERENCES ems_lect ( -- 강의
      lno -- 강의번호
    );

-- 강사배정
ALTER TABLE ems_tch_lect
  ADD CONSTRAINT FK_ems_tch_TO_ems_tch_lect -- 강사 -> 강사배정
    FOREIGN KEY (
      mno -- 강사번호
    )
    REFERENCES ems_tch ( -- 강사
      mno -- 강사번호
    );

-- 강사배정
ALTER TABLE ems_tch_lect
  ADD CONSTRAINT FK_ems_lect_TO_ems_tch_lect -- 강의 -> 강사배정
    FOREIGN KEY (
      lno -- 강의번호
    )
    REFERENCES ems_lect ( -- 강의
      lno -- 강의번호
    );