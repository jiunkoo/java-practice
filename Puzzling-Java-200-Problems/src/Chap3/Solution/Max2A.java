/**
=======================================================================================
------------------------------------ Problem 3-12-1 -----------------------------------
if문을 사용해서 2개의 실숫값 중 큰 값을 표시하는 프로그램을 작성하자.

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
package Chap3.Solution;
import java.util.Scanner;

// 2개의 실숫값을 읽어서 큰 쪽을 표시(방법1: if문)
class Max2A {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("실수 x: ");
        float x = stdIn.nextFloat();
        System.out.print("실수 y: ");
        float y = stdIn.nextFloat();
        stdIn.close();

        float max;
        if (x > y) {
            max = x;
        } else {
            max = y;
        }

        System.out.println("큰 쪽의 값은 " + max + "입니다.");
    }    
}
