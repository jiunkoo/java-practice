/**
=======================================================================================
------------------------------------- Problem 8-1 -------------------------------------
Human.java에 정의된 Human 클래스를 사용하자.

----------------------------------------- 입력 -----------------------------------------
없음

------------------------------------- 출력(실행결과) -------------------------------------
이름: 길동
신장: 170cm
체중: 60kg

이름: 철수
신장: 166cm
체중: 72kg

--------------------------------------- 에러 내용 ---------------------------------------
없음

=======================================================================================
*/
package Chap8.Solution;

// 사람 클래스(ver.1)의 사용 예시
class HumanTester1 {
    public static void main(String[] args) {
        Human1 gildong = new Human1();
        gildong.name = "길동";
        gildong.height = 170;
        gildong.weight = 60;

        Human1 chulsu = new Human1();
        chulsu.name = "철수";
        chulsu.height = 166;
        chulsu.weight = 72;

        System.out.println("이름: " + gildong.name);
        System.out.println("신장: " + gildong.height + "cm");
        System.out.println("체중: " + gildong.weight + "kg");
        System.out.println();

        System.out.println("이름: " + chulsu.name);
        System.out.println("신장: " + chulsu.height + "cm");
        System.out.println("체중: " + chulsu.weight + "kg");
    }
}
