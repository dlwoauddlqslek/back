package day02; // 현재 클래스파일이 위치한 폴더명

public class Step1 { // class s // 자바는 모든 코드를 클래스 안에 작성한다.
  // main+엔터 // 실행할 코드는 모두 main 함수(스레드 포함) 안에 작성한다.
  // 지역변수 정의, 함수 호출
  public static void main(String[] args) { // main s

    // p.61 상수: 변하지 않는 수 vs : 변수: 변하는 수
    // final 예약어/키워드
    final int MAX_NUM=100;
    System.out.println("MAX_NUM = " + MAX_NUM);
    final int MIN_NUM;
    // MAX_NUM=1000; // 오류 발생: 상수이므로 수정 불가

    MIN_NUM=0;
    System.out.println("MIN_NUM = " + MIN_NUM);

    // soutv + 엔터: 가장 가까운 변수의 출력 함수 자동완성 해준다.
    // 코드 실행: 1. ctrl+shift+f10, main함수 왼쪽 초록색 실행 화살표 클릭
  } // main e
} // class e
