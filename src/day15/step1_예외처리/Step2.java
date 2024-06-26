package day15.step1_예외처리;

public class Step2 {
  public static void main(String[] args) throws ClassNotFoundException {
    try{method1();}
    catch (ClassNotFoundException e){
      System.out.println("함수에서 예외가 발생");
    }

    //[1] static 메소드 호출
   method1();
   // static 함수가 아니라서
    // main함수가 static 이므로 우선할당 되서 실행되는데 그 때 method1 메소드를 모른다

    //[2]static 메소드가 아닌 메소드 호출 방법
    //Step2 step2=new Step2(); // 힙영역 주소를 지역변수에 저장
    //step2.method1();          // 지역변수에 있는 힙영역에 접근해 메소드 호출

    //new Step2().method1();  // 지역변수가 없이 바로 힙영역으로부터 호출
  }

  static void method1() throws ClassNotFoundException{
    // 예외[해당 함수를 호출했던 곳으로-리턴과 비슷] 던지기/떠넘기기
    Class.forName("java.lang.String");
    // 1.직접처리: try{}catch{} 2.더넘기기: throws
  }
}
