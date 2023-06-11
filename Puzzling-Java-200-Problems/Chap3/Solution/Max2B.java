/**
=======================================================================================
------------------------------------ Problem 3-12-2 -----------------------------------
Max2A를 조건 연산자를 사용해서 프로그램을 작성하자.

----------------------------------------- 입력 -----------------------------------------
25.7
15.3

------------------------------------- 출력(실행결과) -------------------------------------
실수 x:
실수 y:
큰 쪽의 값은 25.7입니다.

--------------------------------------- 에러 내용 ---------------------------------------
없음

=======================================================================================
*/
// 2 개의 실숫값을 읽어서 큰 쪽을 표시(방법2: 조건 연산자)
import java.util.Scanner;

class Max2B {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("실수 x: ");
        float x = stdIn.nextFloat();
        System.out.print("실수 y: ");
        float y = stdIn.nextFloat();
        stdIn.close();

        float max = x > y ? x : y;
        System.out.println("큰 쪽의 값은 " + max + "입니다.");
    }    
}
