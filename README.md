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
    - 3 단계: 변수와 키보드 입력 다루기 (해설)
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
    - 4 단계: 배열과 흐름 제어문 활용하기
    - 5 단계: 프로그램의 시작점(entry point), `main()`
- 학습 목표 달성 확인 목록
    - [] if, if ~ else 문을 사용하여 조건에 따라 흐름을 제어할 수 있는가?
    - [] while, do ~ while, for(;;), for(:) 문을 사용하여 반복 작업을 처리할 수 있는가?
    - [] 프로그램의 엔트리 포인트가 무슨 의미인지 알고 있는가?

## 19일차(2021-01-18,월)

- 자바 언어 기초(com.eomcs.lang)
    - ex07 : 메서드를 활용하여 명령을 기능 단위로 분리하는 방법
- 실습 프로젝트 : mini-pms(프로젝트 관리 시스템)
    - 6 단계: 메서드의 존재 이유
- 학습 목표 달성 확인 목록
    - [] 환경 변수 JAVA_HOME과 PATH를 설정하고 그 용도를 설명할 수 있는가?
    - [] gradle 설정을 통하여 이클립스 프로젝트 이름을 변경할 수 있는가?
    - [] 메서드를 정의할 수 있는가?
    - [] 정의한 메서드를 사용할 수 있는가?
    - [] 메서드 시그너처, 메서드 바디, 파라미터, 아규먼트 용어를 설명할 수 있는가?
    - [] 메서드 문법을 사용했을 때 이점은 무엇인가?
    - [] 리팩토링의 의미가 무엇인지 아는가?
        - 코드를 묶거나 쪼개서 유지보수 하기 좋은 구조로 소스 코드를 정리하는 것!

## 20일차(2021-01-19,화)

- 자바 언어 기초(com.eomcs.lang)
    - ex07 : 메서드를 활용하여 명령을 기능 단위로 분리하는 방법(계속)
- 실습 프로젝트 : mini-pms(프로젝트 관리 시스템)
    - 6 단계: 메서드의 존재 이유(계속)
    - 7 단계: 클래스로 메서드를 분류하기
- 학습 목표 달성 확인 목록
    - [] 메서드를 정의하고 사용할 수 있는가?
    - [] 파라미터와 아규먼트에 대해 설명할 수 있는가?
    - [] call by value 와 call by reference에 대해 예제를 들어 설명할 수 있는가?
    - [] 클래스 문법의 용도를 설명할 수 있는가?
    - [] 역할에 따라 메서드를 분류하여 클래스로 정의할 수 있는가?
    - [] 클래스에 등록된 메서드를 호출할 수 있는가?

## 21일차(2021-01-20,수)

- 자바 언어 기초(com.eomcs.lang)
    - ex07 : 메서드를 활용하여 명령을 기능 단위로 분리하는 방법(보류)
- 실습 프로젝트 : mini-pms(프로젝트 관리 시스템)
    - 7 단계: 클래스로 메서드를 분류하기(계속)
    - 8 단계: 클래스를 이용하여 새 데이터 타입 정의하기
    - 9 단계: 패키지로 클래스를 분류하기
- 학습 목표 달성 확인 목록
    - [] 클래스 문법을 이용하여 새 데이터 타입을 정의할 수 있는가?
    - [] 클래스로 데이터 타입을 정의하여 사용할 때 이점은 무엇인가?
    - [] 인스턴스와 레퍼런스 개념을 이해하는가?
    - [] 클래스의 인스턴스를 생성할 수 있는가?
    - [] 레퍼런스 배열을 생성하고 다룰 수 있는가?
    - [] 인스턴스를 레퍼런스 배열로 다룰 수 있는가?

## 22일차(2021-01-21,목)

- 자바 언어 기초(com.eomcs.lang)
    - ex07 : 메서드를 활용하여 명령을 기능 단위로 분리하는 방법(보류)
- 실습 프로젝트 : mini-pms(프로젝트 관리 시스템)
    - 10 단계: 다른 클래스와 관계 맺기 : 의존 관계
    - 11 단계: 클래스 필드와 클래스 메서드의 한계
- 학습 목표 달성 확인 목록
    - [] UML이 무엇이고 어떤 용도로 사용하는지 아는가?
    - [] 의존 객체(dependency)가 무엇인지 이해하는가?
    - [] GRASP 패턴이 무엇인지 아는가?
    - [] Information Expert 패턴에 대해 이해하는가?
    - [] domain, vo(value object), dto(data transfer object) 클래스의 의미를 이해하는가? 
    - [] 스태틱 필드의 사용 범위와 그 한계를 이해하는가?
    - [] '기술 부채'가 무엇인지 설명할 수 있는가?

## 23일차(2021-01-22,금)

- 자바 언어 기초(com.eomcs.lang)
    - ex07 : 메서드를 활용하여 명령을 기능 단위로 분리하는 방법(보류)
- 실습 프로젝트 : mini-pms(프로젝트 관리 시스템)
    - 12-a 단계: 인스턴스 필드와 인스턴스 메서드가 필요한 이유 : 인스턴스 필드 사용법
    - 12-b 단계: 인스턴스 필드와 인스턴스 메서드가 필요한 이유 : Information Expert 디자인 패턴
    - 12-c 단계: 인스턴스 필드와 인스턴스 메서드가 필요한 이유 : 인스턴스 메서드 도입
