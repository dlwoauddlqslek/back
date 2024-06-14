package day06.step3;

public class Com {
  //멤버변수/필드
  String cpu;       //cpu
  String vga;       //그래픽카드
  int power;        //파워
  int ram;          //램
  String cooler;    //쿨러
  String mainboard; //메인보드
  //메소드: 쿨러 팬 돌리기, 영상신호 보내기, led등 키기, 데이터연산하기
  public void 영상신호(){
    System.out.println(vga+" 영상신호 보내는 중");
  }
  public void 데이터처리(){
    System.out.println(cpu+"데이터 처리중");
  }
}
