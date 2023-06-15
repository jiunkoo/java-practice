/**
 =======================================================================================
 ------------------------------------- Problem 12-1 ------------------------------------
 Car2 클래스를 작성하자.

 ----------------------------------------- 입력 -----------------------------------------
 없음

 ------------------------------------- 출력(실행결과) -------------------------------------
 없음

 --------------------------------------- 에러 내용 ---------------------------------------
 없음

 =======================================================================================
 */
package Chap12.Solution;
import Chap9.Solution.Day1;

class Car2 {
    private String name;
    private int width;
    private int height;
    private int length;
    private double x;
    private double y;
    private double fuel;
    private Day1 purchaceDay;

    Car2(String name, int width, int height,
         int length, double fuel,  Day1 purchaseDay) {
        this.name = name;
        this.width = width;
        this.height = height;
        this.length = length;
        x = y = 0.0;
        this.fuel = fuel;
        this.purchaceDay = new Day1(purchaseDay);
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getFuel() {
        return fuel;
    }

    public Day1 getPurchaceDay() {
        return purchaceDay;
    }

    void putSpec() {
        System.out.println("이름: " + name);
        System.out.println("전폭: " + width + "mm");
        System.out.println("전고: " + height + "mm");
        System.out.println("전장: " + length + "mm");
    }

    boolean move(double x, double y) {
        double dist = Math.sqrt(x*x + y*y);

        if (dist > fuel) {
            return false;
        } else {
            fuel -= dist;
            this.x += x;
            this.y += y;
            return true;
        }
    }
}
