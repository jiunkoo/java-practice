/**
 =======================================================================================
 ------------------------------------- Problem 15-8 ------------------------------------
 두 문자열의 대소 관계를 판정하는 프로그램을 작성하자.

 ----------------------------------------- 입력 -----------------------------------------
 ABC
 XYZ

 ------------------------------------- 출력(실행결과) -------------------------------------
 문자열 s1:
 문자열 s2:
 s1이 s2보다 작습니다.

 --------------------------------------- 에러 내용 ---------------------------------------
 없음

 =======================================================================================
 */
package Chap15.Solution;
import java.util.Scanner;

public class StringCompareTo {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("문자열 s1: ");
        String s1 = stdIn.next();
        System.out.print("문자열 s2: ");
        String s2 = stdIn.next();
        stdIn.close();

        int balance = s1.compareTo(s2);
        if (balance < 0) {
            System.out.println("s1이 s2보다 작습니다.");
        } else if (balance > 0) {
            System.out.println("s1이 s2보다 큽니다.");
        } else {
            System.out.println("s1과 s2가 같습니다.");
        }
    }
}
