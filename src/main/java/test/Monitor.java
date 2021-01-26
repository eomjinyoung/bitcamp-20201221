package test;

public class Monitor {
  String maker;
  String model;
  int bright;
  int contrast;

  public Monitor(String maker, String model, int b, int c) {
    this.maker = maker;
    this.model = model;
    this.bright = b;
    this.contrast = c;
  }

  void display(String content) {
    System.out.println(content);
  }
}
