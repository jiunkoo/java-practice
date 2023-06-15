/**
=======================================================================================
------------------------------------- Problem 3-8 -------------------------------------
입력한 정숫값에 따라 다음과 같이 표시하는 프로그램을 작성하자.
- "이 값은 5로 나누어 떨어집니다."
- "이 값은 5로 나누어 떨어지지 않습니다."
- "이 값은 음수입니다."

----------------------------------------- 입력 -----------------------------------------
35

------------------------------------- 출력(실행결과) -------------------------------------
정숫값:
이 값은 5로 나누어 떨어집니다.

--------------------------------------- 에러 내용 ---------------------------------------
없음

=======================================================================================
*/
package Chap3.Solution;
import java.util.Scanner;

// 읽은 정숫값이 양의 정수이면 5로 나누어 떨어지는지 여부를 표시
class GoInto5 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("정숫값: ");
        int x = stdIn.nextInt();
        stdIn.close();

        if (x > 0) {
            if (x % 5 == 0) {
                System.out.println("이 값은 5로 나누어 떨어집니다.");
            } else {
                System.out.println("이 값은 5로 나누어 떨어지지 않습니다.");
            }
        } else {
            System.out.println("이 값은 음수입니다.");
        }
    }
}