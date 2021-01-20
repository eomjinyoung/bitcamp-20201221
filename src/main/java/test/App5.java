package test;

public class App5 {

  // 메모리 설계도
  static class Member {
    String name;
    int age;
    boolean working;
  }

  public static void main(String[] args) {

    // 레퍼런스 배열 준비
    Member[] arr = new Member[3];

    arr[0] = new Member();
    arr[1] = new Member();
    arr[2] = new Member();

    arr[0].name = "홍길동";
    arr[0].age = 20;
    arr[0].working = false;

    arr[1].name = "임꺽정";
    arr[1].age = 30;
    arr[1].working = true;

    arr[2].name = "유관순";
    arr[2].age = 40;
    arr[2].working = true;

    printMember(arr[0]);
    printMember(arr[1]);
    printMember(arr[2]);
  }

  static void printMember(Member m) {
    System.out.printf("이름: %s\n", m.name);
    System.out.printf("나이: %d\n", m.age);
    System.out.printf("재직여부: %b\n", m.working);
    System.out.println("--------------------------------");
  }
}







