package day15.step2_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;

public class Step1 {
  public static void main(String[] args) {
    try {
      //1.
      Class.forName("com.mysql.cj.jdbc.Driver");
      //여기서 오류 발생시: 현재 프로젝트내 라이브러리가 존재하지 않을때
      System.out.println("JDBC 드라이버 호출 성공");

      //2.
      Connection conn; //인터페이스 타입의 변수 선언
      conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/day05","root","1234");
      System.out.println("DB연동 성공");
    } catch (Exception e) {
      System.out.println("JDBC 연동 실패"+e);
    }
  }
}

/*
  JDBC
*/
