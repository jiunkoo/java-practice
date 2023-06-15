/**
 =======================================================================================
 ------------------------------------- Problem 14-3 ------------------------------------
 Shape 클래스를 상속하고 Plane2D 인터페이스를 구현한 Rectangle 클래스를 작성하자.

 ----------------------------------------- 입력 -----------------------------------------
 없음

 ------------------------------------- 출력(실행결과) -------------------------------------
 없음

 --------------------------------------- 에러 내용 ---------------------------------------
 없음

 =======================================================================================
 */
package Chap14.Solution;
import Chap13.Solution.Shape;

public class Rectangle extends Shape implements Plane2D {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public String toString() {
        return "Rectangle(width: " + width + ", height: " + height + ")";
    }

    public void draw() {
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= width; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    @Override
    public int getArea() {
        return width * height;
    }
}
