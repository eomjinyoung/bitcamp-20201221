package test.ex07;

public class Test2 {

  public static void main(String[] args) {
    A r1 = new A();
    r1.b = 100;

    A r2 = new A();
    r2.b = 200;

    System.out.printf("%d, %d\n", r1.b, r2.b);

    m();

    System.out.printf("%d, %d\n", r1.b, r2.b);
  }

  static void m() {
    A r1 = new A();
    r1.b = 300;
  }

}
