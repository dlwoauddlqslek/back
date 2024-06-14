package 과제.leve1;

public class Level1_6 {
  public static void main(String[] args) {
    short s=48;
    byte bvalue=(byte)s;
    System.out.println("byte <- short: " + bvalue);

    int i=-27648;
    short svalue=(short)i;
    System.out.println("short <- int: " + svalue);

    long l=1345294336;
    int ivalue=(int)l;
    System.out.println("int <- long: " + ivalue);

    float f=3.1231F;
    long lvalue=(long)f;
    System.out.println("long <- float: " + lvalue);

    double d=3.1231232;
    float fvalue=(float)d;
    System.out.println("float <- double: " + fvalue);
  }
}
