/**
=======================================================================================
------------------------------------ Problem 3-11-2 -----------------------------------
Grade1.java를 논리합 연산자(||)를 사용해서 작성하자.

----------------------------------------- 입력 -----------------------------------------
80

------------------------------------- 출력(실행결과) -------------------------------------
점수:
수

--------------------------------------- 에러 내용 ---------------------------------------
없음

=======================================================================================
*/
// 점수를 기준으로 성적 판정(방법2: 논리합 연산자(||)를 이용)
import java.util.Scanner;

class Grade2 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("점수: ");
        int x = stdIn.nextInt();
        stdIn.close();

        if (x > 100 || x < 0) {
            System.out.println("잘못된 점수입니다.");
        } else if (x >= 80) {
            System.out.println("수");
        } else if (x >= 70) {
            System.out.println("우");
        } else if (x >= 60) {
            System.out.println("미");
        } else if (x >= 50) {
            System.out.println("양");
        } else {
            System.out.println("가");
        }
    }
}
