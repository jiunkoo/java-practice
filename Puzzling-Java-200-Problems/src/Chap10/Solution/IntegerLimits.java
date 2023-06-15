/**
 =======================================================================================
 ------------------------------------- Problem 10-2 ------------------------------------
 네 개의 정수형(byte, short, int, long)이 표현할 수 있는 최솟값과 최댓값을 표시하자.

 ----------------------------------------- 입력 -----------------------------------------
 없음

 ------------------------------------- 출력(실행결과) -------------------------------------
 정수형의 표현 범위
 Byte.MIN_VALUE = -128
 Byte.MAX_VALUE = 127
 Short.MIN_VALUE = -32768
 Short.MAX_VALUE = 32767
 Integer.MIN_VALUE = -2147483648
 Integer.MAX_VALUE = 2147483647
 Long.MIN_VALUE = -9223372036854775808
 Long.MAX_VALUE = 9223372036854775807

 --------------------------------------- 에러 내용 ---------------------------------------
 없음

 =======================================================================================
 */
package Chap10.Solution;

public class IntegerLimits {
    public static void main(String[] args) {
        System.out.println("정수형의 표현 범위");
        System.out.println("Byte.MIN_VALUE = " + Byte.MIN_VALUE);
        System.out.println("Byte.MAX_VALUE = " + Byte.MAX_VALUE);
        System.out.println("Short.MIN_VALUE = " + Short.MIN_VALUE);
        System.out.println("Short.MAX_VALUE = " + Short.MAX_VALUE);
        System.out.println("Integer.MIN_VALUE = " + Integer.MIN_VALUE);
        System.out.println("Integer.MAX_VALUE = " + Integer.MAX_VALUE);
        System.out.println("Long.MIN_VALUE = " + Long.MIN_VALUE);
        System.out.println("Long.MAX_VALUE = " + Long.MAX_VALUE);
    }
}
