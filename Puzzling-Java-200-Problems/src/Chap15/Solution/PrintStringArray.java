/**
 =======================================================================================
 ------------------------------------ Problem 15-10 ------------------------------------
 String형 배열에 저장된 모든 문자열을 표시하는 메서드를 작성하자.

 ----------------------------------------- 입력 -----------------------------------------
 AB
 CD
 EF

 ------------------------------------- 출력(실행결과) -------------------------------------
 문자열의 개수: 3
 sx[0] =
 sx[1] =
 sx[2] =
 AB
 CD
 EF

 --------------------------------------- 에러 내용 ---------------------------------------
 없음

 =======================================================================================
 */
package Chap15.Solution;
import java.util.Scanner;

public class PrintStringArray {
    private static void printStringArray(String[] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length(); j++) {
                System.out.print(a[i].charAt(j));
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("문자열의 개수: ");
        int n = stdIn.nextInt();
        String[] sx = new String[n];
        for (int i = 0; i < sx.length; i++) {
            System.out.print("sx[" + i + "] = ");
            sx[i] = stdIn.next();
        }
        printStringArray(sx);
    }
}
