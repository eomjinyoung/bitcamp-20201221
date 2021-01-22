package test.ex02;

public class App2 {
  public static void main(String[] args) {

    // 인스턴스와 인스턴스 주소, 그리고 레퍼런스
    MyClass v1 = new MyClass();
    System.out.println(v1.b);

    MyClass v2 = v1;

    v2.b = 222;

    System.out.println(v1.b);

  }
}
