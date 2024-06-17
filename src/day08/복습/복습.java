package day08.복습;

public class 복습 {
  public static void main(String[] args) {


    //---------메소드
    // 1. 객체 생성
    제품 p1 = new 제품();
    // 2. 객체를 통해 메소드 호출
    p1.구매함수();
    // 왜? 객체없이 메소드 호출하면 될까 안될까? X
      // 메소드란? 여러개 실행문;/로직 묶음 행위
    int result1= p1.환불함수("코카콜라");

    // public(공개용) vs private(비공개용)
      // - 현재 클래스기준의 다른 클래스로부터 공개여부
      // - 관례적으로 멤버변수는 private 사용
      // 오류 이유: 제품명 멤버변수는 private 라서 접근불가능
    // p1.제품명="사이다";

    // getter and setter 활용, 멤버변수가 private일 때 외부에서 접근하기 위해

    // p1.제품명="사이다";
    p1.set제품명("사이다");
    // System.out.println(p1.제품명);
    System.out.println(p1.get제품명());
  }
}
