/**
=======================================================================================
------------------------------------ Problem 5-2-2 ------------------------------------
OctHex.java를 한 줄로 표시하자.

----------------------------------------- 입력 -----------------------------------------
27

------------------------------------- 출력(실행결과) -------------------------------------
정수:
8진수는 33이고 16진수는 1b입니다.

--------------------------------------- 에러 내용 ---------------------------------------
없음

=======================================================================================
*/
// 10진수를 읽어서 8진수, 16진수로 표시(방법1)
import java.util.Scanner;

class OctHex1Line {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        
        System.out.print("정수: ");
        int x = stdIn.nextInt();
        stdIn.close();

        System.out.printf("8진수는 %o이고 16진수는 %x입니다.\n", x, x);
    }
}