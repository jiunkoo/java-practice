/**
 =======================================================================================
 ------------------------------------- Problem 14-4 ------------------------------------
 Pet 클래스를 작성하자.

 ----------------------------------------- 입력 -----------------------------------------
 없음

 ------------------------------------- 출력(실행결과) -------------------------------------
 나의 이름은 Kurt입니다.
 주인님의 이름은 아이입니다.

 나는 로봇! 이름은 R2D2.
 주인님의 이름은 루크.

 나는 로봇! 이름은 OSX5.
 주인님의 이름은 Apple.
 스킨은 노랑입니다.

 나의 이름은 마이클입니다.
 주인님의 이름은 영남입니다.

 --------------------------------------- 에러 내용 ---------------------------------------
 없음

 =======================================================================================
 */
package Chap14.Solution;

public class SkinnableRobotPetTester {
    static void intro(Pet p) {
        p.introduce();
    }

    public static void main(String[] args) {
        Pet[] a = {
                new Pet("Kurt", "아이"),
                new RobotPet("R2D2", "루크"),
                new SkinnableRobotPet("OSX5", "Apple", Skinnable.YELLOW),
                new Pet("마이클", "영남"),
        };

        for (Pet p: a) {
            intro(p);
            if (p instanceof SkinnableRobotPet) {
                System.out.print("스킨은 ");
                ((SkinnableRobotPet)p).printSkin();
                System.out.println("입니다.");
            }
            System.out.println();
        }
    }
}
