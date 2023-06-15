/**
 =======================================================================================
 ------------------------------------- Problem 15-5 ------------------------------------
 문자열을 읽어서 포함된 모든 문자의 문자 코드를 표시하자.

 ----------------------------------------- 입력 -----------------------------------------
 AB감자

 ------------------------------------- 출력(실행결과) -------------------------------------
 문자열:
 s[0] = A   41
 s[1] = B   42
 s[2] = 감 AC10
 s[3] = 자 C790

 --------------------------------------- 에러 내용 ---------------------------------------
 없음

 =======================================================================================
 */
package Chap15.Solution;
import java.util.Scanner;

public class StringCode {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("문자열s: ");
        String s = stdIn.next();

        for (int i = 0; i < s.length(); i++) {
            System.out.printf("s[%d] = %c %4X \n", i, s.charAt(i), (int)s.charAt(i));
        }
    }
}