- 학습 목표 달성 확인 목록
    - [] 클래스 로딩이 무엇인지 설명할 수 있는가?
    - [] 스태틱 필드와 인스턴스 필드의 생성 시점을 이해하는가?
    - [] Method Area와 Heap, Stack 메모리 영역의 쓰임새를 이해하는가?
    - [] 가비지가 무엇인지 설명할 수 있는가?
    - [] 스태틱 필드의 쓰임새를 아는가?
    - [] 인스턴스 필드의 쓰임새를 아는가?
    - [] 인스턴스 메서드의 쓰임새를 아는가?
    - [] 인스턴스 메서드의 내장 변수인 this를 설명할 수 있는가?

## 24일차(2021-01-25,월)

- 자바 언어 기초(com.eomcs.lang)
    - ex07 : 메서드를 활용하여 명령을 기능 단위로 분리하는 방법(완료)
- 객체지향 문법(com.eomcs.oop)
    - ex01 : 레퍼런스와 인스턴스, 가비지, 가비지 컬렉터 등
    - ex02 : 스태틱 필드/메서드와, 인스턴스 필드/메서드 사용법
    - ex03 : 인스턴스 메서드의 this 내장 변수 용도(Exam0320 까지) 
- 실습 프로젝트 : mini-pms(프로젝트 관리 시스템)
    - 13-a 단계: 의존 객체 주입 : 인스턴스 필드 활용
- 학습 목표 달성 확인 목록
    - [] 가비지의 의미를 알고 있는가?
    - [] 레퍼런스 카운트란 무엇인가?
    - [] 가비지 컬렉터는 무엇인지 알고 있는가?
    - [] 가비지 컬렉터가 실행되는 경우는 언제인가?
    - [] System.gc() 메서드는 무슨 일을 하는가?
    - [] 다섯 가지 객체 관계를 이해하고 UML로 표현할 수 있는가?
    - [] 의존 객체를 설명할 수 있는가?

## 25일차(2021-01-26,화)

- 객체지향 문법(com.eomcs.oop)
    - ex03 : 인스턴스 메서드의 this 내장 변수 용도(Exam0410 부터) 
- 실습 프로젝트 : mini-pms(프로젝트 관리 시스템)
    - 13-b 단계: 의존 객체 주입 : 생성자 활용
- 학습 목표 달성 확인 목록
    - [] 생성자 문법의 용도를 설명할 수 있는가?
    - [] 생성자를 이용하여 인스턴스 필드를 초기화시킬 수 있는가?
    - [] this() 의 용법을 아는가?
    - [] 스태틱 변수 초기화 문장을 사용할 수 있는가?
    - [] 스태틱 블록을 이용하여 스태틱 변수를 초기화시킬 수 있는가?
    - [] 스태틱 블록이 여러 개일 경우 컴파일러가 어떻게 다루는지 아는가?
    - [] 스태틱 변수 초기화 문장이 컴파일되면 어떻게 바뀌는지 아는가?
    - [] 클래스 로딩할 때 어떻게 초기화 과정이 어떻게 진행되는지 이해하는가?
    - [] 인스턴스 블록을 이용하여 인스턴스 변수를 초기화시킬 수 있는가?
    - [] 인스턴스 블록이 컴파일되면 어떻게 바뀌는지 아는가?
    - [] 인스턴스 변수 초기화 문장이 컴파일되면 어떻게 바뀌는지 아는가?
    - [] 인스턴스 블록의 용도를 아는가?

## 26일차(2021-01-27,수)

- 객체지향 문법(com.eomcs.oop)
    - ex04 : 다양한 클래스의 생성자 활용 
- 실습 프로젝트 : mini-pms(프로젝트 관리 시스템)
    - 14 단계: CRUD(Create, Retrieve/Read, Update, Delete) 구현
- 과제 : 개인 프로젝트 중간 발표
- 학습 목표 달성 확인 목록
    - [] JVM의 file.encoding 프로퍼티의 용도를 알고 있는가?
    - [] file.encoding 프로퍼티를 설정하지 않으면 기본 character set 은 무엇인가?
    - [] 클래스 멤버 @Deprecated 애노테이션이 붙은 경우 무엇을 의미하는지 아는가? 
    - [] 생성자의 접근 범위가 private이나 protected 으로 막혔을 때 그 의미를 이해하는가?
    - [] 인스턴스 메서드와 스태틱 메서드의 용도를 이해했는가?
    - [] 상수를 사용하는 이점과 용법을 알고 있는가?
    - [] 배열을 활용하여 생성된 객체(의 주소)를 등록하고, 조회하고, 변경하고, 삭제할 수 있는가?


## 27일차(2021-01-28,목)

- 실습 프로젝트 : mini-pms(프로젝트 관리 시스템)
    - 14 단계: CRUD(Create, Retrieve/Read, Update, Delete) 구현(계속)
    - 14-x 단계: CRUD(Create, Retrieve/Read, Update, Delete) 구현 - 메뉴 다루기와 역할 분담
- 과제 : 개인 프로젝트 중간 발표(계속)
- 학습 목표 달성 확인 목록
    - [] CRUD 를 구현할 수 있는가?
    - [] 리팩토링 기법 중에서 `extract method`와 `replace temp with query`의 의미를 이해하는가?

## 28일차(2021-01-29,금)

- 실습 프로젝트 : mini-pms(프로젝트 관리 시스템)
    - 15-a 단계:  데이터 처리 코드를 캡슐화 하기 전 : 배열 크기 늘리기
    - 15-b 단계:  데이터 처리 코드를 캡슐화 하기 전 : 배열 대신 연결리스트 사용하기
