/**
 =======================================================================================
 ------------------------------------- Problem 14-6 ------------------------------------
 Players 인터페이스를 작성하자.

 ----------------------------------------- 입력 -----------------------------------------
 없음

 ------------------------------------- 출력(실행결과) -------------------------------------
 DVDPlayer형 변수 a
 DVD 재생 시작!
 DVD 재생 종료!
 DVD 느린 재생 시작!
 Player형 변수 b
 DVD 재생 시작!
 DVD 재생 종료!
 ExPlayer형 변수 c
 DVD 재생 시작!
 DVD 재생 종료!
 DVD 느린 재생 시작!

 --------------------------------------- 에러 내용 ---------------------------------------
 없음

 =======================================================================================
 */
package Chap14.Solution;

public class DVDPlayerTester {
    public static void main(String[] args) {
        DVDPlayer a = new DVDPlayer();
        Players b = new DVDPlayer();
        ExPlayer c = new DVDPlayer();

        System.out.println("DVDPlayer형 변수 a");
        a.play();
        a.stop();
        a.slow();

        System.out.println("Player형 변수 b");
        b.play();
        b.stop();

        System.out.println("ExPlayer형 변수 c");
        c.play();
        c.stop();
        c.slow();
    }
}
