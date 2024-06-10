package day03;

import java.util.Scanner;

public class Step4 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("정수1: ");
    int 정1 = scan.nextInt();
    System.out.print("정수2: ");
    int 정2 = scan.nextInt();
    System.out.print("정수3: ");
    int 정3 = scan.nextInt();
    if (정1 > 정2 && 정1 > 정3) {
      System.out.println(정1);
    } else if (정2 > 정3) {
      System.out.println(정2);
    } else {
      System.out.println(정3);
    }

    System.out.print("연도: ");int year = scan.nextInt();
    if(year%4==0 && year%100==0 && year%400==0 ){
      System.out.printf("입력한%d년 은 '윤년' 입니다",year);
    }
    else if(year%4==0 && year%100==0){
      System.out.printf("입력한%d년 은 '평년' 입니다",year);
    }
    else if(year%4==0){
      System.out.printf("입력한%d년 은 '윤년' 입니다",year);
    }

    int 공1 = 14 ; int 공2 = 21 ; int 공3 = 9; int int4=0;
    System.out.print("정수1: "); int int1 = scan.nextInt();
    System.out.print("정수2: "); int int2 = scan.nextInt();
    System.out.print("정수3: "); int int3 = scan.nextInt();
    if(int1==공1 || int1==공2 || int1==공3){int4++;}
    if(int2==공1 || int2==공2 || int2==공3){int4++;}
    if(int3==공1 || int3==공2 || int3==공3){int4++;}
    System.out.printf("동일한 번호는 %d개 입니다",int4);


  }
}

