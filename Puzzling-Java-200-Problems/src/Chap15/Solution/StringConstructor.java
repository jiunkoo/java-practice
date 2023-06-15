/**
 =======================================================================================
 ------------------------------------- Problem 15-2 ------------------------------------
 String형의 문자열을 생성하는 프로그램을 작성하자.
 생성은 여러 가지 방법을 사용한다.

 ----------------------------------------- 입력 -----------------------------------------
 HAL

 ------------------------------------- 출력(실행결과) -------------------------------------
 문자열:
 s1 = ABC
 s2 =
 s3 = ABCDEFGHIJ
 s4 = FGH
 s5 = XYZ
 s6 = HAL

 --------------------------------------- 에러 내용 ---------------------------------------
 없음

 =======================================================================================
 */
package Chap15.Solution;
import java.util.Scanner;

public class StringConstructor {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        char[] c = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J'};
        String s1 = "ABC";
        String s2 = new String();
        String s3 = new String(c);
        String s4 = new String(c, 5, 3);
        String s5 = new String("XYZ");

        System.out.print("문자열: ");
        String s6 = stdIn.next();
        stdIn.close();

        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);
        System.out.println("s3 = " + s3);
        System.out.println("s4 = " + s4);
        System.out.println("s5 = " + s5);
        System.out.println("s6 = " + s6);
    }
}
