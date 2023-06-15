/**
=======================================================================================
------------------------------------ Problem 3-13-1  -----------------------------------
if문을 사용해서 2개의 정숫값을 읽어서 두 값의 차를 표시하는 프로그램을 작성하자.

----------------------------------------- 입력 -----------------------------------------
12
3
3
12

------------------------------------- 출력(실행결과) -------------------------------------
정수 x:
정수 y:
두 값의 차는 9입니다.

--------------------------------------- 에러 내용 ---------------------------------------
없음

=======================================================================================
*/
package Chap3.Solution;
import java.util.Scanner;

// 2 개의 정숫값을 읽어서 차를 표시(방법1: if문)
class Diff2A {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("정수 x: ");
        int x = stdIn.nextInt();
        System.out.print("정수 y: ");
        int y = stdIn.nextInt();
        stdIn.close();

        int diff;
        if (x > y) {
            diff = x - y;
        } else {
            diff = y - x;
        }
        System.out.println("두 값의 차는 " + diff + "입니다.");
    }
}