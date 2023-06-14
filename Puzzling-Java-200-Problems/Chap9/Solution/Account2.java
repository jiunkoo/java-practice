/**
=======================================================================================
------------------------------------ Problem 9-5-2 ------------------------------------
Account1.java에 정의된 Account1 클래스를 수정하자.

--- Account2 클래스 ---
변수
    1) 계좌 명의(문자열)
    2) 계좌 번호(문자열)
    3) 예금 잔고(정수)
    4) 계좌 개설일(날짜)

메서드
    1) 예금, 출금
    2) 문자열 변환

----------------------------------------- 입력 -----------------------------------------
없음

------------------------------------- 출력(실행결과) -------------------------------------
없음

--------------------------------------- 에러 내용 ---------------------------------------
없음

=======================================================================================
*/
// 은행 계좌 클래스(ver.2)
public class Account2 {
    private String name;
    private String no;
    private long balance;
    private Day openDay;

    public Account2(String name, String no, long balance, Day openDay) {
        this.name = name;
        this.no = no;
        this.balance = balance;
        this.openDay = new Day(openDay);
    }

    public String getName() {
        return name;
    }
    public String getNo() {
        return no;
    }
    public long getBalance(){
        return balance;
    }
    public Day getOpenDay() {
        return new Day(openDay);
    }

    void deposit(long k) {
        balance += k;
    }

    void withdraw(long k) {
        balance -= k;
    }

    public String toString() {
        return "{" + name + ", " + balance + "}";
    }
}
