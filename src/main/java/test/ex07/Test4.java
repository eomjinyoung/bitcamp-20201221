package test.ex07;

public class Test4 {

  public static void main(String[] args) {
    A.a = 100;

    A r1 = new A();
    A r2 = new A();
    r1.b = 300;
    r2.b = 400;

    r1.m2("홍길동");
    r2.m2("홍길동");

  }
}
