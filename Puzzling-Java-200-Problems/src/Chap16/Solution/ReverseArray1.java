/**
 =======================================================================================
 ------------------------------------- Problem 16-6 ------------------------------------
 배열의 요소를 반대로 나열하는 메서드를 작성한다.
 존재하지 않는 요소에 접근하는 버그를 심어서 프로그램 동작을 확인한다.

 ----------------------------------------- 입력 -----------------------------------------
 5
 10
 73
 2
 -5
 42

 ------------------------------------- 출력(실행결과) -------------------------------------
 요소 수:
 x[0]:
 x[1]:
 x[2]:
 x[3]:
 x[4]:

 --------------------------------------- 에러 내용 ---------------------------------------
 java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
     at Chap16.Solution.ReverseArray1.swap(ReverseArray1.java:35)
     at Chap16.Solution.ReverseArray1.reverse(ReverseArray1.java:42)
     at Chap16.Solution.ReverseArray1.main(ReverseArray1.java:67)

 =======================================================================================
 */
package Chap16.Solution;
import java.util.Scanner;

public class ReverseArray1 {
    static void swap(int[] a, int idx1, int idx2) {
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
    }

    static void reverse(int[] a) {
        try {
            for (int i = 0; i < a.length / 2; i++) {
                swap(a, i, a.length-i);
            }
        } catch (NullPointerException e) {
            e.printStackTrace();
            System.exit(1);
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
            System.exit(1);
        }
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.print("요소 수: ");
        int n = stdIn.nextInt();

        int[] x = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("x[" + i + "]: ");
            x[i] = stdIn.nextInt();
        }
        stdIn.close();

        try {
            reverse(x);
            System.out.println("요소를 반대로 나열했습니다.");
        } catch (RuntimeException e) {
            System.out.println("예외: " + e);
            System.out.println("예외의 원인: " + e.getCause());
        }
    }
}
