/**
=======================================================================================
------------------------------------- Problem 9-1 -------------------------------------
Coordinate1 클래스를 작성하자.

--- Coordinate1 클래스 ---
변수
    1) x 좌표(실수)
    2) y 좌표(실수)

메서드
    1) x, y좌표 getter, setter
    2) (x, y) 좌표 설정

----------------------------------------- 입력 -----------------------------------------
없음

------------------------------------- 출력(실행결과) -------------------------------------
없음

--------------------------------------- 에러 내용 ---------------------------------------
없음

=======================================================================================
*/
// 2차원 좌표 클래스(ver.1)
class Coordinate1 {
    private double x;
    private double y;

    Coordinate1(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // --- 접근자 --- //
    double getX() {
        return x;
    }
    double getY() {
        return y;
    }

    void setX(double x) {
        this.x = x;
    }
    void setY(double y) {
        this.y = y;
    }

    void setXY(double x, double y) {
        this.x = x;
        this.y = y;
    }
}
