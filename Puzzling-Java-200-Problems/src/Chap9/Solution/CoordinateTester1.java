/**
=======================================================================================
------------------------------------ Problem 9-1-1 ------------------------------------
Coordinate1.java에 정의된 Coordinate1 클래스를 사용하자.

----------------------------------------- 입력 -----------------------------------------
7.5
3.2

------------------------------------- 출력(실행결과) -------------------------------------
좌표 p를 입력하세요.
좌표 x:
좌표 y:
p = (7.5, 3.2)
p = (9.9, 9.9)
q = (9.9, 9.9)

--------------------------------------- 에러 내용 ---------------------------------------
없음

=======================================================================================
*/
package Chap9.Solution;
import java.util.Scanner;

// 2차원 좌표 클래스(ver.1)의 사용 예시(방법 1)
class CoordinateTester1 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("좌표 p를 입력하세요.");
        System.out.print("좌표 x: ");
        double x = stdIn.nextDouble();
        System.out.print("좌표 y: ");
        double y = stdIn.nextDouble();
        stdIn.close();

        Coordinate1 p = new Coordinate1(x, y);
        System.out.println("p = (" + p.getX() + ", " + p.getY() + ")");

        Coordinate1 q = p;
        q.setXY(9.9, 9.9);
        System.out.println("p = (" + p.getX() + ", " + p.getY() + ")");
        System.out.println("p = (" + q.getX() + ", " + q.getY() + ")");
    }
}
