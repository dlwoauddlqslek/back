package 과제.leve1;

public class Level1_5 {
  public static void main(String[] args) {
    byte a=100;
    short shortvalue=a;
    System.out.println("byte -> short: " + shortvalue);

    short b=30000;
    int intvalue=b;
    System.out.println("short -> int: " + intvalue);

    int c=2000000000;
    long longvalue=c;
    System.out.println("int -> long: " + longvalue);

    long d=40000000000L;
    float floatvalue=d;
    System.out.println("long -> float: " + floatvalue);

    float e=3.1231231689453125F;
    double doublevalue=e;
    System.out.println("float -> double: " + doublevalue);


  }
}
