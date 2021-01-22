package test.ex01;

public class App {
  public static void main(String[] args) {

    // 스태틱 필드 만들기
    // => 클래스를 로딩해야 한다.
    //
    // 클래스 로딩하기
    // => 클래스를 사용할 때 JVM이 .class 파일을 메모리에 로딩하여 배치한다.
    //
    // 클래스 사용?
    // => 스태틱 필드를 사용할 때,
    // => 스태틱 메소드를 호출할 때,

    System.out.println(MyClass.a); // <== MyClass의 a 스태틱 변수를 사용한다.
    // 실행 단계:
    // 1) MyClass.class 파일을 읽어, Method Area 영역에 명령어를 배치한다.
    // 2) MyClass에서 선언된 모든 스태틱 필드를 Method Area 영역에 만든다.
    // 3) MyClass의 a 변수의 값을 가져온다.
    // 4) println()으로 그 값을 출력한다.

    System.out.println(MyClass.a); // <== MyClass의 a 스태틱 변수를 사용한다.
    // 실행 단계:
    // 1) MyClass 는 이미 로딩되었기 때문에 다시 로딩하지 않는다.
    //    따라서 스태틱 변수를 또 만들지는 않는다.
    //    그래서 스태틱 변수는 클래스당 각 한 개만 존재한다.
    // 2) MyClass의 a 변수의 값을 가져온다.
    // 3) println()으로 그 값을 출력한다.

    // 로컬 변수 만들기
    // => 메서드를 실행할 때 그 안에 선언된 변수가 스택 메모리에 생성된다.
    MyClass v1;

    // 인스턴스 필드 만들기
    // => new 명령을 사용하면 클래스의 인스턴스 변수가 힙 메모리에 생성된다.
    v1 = new MyClass();

    System.out.println(v1.b);
  }
}







