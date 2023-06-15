/**
 =======================================================================================
 ------------------------------------- Problem 14-5 ------------------------------------
 Wearable, Skinnable 인터페이스를 구현한 HeadMountedDisplay 클래스를 작성하자.

 ----------------------------------------- 입력 -----------------------------------------
 없음

 ------------------------------------- 출력(실행결과) -------------------------------------
 디스플레이를 착용했습니다.
 디스플레이를 벗었습니다.
 YELLOW DISPLAY디스플레이를 착용했습니다.
 디스플레이를 벗었습니다.
 BLACK DISPLAY

 --------------------------------------- 에러 내용 ---------------------------------------
 없음

 =======================================================================================
 */
package Chap14.Solution;

public class HeadMountedDisplayTester {
    public static void main(String[] args) {
        HeadMountedDisplay hmd = new HeadMountedDisplay();
        hmd.putOn();
        hmd.putOff();
        hmd.changeSkin(Skinnable.YELLOW);
        hmd.putSkin();

        Wearable w = hmd;
        w.putOn();
        w.putOff();

        Skinnable s = hmd;
        s.changeSkin(Skinnable.BLACK);
        hmd.putSkin();
    }
}
