/**
=======================================================================================
------------------------------------ Problem 9-1-2 ------------------------------------
Coordinate1.java에 정의된 Coordinate1 클래스를 사용하자.

----------------------------------------- 입력 -----------------------------------------
7.5
3.2
7.5
3.2

------------------------------------- 출력(실행결과) -------------------------------------
좌표 p를 입력하세요.
좌표 x:
좌표 y:
좌표 q를 입력하세요.
좌표 x:
좌표 y:
p != q입니다.
p와 q의 좌표가 같습니다.

--------------------------------------- 에러 내용 ---------------------------------------
없음

=======================================================================================
*/
// 2차원 좌표 클래스(ver.1)의 사용 예시(방법 2: 동일성 판정)
import java.util.Scanner;

class CoordinateTester2 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        double x, y;
        System.out.println("좌표 p를 입력하세요.");
        System.out.print("좌표 x: ");
        x = stdIn.nextDouble();
        System.out.print("좌표 y: ");
        y = stdIn.nextDouble();
        Coordinate1 p = new Coordinate1(x, y);

        System.out.println("좌표 q를 입력하세요.");
        System.out.print("좌표 x: ");
        x = stdIn.nextDouble();
        System.out.print("좌표 y: ");
        y = stdIn.nextDouble();
        Coordinate1 q = new Coordinate1(x, y);
        stdIn.close();

        System.out.println((p == q) ? "p == q입니다." : "p != q 입니다.");
        System.out.println(
            p.getX() == q.getX() && p.getY() == q.getY()
            ? "p와 q의 좌표가 같습니다." : "p와 q의 좌표가 다릅니다."
        );
    }
}
