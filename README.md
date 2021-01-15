# bitcamp-20201221

## 원격 Git 서버의 저장소 복제하기

```
> git clone https://github.com/eomjinyoung/bitcamp-20201221.git
```

## 작업 파일을 로컬 저장소에 백업하기

백업 명단 작성
```
> git add .
```

로컬 저장소에 백업
```
> git commit -m "백업에 대한 간단한 내용"
```

## 로컬 저장소의 변경된 내용을 서버 저장소에 업로드 하기

```
> git push
```

## 깃 서버 저장소의 변경된 내용을 깃 로컬 저장소에 다운로드 하기

```
> git pull
```

## 1일차(2020-12-21,월) ~ 8일차(2020-12-31,목)

- 자바 프로그래밍 오리엔테이션

## 9일차(2021-01-04,월)

- 수업에서 사용할 git 저장소 준비
    - github.com 에 개인 저장소 생성
        - 회원가입
        - bitcamp-study 저장소 생성
    - 로컬에 복제
        - c:/Users/사용자홈폴더/git/bitcamp-study 
    - 강의 자료 저장소 복제
        - github.com/eomcs/eomcs-docs : DB 설치, 개발 도구 사용법 등
        - github.com/eomcs/eomcs-java : 자바 프로그래밍 기본 예제
        - github.com/eomcs/eomcs-java-web : 서블릿/JSP 프로그래밍 예제
        - github.com/eomcs/eomcs-spring-webmvc : Spring WebMVC 예제
        - github.com/eomcs/eomcs-java-project-2020 : 실습 프로젝트
        - github.com/eomcs/eomcs-java-project-2021 : 실습 프로젝트
- 프로그래밍에 대한 소개
    - 컴퓨터(CPU, RAM, HDD 등) + OS + 프로그램 개념

- 학습 목표 달성 확인 목록
    - [] 서버 컴퓨터와 서버 프로그램의 관계를 이해하는가?
    - [] 서버 프로그램과 데스크톱 프로그램을 구분할 수 있는가?
    - [] 클라이언트 프로그램이 무엇인지 이해하고 있는가?
    - [] 클라이언트/서버 구조로 된 애플리케이션의 예를 들 수 있는가?
    - [] git 클라이언트 프로그램을 설치할 수 있는가?
    - [] macOS 패키지 관리자 프로그램인 HomeBrew 를 설치할 수 있는가?
    - [] HomeBrew 패키지 관리자를 통해 git 프로그램을 설치할 수 있는가?
    - [] github.com에서 깃 저장소를 생성할 수 있는가?
    - [] git 서버의 저장소를 로컬로 복제할 수 있는가?
    - [] 로컬에서 작업한 파일을 로컬 깃 저장소에 백업할 수 있는가?
    - [] 로컬 깃 저장소에 백업한 내용을 깃 서버의 저장소에 업로드 할 수 있는가?
    - [] 컴퓨터에서 CPU와 RAM, HDD 의 관계 및 역할을 이해하고 있는가?
    - [] OS의 역할을 대략적으로 이해하는가?
    - [] 명령어를 작성할 때 CPU에 맞춰서 작성해야 하고 또한 OS에 맞춰서 명령어를 구성해야 하는 이유를 설명할 수 있는가?
    - [] 명령어를 작성할 때 컴파일러의 역할은 무엇인가?
    - [] 컴파일러가 OS와 CPU에 따라 구분되는 이유를 아는가?
    - [] 자바 컴파일러가 들어 있는 JDK를 설치할 때 OS와 CPU에 따라 구분해야 하는 이유를 아는가?
    - [] 자바 컴파일러와 JVM의 역할을 설명할 수 있는가?
    - [] 소스(source)와 바이트코드(bytecode)를 설명할 수 있는가?
    - [] 자바 컴파일러를 사용하여 소스 파일을 컴파일 할 수 있는가?
    - [] JVM을 사용하여 바이트코드를 실행할 수 있는가?
    - [] 컴파일 방식과 인터프리터 방식의 차이점과 장단점을 이해하는가?
    - [] 자바는 하이브리드 방식으로 프로그램을 개발하고 실행한다. 하이브리드 방식을 설명할 수 있는가?
    
