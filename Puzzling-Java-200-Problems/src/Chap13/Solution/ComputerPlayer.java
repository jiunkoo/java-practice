/**
 =======================================================================================
 ------------------------------------- Problem 13-5 ------------------------------------
 Player를 상속한 ComputerPlayer 클래스를 작성하자.

 ----------------------------------------- 입력 -----------------------------------------
 없음

 ------------------------------------- 출력(실행결과) -------------------------------------
 없음

 --------------------------------------- 에러 내용 ---------------------------------------
 없음

 =======================================================================================
 */
package Chap13.Solution;
import java.util.Random;

public class ComputerPlayer extends Player {
    private static Random rand;
    static {
        rand = new Random();
    }

    public int nextHand() {
        return rand.nextInt(3);
    }
}
