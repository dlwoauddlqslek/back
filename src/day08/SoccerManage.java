package day08;

public class SoccerManage {
  private int 고유식별번호;
  private String 이름;
  private int 나이;
  private String 선호포지션;
  private String 소속팀;

  SoccerManage(){}
  SoccerManage(int 고유식별번호,String 이름){
    this.고유식별번호=고유식별번호;
    this.이름=이름;
  }
  SoccerManage(int 나이,String 이름,String 선호포지션){
    this.나이=나이; this.이름=이름; this.선호포지션=선호포지션;
  }
  SoccerManage(int 고유식별번호,String 이름,int 나이){
    this.고유식별번호=고유식별번호; this.이름=이름; this.나이=나이;
  }
  SoccerManage(int 고유식별번호,String 이름,int 나이, String 소속팀){
    this.고유식별번호=고유식별번호; this.이름=이름; this.나이=나이; this.소속팀=소속팀;
  }
  SoccerManage(int 고유식별번호,String 이름,int 나이, String 선호포지션, String 소속팀){
    this.고유식별번호=고유식별번호; this.이름=이름; this.나이=나이; this.소속팀=소속팀; this.선호포지션=선호포지션;
  }

  public void showList(){
    System.out.println(고유식별번호+", "+이름+", "+나이+", "+선호포지션+", "+소속팀);
  }

  public int get고유식별번호() {
    return 고유식별번호;
  }

  public void set고유식별번호(int 고유식별번호) {
    this.고유식별번호 = 고유식별번호;
  }

  public String get이름() {
    return 이름;
  }

  public void set이름(String 이름) {
    this.이름 = 이름;
  }

  public int get나이() {
    return 나이;
  }

  public void set나이(int 나이) {
    this.나이 = 나이;
  }

  public String get선호포지션() {
    return 선호포지션;
  }

  public void set선호포지션(String 선호포지션) {
    this.선호포지션 = 선호포지션;
  }

  public String get소속팀() {
    return 소속팀;
  }

  public void set소속팀(String 소속팀) {
    this.소속팀 = 소속팀;
  }
}