## 10일차(2021-01-05,화)

- 컴파일 방식 프로그래밍 경험
    - GCC 컴파일러(MinGW) 설치
    - hello.c 소스 작성
    - 컴파일 및 실행
- 인터프리터 방식 프로그래밍 경험
    - Nodejs 설치
    - Hello.js 소스 작성
    - 인터프리터 실행
- JDK와 JRE, JavaSE, JavaEE, JavaME 소개
    - Hello.java 소스 작성
    - 컴파일 및 JVM 실행
- JDK 및 Eclipse IDE 설치 및 설정


- 학습 목표 달성 확인 목록
    - [] 컴파일 방식과, 인터프리터 방식, 하이브리드 방식의 특징을 설명할 수 있는가?
    - [] 컴파일/인터프리터/하이브리드 방식의 예제를 작성하고 실행시킬 수 있는가?
    - [] GUI와 CLI가 무엇인지 알고 있다.
    - [] OS에서 shell 과 Shell Script 의 관계를 이해한다.
    - [] 윈도우 OS에서 '명령프롬프트'와 '파워쉘'의 차이점을 이해한다.
    - [] 해시 값/디지털 지문이 무엇인지 알고 있다.
    - [] 알고리즘의 뜻을 말할 수 있다.
    - [] MD5, SHA-1, SHA256, SHA512, PGP 등이 무엇을 의미하는지 알고 있다.
    - [] Windows/macOS 에서 명령어를 사용하여 해시 코드를 알아 낼 수 있다.
    - [] JDK를 설치하고 환경 변수(JAVA_HOME, PATH)를 설정할 수 있는가?
    - [] Java IDE(Integrated Development Environment, 예: Eclipse)를 설치하고 설정할 수 있는가?


## 11일차(2021-01-06,수)

- 바이트코드 프로그래밍 
    - 직접 바이트코드를 작성해보기
    - 자바 언어를 이용한 프로그래밍의 이점을 이해하기
    - sublime 에디터 설치
    - HelloWorld.class 작성하기
    - https://medium.com/@davethomas_9528/writing-hello-world-in-java-byte-code-34f75428e0ad
- 학습 목표 달성 확인 목록
    - [] bytecode(portable code, p-code) 가 무엇인지 이해하는가?
    - [] 바이트코드를 직접 작성하는 것보다 소스 파일을 작성해서 컴파일하는 것이 낫다는 것을 이해하는가?
    - [] 빌드 도구가 무슨 일을 하는지 알고 있는가?
    - [] 대표적인 자바 빌드 도구의 종류를 말할 수 있는가? 
    - [] 각 빌드 도구의 설정 파일을 구분할 수 있는가?
    - [] 중간 언어를 이용하는 vm 방식과 LLVM 방식의 특징을 이해하는가? 

## 12일차(2021-01-07,목)

- 자바 언어 기초(com.eomcs.lang)
    - ex01 ~ ex03 예제 
- Gradle 빌드 도구 설치
    - gradle.org 사이트에서 다운로드 후 설치 및 설정
    - .gitignore 파일 추가
- 이클립스로 프로젝트 임포트
    
