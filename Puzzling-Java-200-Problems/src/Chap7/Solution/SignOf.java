/**
=======================================================================================
------------------------------------- Problem 7-1 -------------------------------------
아래 메서드를 작성하자.
- 이름: signOf
- 입력: int형 변수
- 출력: int형 변수
- 기능: 매개변수가 음수면 -1, 0이면 0, 양수면 1을 반환

----------------------------------------- 입력 -----------------------------------------
-15

------------------------------------- 출력(실행결과) -------------------------------------
정수 x:
signOf(x)는 1입니다.

--------------------------------------- 에러 내용 ---------------------------------------
없음

=======================================================================================
*/
package Chap7.Solution;
import java.util.Scanner;

// 입력한 정수의 부호를 판정
class SignOf {
    static int signOf1(int n) {
        int sign = 0;
        if (n > 0) {
            sign = 1;
        } else if (n < 0) {
            sign = -1;
        }

        return sign;
    }

    static int signOf2(int n) {
        if (n > 0) {
            return 1;
        } else if (n == 0) {
            return 0;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        
        System.out.print("정수 x: ");
        int x = stdIn.nextInt();
        stdIn.close();

        int s = signOf1(x);
        System.out.println("signOf(x)는 " + s + "입니다.");
    }
}
