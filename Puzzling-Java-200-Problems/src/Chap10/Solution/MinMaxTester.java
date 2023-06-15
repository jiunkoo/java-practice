/**
 =======================================================================================
 ------------------------------------- Problem 10-7 ------------------------------------
 배열의 값 중에서 최솟값과 최댓값을 구하는 메서드를 모은 유틸리티 클래스 MinMax를 작성하자.

 ----------------------------------------- 입력 -----------------------------------------
 3
 4
 1
 6
 2
 1
 3
 2
 1
 3

 ------------------------------------- 출력(실행결과) -------------------------------------
 x값:
 y값:
 z값:
 배열 a의 요소 수:
 a[0]:
 a[1]:
 a[2]:
 a[3]:
 a[4]:
 a[5]:
 MinMax.min(x, y) = 3
 MinMax.max(x, y) = 4
 MinMax.min(x, y, z) = 1
 MinMax.max(x, y, z) = 4
 MinMax.min(a) = 1
 인덱스는{ 1 4 } 입니다.
 배열 a의 최댓값은 3 입니다.
 인덱스는{2 5 } 입니다.
 배열 a의 최댓값은 3 입니다.

 --------------------------------------- 에러 내용 ---------------------------------------
 없음

 =======================================================================================
 */
package Chap10.Solution;
import java.util.Scanner;

public class MinMaxTester {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.print("x값: ");
        int x = stdIn.nextInt();
        System.out.print("y값: ");
        int y = stdIn.nextInt();
        System.out.print("z값: ");
        int z = stdIn.nextInt();
        System.out.print("배열 a의 요소 수: ");
        int num = stdIn.nextInt();

        int[] a = new int[num];
        for (int i = 0; i < num; i++) {
            System.out.print("a[" + i + "]: ");
            a[i] = stdIn.nextInt();
        }
        stdIn.close();

        System.out.println("MinMax.min(x, y) = " + MinMax.min(x, y));
        System.out.println("MinMax.max(x, y) = " + MinMax.max(x, y));
        System.out.println("MinMax.min(x, y, z) = " + MinMax.min(x, y, z));
        System.out.println("MinMax.max(x, y, z) = " + MinMax.max(x, y, z));
        System.out.println("MinMax.min(a) = " + MinMax.min(a));

        int[] xmin = MinMax.minIndexArray(a);
        System.out.print("인덱스는{ ");
        for (int i = 0; i < xmin.length; i++) {
            System.out.print(xmin[i] + " ");
        }
        System.out.println("} 입니다.");
        System.out.printf("배열 a의 최댓값은 %d 입니다.\n", MinMax.max(a));
        int[] xmax = MinMax.maxIndexArray(a);
        System.out.print("인덱스는{");
        for (int i = 0; i < xmax.length; i++) {
            System.out.print(xmax[i] + " ");
        }
        System.out.println("} 입니다.");
        System.out.printf("배열 a의 최댓값은 %d 입니다.\n", MinMax.max(a));
    }
}
