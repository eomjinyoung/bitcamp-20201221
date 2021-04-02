import java.util.ArrayList;
import java.util.Scanner;

public class TeamMaker {

  public static void main(String[] args) throws Exception {
    Scanner keyboard = new Scanner(System.in);

    ArrayList<String> names = new ArrayList<>();
    names.add("김현우");
    names.add("이유현");
    names.add("김성은");
    names.add("전정헌");
    names.add("경도현");
    names.add("김승원");
    names.add("안종원");
    names.add("정진선");
    names.add("오은석");
    names.add("이필립");
    names.add("최석렬");
    names.add("이동인");
    names.add("이희진");
    names.add("박유진");
    names.add("이보나");
    names.add("윤호중");
    names.add("김대훈");
    names.add("윤태훈");
    names.add("박선우");
    names.add("백지숙");
    names.add("황인태");

    int i = 0;
    while (names.size() > 0) {
      i++;
      int count = (int)(Math.random() * 100000);
      int studentIndex = 0;
      for (int x = 0; x < count; x++) {
        studentIndex = (int)(Math.random() * names.size());
      }
      System.out.printf("%s ", names.remove(studentIndex));
      Thread.sleep(2000);
      if (i % 5 == 0) {
        System.out.println();
        keyboard.nextLine();
      }
    }

  }

}

// 1팀: 윤태훈 이보나 박선우 최석렬 백지숙 
//
// 2팀: 오은석 경도현 안종원 이필립 정진선 
//
// 3팀: 김성은 김현우 황인태 이동인 김대훈 
//
// 4팀: 박유진 윤호중 이희진 김승원 이유현 전정헌




