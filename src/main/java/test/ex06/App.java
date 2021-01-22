package test.ex06;

public class App {
  public static void main(String[] args) {
    // 식1: 2 * 3 + 7 - 2 = 11
    // 식2: 12 / 4 - 5 = -2

    Calculator r1 = new Calculator();
    Calculator r2 = new Calculator();

    r1.result = 0;
    r2.result = 0;

    r1.plus(2);
    r1.plus(2);
    r1.multiple(3);
    r1.plus(7);
    r1.minus(2);

    r2.plus(12);
    r2.divide(4);
    r2.minus(5);

    System.out.println(r1.result);
    System.out.println(r2.result);
  }
}