- 과제 : 개인 프로젝트 중간 발표(보류)
- 학습 목표 달성 확인 목록
    - [] 배열의 크기를 늘리는 방법을 아는가?
    - [] 배열의 크기를 늘릴 때 문제점을 아는가?
    - [] linked-list 자료 구조의 구동원리를 이해하는가?
    - [] linked-list 자료 구조를 구현할 수 있는가?
    - [] 배열 방식과 linked-list 방식의 특징을 설명할 수 있는가?

## 29일차(2021-02-01,월)

- 실습 프로젝트 : mini-pms(프로젝트 관리 시스템)
    - 16-a 단계:  데이터 처리 코드를 캡슐화 하기 : 배열 크기 늘리기
    - 16-b 단계:  데이터 처리 코드를 캡슐화 하기 : 배열 크기 늘리기
    - 16-c 단계:  데이터 처리 코드를 캡슐화 하기 : 배열 대신 연결리스트 사용하기
- 과제 : 개인 프로젝트 중간 발표(발표)
- 학습 목표 달성 확인 목록
    - [] 데이터 처리 코드를 별도의 클래스를 분리했을 때 어떤 이점이 있는가?
    - [] `GRASP` 설계 패턴 방법론에서 `High Cohesion` 패턴의 특징을 이해하는가?
    
## 30일차(2021-02-02,화)

- 객체지향 문법(com.eomcs.oop)
    - ex08 : 캡슐화 문법 사용
- 실습 프로젝트 : mini-pms(프로젝트 관리 시스템)
    - 17 단계:  캡슐화와 접근 제어 : 세터(setter) / 게터(getter)
- 학습 목표 달성 확인 목록
    - [] 추상화에 대해 설명할 수 있는가?
    - [] 캡슐화가 무엇인지 설명할 수 있는가?
    - [] 캡슐화를 보조하는 접근 제어 문법을 이해하는가?
    - [] private/(default)/projected/public 의 접근 범위를 설명할 수 있는가?
    - [] getter와 setter를 정의하고 사용할 수 있는가?
    - [] 필드(field)와 프로퍼티(property)의 차이점을 아는가?
    - [] 상속의 의미와 이점을 이해하는가?
    - [] 다형성의 3대 유형을 설명할 수 있는가?
    - [] 다형적 변수를 다룰 수 있는가?
    - [] 오버로딩의 의미와 그 이점을 설명할 수있는가?
    - [] 오버라이딩이 의미와 그 이점을 설명할 수 있는가?

## 31일차(2021-02-03,수)

- 자바 기본 클래스 사용법(com.eomcs.basic)
    - ex01 : 캡슐화 문법 사용
- 실습 프로젝트 : mini-pms(프로젝트 관리 시스템)
    - 18-a 단계: 다형성 활용 : 다형적 변수와 형변환
    - 18-b 단계: 다형성 활용 : 오버라이딩과 오버로딩 
- 학습 목표 달성 확인 목록
    - [] 클래스를 정의할 때 수퍼 클래스를 지정하지 않으면 어떻게 되는지 아는가?
    - [] Object 클래스의 toString() 리턴 값을 이해하는가?
    - [] Object 클래스의 equals(), hashCode() 메서드의 기능을 이해하는가?
    - [] Object 클래스의 메서드를 어떤 상황에서 오버라이딩 해야 하는지 아는가?

## 32일차(2021-02-04,목)

- 객체지향 문법(com.eomcs.oop)
    - ex05 : 상속 문법의 용도 및 사용법
- 자바 기본 클래스 사용법(com.eomcs.basic)
    - ex02 : 문자열, 날짜, 래퍼(wrapper) 클래스 사용법
- 학습 목표 달성 확인 목록
    - [] mutable 객체와 immutable 객체의 차이를 예를 들어 설명할 수 있는가?
    - [] 리터럴로 만든 String 객체와 new 로 만든 String 객체의 차이점을 설명할 수 있는가?
    - [] 래퍼(wrapper) 클래스의 용도와 사용법을 알고 있는가?
    - [] java.util.Date, java.sql.Date, java.util.Calendar 클래스를 사용할 수 있는가?
    - [] 기능을 확장하기 위해 사용하는 기법의 유형을 설명할 수 있는가?
    - [] 상속을 이용하여 기능을 확장할 수 있는가?
    - [] 수퍼 클래스와 서브 클래스의 용어를 이해하는가?
    - [] 상속 관계에 있는 클래스의 인스턴스 생성 과정을 이해하는가?
    - [] 상속 관계에 있는 클래스의 생성자 호출 과정을 이해하는가?
    - [] 수퍼 클래스의 생성자를 호출하는 `super()` 의 사용법을 아는가?
    - [] 자바에서 다중 상속을 지원하지 않는 이유를 아는가?
    - [] specialization과 generalization 상속 기법을 설명할 수 있는가?
    - [] 추상 클래스의 용도와 사용법을 아는가?
    - [] 추상 메서드의 용도와 사용법을 아는가?

## 33일차(2021-02-05,금)

- 객체지향 문법(com.eomcs.oop)
    - ex06 : 다형성의 활용 및 final 사용법
- 실습 프로젝트 : mini-pms(프로젝트 관리 시스템)
    - 19-a 단계: 자료구조 구현과 활용 : 스택 구현과 사용
- 학습 목표 달성 확인 목록
    - [] 다형적 변수를 활용할 수 있는가?
    - [] 컴파일러에서 다형적 변수의 사용 법위를 어디까지 허용하는지 아는가?
    - [] JVM에서 다형적 변수의 사용 범위를 어디까지 허용하는지 아는가?
    - [] 레퍼런스를 타입 캐스팅하는 방법을 아는가?
    - [] final 제한자의 사용법을 아는가?
    - [] 스택과 큐의 구동 원리는 이해하는가?
    - [] 스택과 큐를 언제 적용해야 하는지 예를 들어 설명할 수 있는가?
    - [] 스택을 구현할 수 있는가?


