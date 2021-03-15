package com.eomcs.concurrent.ex5;

public class Account {
  String accountId;
  long balance;

  public Account(String accountId, long balance) {
    this.accountId = accountId;
    this.balance = balance;
  }

  // 한 번에 한 스레드 만이 호출하도록 접근을 제한하고 싶다면
  // 메서드 전체를 동기화 블록으로 선언하라!
  // 어떻게? 메서드 앞에 synchronized를 붙인다.
  // => 여러 스레드가 접근했을 때 문제가 발생하는 critical section이 아닌데도
  //    synchronized 사용한다면 실행 속도가 떨어질 것이다.
  //
  // 참고!
  // => 여러 스레드가 동시에 실행해도 문제가 없는 코드 블록을
  //    "스레드 안전(thread safe)"라 부른다.
  //
  synchronized public long withdraw(long money) {

    // 1) 이 메서드처럼 여러 스레드가 같은 메모리(balance 필드)의 값을 동시에 변경할 때
    //    문제가 발생하는 코드를 "크리티컬 섹션(임계영역; critical section) 또는 크리티컬 리전(critical region)"
    //    이라 부른다.
    // 2) 크리티컬 섹션에 동시에 접근하지 못하게 하는 기법을
    //    "뮤텍스(mutex)" 또는 "세마포어(1)(semaphore)"라 부른다.
    // 3) 자바에서 뮤텍스를 구현하는 방법
    //    => 크리티컬 섹션에 해당하는 메서드나 코드 블록에 sychronized 키워드를 붙여
    //       한 번에 한 스레드만 진입할 수 있도록 lock을 건다.
    //
    long b = this.balance;

    delay();  // CPU를 뺏길 기회를 제공

    b -= money;

    delay();  // CPU를 뺏길 기회를 제공

    if (b < 0)
      return 0;

    delay();  // CPU를 뺏길 기회를 제공

    this.balance = b;

    delay();  // CPU를 뺏길 기회를 제공

    return money;
  }

  private void delay() {
    int delayCount = (int)(Math.random() * 1000);
    for (int i = 0; i < delayCount; i++)
      Math.asin(45.765); // CPU를 뺏길 기회를 제공
  }
}


