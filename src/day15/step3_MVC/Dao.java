package day15.step3_MVC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class Dao {
  // 외부 클래스로부터 내부 메소드를 사용할 수 있도록 만든 static변수
  static Dao dao=new Dao();
  // 멤버변수
  Connection conn;
  PreparedStatement ps;
  ResultSet rs;

  // 생성자
  Dao(){
    try {
      Class.forName("com.mysql.cj.jdbc.Driver");
      conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/day05", "root", "1234");
    }catch (Exception e){
      System.out.println("연동실패"+e);
    }
  }
  // 각 기능별 함수 구현
  // 2. 등록제어 함수, 매개변수: 저장할값 String, 리턴: 등록성공여부 boolean
  public boolean signUpC(String name){
    try {
      String sql = "insert into table1 values('" + name + "');";
      System.out.println(sql);
      ps = conn.prepareStatement(sql);
      ps.executeUpdate();
      return true; // 성공했다는 결과를 전달
    }catch (Exception e){
      System.out.println(e);
    } return false; // 실패했다는 결과를 전달
  }

  // 3. 출력제어 함수, 매개변수:x, 리턴: 회원목록 ArrayList<String>
  public ArrayList<String> printC(){
    ArrayList<String> list=new ArrayList<>();//리스트(비어있는) 선언
    try {
      String sql = "select * from table1;";
      ps = conn.prepareStatement(sql);
      rs = ps.executeQuery();
      while (rs.next()) { //첫번째 레코드부터 마지막 레코드까지 순회
        list.add(rs.getString("name")); // 현재 레코드의 name필드 값을 호출하여 리스트에 저장
      }
    }catch (Exception e){
      System.out.println(e);
    }return list;
  }

  // 4. 수정제어 함수, 매개변수: 기존이름String, 새로운이름String, 리턴: 수정성공여부 boolean
  public boolean updateC(String oldName, String newName){
    try {
      String sql = "update table1 set name='" + newName + "' where name='" + oldName + "';";
      System.out.println(sql);
      ps = conn.prepareStatement(sql);
      ps.executeUpdate();
      return true;
    }catch (Exception e){
      System.out.println(e);
    }return false;
  }

  // 5. 삭제제어 함수, 매개변수: 삭제할 이름 String, 리턴: 삭제성공여부 boolean
  public boolean deleteC(String name){
    try {
      String sql = "delete from table1 where name='" + name + "';";
      System.out.println(sql);
      ps = conn.prepareStatement(sql);
      ps.executeUpdate();
      return true;
    }catch (Exception e){
      System.out.println(e);
    }return false;
  }

}