## 34일차(2021-02-08,월)

- 객체지향 문법(com.eomcs.oop)
    - ex08 : 캡슐화에서 protected 활용(복습)
- 자바 기본 클래스 사용법(com.eomcs.basic)
    - ex01 : Exam0170 ~ Exam0175, clone()을 이용한 인스턴스 shallow copy, deep copy
- 알고리즘(com.eomcs.algorithm.data_structure)
    - queue, stack : 큐, 스택 구현 방법 및 사용법(복습)
- 실습 프로젝트 : mini-pms(프로젝트 관리 시스템)
    - 19-a 단계: 자료구조 구현과 활용 : 스택 구현과 사용(계속)
    - 19-b 단계: 자료구조 구현과 활용 : 큐 구현과 사용
    - 20-a 단계: `Iterator` 디자인 패턴 : 데이터 조회 기능을 캡슐화
    - 20-b 단계: `Iterator` 디자인 패턴 : XxxIterator 에 대해 Generalization 수행 
- 학습 목표 달성 확인 목록
    - [] private/(default)/protected/public 접근 제어를 이해하는가?
    - [] 오버라이딩하는 메서드의 리턴 타입이 어디까지 허용되는지 아는가?
    - [] Object의 clone()을 이용하여 인스턴스 복제를 처리할 수 있는가?
    - [] 인스턴스 복제 기능을 활성화시키는 방법을 아는가?
    - [] clone() 메서드를 사용하기 위해 필요한 조치 사항을 아는가?
    - [] 인스턴스 복제에서 shallow copy와 deep copy의 차이점을 아는가?
    - [] 큐를 구현할 수 있는가?
    - [] Iterator 패턴의 특징을 이해하고 구현할 수 있는가?
    - [] 상속의 기법에서 일반화(generalization)와 전문화(specialization)를 구현할 수 있는가?

## 35일차(2021-02-09,화)

- 객체지향 문법(com.eomcs.oop)
    - ex07 : 추상 클래스와 인터페이스 사용법
- 실습 프로젝트 : mini-pms(프로젝트 관리 시스템)
    - 20-c 단계: `Iterator` 디자인 패턴 : Iterator 패턴에 인터페이스 문법 적용
    - 20-d 단계: `Iterator` 디자인 패턴 : GRASP의 Creator 패턴 적용
    - 20-e 단계: `Iterator` 디자인 패턴 : 스태틱 중첩 클래스(static nested class) 활용
    - 20-f 단계: `Iterator` 디자인 패턴 : 논스태틱 중첩 클래스(inner class) 활용
    - 20-g 단계: `Iterator` 디자인 패턴 : 로컬 클래스(local class) 활용
    - 20-h 단계: `Iterator` 디자인 패턴 : 익명 클래스(anonymous class) 활용
- 학습 목표 달성 확인 목록
    - [] 인터페이스 문법을 사용하여 객체 사용 규칙을 정의할 수 있는가?
    - [] GRASP의 Creator 패턴의 원리를 이해하는가?
    - [] 패키지 멤버 클래스를 중첩 클래스로 전환하여 다룰 수 있는가?
    - [] 스태틱 중첩 클래스와 논스태틱 중첩 클래스의 차이점을 아는가?
    - [] 로컬 클래스에서 로컬 변수에 접근하는 방법을 아는가?
    - [] 익명 클래스를 정의할 수 있는가?


## 36일차(2021-02-10,수)

- 객체지향 문법(com.eomcs.oop)
    - ex07 : 추상 클래스와 추상 메서드 사용법(계속)
    - ex09 : 인터페이스 사용법
- 학습 목표 달성 확인 목록
    - [] 추상 클래스를 정의하는 방법과 concrete 클래스와의 차이점을 이해하는가?
    - [] 언제 추상 클래스를 사용해야 하는지 아는가?
    - [] 추상 메서드를 정의할 수 있는가?
    - [] 추상 메서드를 사용해야 하는 상황과 그 의미를 설명할 수 있는가?
    - [] 추상 클래스와 추상 메서드를 활용하여 Template Method 패턴을 구현할 수 있는가?
    - [] Math.random() 메서드의 사용법을 아는가?
    - [] 인터페이스를 정의하는 방법과 구현하는 방법을 아는가?
    - [] 인터페이스 문법을 언제 사용해야 하는지 아는가?
    - [] 인터페이스를 사용했을 때 이점을 이해하는가?
    - [] 인터페이스의 default 메서드의 용도를 설명할 수 있는가?
    - [] 인터페이스의 상속과 다중 상속을 이해하는가?
    - [] 인터페이스의 다중 상속이 불가능한 경우를 설명할 수 있는가? 
    - [] 인터페이스의 구현과 다중 구현을 이해하는가?
    - [] 인터페이스의 다중 구현이 불가능한 경우를 설명할 수 있는가?

## 37일차(2021-02-15,월)

- 객체지향 문법(com.eomcs.oop)
    - ex09 : 인터페이스 사용법(계속)
    - ex11 : 중첩 클래스
