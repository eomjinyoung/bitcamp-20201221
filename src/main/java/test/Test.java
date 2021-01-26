package test;

public class Test {

  public static void main(String[] args) { 
    Monitor m1 = new Monitor("비트디스플레이", "비트4K오호라!", 50, 50);

    m1.display("Hello!");

    Calculator c = new Calculator();
    c = 0;
    c.plus(100);

  }

}
