package day09.step1;

public class Step1 {
  public static void main(String[] args) {

    // [1] 학생(객체) 2명 생성
    Student studentJames=new Student("James",5000);
    Student studentThomas=new Student("Thomas",10000);
    Student studentEdward=new Student("Edward",30000);

    Bus bus100=new Bus(100);
    studentJames.takeBus(bus100);
    System.out.println(studentJames);
    System.out.println(bus100);

    Subway subwayGreen=new Subway("2호선");
    studentJames.takeSubway(subwayGreen);
    System.out.println(studentThomas);
    System.out.println(subwayGreen);

    Taxi taxi4885=new Taxi(4885);
    studentEdward.takeTaxi(taxi4885);
    System.out.println(studentEdward);
    System.out.println(taxi4885);

  }
}
