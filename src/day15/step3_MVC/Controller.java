package day15.step3_MVC;

import java.util.ArrayList;

public class Controller {

  static Controller controller=new Controller();

  // 2. 등록제어 함수, 매개변수: 저장할값 String, 리턴: 등록성공여부 boolean
  public boolean signUpC(String name){
    System.out.println("Controller.signUpC");
    boolean result= Dao.dao.signUpC(name);
    return result;
  }

  // 3. 출력제어 함수, 매개변수:x, 리턴: 회원목록 ArrayList<String>
  public ArrayList<String> printC(){
    System.out.println("Controller.printC");
    ArrayList<String> result= Dao.dao.printC();
    return result;
  }

  // 4. 수정제어 함수, 매개변수: 기존이름String, 새로운이름String, 리턴: 수정성공여부 boolean
  public boolean updateC(String oldName, String newName){
    System.out.println("Controller.updateC");
    boolean result= Dao.dao.updateC(oldName,newName);
    return result;
  }

  // 5. 삭제제어 함수, 매개변수: 삭제할 이름 String, 리턴: 삭제성공여부 boolean
  public boolean deleteC(String name){
    System.out.println("Controller.deleteC");
    boolean result=Dao.dao.deleteC(name);
    return result;
  }
}

