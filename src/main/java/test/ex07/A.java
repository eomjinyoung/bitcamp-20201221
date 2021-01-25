package test.ex07;

public class A {
  static int a;
  int b;

  static void m1(String name) {
    System.out.printf("m1(): %s, %d\n", name, a);
  }

  void m2(String name) {
    System.out.printf("m1(): %s, %d, %d\n", name, a, this.b);
  }
}
