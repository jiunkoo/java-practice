/**
=======================================================================================
------------------------------------- Problem 7-2 -------------------------------------
아래 메서드를 작성하자.
- 이름: min
- 입력: int형 변수 3개
- 출력: int형 변수
- 기능: 3개의 int형 변수 a, b, c의 최솟값을 구함

----------------------------------------- 입력 -----------------------------------------
1
3
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
package Chap7.Solution;
import java.util.Scanner;

// 3개의 정숫값에서 최솟값 구하기
class Min3 {
    static int min(int x, int y, int z) {
        int minNumber = x;
        if (y < minNumber) {
            minNumber = y;
        }
        if (z < minNumber) {
            minNumber = z;
        }

        return minNumber;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        
        System.out.print("정수 x: ");
        int x = stdIn.nextInt();
        System.out.print("정수 y: ");
        int y = stdIn.nextInt();
        System.out.print("정수 z: ");
        int z = stdIn.nextInt();
        stdIn.close();

        System.out.println("최솟값은 " + min(x, y, z) + "입니다.");
    }
}
