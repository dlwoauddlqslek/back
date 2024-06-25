package day14.step3;

public interface Sell {
  // 추상메소드
  void sell();
  default void order(){
    System.out.println("판매 주문");
  }
}
