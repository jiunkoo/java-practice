/**
 =======================================================================================
 ------------------------------------ Problem 15-12 ------------------------------------
 커맨드라인 인수를 표시하자.

 ----------------------------------------- 입력 -----------------------------------------
 java PrintArgs AB CD EF

 ------------------------------------- 출력(실행결과) -------------------------------------
 args[0] = AB
 args[1] = CD
 args[2] = EF

 --------------------------------------- 에러 내용 ---------------------------------------
 없음

 =======================================================================================
 */
package Chap15.Solution;

public class PrintArgs {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.println("args[" + i + "] = " + args[i]);
        }
    }
}
