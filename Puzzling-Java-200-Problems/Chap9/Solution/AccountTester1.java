/**
=======================================================================================
------------------------------------ Problem 9-5-3 ------------------------------------
Account2.java에 정의된 Account2 클래스를 사용하자.

----------------------------------------- 입력 -----------------------------------------
없음

------------------------------------- 출력(실행결과) -------------------------------------
계좌 개설일: 2010년 10월 15일(금)
계좌 개설일: 2010년 10월 15일(금)

--------------------------------------- 에러 내용 ---------------------------------------
없음

=======================================================================================
*/
// 은행 계좌 클래스(ver.2)의 사용 예시(방법 1)
class AccountTester1 {
    public static void main(String[] args) {
        Day d = new Day(2010, 10, 15);
        Account2 gildong = new Account2("길동", "123456", 100, d);
        
        Day p = gildong.getOpenDay();
        System.out.println("계좌 개설일: " + p);

        p.set(1999, 12, 31); 

        Day q = gildong.getOpenDay();
        System.out.println("계좌 개설일: " + q);
    }
}
