/**
=======================================================================================
------------------------------------ Problem 9-5-4 ------------------------------------
Account2.java에 정의된 Account2 클래스를 사용하자.

----------------------------------------- 입력 -----------------------------------------
철수
12345678
1000000
1999
1
1

------------------------------------- 출력(실행결과) -------------------------------------
계좌 정보를 입력하세요.
명의:  철수
번호: 12345678
잔고: 1000000
개설 연도: 1999
개설 월: 1
개설 일: 1
계좌 기본 정보: {철수, 1000000}
개설일: 1999년 01월 01일(금)

--------------------------------------- 에러 내용 ---------------------------------------
없음

=======================================================================================
*/
// 은행 계좌 클래스(ver.2)의 사용 예시(방법 2)
import java.util.Scanner;

class AccountTester2 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("계좌 정보를 입력하세요.");
        System.out.print("명의: ");
        String name= stdIn.next();
        System.out.print("번호: ");
        String no = stdIn.next();
        System.out.print("잔고: ");
        long balance = stdIn.nextLong();
        System.out.print("개설 연도: ");
        int year = stdIn.nextInt();
        System.out.print("개설 월: ");
        int month = stdIn.nextInt();
        System.out.print("개설 일: ");
        int date = stdIn.nextInt();
        stdIn.close();

        Account2 a = new Account2(name, no, balance, new Day(year, month, date));

        System.out.println("계좌 기본 정보: " + a);
        System.out.println("개설일: " + a.getOpenDay().toString());
    }
}
