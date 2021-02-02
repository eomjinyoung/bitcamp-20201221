package test;

public class Test1 {
  public static void main(String[] args) {
    Member m = new Member();
    m.name = "홍길동";
    m.tel = "010-1111-2222";
    m.print();
    System.out.println("-------------------");

    Student s = new Student();
    s.name = "임꺽정";
    s.tel = "010-2222-3333";
    s.school = "비트대학교";
    s.major = "컴퓨터공학";
    s.print();

  }

}
