/**
=======================================================================================
------------------------------------- Problem 6-4 -------------------------------------
int형 배열의 각 요소에 난수를 대입하고 각 요소 값을 막대 그래프로 표시하는 프로그램을 작성하자.
- 난수 생성 범위: 1~10
- 요소 수는 키보드로 입력
- 막대그래프: 기호 문자 * 나열
- 마지막 행에는 인덱스를 10으로 나눈 나머지 표시

----------------------------------------- 입력 -----------------------------------------
12

------------------------------------- 출력(실행결과) -------------------------------------
요소 수: 10
                    
      *             
*     *         *   
*     *         *   
*     *     *   *   
*     *     *   * * 
*   * *     *   * * 
* * * *   * *   * * 
* * * * * * * * * * 
* * * * * * * * * * 
--------------------
8 3 4 9 2 3 6 2 8 5 

--------------------------------------- 에러 내용 ---------------------------------------
없음

=======================================================================================
*/
package Chap6.Solution;
import java.util.Scanner;
import java.util.Random;

// 배열의 모든 요소에 난수를 대입한 후 막대 그래프로 표시
class ColumnChart {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("요소 수: ");
        int n = stdIn.nextInt();
        stdIn.close();

        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = rand.nextInt(10);
        }

        for (int i = 9; i >= 0; i--) {
            for (int j = 0; j < n; j++) {
                if (i < a[j]) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        for (int i = 0; i < 2 * n; i++) {
            System.out.print("-");
        }
        System.out.println();

        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
}
