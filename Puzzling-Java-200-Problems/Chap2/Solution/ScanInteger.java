/**
=======================================================================================
------------------------------------- Problem 2-5 -------------------------------------
키보드에서 입력한 정숫값을 표시하는 프로그램을 작성하자.

----------------------------------------- 입력 -----------------------------------------
123

------------------------------------- 출력(실행결과) -------------------------------------
정숫값: [입력]
123을(를) 입력했습니다.

--------------------------------------- 에러 내용 ---------------------------------------
없음

=======================================================================================
*/
// 키보드에서 입력한 정숫값 표시
// 프로그램의 시작 부분(클래스 선언 이전)에 작성한다.
import java.util.Scanner;

class ScanInteger {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("정숫값: ");
        int x = stdIn.nextInt();
        stdIn.close();

        System.out.println(x + "을(를) 입력했습니다.");
    }
}
