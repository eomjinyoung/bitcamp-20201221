// Mybatis 설정 파일 - SQL 매퍼 파일 설정과 SQL 문 사용법
package com.eomcs.mybatis.ex01.c;

import java.util.List;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class Exam0110 {

  public static void main(String[] args) throws Exception {

    SqlSession sqlSession = new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream(
        "com/eomcs/mybatis/ex01/c/mybatis-config.xml")).openSession();

    // BoardMapper.xml 파일에 보관된 select 문 실행하기
    // => SqlSession.selectList("네임스페이스명.SQL아이디")
    List<Board> boards = sqlSession.selectList("BoardMapper.selectBoard");

    System.out.println(boards.size());

    sqlSession.close();
  }

}


