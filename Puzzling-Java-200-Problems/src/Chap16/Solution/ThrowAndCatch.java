/**
 =======================================================================================
 ------------------------------------- Problem 16-3 ------------------------------------
 Exception 예외와 RuntimeException 예외를 던지고 캐치하는 프로그램을 작성하자.
 키보드를 통해 입력받은 값에 따라 던지거나 별도의 핸들러로 캐치한다.

 ----------------------------------------- 입력 -----------------------------------------
 1

 ------------------------------------- 출력(실행결과) -------------------------------------
 sw:
 검사 예외 발생!!

 --------------------------------------- 에러 내용 ---------------------------------------
 없음

 =======================================================================================
 */
package Chap16.Solution;
import java.util.Scanner;

public class ThrowAndCatch {
    static void check(int sw) throws Exception {
        switch (sw) {
            case 1:
                throw new Exception("검사 예외 발생!!");
            case 2:
                throw new Exception("비검사 예외 발생!!");
        }
    }

    static void test(int sw) throws Exception {
        check(sw);
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("sw: ");
        int sw = stdIn.nextInt();
        stdIn.close();

        try {
            test(sw);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
