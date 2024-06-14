package 과제.leve1;

import java.util.Scanner;

public class Level1_3 {
  public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    System.out.print("input boolean: "); boolean a=scan.nextBoolean();
    System.out.print("input byte: "); byte b=scan.nextByte();
    System.out.print("input char: "); char c=scan.next().charAt(0);
    System.out.print("input short: "); short d=scan.nextShort();
    System.out.print("input int: "); int e=scan.nextInt();
    System.out.print("input long: "); long f=scan.nextLong();
    System.out.print("input float: "); float g=scan.nextFloat();
    System.out.print("input double: "); double h=scan.nextDouble();
    System.out.print("output boolean: "+a+"\n");
    System.out.print("output byte: "+b+"\n");
    System.out.print("output char: "+c+"\n");
    System.out.print("output short: "+d+"\n");
    System.out.print("output int: "+e+"\n");
    System.out.print("output long: "+f+"\n");
    System.out.print("output float: "+g+"\n");
    System.out.print("output double: "+h+"\n");



  }
}
