/**
 =======================================================================================
 ------------------------------------- Problem 10-9 ------------------------------------
 int형 x, y 좌표로 구성되는 2차원 좌표 클래스를 작성하자.

 ----------------------------------------- 입력 -----------------------------------------
 없음

 ------------------------------------- 출력(실행결과) -------------------------------------
 없음

 --------------------------------------- 에러 내용 ---------------------------------------
 없음

 =======================================================================================
 */
package Chap10.Solution;
import java.util.GregorianCalendar;
import static java.util.Calendar.*;

public class Point2D {
    private static int counter = 0;
    private static int day;

    private int x = 0;
    private int y = 0;

    static {
        GregorianCalendar today = new GregorianCalendar();
        day = today.get(DATE);
    }

    {
        if (++counter == day) {
            System.out.print("당첨!!");
            System.out.printf("오늘 %d개의 좌표가 생성됐습니다.\n", counter);
        }
    }

    public Point2D(){}

    public Point2D(int x) {
        this.x = x;
    }

    public Point2D(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public static int getCounter() {
        return counter;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
