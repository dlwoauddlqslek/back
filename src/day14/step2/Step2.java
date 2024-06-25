package day14.step2;

public class Step2 {
  public static void main(String[] args) {

    // 인터페이스 타입의 변수 선언
    StepInterface si;
    // 인터페이스는 스스로 객체/인스턴스를 생성 불가능
      // 구현 안한 메소드가 있어서 -> 추상메소드
      // 구현(implements)을 해줄 클래스가 필요하다.
      // implements 한 클래스로 객체 생성한다. -> 구현(객)체
    new ImplementClass(); // <-- (인터페이스를 구현한 클래스의) 객체
    si=new ImplementClass();

    si.method1(3);
    si.method2("java");
    si.method3(3);
    si.method4("java");
    StepInterface.method5(5);
    StepInterface.method6("java");
    //si.method7; // private 이므로 외부클래스로부터 사용불가능
    //si.method8;

    //si.method9;
    //si.method10;

    System.out.println(StepInterface.value1);
  }
}
