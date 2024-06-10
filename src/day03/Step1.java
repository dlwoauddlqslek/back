package day03;

import java.util.Scanner;

public class Step1 {
  public static void main(String[] args) {
    // System.out: 시스템 출력, console 출력화면
    // System.out: 시스템 입력, 키보드

    // 입력 객체 만들기
      // 1. new Scanner();          Scanner 클래스: 입력에 관련된 객체 생성
      // 2. new Scanner(System.in); System.in: 입력장치는 키보드
      // 3. Scanner scan = new Scanner(system.in); : Scanner 타입으로 변수에 생성된 입력객체를 저장한다.
      // 4. 입력객체의 메소드를 이용한 입력값 가져오기
    Scanner scan = new Scanner(System.in);
    /*
     1. .next()     : 띄어쓰기 포함된 문자열도 입력받기 불가능
     2. .nextLine() : 띄어쓰기 포함된 문자열도 입려받기 가능
            - 단 nextLine() 위에 입력관련 메소드가 존재하면 하나로 취급
            - 개행[엔터] 기준으로 마침 처리, next() + nextLine(): 하나로 취급 당함
            - 해결방안
              의미없는 nextLine() 두 메소드 사이에 추가한다.
     3. .nextBoolean()
     4. .nextByte()
     5. .nextShort()
     6. .nextInt()
     7. .nextLong()
     8. .nextFloat()
     9. .nextDouble()
     * char c1= scan.next().charAt(0);
    */

    // 1.
    //scan.next(); // 1. 입력
    String str1=scan.next(); // 2. 저장
    System.out.println("str1 = " + str1); // 3. 출력

    // 2.
    scan.nextLine(); // 의미없는 입력메소드
    String str2=scan.nextLine();
    System.out.println("str2 = " + str2);

    // 3. 논리: 허용범위내 입력, 허용범위 외 입력시 오류
    boolean b1=scan.nextBoolean();
    System.out.println("b1 = " + b1);

    // 4. 바이트: 허용범위내 입력, 허용범위 외 입력시 오류
    byte byte1=scan.nextByte();
    System.out.println("byte1 = " + byte1);

    // 5. short
    short sh1=scan.nextShort();
    System.out.println("sh1 = " + sh1);

    // 6. int
    int in1=scan.nextInt();
    System.out.println("in1 = " + in1);

    // 7. long
    long ln1=scan.nextLong();
    System.out.println("ln1 = " + ln1);

    // 8. float
    float fl1=scan.nextFloat();
    System.out.println("fl1 = " + fl1);

    // 9. double
    double db1=scan.nextDouble();
    System.out.println("db1 = " + db1);
  }
}
