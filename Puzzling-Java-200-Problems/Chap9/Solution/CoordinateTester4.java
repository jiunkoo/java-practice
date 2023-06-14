/**
=======================================================================================
------------------------------------ Problem 9-1-4 ------------------------------------
Coordinate2.java에 정의된 Coordinate2 클래스를 배열로 사용하자.

----------------------------------------- 입력 -----------------------------------------
7.5
3.2

------------------------------------- 출력(실행결과) -------------------------------------
좌표 p를 입력하세요.
좌표 x:
좌표 y:
p = (7.5, 3.2)
p와 q를 동일 좌표로 만들었습니다.
q = (7.5, 3.2)
p와 q의 좌표가 같습니다.
c1 = (0.0, 0.0)
c2 = (1.1, 2.2)

--------------------------------------- 에러 내용 ---------------------------------------
없음

=======================================================================================
*/
// 2차원 좌표 클래스(ver.2)의 사용 예시(방법 4)
import java.util.Scanner;

class CoordinateTester4 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("좌표 p를 입력하세요.");
        System.out.print("좌표 x: ");
        double x = stdIn.nextDouble();
        System.out.print("좌표 y: ");
        double y = stdIn.nextDouble();
        stdIn.close();

        Coordinate2 p = new Coordinate2(x, y);
        System.out.println("p = " + p);
        Coordinate2 q = new Coordinate2(p);
        System.out.println("p와 q를 동일 좌표로 만들었습니다.");
        System.out.println("q = " + q);

        System.out.println((p.equalTo(q)) ? "p와 q의 좌표가 같습니다." : "p와 q의 좌표가 다릅니다.");

        Coordinate2 c1 = new Coordinate2();
        Coordinate2 c2 = new Coordinate2(1.1, 2.2);

        System.out.println("c1 = " + c1);
        System.out.println("c2 = " + c2);
    }
}
