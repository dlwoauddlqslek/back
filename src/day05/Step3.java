package day05;

import java.util.Scanner;

public class Step3 {
  public static void main(String[] args) {
    //[입력]: 입력객체
    Scanner scanner=new Scanner(System.in);

    //[1] 입력받은 수 만큼 별 출력
      //1. 키보드로부터 정수형으로 입력받아 정수형 변수에 저장
//    System.out.print("[1]별 개수:"); int star1 = scanner.nextInt();
//    System.out.println("star1 = " + star1);
//      //2. 입력받은 수 만큼 '*'출력
//    for(int i=1; i<=star1; i++) {
//      System.out.print("*");
//    }
//    System.out.println("");
//
//    //[2] 입력받은 수 만큼 별 출력 하는데 3의 배수마다 줄바꿈 처리 하시오.
//    System.out.print("[2]별 개수:"); int star2=scanner.nextInt();
//    for(int i=1; i<=star2; i++) {
//      System.out.print("*");
//      if (i % 3 == 0) {
//        System.out.println("");
//      }
//    }
//    System.out.println();
//
//    //[3] 입력받은 수 만큼 별을 하나의 변수에 하나씩 추가후 해당 변수 출력
//    System.out.print("[3]별 개수:"); int star3=scanner.nextInt();
//    String starTotal="";
//    for (int i=1; i<=star3; i++){
//      starTotal+="*";
//    }
//    System.out.println("starTotal = " + starTotal);

    //[4]
//    String str="";
//    for(int i=1; i<=5; i++){
//      str+="*";
//      System.out.println(str);
//    }
/*
    System.out.print("[4]줄수:"); int iLine=scanner.nextInt();
    String html="";

    //현재줄수는 1부터 입력받은 줄수까지 1씩 증가
    for( int cLine=1; cLine<=iLine;cLine++){
      for(int star=1; star<=cLine; star++){
        html+="*";
      }
      html+="\n";
    }
    System.out.println(html);
*/

    //[5]
  /*  String str1="";
    for (int i=1; i<=5; i++){
      for (int j=5; j>=i+1; j--){
        System.out.print(" ");}
      for(int k=1; k<=i; k++){
        System.out.print("*");;}
      System.out.println();

    }

   */
//    System.out.print("[5] 줄수:");
//    int iLine = scanner.nextInt();
//    String html="";
//
//    for(int cLine=1; cLine<=iLine; cLine++){
//      // 줄마다 공백출력
//      for(int blank=1; blank<=iLine-cLine; blank++){
//        html+=" ";
//      }
//      // 줄마다 별출력
//      for (int star=1; star<=cLine;star++){
//        html+="*";
//      }
//      html+="\n";
//    }
//    System.out.println(html);

//    System.out.print("[6] 줄수:");
//    int iLine=scanner.nextInt();
//    String html="";
//    for(int cLine=1; cLine<=iLine; cLine++){
//      for(int star=1; star<=iLine-cLine+1;star++ ){
//        html+="*";
//      }
//      html+="\n";
//    }
//    System.out.println(html);

//    System.out.print("[7] 줄수:");
//    int iLine=scanner.nextInt();
//    String html="";
//    for(int cLine=1; cLine<=iLine; cLine++){
//      for(int blank=1; blank<=cLine-1; blank++){
//        html+=" ";
//      }
//      for(int star=1;star<=iLine-cLine+1;star++){
//        html+="*";
//      }
//      html+="\n";
//    }
//    System.out.println(html);

//    System.out.print("[8] 줄수:");
//    int iLine=scanner.nextInt();
//    String html="";
//    for(int cLine=1; cLine<=iLine; cLine++){
//      for(int blank=1; blank<=iLine-cLine;blank++){
//        html+=" ";
//      }
//      for(int star=1; star<=cLine*2-1;star++){
//        html+="*";
//      }
//      for(int blank=1; blank<=iLine-cLine;blank++){
//        html+=" ";
//      }
//      html+="\n";
//    }
//    System.out.println(html);

//    System.out.print("[9] 줄수:");
//    int iLine=scanner.nextInt();
//    String html="";
//    for(int cLine=1; cLine<=iLine; cLine++){
//      for(int blank=1; blank<=cLine-1; blank++){
//        html+=" ";
//      }
//      for(int star=1;star<=(iLine-cLine+1)*2-1;star++){
//        html+="*";
//      }
//      for(int blank=1; blank<=cLine-1; blank++){
//        html+=" ";
//      }
//      html+="\n";
//    }
//    System.out.println(html);





  } // main e
}
