package day02;

public class Step2 {
  public static void main(String[] args) {
    // 형 변환
    // 1. 묵시적/자동 형 변환:
      // 메모리 크기가 작은것 부터 큰 순으로
      // 데이터 손실이 없다.
      // byte -> short -> int -> long -> float -> double
    byte byteValue=10; // byte(1바이트) 상자에 'byteValue' 이라는 이름으로 변수에 10 대입
    int intValue=byteValue; // byte(1바이트) -> int(4바이트) : 묵시적 형 변환
    System.out.println("intValue = " + intValue);

    char charValue='가'; //char(2바이트) 상자에 'charValue' 이라는 이름으로 변수에 '가' 대입/저장
    intValue = charValue; // char(2바이트) -> int(4바이트) : 묵시적 형 변환
    System.out.println("intValue = " + intValue);

    intValue=50;             // int(4바이트)
    long longValue=intValue; // int -> long : 묵시적 형 변환
    System.out.println("longValue = " + longValue);

    longValue=100;
    float floatValue=longValue; // long -> float : 묵시적 형 변환 (부동소수점의 표현 단위 더 크기 때문, 더 정밀하기 때문)
    System.out.println("floatValue = " + floatValue);

    floatValue=100.5F;
    double doubleValue=floatValue; // float -> double : 묵시적 형 변환
    System.out.println("doubleValue = " + doubleValue);

    // -연산중에 묵시적 형 변환
    // 1. byte,short -> int 2. int,int -> int 3. long,int ->long 4. float,float -> float 5. double,float -> double

    byte b1=10; byte b2=20;
    int result=b1+b2; // byte +byte -> int, result1 자료형은 int이다

    byte b3=30; long l1=100;
    long result2= b3+l1; // byte + long -> long

    char c1='A'; char c2='B';
    int result3=c1+c2;        // char+char -> int

    int i1=10; double d1=4.0; // int + double -> double
    double result4=i1+d1;


    // 2. 명시적/강제 형 변환
      // 1. 메모리 크기가 큰것부터 작은 순으로 변환
      // 2. 데이터 손실이 있을 수도 잇다
      // byte <- short <- int <- long <- float <- double

    int intValue2=10;
    // byte byteValue2=intValue2; // 오류: 4바이트를 1바이트에 저장할 수 없다
    byte byteValue2=(byte)intValue2;
    System.out.println("byteValue2 = " + byteValue2);

    long longValue2=300;
    int intValue3=(int)longValue2; // 강제형변환: 데이터 크기에 따라 데이터의 손실이 있을 수 있다

    int intValue4=65;
    char charValue2=(char)intValue4;
    System.out.println("charValue2 = " + charValue2);

    double doubleValue2=3.14;
    int intValue5=(int)doubleValue2; // 강제 형 변환
    System.out.println("intValue5 = " + intValue5);

    char ch1='A';
    int intValue6=ch1;
    System.out.println("intValue6 = " + intValue6);

    int ch2=67;
    char charValue3=(char)ch2;
    System.out.println("charValue3 = " + charValue3);

    char ch7='글';
    int i8=ch7;
    System.out.println("i8 = " + i8);

    int value1=10; double value2=2.0;
    int result5=(int)(value1+value2);
      // 1. value1 + value2 -> int+double -> double
      // 2. int=double(오류)
      // - int=(int)double
    System.out.println("result5 = " + result5);






  }
}
