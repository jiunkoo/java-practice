/**
 =======================================================================================
 ------------------------------------- Problem 14-2 ------------------------------------
 Skinnable 인터페이스를 구현한 SkinnableSoftware를 작성하자.

 ----------------------------------------- 입력 -----------------------------------------
 없음

 ------------------------------------- 출력(실행결과) -------------------------------------
 없음

 --------------------------------------- 에러 내용 ---------------------------------------
 없음

 =======================================================================================
 */
package Chap14.Solution;

public class SkinnableSoftware implements Skinnable {
    int skin;

    public SkinnableSoftware() {
        this.skin = BLACK;
    }

    public SkinnableSoftware(int skin) {
        this.skin = skin;
    }

    @Override
    public void changeSkin(int skin) {
        this.skin = skin;
    }

    public int getSkin() {
        return skin;
    }

    public String getSkinString() {
        switch(skin) {
            case BLACK: return "BLACK";
            case RED: return "RED";
            case GREEN: return "GREEN";
            case BLUE: return "BLUE";
            case YELLOW: return "YELLOW";
        }
        return "";
    }
}
