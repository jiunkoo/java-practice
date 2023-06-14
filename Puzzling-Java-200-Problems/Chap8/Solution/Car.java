/**
=======================================================================================
------------------------------------- Problem 8-3 -------------------------------------
Car 클래스를 작성하자.

--- Car 클래스 ---
변수
    1) 이름(문자열)
    2) 번호(문자열)
    3) 폭(정수)
    4) 높이(정수)
    5) 길이(정수)
    6) 현재 위치의 x 좌표(실수)
    7) 현재 위치의 y 좌표(실수)
    8) 탱크 용량(실수)
    9) 남은 연료(실수)
    10) 연비(실수)

메서드
    1) 현재 x, y 좌표 불러오기
    2) 남은 연료 불러오기
    3) 사양 표시하기
    4) 지시한 x, y 방향만큼 자동차 이동하기
    5) 급유하기 

----------------------------------------- 입력 -----------------------------------------
없음

------------------------------------- 출력(실행결과) -------------------------------------
이름: k3
번호: 서울999-00
전폭: 1660mm
전고: 1500mm
전장: 3640mm
탱그: 40.0리터
연비: 12.0km/리터

--------------------------------------- 에러 내용 ---------------------------------------
없음

=======================================================================================
*/
// 자동차 클래스(ver.1)
class Car {
    private String name;
    private String number;
    private int width;
    private int height;
    private int length;
    private double x;
    private double y;
    private double tankage;
    private double fuel;
    private double sfc;

    Car(
        String name, String number, 
        int width, int height, int length,
        double tankage, double fuel, double sfc
    ) {
        this.name = name;
        this.number = number;
        this.width = width;
        this.height = height;
        this.length = length;
        x = y = 0.0;
        this.tankage = tankage;
        this.fuel = (fuel <= tankage) ? fuel : tankage;
        this.sfc = sfc;
    }

    double getX() {
        return x;
    }

    double getY() {
        return y;
    }

    double getFuel() {
        return fuel;
    }

    void putSpec() {
        System.out.println("이름: " + name);
        System.out.println("번호: " + number);
        System.out.println("전폭: " + width + "mm");
        System.out.println("전고: " + height + "mm");
        System.out.println("전장: " + length + "mm");
        System.out.println("탱크: " + tankage + "리터");
        System.out.println("연비: " + sfc + "km/리터");
    }

    boolean move(double x, double y) {
        double dist = Math.sqrt(x*x + y*y);
        double f = dist / sfc;

        if (f > fuel) {
            return false;
        } else {
            fuel -= f;
            this.x += x;
            this.y += y;
            return true;
        }
    }

    void refuel(double fuel) {
        if (fuel > 0) {
            this.fuel += fuel;
            if (this.fuel > this.tankage) {
                this.fuel = this.tankage;
            }
        }
    }
}
