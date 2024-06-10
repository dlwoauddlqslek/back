package day03;

import java.util.Scanner;

public class Step3 {
  public static void main(String[] args) {
    Scanner scan= new Scanner(System.in);
//    System.out.print("반지름: "); double 반지름=scan.nextDouble();
//    double 넓이=반지름*반지름*3.14;
//    System.out.printf("원 넓이: %.2f\n",넓이);
//
//    System.out.print("나이: "); short 나이=scan.nextShort();
//    System.out.println(나이>=40?"중년":나이>=20?"성인":나이>=10?"학생":"");

    // 문제1
//    System.out.print("정수: ");
//    int in1=scan.nextInt();
//    System.out.println(in1%7==0?"O":"X");

    // 문제2
//    System.out.print("정수: ");
//    int in2=scan.nextInt();
//    System.out.println(in2%2==1?"홀수":"짝수");

    // 문제3
//    System.out.print("정수: ");int in3=scan.nextInt();
//    System.out.println(in3%7==0 && in3%2==0?"O":"X");
//
//    // 문제4
//    System.out.print("정수: ");int in4=scan.nextInt();
//    System.out.println(in4%11==0 || in4%2==0 ? "O":"X");

    // 문제5
//    System.out.print("정수1: ");int in5=scan.nextInt();
//    System.out.print("정수2: ");int in6=scan.nextInt();
//    System.out.println(in5>in6?+in5:in6);

    // 문제7
//    System.out.print("실수1: ");double db1=scan.nextDouble();
//    System.out.print("실수2: ");double db2=scan.nextDouble();
//    double db3=db1/db2*100;
//    System.out.printf("%.1f%%",db3);
//
//    // 문제8
//    System.out.print("윗변: ");double db4=scan.nextDouble();
//    System.out.print("밑변: ");double db5=scan.nextDouble();
//    System.out.print("높이: ");double db6=scan.nextDouble();
//    double db7=(db4+db5)*db6/2;
//    System.out.printf("넓이: %.1f",db7);

    // 문제9
//    System.out.print("키: ");int 키=scan.nextInt();
//    int 표준체중=(int)((키-100)*0.9);
//    System.out.println("표준체중: "+표준체중);
//
//    // 문제10
//    System.out.print("키: ");double 키2=scan.nextDouble();
//    System.out.print("몸무게: ");double 몸무게=scan.nextDouble();
//    double bmi=몸무게/키2/100*키2/100;
//    System.out.printf("BMI: %.2f",bmi);

    // 문제11
//    System.out.print("inch: ");double inch=scan.nextDouble();
//    double cm=inch*2.54;
//    System.out.printf("%.2fcm",cm);
//
//    // 문제12
//    System.out.print("중간고사: ");double 중=scan.nextDouble();
//    System.out.print("기말고사: ");double 기=scan.nextDouble();
//    System.out.print("수행평가: ");double 수=scan.nextDouble();
//    double point=중*0.3+기*0.3+수*0.4;
//    System.out.printf("총점: %.2f",point);

    // 문제13
//    int x=10;
//    int y= x-- +5+ --x;
//    // 1. x-- +5 -> 10+5 (x는 +연산 후 1차감)
//    // 2. 15 + --x -> 15 + 8 (x는 +연산 전 1차감)
//    // x=8, y=23
//    System.out.printf("x의 값: %d, y의 값: %d",x,y);
//
//    // 문제15
//    System.out.print("국어: ");int 국=scan.nextInt();
//    System.out.print("영어: ");int 영=scan.nextInt();
//    System.out.print("수학: ");int 수=scan.nextInt();
//    int 총점=국+영+수;
//    double 평균=총점/3;
//    System.out.printf("총점: %d, 평균: %.2f",총점,평균);

    // 문제16
//    System.out.print("정수1: ");int 정1=scan.nextInt();
//    System.out.print("정수2: ");int 정2=scan.nextInt();
//    System.out.print("정수3: ");int 정3=scan.nextInt();
//
//    System.out.println(정1>정2 && 정1>정3 ? 정1:정2>정3?정2:정3);

    // 문제17
      // 문자열(String)은 비교연산자 사용 불가능(객체)
      // 객체 비교 메소드: 객체.equals()
      // 문자열 비교: "문자열".equals("비교문자열")
    System.out.print("아이디: ");String id=scan.next();
    System.out.print("비밀번호: ");String pw=scan.next();

    System.out.println(id.equals("admin") && pw.equals("1234")? "로그인 성공":"로그인 실패");






  }
}
