/**
 =======================================================================================
 ------------------------------------- Problem 16-5 ------------------------------------
 2개의 정수를 덧셈하는 메서드를 작성한다.
 더할 값과 연산 결과가 모두 한 자리가 되도록 하는 것이 전제이다.
 그렇지 않은 경우에는 예외를 발생시킨다.

 ----------------------------------------- 입력 -----------------------------------------
 52
 5

 ------------------------------------- 출력(실행결과) -------------------------------------
 정수 a:
 정수 b:
 범위 밖 예외가 발생했습니다.
 범위 밖 값: 52

 --------------------------------------- 에러 내용 ---------------------------------------
 없음

 =======================================================================================
 */
package Chap16.Solution;
import java.util.Scanner;
import Chap16.Solution.RangeError.*;

public class RangeErrorTester {
    static boolean isValid(int n) {
        return n >= 0 && n <= 9;
    }

    static int add(int a, int b) throws ParameterRangeError, ResultRangeError {
        if (!isValid(a)) throw new ParameterRangeError(a);
        if (!isValid(b)) throw new ParameterRangeError(b);
        int result = a + b;
        if (!isValid(result)) {
            throw new ResultRangeError(result);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("정수 a: ");
        int a = stdIn.nextInt();
        System.out.print("정수 b: ");
        int b = stdIn.nextInt();
        stdIn.close();

        try {
            System.out.println("합은 " + add(a, b) + "입니다.");
        } catch(RangeError e) {
            System.out.println("범위 밖 예외가 발생했습니다.\n" + e.getMessage());
        }
    }
}
