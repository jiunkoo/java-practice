/**
=======================================================================================
------------------------------------ Problem 9-5-1 ------------------------------------
Account1 클래스를 작성하자.

--- Account1 클래스 ---
변수
    1) 계좌 명의(문자열)
    2) 계좌 번호(문자열)
    3) 예금 잔고(정수)

메서드
    1) 예금, 출금

----------------------------------------- 입력 -----------------------------------------
없음

------------------------------------- 출력(실행결과) -------------------------------------
없음

--------------------------------------- 에러 내용 ---------------------------------------
없음

=======================================================================================
*/
// 은행 계좌 클래스(ver.1)
class Account1 {
    private String name;
    private String no;
    private long balance;

    Account1(String name, String no, long balance) {
        this.name = name;
        this.no = no;
        this.balance = balance;
    }

    String getName() {
        return name;
    }
    String getNo() {
        return no;
    }
    long getBalance(){
        return balance;
    }

    void deposit(long k) {
        balance += k;
    }

    void withdraw(long k) {
        balance -= k;
    }
}
