/**
=======================================================================================
------------------------------------ Problem 3-13-2 -----------------------------------
Diff2A.java를 조건 연산자를 사용해서 프로그램을 작성하자.

----------------------------------------- 입력 -----------------------------------------
12
3

------------------------------------- 출력(실행결과) -------------------------------------
정수 x:
정수 y:
두 값의 차는 9입니다.

--------------------------------------- 에러 내용 ---------------------------------------
없음

=======================================================================================
*/
// 2 개의 정숫값을 읽어서 차를 표시(방법2: 조건 연산자)
import java.util.Scanner;

class Diff2B {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("정수 x: ");
        int x = stdIn.nextInt();
        System.out.print("정수 y: ");
        int y = stdIn.nextInt();
        stdIn.close();

        int diff = x > y ? x - y : y - x;
        System.out.println("두 값의 차는 " + diff + "입니다.");
    }
}
