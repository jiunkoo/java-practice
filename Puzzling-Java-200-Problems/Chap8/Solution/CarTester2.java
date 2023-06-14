/**
=======================================================================================
------------------------------------ Problem 8-4-2 ------------------------------------
Car 클래스를 사용하자.

----------------------------------------- 입력 -----------------------------------------
SUV
서울123-45
1885
1490
5520
100
90
8.5

------------------------------------- 출력(실행결과) -------------------------------------
현재 위치: 0.00, 0.00
남은 연료: 90.00
이동하시겠습니까?[ 0...No/1...Yes]: 1
X 방향으로의 이동 거리: 540
Y 방향으로의 이동 거리: 540
현재 위치: 540.00, 540.00
남은 연료: 0.16
이동하시겠습니까?[ 0...No/1...Yes]: 1  
X 방향으로의 이동 거리: 100
Y 방향으로의 이동 거리: 100
연료 부족!!
현재 위치: 540.00, 540.00
남은 연료: 0.16
이동하시겠습니까?[ 0...No/1...Yes]: 0

--------------------------------------- 에러 내용 ---------------------------------------
없음

=======================================================================================
*/
// 자동차 클래스(Ver.1)의 사용 예시(2: 대화형으로 자동차를 이동)
import java.util.Scanner;

class CarTester2 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("차량 데이터를 입력하세요.");
        System.out.print("이름: ");
        String name = stdIn.nextLine();
        System.out.print("번호: ");
        String number = stdIn.nextLine();
        System.out.print("전폭: ");
        int width = stdIn.nextInt();
        System.out.print("전고: ");
        int height = stdIn.nextInt();
        System.out.print("전징: ");
        int length = stdIn.nextInt();
        System.out.print("탱크용량: ");
        double tankage = stdIn.nextDouble();
        System.out.print("연료량: ");
        double fuel = stdIn.nextDouble();
        System.out.print("연비: ");
        double sfc = stdIn.nextDouble();

        Car myCar = new Car(
            name, number, 
            width, height, length,
            tankage, fuel, sfc
        );

        while(true) {
            System.out.printf("현재 위치: %.2f, %.2f\n", myCar.getX(), myCar.getY());
            System.out.printf("남은 연료: %.2f\n", myCar.getFuel());
            System.out.print("이동하시겠습니까?[ 0...No/1...Yes]: ");
            if (stdIn.nextInt() == 0) {
                break;
            }
            System.out.print("X 방향으로의 이동 거리: ");
            double x = stdIn.nextDouble();
            System.out.print("Y 방향으로의 이동 거리: ");
            double y = stdIn.nextDouble();

            if (!myCar.move(x, y)) {
                System.out.println("연료 부족!!");
            }
        }

        stdIn.close();
    }
}
