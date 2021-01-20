package test;

public class App2 {

  public static void main(String[] args) {
    // 회원정보를 저장할 새로운 메모리 구조를 설계한다.
    // => 사용자(개발자) 정의 데이터 타입
    // 
    class Member {
      String name;
      int age;
      boolean working;
    }

    // 새 설계도에 따라 메모리(변수들을)를 준비한다.
    Member m1 = new Member();
    // m1 => 설계도에 따라 준비한 메모리의 주소를 보관한다.
    // new Member() => Member 설계도에 따라 변수를 생성한 후 그 주소를 리턴.

    // Member 설계도에 따라 준비한 메모리 사용하기
    m1.name = "홍길동";
    m1.age = 20;
    m1.working = false;

    System.out.printf("이름: %s\n", m1.name);
    System.out.printf("나이: %d\n", m1.age);
    System.out.printf("재직여부: %b\n", m1.working);
  }
}







