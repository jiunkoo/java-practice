/**
=======================================================================================
------------------------------------- Problem 3-21 ------------------------------------
월을 1~12의 정숫값으로 읽어서 해당하는 계절을 표시하는 프로그램을 작성하자.
- 1~12인 경우: "봄", "여름", "가을", "겨울" 중 하나 표시
- 그 외의 경우: "그런 월은 없습니다."

----------------------------------------- 입력 -----------------------------------------
13

------------------------------------- 출력(실행결과) -------------------------------------
몇 월입니까?:
그런 월은 없습니다.

--------------------------------------- 에러 내용 ---------------------------------------
없음

=======================================================================================
*/
package Chap3.Solution;
import java.util.Scanner;

// 읽은 월의 계절을 표시
class Season {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("몇 월입니까?: ");
        int month = stdIn.nextInt();
        stdIn.close();

        switch(month) {
            case 12:
            case 1:
            case 2:
                System.out.println("겨울");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("봄");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("여름");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("가을");
                break;
            default:
                System.out.println("그런 월은 없습니다.");
                break;
        }
    }
}
