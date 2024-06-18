package day09.step3;

import java.util.Scanner;

public class 제품CRUD_배열버전 {
  public static void main(String[] args) {

    Scanner scan=new Scanner(System.in);
    String[] c1=new String[3];
    String[] n1=new String[3];
    int[] p1=new int[3];


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

        if (c1[0]==null){
          c1[0]=c; n1[0]=n; p1[0]=p;
        }else if(c1[1]==null){
          c1[1]=c; n1[1]=n; p1[1]=p;
        }else if(c1[2]==null){
          c1[2]=c; n1[2]=n; p1[2]=p;
        }else{
          System.out.println("[경고] 제품등록 자리가 부족합니다.");
        }
      }
      else if(ch==2){
        if (c1[0]!=null){
          System.out.println(c1[0]+" "+n1[0]+" "+p1[0]);
        }
        if(c1[1]!=null){
          System.out.println(c1[1]+" "+n1[1]+" "+p1[1]);
        }
        if(c1[2]!=null){
          System.out.println(c1[2]+" "+n1[2]+" "+p1[2]);
        }

      }
      else if(ch==3){
        System.out.println("수정할 제품코드: "); String u=scan.next();
        if(u.equals(c1[0])){
          System.out.println("새로운 제품명: "); n1[0]=scan.next();
          System.out.println("새로운 제품가격: "); p1[0]=scan.nextInt();
        }else if(u.equals(c1[1])){
          System.out.println("새로운 제품명: "); n1[1]=scan.next();
          System.out.println("새로운 제품가격: "); p1[1]=scan.nextInt();
        }else if(u.equals(c1[2])){
          System.out.println("새로운 제품명: "); n1[2]=scan.next();
          System.out.println("새로운 제품가격: "); p1[2]=scan.nextInt();
        }else{
          System.out.println("존재하지 않는 제품코드 입니다.");
        }
      }
      else if(ch==4){
        System.out.println("삭제할 제품코드: "); String u=scan.next();
        if(u.equals(c1[0])){
          c1[0]=null;
        }else if(u.equals(c1[1])){
         c1[1]=null ;
        }else if(u.equals(c1[2])){
          c1[2]=null;
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
