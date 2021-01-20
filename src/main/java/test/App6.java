package test;

public class App6 {

  // 메모리 설계도
  static class Member {
    String name;
    int age;
    boolean working;
  }

  public static void main(String[] args) {

    Member m = new Member();
    m.name = "임꺽정";
    m.age = 20;
    m.working = true;

    printMember(m);

    Member[] arr;

    arr = new Member[3];

    arr[0] = new Member();
    arr[1] = new Member();
    arr[2] = new Member();

    arr[0].name = "홍길동";
    arr[0].age = 20;
    arr[0].working = false;

    printMember(arr[0]);
  }

  static void printMember(Member m) {
    System.out.printf("이름: %s\n", m.name);
    System.out.printf("나이: %d\n", m.age);
    System.out.printf("재직여부: %b\n", m.working);
    System.out.println("--------------------------------");
  }
}







