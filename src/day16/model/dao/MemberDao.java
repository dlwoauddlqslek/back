package day16.model.dao;

import day16.model.dto.MemberDto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class MemberDao {

  public static MemberDao mdao=new MemberDao();

  // DB연동
    // JDBC 인터페이스 3개
    Connection conn; PreparedStatement ps; ResultSet rs;
    // 생성자에 연동 코드
  MemberDao(){
    try {
      Class.forName("com.mysql.cj.jdbc.Driver");
      conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/day06", "root", "1234");
    }catch (Exception e){
      System.out.println("연동실패"+e);
    }
  }

  // 1. 회원가입 화면 함수
  public boolean signUp(MemberDto mdto){
    try{
      // 1. SQL 작성한다.
      String sql="insert into member(mid,mpwd,mname,mphone) values(?,?,?,?);";
      System.out.println(sql);
      // 2. SQL 기재한다.
      ps=conn.prepareStatement(sql);
      // 2. SQL 문법의 ?(와일드카드) 매개변수 기재한다
      ps.setString(1,mdto.getId());   //.setString( ?순서, 값)
      ps.setString(2,mdto.getPw());
      ps.setString(3,mdto.getName());
      ps.setString(4,mdto.getPhone());
      // 3. SQL 실행한다. // 4. SQL 실행결과
      int count =ps.executeUpdate();
      if(count==1){return true;} // 1개 레코드 등록되면 성공
    }catch (Exception e){System.out.println(e);}
    return false;
  }
  // 2. 로그인 화면 함수
  public boolean login(String mid,String mpwd){
    try {
      String sql = "select * from member where mid=? and mpwd=?;";
      ps = conn.prepareStatement(sql);
      ps.setString(1, mid);
      ps.setString(2, mpwd);
      rs = ps.executeQuery();
      if (rs.next()) {return true;}
    }catch (Exception e){System.out.println(e);}
    return false;
  }
  // 3. 아이디 찾기 화면 함수
  public String findId(String mname,String mphone){
    String result=null;
    try{
      String sql="select * from member where mname=? and mphone =?;";
      ps=conn.prepareStatement(sql);
      ps.setString(1,mname);
      ps.setString(2,mphone);
      rs=ps.executeQuery();
      if (rs.next()){
        return result= rs.getString("mid");}


    }catch (Exception e){System.out.println(e);}
    return result;
  }
  // 4. 비밀번호 찾기 화면 함수
  public String findPw(String mid,String mphone){
    try{
      String sql="select * from member where mid=? and mphone=?;";
      ps=conn.prepareStatement(sql);
      ps.setString(1,mid);
      ps.setString(2,mphone);
      rs=ps.executeQuery();
      if (rs.next()){
        return rs.getString("mpwd");
      }

    }catch (Exception e){System.out.println(e);}
    return null;
  }
}
