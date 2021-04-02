// SQL 문에 삽입할 파라미터 전달하기 - 일반 객체를 이용하여 여러 개의 값 넘기기
package com.eomcs.mybatis.ex03.b;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import com.eomcs.mybatis.vo.Board;

public class Exam0120 {

  public static void main(String[] args) throws Exception {
    SqlSession sqlSession = new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream(
        "com/eomcs/mybatis/ex03/b/mybatis-config.xml")).openSession();

    // selectList(),selectOne(),insert(),update(),delete()
    // - selectList(SQL ID)
    // - selectList(SQL ID, 파라미터)
    // - 위와 같이 SQL을 실행할 때 오직 한 개의 파라미터만 넘길 수 있다.
    // - 여러 개의 파라미터를 넘기고 싶다면 객체에 담아서 넘겨라!
    // 
    // 예) 특정 범위의 번호에 해당하는 게시글을 가져온다.
    //
    Board board = new Board();
    board.setTitle("제목입니다");
    board.setContent("내용입니다.");

    // insert 문을 실행할 때는 insert() 메서드를 호출한다.
    // - 리턴 값은 executeUpdate()의 실행 결과이다.
    // - 즉 insert 된 데이터의 개수이다.
    int count = sqlSession.insert("BoardMapper.insert", board);
    System.out.printf("%d 개의 데이터를 입력 했음!\n", count);

    // 현재 SqlSession 객체가 수동 commit 상태이기 때문에
    // 데이터 변경을 수행한 후 commit을 반드시 실행해야 한다.
    sqlSession.commit();

    sqlSession.close();

    System.out.println("실행 완료!");
  }

}


