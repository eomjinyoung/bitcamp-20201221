package test.ex04;

public class Calculator {

  static void plus(CalculatorResult that, int value) {
    that.result += value;
  }

  static void minus(CalculatorResult that, int value) {
    that.result -= value;
  }

  static void multiple(CalculatorResult that, int value) {
    that.result *= value;
  }

  static void divide(CalculatorResult that, int value) {
    that.result /= value;
  }
}
