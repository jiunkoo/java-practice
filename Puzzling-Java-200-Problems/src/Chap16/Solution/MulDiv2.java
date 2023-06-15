/**
 =======================================================================================
 ------------------------------------- Problem 16-2 ------------------------------------
 MulDiv1.java를 수정하자.
 정숫값의 곱과 몫을 구하고 출력하는 메서드를 작성한다.
 그리고 각각을 순차적으로 호출해서 결과를 표시한다.
 호출 과정에서 예외를 캐치한다.

 ----------------------------------------- 입력 -----------------------------------------
 7
 E

 ------------------------------------- 출력(실행결과) -------------------------------------
 x 값:
 y 값:
 입력 오류 발생.java.util.InputMismatchException
 프로그램을 종료합니다.

 --------------------------------------- 에러 내용 ---------------------------------------
 java.util.InputMismatchException
     at java.base/java.util.Scanner.throwFor(Scanner.java:939)
     at java.base/java.util.Scanner.next(Scanner.java:1594)
     at java.base/java.util.Scanner.nextInt(Scanner.java:2258)
     at java.base/java.util.Scanner.nextInt(Scanner.java:2212)
     at Chap16.Solution.MulDiv2.main(MulDiv2.java:49)

 =======================================================================================
 */
package Chap16.Solution;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MulDiv2 {
    static int mul(int x, int y) {
        return x * y;
    }

    static int div(int x, int y) {
        return x / y;
    }

    static void muldiv(int x, int y) {
        System.out.println("x * y = " + mul(x, y));
        System.out.println("x / y = " + div(x, y));
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        try {
            System.out.print("x 값: ");
            int x = stdIn.nextInt();
            System.out.print("y 값: ");
            int y = stdIn.nextInt();
            stdIn.close();

            muldiv(x, y);
        } catch (InputMismatchException e) {
            System.out.println("입력 오류 발생." + e);
            e.printStackTrace();
        } catch (ArithmeticException e) {
            System.out.println("산술 오류 발생." + e);
            e.printStackTrace();
        } finally {
            System.out.println("프로그램을 종료합니다.");
        }
    }
}
