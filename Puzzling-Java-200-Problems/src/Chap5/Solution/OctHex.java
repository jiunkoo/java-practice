/**
=======================================================================================
------------------------------------ Problem 5-2-1 ------------------------------------
10진수 정수를 8진수와 16진수로 표시하는 프로그램을 작성하자.

----------------------------------------- 입력 -----------------------------------------
27

------------------------------------- 출력(실행결과) -------------------------------------
정수:
8진수는 33입니다.
16진수는 1b입니다.

--------------------------------------- 에러 내용 ---------------------------------------
없음

=======================================================================================
*/
package Chap5.Solution;
import java.util.Scanner;

// 10진수를 읽어서 8진수, 16진수로 표시(방법1)
class OctHex {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        
        System.out.print("정수: ");
        int x = stdIn.nextInt();
        stdIn.close();

        System.out.printf("8진수는 %o입니다.\n", x);
        System.out.printf("16진수는 %x입니다.\n", x);
    }
}
