/**
 =======================================================================================
 ------------------------------------- Problem 13-1 ------------------------------------
 Animal1을 상속한 Dog1 클래스를 작성하자.

 ----------------------------------------- 입력 -----------------------------------------
 없음

 ------------------------------------- 출력(실행결과) -------------------------------------
 없음

 --------------------------------------- 에러 내용 ---------------------------------------
 없음

 =======================================================================================
 */
package Chap13.Solution;

public class Dog1 extends Animal1 {
    private String type;

    public Dog1(String name, String type) {
        super(name);
        this.type = type;
    }

    public void bark() {
        System.out.println("멍멍!");
    }
}
