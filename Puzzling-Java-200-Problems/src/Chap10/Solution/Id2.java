/**
 =======================================================================================
 ------------------------------------- Problem 10-3 ------------------------------------
 Id1.java의 Id1 클래스를 수정하자.
 마지막에 부여한 식별 번호를 반환하는 클래스 메서드 getMaxId를 추가한다.
 getMaxId는 인스턴스를 n개 생성한 시점에 호출하면 n을 반환해야 한다.

 ----------------------------------------- 입력 -----------------------------------------
 없음

 ------------------------------------- 출력(실행결과) -------------------------------------
 없음

 --------------------------------------- 에러 내용 ---------------------------------------
 없음

 =======================================================================================
 */
package Chap10.Solution;

public class Id2 {
    private static int counter = 0;
    private int id;

    public Id2() {
        id = ++counter;
    }

    public int getId() {
        return id;
    }

    public static int getMaxId() {
        return counter;
    }
}
