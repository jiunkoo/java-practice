/**
 =======================================================================================
 ------------------------------------- Problem 15-6 ------------------------------------
 문자열 s1 안에 문자열 s2가 포함되었는지 확인하는 프로그램을 작성하자.

 ----------------------------------------- 입력 -----------------------------------------
 ABCDEFGHI
 EFG

 ------------------------------------- 출력(실행결과) -------------------------------------
 문자열 s1:
 문자열 s2:
 ABCDEFGHI
     EFG

 --------------------------------------- 에러 내용 ---------------------------------------
 없음

 =======================================================================================
 */
package Chap15.Solution;
import java.util.Scanner;

public class SearchString {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("문자열 s1: ");
        String s1 = stdIn.next();
        System.out.print("문자열 s2: ");
        String s2 = stdIn.next();
        stdIn.close();

        int idx = s1.indexOf(s2);
        if (idx == -1) {
            System.out.println("s1 안에 s2가 포함되어 있지 않습니다.");
        } else {
            System.out.println(s1);
            for (int i = 0; i < idx; i++) {
                System.out.print(' ');
            }
            System.out.println(s2);
        }
    }
}
