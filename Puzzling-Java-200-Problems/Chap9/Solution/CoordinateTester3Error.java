/**
=======================================================================================
------------------------------------ Problem 9-1-3 ------------------------------------
Coordinate1.java에 정의된 Coordinate1 클래스를 배열로 사용하자.

----------------------------------------- 입력 -----------------------------------------
없음

------------------------------------- 출력(실행결과) -------------------------------------
없음

--------------------------------------- 에러 내용 ---------------------------------------
Exception in thread "main" java.lang.NullPointerException: Cannot invoke "Coordinate.
setXY(double, double)" because "<local3>[<local4>]" is null
        at CoordinateTester3Error.main(CoordinateTester3Error.java:30)

=======================================================================================
*/
// 2차원 좌표 클래스(ver.1)의 사용 예시(방법 3: 배열/오류)
import java.util.Scanner;

class CoordinateTester3Error {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("좌표는 몇 개: ");
        int n = stdIn.nextInt();
        stdIn.close();

        Coordinate1[] a = new Coordinate1[n];
        for (int i = 0; i < a.length; i++) {
            a[i].setXY(5.5, 7.7);
        }

        for (int i=0; i < a.length; i++) {
            System.out.printf("a[%d] = (%.1f, %.1f)\n", i, a[i].getX(), a[i].getY());
        }
    }
}