- 학습 목표 달성 확인 목록
    - [] 자바 소스 파일과 class {} 블록, 컴파일러의 관계를 이해하는가?
    - [] 공개 클래스와 디폴트 클래스, 소스 파일명의 관계를 이해하는가?
    - [] 자바 패키지의 목적을 이해하는가?
    - [] 패키지에 소속된 클래스를 정의할 수 있는가?
    - [] 패키지에 소속된 클래스와 무소속 클래스를 컴파일하면 어떻게 되는지 알고 있는가?
    - [] 패키지에 소속된 클래스를 JVM으로 실행할 수 있는가?
    - [] 일반 주석과 javadoc 주석, 애노테이션의 용도를 이해하는가?
    - [] javadoc 프로그램을 사용하여 API 문서를 생성할 수 있는가?
    - [] 메모리와 비트, 2진수의 관계를 이해하는가?
    - [] 비트 크기에 따라 저장할 수 있는 수의 범위를 계산할 수 있는가?
    - [] 메모리에 정수 값을 저장할 때 음수를 어떻게 저장하는지 알고 있는가?
    - [] 2의 보수가 무엇인지 아는가? 2의 보수를 사용하여 양수를 음수로 바꿀 수 있는가?
    - [] 자바 언어에서 정수 리터럴을 4바이트와 8바이트로 구분하여 표현할 수 있는가?
    - [] Gradle 빌드 도구를 설치하고 실행할 수 있는가?
    - [] build.gradle 설정 파일을 작성하고, 플러그인 추가/라이브러리 등록 을 할 수 있는가?
    - [] Gradle을 이용하여 이클립스 설정 파일을 생성할 수 있는가?
    - [] 이클립스에서 프로젝트를 임포트 할 수 있는가? 
    - [] .gitignore 파일의 용도를 알고 있는가?

## 13일차(2021-01-08,금)

- 자바 언어 기초(com.eomcs.lang)
    - ex03 예제 : 리터럴 사용법
    - 정수/부동소수점/문자를 2진수로 표현하는 방법
- 학습 목표 달성 확인 목록
    - [] 정수를 2진수로 표현할 때 Sign-Magnitude, 1의 보수, 2의 보수, Excess-K 각각의  방식으로 표현할 수 있는가?
    - [] 정수를 저장할 때 Sign-Magnitude 가 아닌 2의 보수 방식으로 저장하는 이유를 아는가?
    - [] 값을 2진수로 표현하는 이유는 무엇인가?
    - [] 정수 말고, 2진수로 표현하는 다른 종류의 값을 말할 수 있는가?
    - [] 부동소수점을 리터럴로 표현할 수 있는가?
    - [] 부동소수점을 메모리 크기에 따라 4바이트, 8바이트 리터럴로 구분하여 표현할 수 있는가?
    - [] 부동소수점을 2진수로 표현할 수 있는가?
    - [] 부동소수점의 범위를 유효자릿수로 표현하는 이유를 아는가?
    - [] 4바이트 부동소수점과 8바이트 부동소수점의 유효자릿수는 무엇인가?
    - [] 문자의 2진수 표현을 정의한 것을 무엇이라 부르는가?
    - [] character set의 다양한 종류(ASCII,ISO-8859-1,EUC-KR,조합형,MS949,Unicode,UTF-8,UTF16)와 그 특징을 설명할 수 있는가?
    - [] 자바에서는 UTF-16BE(UCS2)을 기본 character set으로 사용한다는 것을 아는가?


## 14일차(2021-01-11,월)

- 자바 언어 기초(com.eomcs.lang)
    - ex04 예제: 변수 사용법
    - 자바 컴파일러와 JVM에서 Character Set을 다루는 과정
    - 인코딩과 디코딩 개념
    - JVM에서 문자를 출력하는 과정과 폰트의 사용
    - 폰트 및 그림의 래스터 방식과 벡터 방식의 개념
    - 자바에서 문자를 코드화 해서 다루는 방법
    - 변수의 개념과 변수를 선언하는 방법
    - 정수, 부동소수점, 논리, 문자 등 자바 원시 타입 변수를 사용하는 방법
    - 레퍼런스 변수와 자바 원시 타입 변수의 차이점
    - 배열 다루는 방법
    - 인스턴스와 가비지 개념
