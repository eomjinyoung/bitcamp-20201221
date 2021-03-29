package test;

public class ConsolePrinter extends AbstractPrinter {
  String content;

  public ConsolePrinter(String content) {
    this.content = content;
  }

  @Override
  public void printContent() {
    System.out.println(this.content);

  }
}
