/**
 =======================================================================================
 ------------------------------------- Problem 11-1 ------------------------------------
 오늘의 운세 프로그램을 작성하자.
 대길, 길, 중길, 소길, 흉 중 하나의 운세를 표시한다.

 ----------------------------------------- 입력 -----------------------------------------
 없음

 ------------------------------------- 출력(실행결과) -------------------------------------
 오늘은 2023년 06월 16일 입니다.
 오늘의 운세는 대길입니다.

 --------------------------------------- 에러 내용 ---------------------------------------
 없음

 =======================================================================================
 */
package Chap11.Solution;
import java.util.GregorianCalendar;
import java.util.Random;

public class LuckyDraw1 {
    public static void main(String[] args) {
        GregorianCalendar today = new GregorianCalendar();
        int y = today.get(GregorianCalendar.YEAR);
        int m = today.get(GregorianCalendar.MONTH) + 1;
        int d = today.get(GregorianCalendar.DATE);
        System.out.printf("오늘은 %04d년 %02d월 %02d일 입니다.\n", y, m, d);

        Random rand = new Random();
        int k = rand.nextInt(10);
        System.out.print("오늘의 운세는 ");
        switch (k) {
            case 0:
                System.out.print("대길");
                break;
            case 1: case 2: case 3:
                System.out.print("길");
                break;
            case 4: case 5: case 6:
                System.out.println("중길");
                break;
            case 7: case 8:
                System.out.print("소길");
                break;
            case 9:
                System.out.print("흉");
                break;
        }
        System.out.println("입니다.");
    }
}
