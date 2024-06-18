package day09.step3;

import java.util.Scanner;

public class 제품CRUD_변수버전 {
  public static void main(String[] args) {

    Scanner scan=new Scanner(System.in);
    int a=1;
    String c1=""; String c2=""; String c3="";
    String n1=""; String n2=""; String n3="";
    int p1=0; int p2=0; int p3=0;


    // 제품 메모리 설계

    while(true){
      System.out.println("1.등록(C) 2.출력(R) 3.수정(U) 4.삭제(D) 5.종료 선택>>"); // 무한출력
      int ch=scan.nextInt(); // 무한입력
      if(ch==1){

        System.out.println("제품코드를 입력해주세요: ");
        String c = scan.next();
        System.out.println("제품명을 입력해주세요: ");
        String n = scan.next();
        System.out.println("제품가격을 입력해주세요: ");
        int p = scan.nextInt();

        if (c1.equals("")){
          c1=c; n1=n; p1=p;
        }else if(c2.equals("")){
          c2=c; n2=n; p2=p;
        }else if(c3.equals("")){
          c3=c; n3=n; p3=p;
        }else{
          System.out.println("[경고] 제품등록 자리가 부족합니다.");
        }
      }
      else if(ch==2){
        if (!c1.equals("")){
          System.out.println(c1+" "+n1+" "+p1);
        }
        if(!c2.equals("")){
          System.out.println(c2+" "+n2+" "+p2);
        }
        if(!c3.equals("")){
          System.out.println(c3+" "+n3+" "+p3);
        }

      }
      else if(ch==3){
        System.out.println("수정할 제품코드: "); String u=scan.next();
        if(u.equals(c1)){
          System.out.println("새로운 제품명: "); n1=scan.next();
          System.out.println("새로운 제품가격: "); p1=scan.nextInt();
        }else if(u.equals(c2)){
          System.out.println("새로운 제품명: "); n2=scan.next();
          System.out.println("새로운 제품가격: "); p2=scan.nextInt();
        }else if(u.equals(c3)){
          System.out.println("새로운 제품명: "); n3=scan.next();
          System.out.println("새로운 제품가격: "); p3=scan.nextInt();
        }else{
          System.out.println("존재하지 않는 제품코드 입니다.");
        }
      }
      else if(ch==4){
        System.out.println("삭제할 제품코드: "); String u=scan.next();
        if(u.equals(c1)){
          c1="";
        }else if(u.equals(c2)){
         c2="";
        }else if(u.equals(c3)){
          c3="";
        }else{
          System.out.println("존재하지 않는 제품코드 입니다.");
        }
      }
      else if(ch==5){
        System.out.println("프로그램 종료합니다."); break;
      }
      else{
        System.out.println("알 수 없는 번호입니다.");
      }
    } // while e
  } // main e
}
