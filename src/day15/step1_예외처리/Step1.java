package day15.step1_예외처리;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Step1 {
  public static void main(String[] args) {
    // [1]일반예외: 발생할 수도 있고 안할 수도 있고, 컴파일러 무조건 예외처리 검사
    try {
      //==========예외가 발생할 것 같은
      Class.forName("java.lang.String");    // .forName(클래스명): 해당 클래스명이 존재하는지 검사한다
      Class.forName("java.lang.String2");
      // -java.lang.ClassNotFoundException;
    }catch (ClassNotFoundException e){
      //===========예외 발생시
      System.out.println(e); // 로그를 남기고 추후에 개발자가 코드 수정
    }
    // [2]실행예외: 발생할 수도 있고 안할 수도 있고(방지)
    try {
      String str1 = "ThisIsJava";
      System.out.println(str1.length());  //문자열.length(); 문자열 길이

      String str2 = null;
      System.out.println(str2.length()); // .(도트/접근)연산자, 객체내 멤버변수,메소드 접근
      // java.lang.NullPointerException
    }catch (NullPointerException e){
      System.out.println(e);
    }

    //
    String str3="100";
    String str4="1aa";
    int result1=Integer.parseInt(str3);  // Integer클래스: int형 관련 클래스, parseInt() 문자열->정수형 타입 변환
                             // .parseInt(): static 함수
    System.out.println(result1);
    try {
      int result2 = Integer.parseInt(str4);
      System.out.println(result2);
    }catch (NumberFormatException e){
      System.out.println(e);
    }
    try {
      int[] intArray = {1, 2, 3};
      System.out.println(intArray[2]);
      System.out.println(intArray[3]);
    }catch (ArrayIndexOutOfBoundsException e){
      System.out.println(e);
    }

    //
    try {
      Scanner scan = new Scanner(System.in);
      int ch = scan.nextInt(); // InputMismatchException
    }catch (InputMismatchException e){
      System.out.println(e);
    }

    // try 다중 catch
    try {
      String str5 = "1aa";
      int result3 = Integer.parseInt(str5);

      int[] intArray = {1, 2, 3};
      System.out.println(intArray[3]);

      Scanner scan = new Scanner(System.in);
      int ch = scan.nextInt();
    }catch (NumberFormatException e){
      System.out.println("숫자형으로 변환할 수 없음");
    }catch (ArrayIndexOutOfBoundsException e){
      System.out.println("없는 인덱스");
    }catch (InputMismatchException e){
      System.out.println("잘못된 입력");
    }catch (Exception e){
      System.out.println("알 수 없는 예외 발생. 추후 보수 예정");
    }finally {
      System.out.println("예외가 있더라도 무조건 실행되는 구역");
    }


  }
}
