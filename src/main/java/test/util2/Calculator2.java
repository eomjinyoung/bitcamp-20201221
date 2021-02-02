package test.util2;

import test.util.Calculator;

public class Calculator2 extends Calculator {

  public void minus(int value) {
    this.result -= value;
  }

  public void minus(int value1, int value2) {
    this.result -= value1;
    this.result -= value2;
  }

  public void plus(int a, int b) {
    this.result += a;
    this.result += b;
  }
}
