package day08;


import java.util.Scanner;

public class Regist2 {
  public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    SoccerManage[] list=new SoccerManage[100];
    int 고유식별번호=1;
    while(true){
      System.out.print("1. 선수등록 2. 전체선수명단 선택: ");
      int choice=scan.nextInt();
      if(choice==1){

        System.out.print("이름: "); String 이름=scan.next();
        System.out.print("나이: "); int 나이=scan.nextInt();
        System.out.print("선호포지션: ");String 선호포지션=scan.next();
        System.out.print("소속팀: ");String 소속팀=scan.next();
        list[고유식별번호-1]=new SoccerManage(고유식별번호,이름,나이,선호포지션,소속팀);
        고유식별번호++;
      }
      if(choice==2){
        for(int i=0; i<list.length; i++){
          if (list[i]!=null){
            list[i].showList();
          }
        }
      }

      if(choice==3){
        System.out.print("삭제할 고유식별번호를 입력해주세요: ");
        int num=scan.nextInt();
        for(int i=0; i<list.length; i++) {
          if (list[i] != null) {
            if (num == list[i].get고유식별번호()) {
              for (int j = i; j < list.length-1 ; j++) {
                list[j] = list[j + 1];
              }
            }
          }
        }
      }
    }
  }
}