- 학습 목표 달성 확인 목록
    - [] 컴파일 할 때 -encoding 옵션을 붙여야 하는 경우와 그 이유를 아는가?
    - [] 인코딩과 디코딩을 설명할 수 있는가?
    - [] 폰트가 무엇이고 언제 사용되는지 알고 있는가?
    - [] 래스터 방식 폰트와 벡터 방식 폰트의 구동 원리를 설명할 수 있는가?
    - [] JVM에서 문자를 다루는 방식을 아는가?
    - [] 변수가 무엇인지 설명할 수 있는가? 
    - [] 변수 선언이 무엇인지 설명할 수 있는가?
    - [] 데이터타입과 변수의 관계를 이해하는가?
    - [] 자바 원시 타입의 변수를 선언하고 값을 할당할 수 있는가?
    - [] 자바 원시 타입 변수와 레퍼런스 변수의 차이점을 이해하는가?
    - [] 배열을 생성하고 배열의 각 항목의 값을 다룰 수 있는가?
    - [] 배열을 이용하여 인스턴스와 가비지를 설명할 수 있는가?

## 15일차(2021-01-12,화)

- Application Architecture 소개
    - 애플리케이션 아키텍처의 시대 별 변화 과정
    - 각 아키텍처의 특징과 단점, 그리고 해결책
- SCM(Software Configuration Management) 의 개념
    - 형상 관리 시스템(=버전 관리 시스템) 소개
    - CSV, Subversion, Git 의 차이점 
- 실습 프로젝트 : mini-pms(프로젝트 관리 시스템)
    - 1-a 단계: 자바 프로젝트 폴더 준비
        - gradle 빌드 도구를 사용한다.
        - Maven 빌드 도구의 표준 디렉토리 구조로 프로젝트 폴더를 구성한다.
    - 1-b 단계: 프로젝트를 이클립스 IDE로 임포트 하기
        - build.gradle 파일을 편집한다.
        - `eclipse` 그래이들 플러그인 추가
        - `$ gradle eclipse` 명령을 실행하여 이클립스 IDE 관련 설정 파일을 준비한다.
        - 이클립스에서 프로젝트를 임포트 한다.
    - 1-c 단계: 프로젝트에 버전 관리 시스템 Git을 적용하기
        - `$ git init` 실행 
- 학습 목표 달성 확인 목록
    - [] 시스템 소프트웨어와 애플리케이션 소프트웨어를 설명할 수 있는가?
    - [] 애플리케이션 아키텍처의 종류와 특징을 설명할 수 있는가?
    - [] gradle 빌드 도구를 사용하여 자바 애플리케이션 프로젝트를 구성할 수 있는가?
    - [] gradle을 사용하여 애플리케이션을 실행(run)하고 빌드(build) 할 수 있는가?
    - [] gradle을 사용하여 Eclipse IDE 프로젝트로 전환할 수 있는가?
    - [] 형상 관리 시스템이 무엇인지 알고 있는가?
    - [] CSV, Subversion, Git 버전 관리 시스템의 차이점 이해하고 있는가?
    - [] 프로젝트를 git 저장소로 설정할 수 있는가? 

## 16일차(2021-01-13,수)

- JIT, AOT 컴파일러 소개
- 자바 언어 기초(com.eomcs.lang)
    - ex99 예제: 콘솔 출력 및 키보드 입력을 다루는 방법
    - print(), println(), printf() 사용법
    - Scanner 객체 사용법 
- 실습 프로젝트 : mini-pms(프로젝트 관리 시스템)
    - 1-c 단계: 프로젝트에 버전 관리 시스템 Git을 적용하기(계속)
        - `$ git init` 실행 
        - `.git/` 폴더의 용도 이해
        - github.com 에 저장소 생성
        - 로컬 저장소와 원격 저장소를 연결
        - 로컬 저장소의 변경 내용을 원격 저장소에 업로드
    - 2 단계: 리터럴과 콘솔 출력 다루기
        - `System.out.print()` 사용
        - `System.out.println()` 사용
        - `System.out.printf()` 사용
        - 문자열 리터럴의 연결
    - 3 단계: 변수와 키보드 입력 다루기
        - `Scanner` 객체를 사용하여 키보드 입력 다루기
