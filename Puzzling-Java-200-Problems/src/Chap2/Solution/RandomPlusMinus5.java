/**
=======================================================================================
------------------------------------- Problem 2-12 ------------------------------------
키보드에서 입력한 정숫값을 +5 또는 -5 범위의 랜덤 정숫값을 생성하자.

----------------------------------------- 입력 -----------------------------------------
7

------------------------------------- 출력(실행결과) -------------------------------------
정숫값: [입력]
입력값의 -5에서 +5 범위의 난수를 생성했습니다.
값은 11입니다.

--------------------------------------- 에러 내용 ---------------------------------------
없음

=======================================================================================
*/
package Chap2.Solution;
import java.util.Scanner;
import java.util.Random;

// 키보드를 통해 입력받은 값의 +5 또는 -5 범위의 난수 생성
class RandomPlusMinus5 {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner stdIn = new Scanner(System.in);

        System.out.print("정숫값: ");
        int x = stdIn.nextInt();
        stdIn.close();

        System.out.println("입력값의 -5에서 +5 범위의 난수를 생성했습니다.");
        System.out.println("값은 " + (x - 5 + rand.nextInt(11)) + "입니다.");
    }
}
