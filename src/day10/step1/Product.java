package day10.step1;

public class Product {
  private String c;
  private String n;
  private int p;

  // 생성자

  public Product(String c, String n, int p) {
    this.c = c;
    this.n = n;
    this.p = p;
  }

  //메소드
    // 1. 일반 함수
    // 2. private 멤버변수 외부로 접근하기 위해 getter and setter

  public String getC() {
    return c;
  }

  public void setC(String c) {
    this.c = c;
  }

  public String getN() {
    return n;
  }

  public void setN(String n) {
    this.n = n;
  }

  public int getP() {
    return p;
  }

  public void setP(int p) {
    this.p = p;
  }

    // 3. toString(): 객체 호출시 주소값이 아닌 속성값

  @Override
  public String toString() {
    return "Product{" +
            "c='" + c + '\'' +
            ", n='" + n + '\'' +
            ", p=" + p +
            '}';
  }
}
