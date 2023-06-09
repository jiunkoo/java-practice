/**
=======================================================================================
------------------------------------- Problem 3-15 ------------------------------------
3개의 정수 중 최솟값을 구하는 프로그램을 작성하자.

----------------------------------------- 입력 -----------------------------------------
3
1
2

------------------------------------- 출력(실행결과) -------------------------------------
정수 x:
정수 y:
정수 z:
최솟값은 1입니다.

--------------------------------------- 에러 내용 ---------------------------------------
없음

=======================================================================================
*/
package Chap3.Solution;
import java.util.Scanner;

// 3개의 정수 중 최솟값 구하기
class Min3 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("정수 x: ");
        int x = stdIn.nextInt();
        System.out.print("정수 y: ");
        int y = stdIn.nextInt();
        System.out.print("정수 z: ");
        int z = stdIn.nextInt();
        stdIn.close();

        int min = x;
        if (y < min) {
            min = y;
        }
        if (z < min) {
            min = z;
        }

        System.out.println("최솟값은 " + min + "입니다.");
    }
}
