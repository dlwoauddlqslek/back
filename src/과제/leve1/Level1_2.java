package 과제.leve1;

public class Level1_2 {
  public static void main(String[] args) {
    boolean a=true;
    byte b=100;
    char c='A';
    short d=30000;
    int e=2000000;
    long f=20000000000L;
    float g=3.14F;
    double h=3.12312123;
    System.out.printf("%s %30s %30s\n","type","value","range");
    System.out.printf("%66s","------------------------------------------------------------------\n");
    System.out.printf("%s %27s %30s\n","boolean",a,"true or false");
    System.out.printf("%s %30d %30s\n","byte",b,"-128 ~ 127");
    System.out.printf("%s %30s %30s\n","char",c,"0~65535[ character 1 ]");
    System.out.printf("%s %29d %30s\n","short",d,"-32768 ~ 32767");
    System.out.printf("%s %31d %30s\n","int",e,"-+2000 million");
    System.out.printf("%s %30d %30s\n","long",f,"-+2000 million Excess");
    System.out.printf("%s %29f %30s\n","float",g,"8 decimal places");
    System.out.printf("%s %28f %30s\n","double",h,"17 decimal places");

  }


}
