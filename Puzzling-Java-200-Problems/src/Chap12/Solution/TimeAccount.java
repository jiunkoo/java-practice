/**
 =======================================================================================
 ------------------------------------- Problem 12-7 ------------------------------------
 TimeAccount 클래스를 작성하자.

 ----------------------------------------- 입력 -----------------------------------------
 없음

 ------------------------------------- 출력(실행결과) -------------------------------------
 없음

 --------------------------------------- 에러 내용 ---------------------------------------
 없음

 =======================================================================================
 */
package Chap12.Solution;
import Chap9.Solution.Account1;

public class TimeAccount extends Account1 {
    private long timeBalance;

    public TimeAccount(String name, String no, long balance, long timeBalance) {
        super(name, no, balance);
        this.timeBalance = timeBalance;
    }

    public long getTimeBalance() {
        return timeBalance;
    }

    void cancel() {
        deposit(timeBalance);
        timeBalance = 0;
    }
}
