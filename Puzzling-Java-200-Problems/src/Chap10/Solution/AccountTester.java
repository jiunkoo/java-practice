/**
 =======================================================================================
 ------------------------------------ Problem 10-10 ------------------------------------
 Chap9의 Account2.java의 Account2 클래스를 수정하자.

 ----------------------------------------- 입력 -----------------------------------------
 2
 0
 홍길동
 12345
 1
 김철수
 54321
 3000
 2018
 3
 5

 ------------------------------------- 출력(실행결과) -------------------------------------
 계좌 개설 수:
 0...간이/1...상세:
 계좌 정보를 입력하세요.
 명의: 홍길동
 번호: 12345
 은행 계좌를 개설해주셔서 감사합니다.
 계좌 기본 정보: {홍길동, 0}
 식별 번호: 1
 개설일: 2023년 06월 16일(금)
 0...간이/1...상세:
 계좌 정보를 입력하세요.
 명의:
 번호:
 잔고:
 개설연도:
 개설월:
 개설일:
 은행 계좌를 개설해주셔서 감사합니다.
 계좌 기본 정보: {김철수, 3000}
 식별 번호: 2
 개설일: 2018년 03월 05일(월)

 --------------------------------------- 에러 내용 ---------------------------------------
 없음

 =======================================================================================
 */
package Chap10.Solution;
import java.util.Scanner;

public class AccountTester {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.print("계좌 개설 수: ");
        int n = stdIn.nextInt();
        Account3[] a = new Account3[n];

        for (int i = 0; i < a.length; i++) {
            System.out.print("0...간이/1...상세: ");
            int type = stdIn.nextInt();

            System.out.println("계좌 정보를 입력하세요.");
            System.out.print("명의: ");
            String name= stdIn.next();
            System.out.print("번호: ");
            String no = stdIn.next();
            if (type == 0) {
                a[i] = new Account3(name, no);
            } else {
                System.out.print("잔고: ");
                int balance = stdIn.nextInt();
                System.out.print("개설연도: ");
                int y = stdIn.nextInt();
                System.out.print("개설월: ");
                int m = stdIn.nextInt();
                System.out.print("개설일: ");
                int d = stdIn.nextInt();
                a[i] = new Account3(name, no, balance, new Day2(y, m, d));
            }
            System.out.println("계좌 기본 정보: " + a[i]);
            System.out.println("식별 번호: " + a[i].getId());
            System.out.println("개설일: " + a[i].getOpenDay().toString());
        }
        stdIn.close();
    }
}
