package day06.step6;

import java.util.Scanner;

public class Step6 {
  public static void main(String[] args) {
    // 1. 입력 객체: 입력기능( .next() )을 사용하기 위해
      // .next() 관련된 기능을 scanner 객체가 가지고 있다
    Scanner scan=new Scanner(System.in);
    // 객체 생성
    Account a1=new Account();
    // 객체내 필드/멤버변수에 값 대입
    a1.balance=0;
    a1.number="39549-5939675";

    while(true){ // w s: 무한반복
      System.out.println("1.예금 2.출금 3.잔액 4.종료");
      System.out.print("원하는 업무의 숫자를 입력해주세요");
      int btn=scan.nextInt();
      System.out.println("btn = " + btn);


      if(btn==1){
        System.out.print("예금할 금액을 입력하세요"); int in=scan.nextInt();
        System.out.println("in = " + in);
        a1.balance+=in;
        System.out.println(a1.balance);
      }
      else if(btn==2){
        System.out.print("출금할 금액을 입력하세요"); int out=scan.nextInt();
        System.out.println("out = " + out);
        a1.balance-=out;
        System.out.println(a1.balance);
      }
      else if(btn==3){
        System.out.print("계좌의 잔액은"+a1.balance+"원 입니다\n");
      }
      else if(btn==4){
        System.out.println("안녕히 가십시오");
        break;
      }
      else{
        System.out.println("잘못된 번호입니다");
      }


    } // w end
  }
}
