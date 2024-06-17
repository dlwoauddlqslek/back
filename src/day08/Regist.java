package day08;

public class Regist {
  public static void main(String[] args) {
    SoccerManage p1=new SoccerManage();
    SoccerManage p2=new SoccerManage(2,"박지성");
    SoccerManage p3=new SoccerManage(31,"손흥민","공격수");
    SoccerManage p4=new SoccerManage(4,"이강인",25);
    SoccerManage p5=new SoccerManage(5,"김민재",28,"독일");
    SoccerManage p6=new SoccerManage(6,"서장훈",21,"공격수","서울");

    p1.set고유식별번호(1);
    p1.set이름("유재석");
    p1.set나이(40);
    p1.set선호포지션("공격수");
    p1.set소속팀("인천");

    p2.set나이(38);
    p2.set선호포지션("미드필더");
    p2.set소속팀("인천");

    p3.set고유식별번호(3);
    p3.set소속팀("토트넘");

    p4.set선호포지션("미드필더");
    p4.set소속팀("파리");

    p5.set선호포지션("수비수");

    System.out.println("고유식별번호,이름,나이,선호포지션,소속팀");

    System.out.println(p1.get고유식별번호()+", "+p1.get이름()+", "+p1.get나이()+", "+
            p1.get선호포지션()+", "+p1.get소속팀());

    System.out.println(p2.get고유식별번호()+", "+p2.get이름()+", "+p2.get나이()+", "+
            p2.get선호포지션()+", "+p2.get소속팀());

    System.out.println(p3.get고유식별번호()+", "+p3.get이름()+", "+p3.get나이()+", "+
            p3.get선호포지션()+", "+p3.get소속팀());

    System.out.println(p4.get고유식별번호()+", "+p4.get이름()+", "+p4.get나이()+", "+
            p4.get선호포지션()+", "+p4.get소속팀());

    System.out.println(p5.get고유식별번호()+", "+p5.get이름()+", "+p5.get나이()+", "+
            p5.get선호포지션()+", "+p5.get소속팀());

    System.out.println(p6.get고유식별번호()+", "+p6.get이름()+", "+p6.get나이()+", "+
            p6.get선호포지션()+", "+p6.get소속팀());
  }
}