- 학습 목표 달성 확인 목록
    - [] `.git/` 폴더가 무슨 용도인지 알고 있는가? 
    - [] git 을 이용하여 로컬 저장소에 변경한 내용을 백업할 수 있는가?
    - [] git 로컬 저장소를 원격 저장소와 연결할 수 있는가?
    - [] git 로컬 저장소의 변경 사항을 원격 저장소에 업로드 할 수 있는가?
    - [] 문자열 리터럴을 다룰 수 있는가?
    - [] print(), println(), printf() 메서드를 사용할 수 있는가?
    - [] Scanner 객체를 사용하여 키보드 입력을 다룰 수 있는가?
    - [] C, C++, Java를 비교하여 특징을 간략히 설명할 수 있는가?
    - [] function, class 문법이 등장한 이유를 이해하는가?
    
## 17일차(2021-01-14,목)

- 자바 언어 기초(com.eomcs.lang)
    - ex05 : 연산자 사용법
- 실습 프로젝트 : mini-pms(프로젝트 관리 시스템)
    -  3 단계: 변수와 키보드 입력 다루기 (해설)
- 학습 목표 달성 확인 목록
    - [] 자바에서 제공하는 연산자를 사용할 수 있는가?
    - [] 정수 연산에서 최소 연산 단위가 int임을 이해하는가?
    - [] 연산 우선 순위를 이해하는가?
    - [] 연산은 같은 타입이어야만 수행할 수 있다는 것을 아는가?
    - [] 연산의 결과는 피연산자의 타입과 같다는 것을 아는가?
    - [] 암시적 형변환을 설명할 수 있는가?
    - [] 명시적 형변환을 사용할 수 있는가?
    - [] 부동소수점의 값을 비교할 때 극소수의 값을 고려해야 함을 이해하는가?
    - [] 관계 연산자(>, >=, <, <=, ==, !=)를 다룰 수 있는가?
    - [] 부동소수점의 값을 비교할 때 주의할 사항이 무엇인가?
    - [] 논리 연산자(&&,||,!,^,&,|)를 다룰 수 있는가?
    - [] &&와 &, ||와 | 논리 연산자의 차이점을 아는가?
    - [] 비트 연산자(&,|,^,~)를 다룰 수 있는가?
    - [] 비트 연산자로 % 연산을 수행하는 방법을 아는가?
    - [] 비트 연산자를 활용하여 특정 값만 추출하는 방법을 아는가?
    - [] 비트 연산자를 활용하여 여러 개의 true/false 값을 한 변수에서 다룰 수 있는가?
    - [] 비트 이동 연산자(<<, >>, >>>)를 다룰 수 있는가?
    - [] 비트 이동 연산자를 사용하여 2의 배수를 곱하고 나누는 방법을 아는가?
    - [] 조건 연산자(?:)를 다룰 수 있는가?
    - [] ++/-- 후위 연산자 및 전위 연산자를 다룰 수 있는가?
    - [] 복합 할당 연산자(+=, -=, *=, /=, %= 등)를 다룰 수 있는가?
 
## 18일차(2021-01-15,금)

- 자바 언어 기초(com.eomcs.lang)
    - ex06 : 명령어의 실행 흐름을 제어하는 방법
- 실습 프로젝트 : mini-pms(프로젝트 관리 시스템)
    -  4 단계: 배열과 흐름 제어문 활용하기
    -  5 단계: 프로그램의 시작점(entry point), `main()`
- 학습 목표 달성 확인 목록
    - [] if, if ~ else 문을 사용하여 조건에 따라 흐름을 제어할 수 있는가?
    - [] while, do ~ while, for(;;), for(:) 문을 사용하여 반복 작업을 처리할 수 있는가?
    - [] 프로그램의 엔트리 포인트가 무슨 의미인지 알고 있는가?

## 19일차(2021-01-18,월)

- 자바 언어 기초(com.eomcs.lang)
    - ex07 : 메서드를 활용하여 명령을 기능 단위로 분리하는 방법
- 실습 프로젝트 : mini-pms(프로젝트 관리 시스템)
    -  6 단계: 메서드의 존재 이유
- 학습 목표 달성 확인 목록    

