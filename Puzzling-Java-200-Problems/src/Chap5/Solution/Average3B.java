/**
=======================================================================================
------------------------------------- Problem 5-6 -------------------------------------
Average3Wrong.java를 캐스트 연산자를 이용해서 평균을 구하도록 프로그램을 작성하자.

----------------------------------------- 입력 -----------------------------------------
7
8
10

------------------------------------- 출력(실행결과) -------------------------------------
정숫값 x, y, z의 평균을 구합니다.
x값:
y값:
z값:
x, y, z의 평균은 8.333입니다.

--------------------------------------- 에러 내용 ---------------------------------------
없음

=======================================================================================
*/
package Chap5.Solution;
import java.util.Scanner;

// 3개의 정숫값을 읽어서 평균을 실수로 표시(잘못된 버전)
class Average3B {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("정숫값 x, y, z의 평균을 구합니다.");
        System.out.print("x값: ");
        int x = stdIn.nextInt();
        System.out.print("y값: ");
        int y = stdIn.nextInt();
        System.out.print("z값: ");
        int z = stdIn.nextInt();
        stdIn.close();

        double average = (double)(x + y + z)/3.0;
        System.out.printf("x, y, z의 평균은 %.3f입니다.\n", average);
    }
}
