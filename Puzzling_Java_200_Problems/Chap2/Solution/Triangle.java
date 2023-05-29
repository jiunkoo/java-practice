/**
=======================================================================================
------------------------------------- Problem 2-9 -------------------------------------
삼각형의 밑변과 높이를 입력받아 삼각형의 넓이를 구하는 프로그램을 작성하자.

----------------------------------------- 입력 -----------------------------------------
6.5
3.5

------------------------------------- 출력(실행결과) -------------------------------------
삼각형의 넓이를 구합니다.
밑변: [입력]
높이: [입력]
넓이는 11.375입니다.

--------------------------------------- 에러 내용 ---------------------------------------
없음

=======================================================================================
*/
// 삼각형의 넓이를 구해서 표시
import java.util.Scanner;

class Triangle {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("삼각형의 넓이를 구합니다.");

        System.out.print("밑변: ");
        double width = stdIn.nextDouble();
        System.out.print("높이: ");
        double height = stdIn.nextDouble();

        System.out.println("넓이는 " + ((width * height) / 2) + "입니다.");
    }
}