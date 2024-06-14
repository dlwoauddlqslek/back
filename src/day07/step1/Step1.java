package day07.step1;

public class Step1 {
  public static void main(String[] args) {

    // [i]객체 만들기
      // 1. 타입/클래스명(설계도선택) 작성한다.
    // Person
      // 2. 객체를 담을 임의의 변수명 작성한다.
    // Person personLee;
      // 3. 객체/인스턴스를 생성해서 변수에 담는다.
      // new 생성자명();
    Person personLee=new Person();

    Person personKim=new Person("김현수");

    Person personPark=new Person("박지성",180,80);

  }
}
