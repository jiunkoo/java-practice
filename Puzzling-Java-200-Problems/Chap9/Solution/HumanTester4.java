/**
=======================================================================================
------------------------------------- Problem 9-6 -------------------------------------
Human3.java에 정의된 Human3 클래스를 사용하는 프로그램을 작성하자.

----------------------------------------- 입력 -----------------------------------------
없음

------------------------------------- 출력(실행결과) -------------------------------------
gildong = {길동: 170cm 60kg 1975년 03월 12일(수)출생}
chulsu = {길동: 166cm 72kg 1987년 10월 07일(수)출생}

--------------------------------------- 에러 내용 ---------------------------------------
없음

=======================================================================================
*/
// 사람 클래스 인스턴스 배열
class HumanTester4 {
    public static void main(String[] args) {
        Human3 gildong = new Human3("길동", 170, 60, new Day(1975, 3, 12));
        Human3 chulsu = new Human3("길동", 166, 72, new Day(1987, 10, 7));

        System.out.println("gildong = " + gildong);
        System.out.println("chulsu = " + chulsu);
    }
}
