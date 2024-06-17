package day08;

public class Book {

  // 1. 멤버변수
  private String bookName;
  private String author;

  // 2. 생성자: 오른족클릭 -> 생성 -> 생성자
  public Book(){}
  public Book(String bookName, String author) {
    this.bookName = bookName;
    this.author = author;
  }

  // 3. 메소드
    // 1. 일반함수
  public void showBookInfo(){
    System.out.println(this.bookName+","+this.author);
  }
    // 2. getter and setter
  public String getBookName() {
    return bookName;
  }

  public void setBookName(String bookName) {
    this.bookName = bookName;
  }

  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }
}
