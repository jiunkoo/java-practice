/**
 =======================================================================================
 ------------------------------------- Problem 12-1 ------------------------------------
 ExCar 클래스를 작성하자.

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

public class ExCar extends Car2 {
    private double totalMileage;

    public ExCar(String name, int width, int height, int length,
                 double fuel, Day1 purchaseDay){
        super(name, width, height, length, fuel, purchaseDay);
        this.totalMileage = 0.0;
    }

    public double getTotalMileage() {
        return totalMileage;
    }

    @Override
    void putSpec() {
        super.putSpec();
        System.out.printf("총 주행 거리: %.2fkm\n", totalMileage);
    }

    @Override
    boolean move(double x, double y) {
        double dist = Math.sqrt((x * x + y * y));
        if (!super.move(x, y)) {
            return false;
        } else {
            totalMileage += dist;
            return true;
        }
    }
}
