/**
=======================================================================================
------------------------------------- Problem 7-3 -------------------------------------
아래 메서드를 작성하자.
- 이름: med
- 입력: int형 변수 3개
- 출력: int형 변수
- 기능: 3개의 int형 변수 a, b, c의 중간값을 구함

----------------------------------------- 입력 -----------------------------------------
1
3
2

------------------------------------- 출력(실행결과) -------------------------------------
정수 x:
정수 y:
정수 z:
중간값은 2입니다.

--------------------------------------- 에러 내용 ---------------------------------------
없음

=======================================================================================
*/
package Chap7.Solution;
import java.util.Scanner;

// 3개의 정숫값에서 중간값 구하기
class Med3 {
    static int med(int x, int y, int z) {
        int medNumber = x;
        if ((y <= x && x <= z) || (z <= x && x <= y)) {
            medNumber = x;
        }
        if ((x <= y && y <= z) || (z <= y && y <= x)) {
            medNumber = y;
        }
        if ((x <= z && z <= y) || (y <= z && z <= x)) {
            medNumber = z;
        }

        return medNumber;
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

        System.out.println("중간값은 " + med(x, y, z) + "입니다.");
    }
}