- 학습 목표 달성 확인 목록
    - [] 인터페이스를 간접적으로 구현하기 위해 추상 클래스를 활용할 수 있는가?
    - [] 인터페이스를 활용할 수 있는가?
    - [] 인터페이스의 구현을 간결하게 만들기 위해 추상 클래스를 활용할 수 있는가?
    - [] 인터페이스의 default 메서드를 언제 활용하는가?
    - [] 인터페이스의 활용 예를 만들 수 있는가?
    - [] L10N, I18N의 약자를 기술할 수 있는가?
    - [] 스태틱 중첩 클래스를 정의할 수 있는가?
    - [] 논스태틱 중첩 클래스를 정의할 수 있는가?
    - [] inner 클래스가 무엇인지 아는가?
    - [] 스태틱 중첩 클래스와 논스태틱 중첩 클래스의 차이를 아는가?
    - [] 로컬 클래스를 정의할 수 있는가?
    - [] 로컬 클래스에서 바깥 클래스 인스턴스를 주소를 어떻게 관리하는가?
    - [] 로컬 클래스가 바깥 메서드의 로컬 변수를 사용할 때 어떻게 관리하는가?
    - [] 익명 클래스를 정의할 수 있는가?
    - [] 리팩토링과 디자인 패턴의 목적이 무엇인가?
    - [] 
    
## 38일차(2021-02-16,화)

- 제네릭 문법(com.eomcs.generic)
    - ex01 : 제네릭 문법 사용
- 실습 프로젝트 : mini-pms(프로젝트 관리 시스템)
    - 21 단계: 제네릭이 필요한 이유와 사용법
- 학습 목표 달성 확인 목록
    - [] 제네릭 문법을 사용할 때 이점을 설명할 수 있는가?
    - [] 제네릭 문법을 메서드에 적용할 수 있는가?
    - [] 제네릭 문법을 클래스에 적용할 수 있는가?
    - [] 타입 파라미터가 무엇인지 알고 있는가?
    - [] 제네릭 타입의 배열을 생성할 수 있는가?
    - [] 프로젝트에 제네릭을 적용할 수 있는가?

## 39일차(2021-02-17,수)

- 자바 기본 클래스 사용법(com.eomcs.basic)
    - ex03 ~ ex08 : 자바 컬렉션 API 사용법
- 실습 프로젝트 : mini-pms(프로젝트 관리 시스템)
    - 22 단계: 자바 컬렉션 API 사용하기
    - 23 단계: 예외가 발생했을 때 시스템을 멈추지 않게 하는 방법
- 학습 목표 달성 확인 목록
    - [] ArrayList 클래스를 사용할 수 있는가?
    - [] LinkedList 클래스를 사용할 수 있는가?
    - [] ArrayList와 LinkedList의 차이점을 설명할 수 있는가?
    - [] HashSet 클래스를 사용할 수 있는가?
    - [] Hash 알고리즘에 따라 데이터를 저장하는 방법을 아는가?
    - [] HashSet에 저장할 객체는 반드시 hashCode()와 equals()를 오버라이딩 해야 하는 이유를 아는가?
    - [] HashSet의 값 목록을 조회할 수 있는가?
    - [] HashMap 클래스를 사용할 수 있는가?
    - [] HashMap의 key 목록을 다룰 수 있는가?
    - [] HashMap의 value 목록을 다룰 수 있는가?
    - [] HashMap과 Hashtable의 차이점을 설명할 수 있는가?
    - [] List와 Set, Map의 차이점을 설명할 수 있는가?

## 40일차(2021-02-18,목)

- 실습 프로젝트 : mini-pms(프로젝트 관리 시스템)
    - 24-a 단계: 'Command' 디자인 패턴을 적용하기 : 적용 전 문제점 확인
    - 24-b 단계: 'Command' 디자인 패턴을 적용하기 : 메서드를 객체로 분리하기
    - 24-c 단계: 'Command' 디자인 패턴을 적용하기 : 인터페이스 문법을 이용하여 핸들러 객체의 사용 규칙을 통일하기
    - 24-d 단계: 'Command' 디자인 패턴을 적용하기 : Map 을 이용한 커맨드 객체 관리
- 학습 목표 달성 확인 목록
    - [] 커맨드 디자인 패턴의 사용처를 설명할 수 있는가?
    - [] 커맨드 패턴을 적용할 수 있는가?
    - [] 커맨드 패턴을 적용할 때 인터페이스 문법의 용도를 이해하는가?
    - [] Map 을 사용하여 객체를 다룰 수 있는가?

## 41일차(2021-02-19,금)

- 제네릭 문법(com.eomcs.generic)
    - ex02 ~ ex04 : 제네릭 문법 사용(계속)
- 객체지향 문법(com.eomcs.oop)
    - ex12 : 람다(lambda) 사용법
- 학습 목표 달성 확인 목록
    - [] 제네릭 문법이 적용된 경우 인스턴스와 레퍼런스의 사용법을 이해하는가?
    - [] 제네릭의 wildcard(?) 문법을 사용할 수 있는가?
    - [] wildcard 문법에서 extends와 super 차이점을 이해하는가?
    - [] 'funtional interface' 를 설명할 수 있는가?
    - [] 람다(lambda) 문법을 사용할 수 있는가?
    - [] 로컬 클래스를 익명 클래스로 바꿀 수 있는가?
    - [] 익명 클래스를 람다 코드로 바꿀 수 있는가?
    - [] 스태틱 메서드를 '메서드 레퍼런스'로 활용할 수 있는가?
    - [] 인스턴스 메서드를 '메서드 레퍼런스'로 활용할 수 있는가?
    - [] 생성자를 '메서드 레퍼런스'로 활용할 수 있는가?
    - [] List의 forEach() 메서드를 활용하여 목록을 조회할 수 있는가?


## 42일차(2021-02-22,월)

- 예외 처리 문법(com.eomcs.exception)
    - 예외 종류와 예외 클래스 계층도의 관계
    - try ~ catch ~ finally 문법의 사용법
    - try with resources 문법의 사용법
