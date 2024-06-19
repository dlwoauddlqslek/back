package day10.step1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Step4 {
  public static void main(String[] args) {
    //* 입력객체
    Scanner scan=new Scanner(System.in);

    //1. 배열구성

    ArrayList<Product> productList=new ArrayList<>();

    //2. 무한루프
    while(true){//
      System.out.println("리스트상태확인: "+productList);
      System.out.println("1.등록(C) 2.출력(R) 3.수정(U) 4.삭제(D) 5.종료 선택>>"); // 무한출력
      int ch =scan.nextInt(); // 무한입력, 입력받은 데이터로 기능을 구분짓기 위해
      if(ch==1){
        // 1. 입력받고
        System.out.println("제품코드: "); String c=scan.next();
        System.out.println("제품명: "); String n=scan.next();
        System.out.println("제품가격: "); int p=scan.nextInt();
        // 2. 가공(유효성검사 혹은 객체화)
        Product product=new Product(c,n,p);

        productList.add(product);
      }
      else if(ch==2){}
      else if(ch==3){}
      else if(ch==4){
        // 입력받기
        System.out.println("삭제할 제품코드: "); String deleteCod=scan.next();
        // 삭제할 제품코드를 찾는다
        for(int i=0; i<productList.size(); i++){
          if (productList.get(i).getC().equals(deleteCod)){
            productList.remove(i);
            break;
          }
        }

      }
      else if(ch==5){}

    } // while e
  }
}
/*
  [메모리 설계]
  1. 객체의 추상적인 구성(특성, 행위)하기
  2. 구성한 개념을 클래스로 구현하기
  3. 해당 클래스 타입의 객체를 여러개 저장하기 위해 배열 선정/만들기

  [화면 구현 설계]
  1. 콘솔에 출력할 내용들을 구성

*/