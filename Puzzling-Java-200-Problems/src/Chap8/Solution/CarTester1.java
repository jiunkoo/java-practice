/**
=======================================================================================
------------------------------------ Problem 8-4-1 ------------------------------------
Car.java에 정의된 Car 클래스를 사용하자.

----------------------------------------- 입력 -----------------------------------------
없음

------------------------------------- 출력(실행결과) -------------------------------------
이름: k3
번호: 서울999-99
전폭: 1660mm
전고: 1500mm
전장: 3640mm
탱크: 40.0리터
연비: 12.0km/리터

--------------------------------------- 에러 내용 ---------------------------------------
없음

=======================================================================================
*/
package Chap8.Solution;

// 자동차 클래스(Ver.1)의 사용 예시(방법 1)
class CarTester1 {
    public static void main(String[] args) {
        Car k3 = new Car(
            "k3", "서울999-99",
            1660, 1500, 3640,
            40.0, 35.0, 12.0
        );

        k3.putSpec();
    }
}