- 학습 목표 달성 확인 목록
    - [] 예외의 종류에 무엇이 있는지 아는가?
    - [] 시스템 예외를 다루는 클래스와 애플리케이션 예외를 다루는 클래스를 아는가?
    - [] 시스템 예외 클래스와 애플리케이션 예외 클래스의 계층도를 그릴 수 있는가?
    - [] 예외를 처리하는 try ~ catch ~ 문법을 사용할 수 있는가?
    - [] 여러 개의 catch 블록을 다룰 수 있는가?
    - [] 수퍼 클래스 파라미터로 여러 개의 catch 블록을 한 개의 catch 블록으로 통합하는 방법을 아는가?
    - [] | 연산자를 사용하여 여러 개의 예외를 한 개의 catch 블록에서 받을 수 있는가?
    - [] throw 키워드를 사용하여 예외를 던질 수 있는가?
    - [] 메서드 선언부에 throws 키워드를 언제 사용해야 하는지 아는가?
    - [] 언제 메서드 선언부에 throws 키워드를 생략하는지 아는가?
    - [] Exception과 RuntimeException 예외의 차이를 아는가?
    - [] finally 블록의 사용법을 아는가?
    - [] try-with-resources 문법을 사용할 수 있는가?
    - [] 예외 클래스를 상속 받아 사용자 정의 예외 클래스를 만들 수 있는가?
    - [] 사용자 예외 클래스를 만드는 목적을 아는가?

## 43일차(2021-02-23,화)

- 파일 입출력 API 사용법(com.eomcs.io)
    - File 클래스 사용법
    - FileInputStream/FileOutputStream 클래스 사용법
- 학습 목표 달성 확인 목록
    - [] 내부 기억 장치 RAM과 외부 기억 장치 HDD, SSD의 용도를 이해하는가?
    - [] HDD의 데이터 저장 원리를 이해하는가?
    - [] HDD의 트랙, 섹터, 실린더를 설명할 수 있는가?
    - [] HDD에 데이터를 저장할 때 수평 기록 방식과 수직 기록 방식을 이해하는가?
    - [] 파일 시스템과 디스크 포맷을 설명할 수 있는가?
    - [] File 클래스를 사용하여 파일 및 디렉토리를 생성하고 조회하고 삭제할 수 있는가?
    - [] FileFilter와 FilenameFilter를 사용하여 디렉토리 내용을 선택적으로 조회할 수 있는가?
    - [] FileInputStream/FileOutputStream 클래스를 사용하여 바이트 단위의 데이터를 읽고 쓸 수 있는가?
    - [] 문자열을 특정 문자 집합으로 인코딩 된 바이트 배열로 뽑아낼 수 있는가?

## 44일차(2021-02-24,수)

- 파일 입출력 API 사용법(com.eomcs.io)
    - FileInputStream/FileOutputStream 클래스 사용법(계속)
    - FileReader/FileWriter 클래스 사용법
- 학습 목표 달성 확인 목록
    - [] 바이너리 파일과 텍스트 파일을 구분할 수 있는가?
    - [] 바이트 스트림 클래스와 문자 스트림 클래스를 구분하여 설명할 수 있는가?
    - [] 데이터 싱크(sink) 타입에 따라 클래스를 구분하여 설명할 수 있는가?
    - [] FileInputStream/FileOutputStream으로 텍스트 출력을 다룰 수 있는가?
    - [] FileInputStream/FileOutputStream 클래스와 FileReader/FileWriter 클래스의 사이이 차이점을 이해하는가?
    - [] JVM 환경 변수 "file.encoding" 의 사용법을 아는가?
    - [] 드라이버 소프트웨어가 무엇인지 아는가?
    - [] 스트리밍 API의 등장 이유를 아는가?
    - [] FileReader/FileWriter 사용법
    - [] 데이터 프로세싱 스트림 클래스의 역할을 이해하는가?
    - [] 데이터를 입출력할 때 버퍼를 사용하는 이유를 아는가?
    - [] 파일에서 읽은 1바이트를 4바이트 int 값으로 변환할 때 주의할 점을 아는가?

## 45일차(2021-02-25,목)

- 파일 입출력 API 사용법(com.eomcs.io)
    - 데이터 프로세싱 스트림 클래스 구동원리 이해와 구현
    - 데코레이터 패턴 사용법
    - Java에서 제공하는 데이터 프로세싱 스트림 클래스 사용법
- 학습 목표 달성 확인 목록
    - [] 바이트 배열을 이용하여 데이터를 읽을 때 바이트 배열의 크기는 어느 정도가 적당한가?
    - [] 상속을 이용한 입출력 기능 확장의 한계점을 이해하는가?
    - [] 포함 관계를 통한 기능 확장을 구현할 수 있는가?
    - [] 포함 관계와 상속을 이용하여 데코레이터 패턴을 구현할 수 있는가?
    - [] Java Streamming API의 주요 클래스에 대한 계층도를 그릴 수 있는가?
    - [] serialize(직렬화; 바이트 배열화)의 개념을 이해하는가?
    - [] ObjectInputStream/ObjectOutputStrteam을 이용하여 인스턴스를 입출력 할 수 있는가?
    - [] java.io.Serializable 인터페이스의 용도를 아는가?
    - [] serialize 파일에 출력되는 내용은 무엇인가?
    - [] serialVersionUID 스태틱 필드의 용도를 아는가?
    - [] 파일 입출력을 프로그래밍 할 때 예외처리를 할 수 있는가?

## 46일차(2021-02-26,금)

