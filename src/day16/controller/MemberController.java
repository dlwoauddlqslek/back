package day16.controller;

import day16.model.dao.MemberDao;
import day16.model.dto.MemberDto;

public class MemberController {

  public static MemberController mcontrol=new MemberController();

  // 1. 회원가입 화면 함수
  public boolean signUp(MemberDto mdto){
    System.out.println("MemberController.signUp");
    boolean result= MemberDao.mdao.signUp(mdto);
    return result;
  }
  // 2. 로그인 화면 함수
  public boolean login(String mid, String mpwd){
    System.out.println("MemberController.login");
    return MemberDao.mdao.login(mid,mpwd);
  }
  // 3. 아이디 찾기 화면 함수
  public String findId(String mname, String mphone){
    String result=MemberDao.mdao.findId(mname,mphone);
    return result;
  }
  // 4. 비밀번호 찾기 화면 함수
  public String findPw(String mid, String mphone){
    String result=MemberDao.mdao.findPw(mid,mphone);
    return result;
  }
}
