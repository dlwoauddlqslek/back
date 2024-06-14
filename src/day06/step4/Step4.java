package day06.step4;

import java.util.Scanner;

public class Step4 {
  public static void main(String[] args) {

    // 클래스 사용처: 1. 객체설계도 2. main 함수를 가지고 있는 클래스

    // 1. 입력객체: 키보드로부터 입력받기 위한기능을 제공하는 객체
    Scanner scanner=new Scanner(System.in);

    // 차 1대당 변수3개씩 사용한다는 가정에 차량이 3대이면 변수는 9개, 차랴이 100대면 300개
    int speed=0; // 속도변수 선언하고 0으로 초기화
    String color="빨강";
    String carNumber="25가4521";

//    int speed2=0; // 속도변수 선언하고 0으로 초기화
//    String color2="빨강";
//    String carNumber2="25가4521";
//
//    int speed3=0; // 속도변수 선언하고 0으로 초기화
//    String color3="빨강";
//    String carNumber3="25가4521";


    // 2. 무한루프
    while(true){
      // 출력함수
      System.out.println("------------------");
      System.out.print(">>> 1.증속 2.감속 3.중지:");

      // 입력함수 이용해서 키보드로부터 입력받은 값을 정수형으로 반환해서 변수에 저장
      int ch=scanner.nextInt();
      // 조건문
      if (ch == 1) {
        speed++; //속도 1 증가
        System.out.println(">증속(속도증가) 현재속도:"+speed);
      }
      else if (ch==2) {
        speed--; //속도 1 감소
        System.out.println(">감속(속도감소) 현재속도:"+speed);
      }
      else if (ch==3){
        System.out.println(">중지");
        speed=0;  //속도 0으로 변경
        break;    //가장 가까운 반복문,switch문 을 탈출
      }
      else {
        System.out.println(">알 수 없는 입력번호 입니다.");
      }

    }
    }
  }