- 실습 프로젝트 : mini-pms(프로젝트 관리 시스템)
    - 25-a 단계: 파일 입출력 API : 바이너리 형식으로 데이터를 읽고 쓰기(FileInputStream/FileOutputStream)
    - 25-b 단계: 파일 입출력 API : 데코레이터 객체 활용하기(DataInputStream/DataOutputStream)
    - 25-c 단계: 파일 입출력 API : 버퍼 사용하기(BufferedInputStream/BufferedOutputStream)
    - 25-d 단계: 파일 입출력 API : 객체 읽고 쓰기(ObjectInputStream/ObjectOutputStream)
    - 25-e 단계: 파일 입출력 API : 리팩터링 I
- 학습 목표 달성 확인 목록
    - [] 바이너리 파일과 텍스트 파일을 구분할 수 있는가?
    - [] FileInputStream과 FileOutputStream 클래스의 사용 방법을 아는가?
    - [] 데코레이터 패턴의 구조와 특징을 이해하는가?
    - [] 자바의 스트리밍 API에 데코레이터 패턴이 적용된 것을 설명할 수 있는가?
    - [] DataInputStream/DataOutputStream 클래스의 용도를 아는가?
    - [] 입출력에 버퍼를 적용했을 때 이점을 아는가?
    - [] BufferedInputStream/BufferedOutputStream 클래스를 구현할 수 있는가?
    - [] ObjectInputStream/ObjectOutputStream 클래스의 용도를 아는가?
    - [] 직렬화(serialization)/객체 복원(deserialization)의 동작 원리를 설명할 수 있는가?
    - [] 제넥릭을 사용하여 다양한 타입의 파라미터 값이나 리턴 값을 처리할 수 있는가?

## 47일차(2021-03-02,화)

- 실습 프로젝트 : mini-pms(프로젝트 관리 시스템)
    - 26-a 단계: 파일 입출력 API : 텍스트 형식(CSV 파일 포맷)으로 데이터를 읽고 쓰기(FileReader/FileWriter)
    - 26-b 단계: 파일 입출력 API : 버퍼 사용하기(BufferedReader/BufferedWriter)
    - 26-c 단계: 파일 입출력 API : 리팩터링 I
    - 26-d 단계: 파일 입출력 API : 리팩터링 II
- 학습 목표 달성 확인 목록
    - [] FileReader/FileWriter 클래스의 사용법을 아는가?
    - [] CSV 파일 포맷을 이해하는가?
    - [] MIME 에 대해 설명할 수 있는가?
    - [] BufferedReader/BufferedWriter 데코레이터를 사용할 수 있는가?
    - [] GRASP의 Information Expert 패턴을 이해하는가?
    - [] GoF 의 Factory Method 패턴을 구현할 수 있는가?
    - [] 인터페이스의 용법을 아는가?
    - [] *functional interface*를 아는가?
    - [] 메서드 레퍼런스의 용법을 아는가?
    - [] 클래스의 스태틱 메서드를 functional interface의 구현체로 사용할 수 있는가?
    - [] 클래스의 생성자를 메서드 functional interface의 구현체로 사용할 수 있는가?
    - [] 제네릭 문법을 활용할 수 있는가?

## 48일차(2021-03-03,수)

- 실습 프로젝트 : mini-pms(프로젝트 관리 시스템)
    - 27 단계: JSON 형식으로 객체를 읽고 쓰기 : Gson 라이브러리 활용
    - 28-a 단계: `Observer` 디자인 패턴 : 프로젝트에 적용하기
    - 28-b 단계: `Observer` 디자인 패턴 : `Observer` 객체를 통해 파일 다루기
- 학습 목표 달성 확인 목록
    - [] 메타데이터,마크업,태그 용어를 설명할 수 있는가?
    - [] JSON 형식을 아는가?
    - [] CSV 형식과 XML/JSON 형식을 비교 설명할 수 있는가?
    - [] XML과 JSON을 비교 설명할 수 있는가?
    - [] JSON 라이브러리인 Gson을 사용할 수 있는가?
    - [] functional interface가 무엇인지 설명할 수 있는가?
    - [] functional interface의 구현체를 만드는 다양한 방법을 아는가?
    - [] Observer 디자인 패턴의 특징과 이점을 이해하는가?
    - [] Observer 디자인 패턴의 클래스 구조를 프로젝트에 적용할 수 있는가?
    - [] 스트리밍 API의 옵저버 패턴을 설명할 수 있는가?

## 49일차(2021-03-04,목)

- 네트워킹 API 사용법(com.eomcs.net)
    - ex01 : 네트워킹 개념과 프로그래밍 기법 소개
    - ex02 : ServerSocket과 Socket 클래스 사용법
    - ex03 : 소켓 간 데이터 입출력 방법
- 학습 목표 달성 확인 목록
    - [] Hub, Gateway, Router, DNS 서버의 역할을 이해하는가?
    - [] 일반 허브와 스위치 허브의 차이점을 이해하는가?
    - [] LAN, WAN, Internet, Intranet 용어를 설명할 수 있는가?
    - [] IP 주소와 포트 번호가 무엇인지 아는가?
    - [] IP 주소를 xxx.xxx.xxx.xxx 형식으로 표기하는 이유를 아는가?
    - [] IPv4, 사설 IP 주소, IPv6의 관계를 설명할 수 있는가?
    - [] ServerSocket의 용도와 대기열을 이해하는가?
    - [] ServerSocket의 대기열을 제어할 수 있는가?
    - [] ServerSocket의 accept() 용법을 아는가?
    - [] Socket을 이용하여 데이터를 입출력 할 수 있는가?

## 50일차(2021-03-05,금)

