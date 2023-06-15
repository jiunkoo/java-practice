/**
 =======================================================================================
 ------------------------------------- Problem 15-9 ------------------------------------
 부동소수점 값 x에서 소수점 이하 부분 p 자리로, 그리고 전체를 w 자리로 표시하는 프로그램을 작성하자.

 ----------------------------------------- 입력 -----------------------------------------
 3.1415926535
 9
 4

 ------------------------------------- 출력(실행결과) -------------------------------------
 실수:
 전체 자리수:
 소수점 이하 자릿수:
 3.1416


 --------------------------------------- 에러 내용 ---------------------------------------
 없음

 =======================================================================================
 */
package Chap15.Solution;
import java.util.Scanner;

public class PrintDouble {
    private static void printDouble(double x, int p, int w) {
        System.out.printf(String.format("%%%d.%df", w, p), x);
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("실수: ");
        double x = stdIn.nextDouble();
        System.out.print("전체 자리수: ");
        int w = stdIn.nextInt();
        System.out.print("소수점 이하 자릿수: ");
        int p = stdIn.nextInt();
        stdIn.close();

        printDouble(x, p, w);
        System.out.println();
    }
}
