/**
=======================================================================================
------------------------------------ Problem 3-2-1 ------------------------------------
if문을 사용해서 절댓값을 구하는 프로그램을 작성하자.

----------------------------------------- 입력 -----------------------------------------
-1

------------------------------------- 출력(실행결과) -------------------------------------
정숫값:
절댓값은 1입니다.

--------------------------------------- 에러 내용 ---------------------------------------
없음

=======================================================================================
*/
package Chap3.Solution;
import java.util.Scanner;

// 정숫값을 읽어서 절댓값을 표시(방법1: if문)
class Absolute1 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        
        System.out.print("정숫값: ");
        int x = stdIn.nextInt();
        stdIn.close();

        int abs;
        if (x > 0) {
            abs = x;
        } else {
            abs = -x;
        }
        System.out.println("절댓값은 " + abs + "입니다.");
    }
}
