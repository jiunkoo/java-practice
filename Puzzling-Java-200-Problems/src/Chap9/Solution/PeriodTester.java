/**
=======================================================================================
------------------------------------- Problem 9-7 -------------------------------------
Period.java에 정의된 Period 클래스를 사용하는 프로그램을 작성하자.

----------------------------------------- 입력 -----------------------------------------
없음

------------------------------------- 출력(실행결과) -------------------------------------
gildong = {길동: 170cm 60kg 1975년 03월 12일(수)출생}
chulsu = {길동: 166cm 72kg 1987년 10월 07일(수)출생}

--------------------------------------- 에러 내용 ---------------------------------------
없음

=======================================================================================
*/
package Chap9.Solution;

// 사람 클래스 인스턴스 배열
class PeriodTester {
    public static void main(String[] args) {
        Period taejo = new Period(
            new Day1(1392, 8, 5),
            new Day1(1398, 10, 14)
        );
        Period jeongjong = new Period(
            new Day1(1398, 10, 14),
            new Day1(1400, 11, 28)
        );
        Period taejong = new Period(
            new Day1(1400, 11, 28),
            new Day1(1418, 9, 9)
        );
        Period sejong = new Period(
            new Day1(1918, 9, 9),
            new Day1(1450, 3, 30)
        );

        System.out.println("태조 = " + taejo);
        System.out.println("정종 = " + jeongjong);
        System.out.println("태종 = " + taejong);
        System.out.println("세종 = " + sejong);
    }
}
