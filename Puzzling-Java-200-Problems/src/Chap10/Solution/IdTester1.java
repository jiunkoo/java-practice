/**
 =======================================================================================
 ------------------------------------- Problem 10-2 ------------------------------------
 Id1 클래스를 작성하자.
 9-1의 Human4.java 클래스에서 식별 번호와 관련된 처리만 추출한다.

 ----------------------------------------- 입력 -----------------------------------------
 없음

 ------------------------------------- 출력(실행결과) -------------------------------------
 x.getId() = 1
 y.getId() = 2
 Id.counter = 2
 x.counter = 2
 y.counter = 2

 --------------------------------------- 에러 내용 ---------------------------------------
 없음

 =======================================================================================
 */
package Chap10.Solution;

public class IdTester1 {
    public static void main(String[] args) {
        Id1 x = new Id1();
        Id1 y = new Id1();

        System.out.println("x.getId() = " + x.getId());
        System.out.println("y.getId() = " + y.getId());

        System.out.println("Id.counter = " + Id1.counter);
        System.out.println("x.counter = " + x.counter);
        System.out.println("y.counter = " + y.counter);
    }
}
