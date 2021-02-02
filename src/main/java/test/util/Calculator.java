package test.util;

public class Calculator {
  protected int result; 

  public void plus(int value) {
    this.result += value;
  }

  public int getResult() {
    return this.result;
  }
}
