package day16.model.dto;

import day16.model.dao.MemberDao;

public class MemberDto { // 이동객체
  // 1. 멤버변수 <---> DB필드와 동일, private 권장
  private int mno;
  private String mdate;
  private String phone;
  private String name;
  private String pw;
  private String id;

  // 2. 생성자 기본생성자, 풀생성자
  public MemberDto(){}

  public MemberDto(String id, String pw, String name, String phone, String mdate, int mno) {
    this.id = id;
    this.pw = pw;
    this.name = name;
    this.phone = phone;
    this.mdate = mdate;
    this.mno = mno;
  }

  // 회원가입용 생성자
  public MemberDto(String id, String pw, String name, String phone) {
    this.id = id;
    this.pw = pw;
    this.name = name;
    this.phone = phone;
  }

  // 3. 메소드: 1.getter/setter 2.toString()

  public int getMno() {
    return mno;
  }

  public void setMno(int mno) {
    this.mno = mno;
  }

  public String getMdate() {
    return mdate;
  }

  public void setMdate(String mdate) {
    this.mdate = mdate;
  }

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getPw() {
    return pw;
  }

  public void setPw(String pw) {
    this.pw = pw;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  @Override
  public String toString() {
    return "MemberDto{" +
            "mno=" + mno +
            ", mdate='" + mdate + '\'' +
            ", phone='" + phone + '\'' +
            ", name='" + name + '\'' +
            ", pw='" + pw + '\'' +
            ", id='" + id + '\'' +
            '}';
  }
}
