/**
 =======================================================================================
 ------------------------------------- Problem 14-5 ------------------------------------
 Wearable, Skinnable 인터페이스를 구현한 HeadMountedDisplay 클래스를 작성하자.

 ----------------------------------------- 입력 -----------------------------------------
 없음

 ------------------------------------- 출력(실행결과) -------------------------------------
 없음

 --------------------------------------- 에러 내용 ---------------------------------------
 없음

 =======================================================================================
 */
package Chap14.Solution;

public class HeadMountedDisplay implements Wearable, Skinnable {
    private int skin;

    @Override
    public void changeSkin(int skin) {
        this.skin = skin;
    }

    @Override
    public void putOn() {
        System.out.println("디스플레이를 착용했습니다.");
    }

    @Override
    public void putOff() {
        System.out.println("디스플레이를 벗었습니다.");
    }

    public void putSkin() {
        switch (skin) {
            case BLACK:
                System.out.print("BLACK DISPLAY");
                break;
            case RED:
                System.out.print("RED DISPLAY");
                break;
            case GREEN:
                System.out.print("GREEN DISPLAY");
                break;
            case BLUE:
                System.out.print("BLUE DISPLAY");
                break;
            case YELLOW:
                System.out.print("YELLOW DISPLAY");
                break;
        }
    }
}
