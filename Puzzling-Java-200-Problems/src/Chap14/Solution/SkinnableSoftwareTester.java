/**
 =======================================================================================
 ------------------------------------- Problem 14-2 ------------------------------------
 Skinnable 인터페이스를 작성하자.

 ----------------------------------------- 입력 -----------------------------------------
 없음

 ------------------------------------- 출력(실행결과) -------------------------------------
 x의 스킨은 YELLOW입니다.
 y의 스킨은 GREEN입니다.

 --------------------------------------- 에러 내용 ---------------------------------------
 없음

 =======================================================================================
 */
package Chap14.Solution;

public class SkinnableSoftwareTester {
    public static void main(String[] args) {
        SkinnableSoftware x = new SkinnableSoftware();
        SkinnableSoftware y = new SkinnableSoftware(Skinnable.GREEN);

        x.changeSkin(Skinnable.YELLOW);

        System.out.println("x의 스킨은 " + x.getSkinString() + "입니다.");
        System.out.println("y의 스킨은 " + y.getSkinString() + "입니다.");
    }
}
