/**
 =======================================================================================
 ------------------------------------ Problem 10-10 ------------------------------------
 Chap9의 Account2.java의 Account2 클래스를 수정하자.

 ----------------------------------------- 입력 -----------------------------------------
 없음

 ------------------------------------- 출력(실행결과) -------------------------------------
 없음

 --------------------------------------- 에러 내용 ---------------------------------------
 없음

 =======================================================================================
 */
package Chap10.Solution;

public class Account3 {
    private static int counter = 0;
    private String name;
    private String no;
    private long balance;
    private Day2 openDay;
    private int id;

    {
        id = ++counter;
        System.out.println("은행 계좌를 개설해주셔서 감사합니다.");
    }

    public Account3(String name, String no) {
        this(name, no, 0, new Day2());
    }

    public Account3(String name, String no, long balance, Day2 openDay) {
        this.name = name;
        this.no = no;
        this.balance = balance;
        this.openDay = openDay;
    }

    public String getName() {
        return name;
    }

    public String getNo() {
        return no;
    }

    public long getBalance() {
        return balance;
    }

    public Day2 getOpenDay() {
        return openDay;
    }

    public int getId() {
        return id;
    }

    protected void deposit(long k) {
        balance += k;
    }

    void withdraw(long k) {
        balance -= k;
    }

    public String toString() {
        return "{" + name + ", " + balance + "}";
    }
}
