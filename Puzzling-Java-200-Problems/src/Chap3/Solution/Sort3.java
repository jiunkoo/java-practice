/**
=======================================================================================
------------------------------------- Problem 3-19 ------------------------------------
입력한 3개의 정숫값을 오름차순(작은 순)으로 정렬하는 프로그램을 작성하자.

----------------------------------------- 입력 -----------------------------------------
53
35
42

------------------------------------- 출력(실행결과) -------------------------------------
정수 x:
정수 y:
정수 z:
x<=y<=z가 되도록 정렬했습니다.
변수 x는 35입니다.
변수 y는 42입니다.
변수 z는 53입니다.

--------------------------------------- 에러 내용 ---------------------------------------
없음

=======================================================================================
*/
package Chap3.Solution;
import java.util.Scanner;

// 3개의 정숫값을 오름차순으로 정렬
class Sort3 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("정수 x: ");
        int x = stdIn.nextInt();
        System.out.print("정수 y: ");
        int y = stdIn.nextInt();
        System.out.print("정수 z: ");
        int z = stdIn.nextInt();
        stdIn.close();

        int temp;
        if (x > y) {
            temp = x;
            x = y;
            y = temp;
        }
        if (y > z) {
            temp = y;
            y = z;
            z = temp;
        }
        if (x > y) {
            temp = x;
            x = y;
            y = temp;
        }

        System.out.println("x<=y<=z가 되도록 정렬했습니다.");
        System.out.println("변수 x는 " + x + "입니다.");
        System.out.println("변수 y는 " + y + "입니다.");
        System.out.println("변수 z는 " + z + "입니다.");
    }
}
