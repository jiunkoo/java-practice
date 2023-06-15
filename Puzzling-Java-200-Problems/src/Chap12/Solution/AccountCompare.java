/**
 =======================================================================================
 ------------------------------------- Problem 12-7 ------------------------------------
 TimeAccount 클래스를 작성하자.

 ----------------------------------------- 입력 -----------------------------------------
 없음

 ------------------------------------- 출력(실행결과) -------------------------------------
 두 사람의 예금 잔액 비교 결과입니다.
 철수의 예금 잔액이 많습니다.

 --------------------------------------- 에러 내용 ---------------------------------------
 없음

 =======================================================================================
 */
package Chap12.Solution;
import Chap9.Solution.Account1;

public class AccountCompare {
    static int compBalance(Account1 a, Account1 b) {
        long totalBalanceA = a instanceof TimeAccount
                ? ((TimeAccount)a).getBalance() + ((TimeAccount)a).getTimeBalance()
                : a.getBalance();
        long totalBalanceB = b instanceof TimeAccount
                ? ((TimeAccount)b).getBalance() + ((TimeAccount)b).getTimeBalance()
                : b.getBalance();
        if (totalBalanceA > totalBalanceB) {
            return 1;
        } else if (totalBalanceA < totalBalanceB) {
            return -1;
        }
        return 0;
    }

    public static void main(String[] args) {
        Account1 gildong = new Account1("길동", "123456", 500);
        TimeAccount chulsu = new TimeAccount("철수", "654321", 300, 400);

        System.out.println("두 사람의 예금 잔액 비교 결과입니다.");
        switch (compBalance(gildong, chulsu)) {
            case -1:
                System.out.println("철수의 예금 잔액이 많습니다.");
                break;
            case 0:
                System.out.println("둘의 예금 잔액이 같습니다.");
                break;
            case 1:
                System.out.println("길동의 예금 잔액이 많습니다. ");
                break;
        }
    }
}
