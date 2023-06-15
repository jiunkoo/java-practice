/**
 =======================================================================================
 ------------------------------------- Problem 10-3 ------------------------------------
 Id1.java의 Id1 클래스를 수정하자.
 마지막에 부여한 식별 번호를 반환하는 클래스 메서드 getMaxId를 추가한다.
 getMaxId는 인스턴스를 n개 생성한 시점에 호출하면 n을 반환해야 한다.

 ----------------------------------------- 입력 -----------------------------------------
 없음

 ------------------------------------- 출력(실행결과) -------------------------------------
 x.getId() = 1
 y.getId() = 2
 Id2.getMaxId() = 2
 x.getMaxId() = 2
 y.getMaxId() = 2

 --------------------------------------- 에러 내용 ---------------------------------------
 없음

 =======================================================================================
 */
package Chap10.Solution;

public class IdTester2 {
    public static void main(String[] args) {
        Id2 x = new Id2();
        Id2 y = new Id2();

        System.out.println("x.getId() = " + x.getId());
        System.out.println("y.getId() = " + y.getId());

        System.out.println("Id2.getMaxId() = " + Id2.getMaxId());
        System.out.println("x.getMaxId() = " + x.getMaxId());
        System.out.println("y.getMaxId() = " + y.getMaxId());
    }
}
