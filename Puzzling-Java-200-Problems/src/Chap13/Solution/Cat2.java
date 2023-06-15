/**
 =======================================================================================
 ------------------------------------- Problem 13-2 ------------------------------------
 Animal2를 상속한 Cat2 클래스를 작성하자.

 ----------------------------------------- 입력 -----------------------------------------
 없음

 ------------------------------------- 출력(실행결과) -------------------------------------
 없음

 --------------------------------------- 에러 내용 ---------------------------------------
 없음

 =======================================================================================
 */
package Chap13.Solution;

public class Cat2 extends Animal2 {
    private int age;

    public Cat2(String name, int age) {
        super(name);
        this.age = age;
    }

    public void bark() {
        System.out.println("냐옹!");
    }

    @Override
    public String toString() {
        return age + "의 " + getName();
    }
}
