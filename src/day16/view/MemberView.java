package day16.view;

import day16.controller.MemberController;
import day16.model.dto.MemberDto;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MemberView {

  // 해당 클래스의 함수들을 다른 클래스에서 호출 할 수 있도록 static변수에 해당 객체를 대입
  public static MemberView mView=new MemberView();

  // 입력객체
  Scanner scan=new Scanner(System.in);

  // 0. 초기화면 함수
  public void index(){
    while(true){
      System.out.print("1.회원가입 2.로그인 3.아이디찾기 4.비밀번호찾기 : ");
      try {
        int ch = scan.nextInt();
        if (ch==1){signUp();}
        else if(ch==2){login();}
        else if(ch==3){findId();}
        else if(ch==4){findPw();}
        else{System.out.println("없는 기능 번호 입니다.");}
      }catch (InputMismatchException e){
        System.out.println("잘못된 입력이 있습니다. 초기메뉴로");
        scan=new Scanner(System.in);
      }

    }
  }

  // 1. 회원가입 화면 함수
  public void signUp(){
    System.out.println("회원가입 메뉴");
    // 1. 입력
    System.out.print("아이디 입력: "); String id=scan.next();
    System.out.print("비밀번호 입력: "); String pw=scan.next();
    System.out.print("성함 입력: "); String name=scan.next();
    System.out.print("연락처 입력: "); String phone=scan.next();
    // 2. 유효성검사
    // 3. 객체화
    MemberDto mdto=new MemberDto(id,pw,name,phone);
    // 4. Controller에게 전달
    boolean result= MemberController.mcontrol.signUp(mdto);
    if (result){System.out.println("회원가입 성공");}
    else{System.out.println("회원가입 실패");}
  }
  // 2. 로그인 화면 함수
  public void login(){
    System.out.print("아이디 입력: "); String mid=scan.next();
    System.out.print("비밀번호 입력: "); String mpwd=scan.next();

    boolean result=MemberController.mcontrol.login(mid,mpwd);
    if (result){System.out.println("로그인 성공");}
    else {System.out.println("로그인 실패");}
  }
  // 3. 아이디 찾기 화면 함수
  public void findId(){
    System.out.print("성함 입력: "); String mname=scan.next();
    System.out.print("연락처 입력: "); String mphone=scan.next();

    String result=MemberController.mcontrol.findId(mname,mphone);
    if (result!=null){System.out.println(result);}
    else{System.out.println("없습니다.");}
  }
  // 4. 비밀번호 찾기 화면 함수
  public void findPw(){
    System.out.print("아이디 입력: "); String mid=scan.next();
    System.out.print("연락처 입력: "); String mphone=scan.next();

    String result=MemberController.mcontrol.findPw(mid,mphone);
    if (result!=null){System.out.println(result);}
    else{System.out.println("없습니다.");}

  }
}
