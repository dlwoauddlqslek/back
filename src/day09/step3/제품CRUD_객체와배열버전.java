package day09.step3;

import java.util.Scanner;

public class 제품CRUD_객체와배열버전 {
  public static void main(String[] args) {

    Scanner scan=new Scanner(System.in);
    제품[] list=new 제품[3];


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

        boolean saveCheck = false;
        for(int i=0; i<=list.length; i++){
          if( i == list.length ){
            System.out.println("[경고] 제품등록 자리가 부족합니다.");
            break;
          }
          if (list[i]==null) {
            list[i] = new 제품(c, n, p);
            saveCheck = true;
            break;
          }
        } // w end



      }
      else if(ch==2){
        for(int i=0; i<list.length; i++){
          if(list[i]!=null){
            System.out.println(list[i]);
          }
        }

      }
      else if(ch==3){
        System.out.println("수정할 제품코드: "); String u=scan.next();

        boolean e = false;

        for(int i=0; i<list.length; i++){
          if(list[i]!=null && u.equals(list[i].c)){
            System.out.println("새로운 제품명: "); list[i].n=scan.next();
            System.out.println("새로운 제품가격: "); list[i].p=scan.nextInt();
            e = true;
            break;
          }

          /*if(!u.equals(list[i].c)){
            System.out.println("잘못된 제품코드 입니다.");
          }*/
        }
        if(e == false){
          System.out.println("잘못된 제품코드 입니다."); break;
        }
      }
      else if(ch==4){
        boolean e=false;
        System.out.println("삭제할 제품코드: "); String u=scan.next();
        for(int i=0; i<list.length; i++) {
          if ( list[i] != null && u.equals(list[i].c)) {
            list[i] = null; e=true;
            break;
          }

        }
        if(e == false){
          System.out.println("잘못된 제품코드 입니다.");
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
