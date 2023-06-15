/**
 =======================================================================================
 ------------------------------------- Problem 15-7 ------------------------------------
 키보드에서 입력한 문자열 2개가 같은지 판정하는 프로그램을 작성하자.

 ----------------------------------------- 입력 -----------------------------------------
 ABC
 ABC

 ------------------------------------- 출력(실행결과) -------------------------------------
 문자열 s1:
 문자열 s2:
 s1 != s2 입니다.
 s1과 s2의 내용이 같습니다.

 --------------------------------------- 에러 내용 ---------------------------------------
 없음

 =======================================================================================
 */
package Chap15.Solution;
import java.util.Scanner;

public class CompareString {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("문자열 s1: ");
        String s1 = stdIn.next();
        System.out.print("문자열 s2: ");
        String s2 = stdIn.next();
        stdIn.close();

        if (s1 == s2) {
            System.out.println("s1 == s2 입니다.");
        } else {
            System.out.println("s1 != s2 입니다.");
        }

        if (s1.equals(s2)) {
            System.out.println("s1과 s2의 내용이 같습니다.");
        } else {
            System.out.println("s1과 s2의 내용이 다릅니다.");
        }
    }
}
