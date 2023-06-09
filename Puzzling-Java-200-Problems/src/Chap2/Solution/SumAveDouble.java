/**
=======================================================================================
------------------------------------- Problem 2-8 -------------------------------------
2개의 실숫값을 입력받아 그 합과 평균을 구하는 프로그램을 작성하자.

----------------------------------------- 입력 -----------------------------------------
9.75
2.5

------------------------------------- 출력(실행결과) -------------------------------------
x값: [입력]
y값: [입력]
합계는 12.25입니다.
평균은 6.125입니다.

--------------------------------------- 에러 내용 ---------------------------------------
없음

=======================================================================================
*/
package Chap2.Solution;
import java.util.Scanner;

// 입력한 2개의 실숫값의 합과 평균을 표시
class SumAveDouble {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("x값: ");
        double x = stdIn.nextDouble();
        System.out.print("y값: ");
        double y = stdIn.nextDouble();
        stdIn.close();

        System.out.println("합계는 " + (x + y) + "입니다.");
        System.out.println("평균은 " + ((x + y) / 2) + "입니다.");
    }
}
