/**
=======================================================================================
------------------------------------- Problem 9-2 -------------------------------------
아래 문제점을 해결하기 위해 Coordinate1.java에 정의된 Coordinate1 클래스를 수정하자.

문제점
- 유연하지 못한 인스턴스 생성: 생성자가 2개의 double형 인수 요구
(값을 설정하지 않고 요소 생성 후 나중에 값 설정 불가능)
- 특정 좌표와 동일한 좌표를 가지는 인스턴스 생성 불가
- 2개의 좌표가 동일한지 판정하기 어려움
- 좌표를 죠시할 때마다 2개의 getter를 호출해서 좌표 확인

--- Coordinate2 클래스 ---
변수
    1) 좌표 x(실수)
    2) 좌표 y(실수)

메서드
    1) x, y좌표 getter, setter
    2) (x, y) 좌표 설정
    3) 두 좌표의 동일성 판정
    4) 좌표 위치 문자열 반환

----------------------------------------- 입력 -----------------------------------------
없음

------------------------------------- 출력(실행결과) -------------------------------------
없음

--------------------------------------- 에러 내용 ---------------------------------------
없음

=======================================================================================
*/
// 2차원 좌표 클래스(ver.2)
class Coordinate2 {
    private double x = 0.0;
    private double y = 0.0;

    public Coordinate2() {}
    public Coordinate2(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public Coordinate2(Coordinate2 c) {
        this(c.x, c.y);
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

    public void setXY(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public boolean equalTo(Coordinate2 c) {
        return x == c.x && y == c.y;
    }

    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
