/**
 =======================================================================================
 ------------------------------------- Problem 11-3 ------------------------------------
 DateId 클래스를 작성하자.

 ----------------------------------------- 입력 -----------------------------------------
 없음

 ------------------------------------- 출력(실행결과) -------------------------------------
 오늘은 2023년 06월 16일 입니다.
 a의 식별 번호: 2023061601
 b의 식별 번호: 2023061602
 c의 식별 번호: 2023061603

 --------------------------------------- 에러 내용 ---------------------------------------
 없음

 =======================================================================================
 */
package Chap11.Solution;

public class DateIdTester {
    public static void main(String[] args) {
        DateId a = new DateId();
        DateId b = new DateId();
        DateId c = new DateId();

        System.out.println("a의 식별 번호: " + a.getId());
        System.out.println("b의 식별 번호: " + b.getId());
        System.out.println("c의 식별 번호: " + c.getId());
    }
}