- 네트워킹 API 사용법(com.eomcs.net)
    - ex04 : Stateful과 Stateless 통신 구현
- 학습 목표 달성 확인 목록
    - [] Connection-Oriented 통신 방식과 Connnectionless 통신 방법을 구분하여 설명할 수 있는가?
    - [] Stateful과 Stateless 통신 방법을 구분하여 설명할 수 있는가?
    - [] Stateful 방식으로 클라이언트/서버 통신을 구현할 수 있는가?
    - [] Stateless 방식으로 클라이언트/서버 통신을 구현할 수 있는가?
    - [] Stateful 방식의 이점을 활용하여 클라이언트의 작업 상태를 유지할 수 있는가?
    - [] Stateless 방식에서 클라이언트의 작업 상태를 유지하기 위해 구현하는 방법을 아는가?
    - [] Thread의 개념을 이해하는가?
    - [] 여러 클라이언트의 요청을 동시 처리하기 위해 스레드를 구현할 수 있는가?

## 51일차(2021-03-08,월)

- 네트워킹 API 사용법(com.eomcs.net)
    - ex05 : connection-oriented 와 connectionless 통신 방법
    - ex06 : HTTP 프로토콜 통신 방법
    - ex07 : URL 클래스 사용법
    - ex08 : URL, URLConnection 클래스를 이용한 HTTP 요청
    - ex11 : 계산기 서비스 구현
- 학습 목표 달성 확인 목록
    - [] connection-oriented와 connectionless 통신 방법의 차이점을 이해하는가?
    - [] ServerSocket/Socket 과 DatagramSocket/DatagramPacket 클래스의 사용법을 아는가?
    - [] HTTP 프로토콜의 통신 방법을 이해하는가?
    - [] HTTP 클라이언트와 HTTP 서버를 간단히 구현할 수 있는가?
    - [] URL 클래스를 사용하여 URL 주소의 각 요소를 식별할 수 있는가?
    - [] URL, URLConnection 클래스를 이용하여 HTTP 요청을 구현할 수 있는가?
    - [] 계산기 서비스를 stateful 통신 방식과 stateless 통신 방식으로 모두 구현할 수 있는가?
    - [] 스레드를 이용하여 여러 클라이언트를 동시에 처리할 수 있는가?

## 52일차(2021-03-09,화)

- 실습 프로젝트 : mini-pms(프로젝트 관리 시스템)
    - 29-a 단계: 파일 관리를 별도의 애플리케이션으로 분리하기 : 클라이언트/서버 프로젝트 준비
    - 29-b 단계: 파일 관리를 별도의 애플리케이션으로 분리하기 : 간단한 메시지 송수신
    - 29-c 단계: 파일 관리를 별도의 애플리케이션으로 분리하기 : 사용자가 입력한 명령처리
    - 29-d 단계: 파일 관리를 별도의 애플리케이션으로 분리하기 : 프로토콜 정의 및 적용
- 학습 목표 달성 확인 목록
    - [] github.com 에서 깃 저장소를 생성할 수 있는가?
    - [] github.com의 깃 저장소를 로컬 PC로 복제할 수 있는가?
    - [] gradle 빌드 도구를 이용하여 일반 폴더를 프로젝트 폴더로 구성할 수 있는가?
    - [] gradle 빌드 도구로 자바 프로젝트를 eclipse IDE 용 프로젝트로 전환할 수 있는가?
    - [] ServerSocket/Socket 클래스를 이용하여 클라이언트/서버 애플리케이션을 구현할 수 있는가?
    - [] 통신 프로토콜을 정의하고 그 프로토콜에 맞춰 통신 프로그램을 구현할 수 있는가? 

## 53일차(2021-03-10,수)

- 실습 프로젝트 : mini-pms(프로젝트 관리 시스템)
    - 29-e 단계: 파일 관리를 별도의 애플리케이션으로 분리하기 : 파일 및 데이터 처리를 서버로 분리
- 학습 목표 달성 확인 목록

## 54일차(2021-03-11,목)

- 실습 프로젝트 : mini-pms(프로젝트 관리 시스템)
    - 29-e 단계: 파일 관리를 별도의 애플리케이션으로 분리하기 : 파일 및 데이터 처리 기능을 서버로 이전( 계속)
    - 29-f 단계: 파일 관리를 별도의 애플리케이션으로 분리하기 : 드라이버 객체 도입
- 학습 목표 달성 확인 목록

## 55일차(2021-03-12,금)

- 실습 프로젝트 : mini-pms(프로젝트 관리 시스템)
    - 29-f 단계: 파일 관리를 별도의 애플리케이션으로 분리하기 : 드라이버 객체 도입(계속)
    - 29-g 단계: 파일 관리를 별도의 애플리케이션으로 분리하기 : 다중 클라이언트의 동시 접속 처리
- 학습 목표 달성 확인 목록

## 56일차(2021-03-15,월)

- 스레드 프로그래밍(com.eomcs.concurrent)
    - ex01 : 멀티 태스킹
    - ex02 : JVM의 기본 스레드들
    - ex03 : 스레드를 만드는 방법
    - ex04 : 스레드 생명 주기와 우선 순위
- 학습 목표 달성 확인 목록

## 57일차(2021-03-16,화)

- 스레드 프로그래밍(com.eomcs.concurrent)
    - ex05 : 비동기 프로그램의 문제점, 뮤텍스/세마포어
    - ex06 : 스레드 재사용 기법
    - ex07 : 스레드풀 동작원리와 구현
- 학습 목표 달성 확인 목록

## 58일차(2021-03-17,수)

- JDBC 프로그래밍
    - 
- 학습 목표 달성 확인 목록