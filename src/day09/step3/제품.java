package day09.step3;

public class 제품 {
  String c;
  String n;
  int p;

  public 제품(String c, String n, int p) {
    this.c = c;
    this.n = n;
    this.p = p;
  }

  @Override
  public String toString() {
    return "제품{" +
            "c='" + c + '\'' +
            ", n='" + n + '\'' +
            ", p=" + p +
            '}';
  }
}
