package 과제.level2;


import java.util.Random;
import java.util.Scanner;

public class Level2_2 {
  public static int dbinsert() { return new Random().nextInt(3)+1;  }

  public static void main(String[] args) {
    int result=Level2_2.dbinsert();
    if (result==1){
      System.out.println("회원가입 성공");
    }else if (result==2){
      System.out.println("사용중인 아이디");
    }else if (result==3){
      System.out.println("입력이 안된 정보가 있습니다");
    }else{
      System.out.println("데이터베이스 오류");
    }
  }

}
