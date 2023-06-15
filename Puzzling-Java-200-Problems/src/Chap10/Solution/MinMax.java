/**
 =======================================================================================
 ------------------------------------- Problem 10-7 ------------------------------------
 배열의 값 중에서 최솟값과 최댓값을 구하는 메서드를 모은 유틸리티 클래스 MinMax를 작성하자.

 ----------------------------------------- 입력 -----------------------------------------
 없음

 ------------------------------------- 출력(실행결과) -------------------------------------
 없음

 --------------------------------------- 에러 내용 ---------------------------------------
 없음

 =======================================================================================
 */
package Chap10.Solution;

public class MinMax {
    public static int min(int x, int y) {
        return x < y ? x : y;
    }

    public static int min(int x, int y, int z) {
        int min = x;
        if (y < min) {
            min = y;
        }
        if (z < min) {
            min = z;
        }
        return min;
    }

    public static int min(int[] x) {
        int min = x[0];
        for (int i = 1; i < x.length; i++) {
            if (x[i] < min) {
                min = x[i];
            }
        }
        return min;
    }

    public static int[] minIndexArray(int[] x) {
        int min = min(x);
        int count = 0;
        for (int i = 0; i < x.length; i++) {
            if (x[i] == min) {
                count++;
            }
        }

        int[] c = new int[count--];
        for (int i = x.length - 1; count >= 0; i--) {
            if (x[i] == min) {
                c[count--] = i;
            }
        }
        return c;
    }

    public static int max(int x, int y) {
        return x > y ? x : y;
    }

    public static int max(int x, int y, int z) {
        int max = x;
        if (y > max) {
            max = y;
        }
        if (z > max) {
            max = z;
        }
        return max;
    }

    public static int max(int[] x) {
        int max = x[0];
        for (int i = 1; i < x.length; i++) {
            if (x[i] > max) {
                max = x[i];
            }
        }
        return max;
    }

    public static int[] maxIndexArray(int[] x) {
        int max = max(x);
        int count = 0;
        for (int i = 0; i < x.length; i++) {
            if (x[i] == max) {
                count++;
            }
        }

        int[] c = new int[count--];
        for (int i = x.length - 1; count >= 0; i--) {
            if (x[i] == max) {
                c[count--] = i;
            }
        }
        return c;
    }
}
