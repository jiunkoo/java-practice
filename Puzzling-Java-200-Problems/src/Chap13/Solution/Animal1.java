/**
 =======================================================================================
 ------------------------------------- Problem 13-1 ------------------------------------
 Animal1 클래스를 작성하자.

 ----------------------------------------- 입력 -----------------------------------------
 없음

 ------------------------------------- 출력(실행결과) -------------------------------------
 없음

 --------------------------------------- 에러 내용 ---------------------------------------
 없음

 =======================================================================================
 */
package Chap13.Solution;

abstract class Animal1 {
    private String name;

    public Animal1(String name) {
        this.name = name;
    }

    public abstract void bark();

    public String getName() {
        return name;
    }
}
