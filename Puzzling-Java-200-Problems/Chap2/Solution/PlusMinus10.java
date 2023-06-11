/**
=======================================================================================
------------------------------------- Problem 2-6 -------------------------------------
키보드에서 입력한 정숫값에 10을 더한 값과 10을 뺀 값을 출력하자.

----------------------------------------- 입력 -----------------------------------------
7

------------------------------------- 출력(실행결과) -------------------------------------
정숫값: [입력]
10을 더한 값은 17입니다.
10을 뺀 값은 -3입니다.

--------------------------------------- 에러 내용 ---------------------------------------
없음

=======================================================================================
*/
// 키보드에 입력한 정숫값에 10을 더하거나 뺀 값을 표시
import java.util.Scanner;

class PlusMinus10 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("정숫값: ");
        int x = stdIn.nextInt();
        stdIn.close();

        System.out.println("10을 더한 값은 " + (x + 10) + "입니다.");
        System.out.println("10을 뺀 값은 " + (x - 10) + "입니다.");        
    }
}
