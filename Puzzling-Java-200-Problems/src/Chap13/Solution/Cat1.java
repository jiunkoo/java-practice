/**
 =======================================================================================
 ------------------------------------- Problem 13-1 ------------------------------------
 Animal1을 상속한 Cat1 클래스를 작성하자.

 ----------------------------------------- 입력 -----------------------------------------
 없음

 ------------------------------------- 출력(실행결과) -------------------------------------
 없음

 --------------------------------------- 에러 내용 ---------------------------------------
 없음

 =======================================================================================
 */
package Chap13.Solution;

public class Cat1 extends Animal1 {
    private int age;

    public Cat1(String name, int age) {
        super(name);
        this.age = age;
    }

    public void bark() {
        System.out.println("냐옹!");
    }
}
