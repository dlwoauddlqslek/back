package day05;

public class Step2 {
  public static void main(String[] args) {
    // 조건문 왜? 판단의 흐름 제어
    // 반복문 왜? 동일한 실행을 반복으로 실행

    // 1.
    int num = 1;
    num = num + 2;
    num = num + 3;
    num = num + 4;
    num = num + 5;
    num = num + 6;
    num = num + 7;
    num = num + 8;
    num = num + 9;
    num = num + 10;
    System.out.println(num);

    int num2 = 1;
    for (int i = 2; i <= 10; i++) {
      num2 = num2 + i;
    }
    System.out.println(num2);
    /*

        초기값               연수구
        while(조건문){       while(부평구){
        실행문;              걷기;
        증감식;              걸음수++
        }                   }

    */


    int num3 = 1;
    int i = 2;
    while (i <= 10) {
      num3 = num3 + i;
      i++;
    }
    System.out.println(num3);

    // 연산하거나 그값을 가져다 사용하려면 변수에 반드시 어떤 값을 가지고 있어야 한다.
    // int sum; <-- 오류
    int sum = 0;
    sum = sum + 3;

    // 무한반복: 24시간 서비스를 제공할 때 끊임없이 돌아야하는 경우
//    while(true){
//      System.out.println(">>Loop<<");
//    }
//      for(;;){
//        System.out.println(">>Loop<<");
//      }

    int num4 = 1;
    int sum2 = 0; // 0을 대입하는 이유: sum2에 연산하기 위해 초기값 대입

    do {
      sum2 += num4;
      num4++;
    } while (num4 <= 10);
    System.out.println(num4);

    sum2 = 0;
    for (int num5 = 1; num5 <= 10; num5++) {
      sum2 += num5;
    }
    System.out.println(sum2);

    // 관례
    // while: 무한루프 구현할 때 while(true){}
    // do-while: 반드시 한번 이상 수행해야 할 때
    // for: 일반적이다.

    // for문 중첩
      /*
        외부
        dan=2
          내부 times=1 times=1 times=1 times=1 times=1 times=1 times=1 times=1 times=1 times=1
        dan=3
        dan=4
        dan=5
        dan=6
        dan=7
        dan=8
        dan=9


      */
    for (int dan = 2; dan <= 9; dan++) {
      //System.out.print("dan=" + dan);

      for (int times = 1; times <= 9; times++) {
        System.out.printf("%d*%d=%2d ", dan, times, dan * times);
      }
      System.out.println("");
    }
    // continue: 반복문 안에서 continue문을 만나면 이후의 문장은 수행하지 않고 for문의 증감식으로 이동
    // 특정 조건에서는 수행하지 않고 건너뛰어야 할 때
    int total = 0;
    for (int num5 = 1; num5 <= 100; num5++) {
      if (num5 % 2 == 0) {
        continue;
      } //코드의 흐름이 continue; 만나면 for문의 증감식으로 이동
      total += num5;
    }

    //예제: 1부터 1씩증가 하면서 누적합계가 100이면 중지
    int sum3 = 0;
    for (int num6 = 0; sum3 < 100; num6++) {
      sum3 += num6;
    }
    System.out.println("sum3 = " + sum3);

    sum3 = 0;
    for (int num6 = 0; ; num6++) {
      sum3 += num6;
      if (sum3 >= 100) break;
    }
    System.out.println("sum3 = " + sum3);


    int no1 = 10;
    int no2 = 2;
    int result = 0;
    char operator = '+';
    if (operator == '+') {
      result = no1 + no2;
    }
    System.out.println("result = " + result);

    switch (operator){
      case '+':result=no1+no2;
    }
    System.out.println("result = " + result);

    for (int dan = 2; dan <= 9; dan++) {
      if(dan%2==1)
        continue;

      for (int times = 1; times <= 9; times++) {
        System.out.printf("%d*%d=%2d ", dan, times, dan * times);
      }
      System.out.println("");


  }

    for (int dan = 2; dan <= 9; dan++) {


      for (int times = 1; times <= 9; times++) {


        System.out.printf("%d*%d=%2d ", dan, times, dan * times);
       if (dan<=times)
         break;
      }
      System.out.println("");
}





    }
}


