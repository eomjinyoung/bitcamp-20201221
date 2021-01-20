package test;

public class App3 {

  public static void main(String[] args) {
    // 메모리 설계도
    class Member {
      String name;
      int age;
      boolean working;
    }

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


    System.out.printf("이름: %s\n", m1.name);
    System.out.printf("나이: %d\n", m1.age);
    System.out.printf("재직여부: %b\n", m1.working);
    System.out.println("--------------------------------");

    System.out.printf("이름: %s\n", m2.name);
    System.out.printf("나이: %d\n", m2.age);
    System.out.printf("재직여부: %b\n", m2.working);
    System.out.println("--------------------------------");

    System.out.printf("이름: %s\n", m3.name);
    System.out.printf("나이: %d\n", m3.age);
    System.out.printf("재직여부: %b\n", m3.working);
    System.out.println("--------------------------------");

  }
}







