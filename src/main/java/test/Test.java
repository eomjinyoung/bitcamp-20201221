package test;

public class Test {

  static class Member {
    int no;
    String name;
    int age;

    // 상속 받은 메서드를 서브 클래스의 역할에 맞게 재정의 하자.
    // - 이것을 오버라이딩(overriding) 이라 부른다.
    // 
    // 상속 받은 메서드?
    // - 서브 클래스에서 호출할 수 있도록 권한을 획득한 수퍼 클래스의 메서드를 말한다.
    // - 수퍼 클래스의 메서드를 복사해서 서브 클래스에 가져왔다는 뜻이 아니다.
    // 
    // 오버라이딩 문법
    // - 수퍼 클래스의 메서드와 똑 같은 시그너처를 가져야 한다.
    // 
    @Override
    public boolean equals(Object obj) {
      if (!(obj instanceof Member)) 
        return false;

      Member m = (Member) obj;

      if (this.no != m.no)
        return false;

      if (!this.name.equals(m.name))
        return false;

      if (this.age != m.age) 
        return false;

      return true;
    }

    @Override
    public int hashCode() {
      String str = this.no + "," + this.name + "," + this.age;
      return str.hashCode();
    }
  }

  public static void main(String[] args) {

    Member obj = new Member();
    obj.no = 1;
    obj.name = "홍길동";
    obj.age = 20;

    Member obj2 = new Member();
    obj2.no = 1;
    obj2.name = "홍길동";
    obj2.age = 20;

    System.out.println(obj.toString());
    System.out.println(obj2.toString());

    System.out.println(Integer.toHexString(obj.hashCode()));
    System.out.println(Integer.toHexString(obj2.hashCode()));

    System.out.println(obj == obj2);
    System.out.println(obj.equals(obj2));

  }

}
