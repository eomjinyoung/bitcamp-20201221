package test.ex02;

public class App {
  public static void main(String[] args) {
    // 스태틱 변수를 사용하기
    // => 클래스명.변수명
    System.out.println(MyClass.a);

    // 인스턴스 변수 사용하기
    // => 인스턴스를가리키는주소.변수명
    MyClass v1 = new MyClass();
    System.out.println(v1.b);

    // 스태틱 변수는 인스턴스주소를 통해서도 찾아갈 수 있다.
    // => 그러나 이렇게 사용하지 말라!
    // => 개발자들이 헷갈린다. 이게 인스턴스 변수인지, 클래스 변수인지 직관적으로 알 수 없다.
    System.out.println(v1.a);
  }
}
