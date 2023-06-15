/**
 =======================================================================================
 ------------------------------------- Problem 14-4 ------------------------------------
 Pet 클래스를 작성하자.

 ----------------------------------------- 입력 -----------------------------------------
 없음

 ------------------------------------- 출력(실행결과) -------------------------------------
 없음

 --------------------------------------- 에러 내용 ---------------------------------------
 없음

 =======================================================================================
 */
package Chap14.Solution;

public class Pet {
    private String name;
    private String masterName;

    public Pet(String name, String masterName) {
        this.name = name;
        this.masterName = masterName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMasterName() {
        return masterName;
    }

    public void setMasterName(String masterName) {
        this.masterName = masterName;
    }

    public void introduce() {
        System.out.println("나의 이름은 " + name + "입니다.");
        System.out.println("주인님의 이름은 " + masterName + "입니다.");
    }
}
