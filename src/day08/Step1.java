package day08;

import java.util.Arrays;

public class Step1 {
  public static void main(String[] args) {
    // 1. int형 10개를 저장할 수 있는 배열 선언과 동시에 초기화
    int[] num1=new int[]{1,2,3,4,5,6,7,8,9,10};
      // -[1][2][3][4][5][6][7][8][9][10]

    // Arrays.toString(배열변수): 현재 배열 내 요소 출력
    System.out.println(Arrays.toString(num1));

    int[] num2=new int[10];
      // [0][0][0][0][0][0][0][0][0][0]
    System.out.println(Arrays.toString(num2));

    int num3;
    // System.out.println(num3);

    // 배열 내 요소 하나씩 호출
    int sum=0;
    for(int i=0; i< num1.length; i++){
      System.out.println(num1[i]);
      sum+=num1[i];
    }
    System.out.println("sum = " + sum);

    // 문자 여러개를 저장하는 문자 배열 만들기 -> 문자열 만들기
      // String 클래스 이해 도움
    char[] alphabets=new char[26];
    char ch='A';
    for(int i=0; i<alphabets.length; i++){
      alphabets[i]=ch;
      ch++; // 알파벳 문자 1증가. A->B
    }
    for(int i=0; i<alphabets.length; i++){
      System.out.println(alphabets[i]+","+(int)alphabets[i]);
    }
      // char c='A'        -> 정수로 변환 O = 65
      // String str="ABC"  -> 정수로 변환 X = [65, 66, 67]
  }
}
