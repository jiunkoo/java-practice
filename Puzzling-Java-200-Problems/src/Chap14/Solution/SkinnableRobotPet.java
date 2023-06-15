/**
 =======================================================================================
 ------------------------------------- Problem 14-4 ------------------------------------
 RobotPet 클래스를 상속하고 Skinnable 인터페이스를 구현한 SkinnableRobotPet을 작성하자.

 ----------------------------------------- 입력 -----------------------------------------
 없음

 ------------------------------------- 출력(실행결과) -------------------------------------
 없음

 --------------------------------------- 에러 내용 ---------------------------------------
 없음

 =======================================================================================
 */
package Chap14.Solution;

public class SkinnableRobotPet extends RobotPet implements Skinnable {
    private int skin;

    public SkinnableRobotPet(String name, String masterName, int skin) {
        super(name, masterName);
        this.skin = skin;
    }

    public void changeSkin(int skin) {
        this.skin = skin;
    }

    public void printSkin() {
        switch (skin) {
            case BLACK:
                System.out.print("검정");
                break;
            case RED:
                System.out.print("빨강");
                break;
            case GREEN:
                System.out.print("초록");
                break;
            case BLUE:
                System.out.print("파랑");
                break;
            case YELLOW:
                System.out.print("노랑");
                break;
        }
    }
}
