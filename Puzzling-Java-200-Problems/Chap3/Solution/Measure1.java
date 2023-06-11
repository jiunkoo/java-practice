/**
=======================================================================================
------------------------------------- Problem 3-3 -------------------------------------
2개의 양의 정숫값을 읽어서 약수를 판별하는 프로그램을 작성하자.
- "y는 x의 약수입니다."
- "y는 x의 약수가 아닙니다."

----------------------------------------- 입력 -----------------------------------------
12
4

------------------------------------- 출력(실행결과) -------------------------------------
변수 x:
변수 y:
y는 x의 약수입니다.

--------------------------------------- 에러 내용 ---------------------------------------
없음

=======================================================================================
*/
// 읽은 정숫값이 약수인지 판별(등가 연산자)
import java.util.Scanner;

class Measure1 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("변수 x: ");
        int x = stdIn.nextInt();
        System.out.print("변수 y: ");
        int y = stdIn.nextInt();
        stdIn.close();

        if (x % y == 0) {
            System.out.println("y는 x의 약수입니다.");
        } else {
            System.out.println("y는 x의 약수가 아닙니다.");
        }
    }
}
