package test;

public class App4 {

  // 메모리 설계도
  static class Member {
    String name;
    int age;
    boolean working;
  }

  public static void main(String[] args) {

    // 설계도에 따라 준비한 변수 및 레퍼런스
    Member m1 = new Member();
    Member m2 = new Member();
    Member m3 = new Member();

    // 인스턴스 변수에 값 넣기
    m1.name = "홍길동";
    m1.age = 20;
    m1.working = false;

    m2.name = "임꺽정";
    m2.age = 30;
    m2.working = true;

    m3.name = "안중근";
    m3.age = 40;
    m3.working = true;

    printMember(m1);
    printMember(m2);
    printMember(m3);
  }

  static void printMember(Member m) {
    System.out.printf("이름: %s\n", m.name);
    System.out.printf("나이: %d\n", m.age);
    System.out.printf("재직여부: %b\n", m.working);
    System.out.println("--------------------------------");
  }
}







