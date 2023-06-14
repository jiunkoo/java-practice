/**
=======================================================================================
------------------------------------- Problem 8-2 -------------------------------------
Human2.java에 정의된 Human2 클래스를 사용하자.
gildong은 3kg 불었고 chulsu는 5kg 빠졌다.

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
// 사람 클래스(ver.2)의 사용 예시
class HumanTester2 {
    public static void main(String[] args) {
        Human2 gildong = new Human2("길동", 170, 60);
        Human2 chulsu = new Human2("철수", 166, 72);

        gildong.gainWeight(3);
        chulsu.reduceWeight(5);

        System.out.println("이름: " + gildong.getName());
        System.out.println("신장: " + gildong.getHeight() + "cm");
        System.out.println("체중: " + gildong.getWeight() + "kg");
        System.out.println();

        System.out.println("이름: " + chulsu.getName());
        System.out.println("신장: " + chulsu.getHeight() + "cm");
        System.out.println("체중: " + chulsu.getWeight() + "kg");
    }
}
