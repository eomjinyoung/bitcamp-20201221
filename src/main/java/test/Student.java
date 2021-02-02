package test;

public class Student extends Member {
  String school;
  String major;

  @Override
  void print() {
    super.print();
    System.out.printf("%s,%s 학과\n", this.school, this.major);
  }
}
