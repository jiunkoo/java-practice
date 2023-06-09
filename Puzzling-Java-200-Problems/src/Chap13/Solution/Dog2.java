/**
 =======================================================================================
 ------------------------------------- Problem 13-2 ------------------------------------
 Animal2를 상속한 Dog2 클래스를 작성하자.

 ----------------------------------------- 입력 -----------------------------------------
 없음

 ------------------------------------- 출력(실행결과) -------------------------------------
 없음

 --------------------------------------- 에러 내용 ---------------------------------------
 없음

 =======================================================================================
 */
package Chap13.Solution;

public class Dog2 extends Animal2 {
    private String type;

    public Dog2(String name, String type) {
        super(name);
        this.type = type;
    }

    public void bark() {
        System.out.println("멍멍!");
    }

    @Override
    public String toString() {
        return type + "의 " + getName();
    }
}
