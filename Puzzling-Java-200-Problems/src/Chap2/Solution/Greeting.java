/**
=======================================================================================
------------------------------------- Problem 2-14 ------------------------------------
키보드로 입력한 성과 이름으로 인사하는 프로그램을 작성하자.

----------------------------------------- 입력 -----------------------------------------
홍
길동

------------------------------------- 출력(실행결과) -------------------------------------
성: [입력]
이름: [입력]
안녕하세요. 홍길동 씨.

--------------------------------------- 에러 내용 ---------------------------------------
없음

=======================================================================================
*/
package Chap2.Solution;
import java.util.Scanner;

// 입력한 성과 이름으로 인사
class Greeting {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("성: ");
        String lastName = stdIn.next();
        System.out.print("이름: ");
        String firstName = stdIn.next();
        stdIn.close();

        System.out.println("안녕하세요. " + lastName + firstName + " 씨.");
    }
}
