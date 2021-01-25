package test.ex07;

public class Test1 {

  public static void main(String[] args) {
    A.a = 100;
    System.out.println(A.a);

    m();
    System.out.println(A.a);
  }

  static void m() {
    A.a = 200;
  }

}
