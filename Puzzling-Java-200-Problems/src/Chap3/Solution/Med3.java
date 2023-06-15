/**
=======================================================================================
------------------------------------- Problem 3-16 ------------------------------------
3개의 정수 중 중앙값을 구하는 프로그램을 작성하자.
- 2, 3, 1의 중앙값: 2
- 1, 2, 1의 중앙값: 1
- 3, 3, 3의 중앙값: 3

----------------------------------------- 입력 -----------------------------------------
2
3
1

------------------------------------- 출력(실행결과) -------------------------------------
정수 x:
정수 y:
정수 z:
중앙값은 2입니다.

--------------------------------------- 에러 내용 ---------------------------------------
없음

=======================================================================================
*/
package Chap3.Solution;
import java.util.Scanner;

// 3개의 정수 중 중앙값 구하기
class Med3 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("정수 x: ");
        int x = stdIn.nextInt();
        System.out.print("정수 y: ");
        int y = stdIn.nextInt();
        System.out.print("정수 z: ");
        int z = stdIn.nextInt();
        stdIn.close();

        int med = x;
        if ((y <= x && x <= z) || (z <= x && x <= y)) {
            med = x;
        }
        if ((x <= y && y <= z) || (z <= y && y <= x)) {
            med = y;
        }
        if ((x <= z && z <= y) || (y <= z && z <= x)) {
            med = z;
        }

        System.out.println("중앙값은 " + med + "입니다.");
    }
}