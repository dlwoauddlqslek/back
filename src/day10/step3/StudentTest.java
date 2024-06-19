package day10.step3;

import java.util.Scanner;

public class StudentTest {
  public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
//    Student studentLee=new Student(1001,"Lee");
//    studentLee.addSubject("국어",100);
//    studentLee.addSubject("수학",50);
//
//    Student studentKim=new Student(1002,"Kim");
//    studentKim.addSubject("국어",70);
//    studentKim.addSubject("수학",85);
//    studentKim.addSubject("영어",100);
//
//    studentLee.showStudentInfo();
//    System.out.println("===================================================");
//    studentKim.showStudentInfo();
    while(true){
      System.out.println("1.학생등록 2.점수등록 3.점수확인 4.학생삭제 선택: ");
      int ch=scan.nextInt();
      if(ch==1){
        System.out.println("학번 입력: "); int num=scan.nextInt();
        System.out.println("이름 입력: "); String name=scan.next();

      }
      if(ch==2){}
      if(ch==3){}
      if(ch==4){}

    }

  }
}
