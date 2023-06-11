/**
=======================================================================================
------------------------------------- Problem 3-17 ------------------------------------
입력한 2개의 정숫값 중 작은 값과 큰 값을 표시하는 프로그램을 작성하자.
- "작은 값은 x입니다."
- "큰 값은 y입니다."
- "두 값이 같습니다."

----------------------------------------- 입력 -----------------------------------------
12
3

------------------------------------- 출력(실행결과) -------------------------------------
정수 x:
정수 y:
작은 값은 3입니다.
큰 값은 12입니다.

--------------------------------------- 에러 내용 ---------------------------------------
없음

=======================================================================================
*/
// 두 정숫값 중 작은 값과 큰 값을 구해서 표시
import java.util.Scanner;

class MinMaxEq {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("정수 x: ");
        int x = stdIn.nextInt();
        System.out.print("정수 y: ");
        int y = stdIn.nextInt();
        stdIn.close();

        int min = x > y ? y : x;
        System.out.println("작은 값은 " + min + "입니다.");
        int max = x > y ? x : y;
        System.out.println("작은 값은 " + max + "입니다.");
    }
}
