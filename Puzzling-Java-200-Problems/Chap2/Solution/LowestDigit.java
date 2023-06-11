/**
=======================================================================================
------------------------------------- Problem 2-7 -------------------------------------
키보드에서 입력한 정숫값에서 마지막 자릿수를 제외한 값과 마지막 자릿수 값만 표시하는 프로그램을 작성하자.

----------------------------------------- 입력 -----------------------------------------
1275

------------------------------------- 출력(실행결과) -------------------------------------
정숫값: [입력]
마지막 자릿수를 제외한 값은 127입니다.
마지막 자릿수는 5입니다.

--------------------------------------- 에러 내용 ---------------------------------------
없음

=======================================================================================
*/
// 키보드에서 입력한 정숫값에 마지막 자릿수를 제외한 값과 마지막 자릿수를 표시
import java.util.Scanner;

class LowestDigit {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("정숫값: ");
        int x = stdIn.nextInt();
        stdIn.close();
        
        System.out.println("마지막 자릿수를 제외한 값은 " + (x / 10) + "입니다.");
        System.out.println("마지막 자릿수는 " + (x % 5) + "입니다.");
    }
}
