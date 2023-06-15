/**
 =======================================================================================
 ------------------------------------- Problem 13-3 ------------------------------------
 Shape를 상속한 AbsLine 클래스를 작성하자.

 ----------------------------------------- 입력 -----------------------------------------
 없음

 ------------------------------------- 출력(실행결과) -------------------------------------
 없음

 --------------------------------------- 에러 내용 ---------------------------------------
 없음

 =======================================================================================
 */
package Chap13.Solution;

public class AbstLine extends Shape {
    private int length;

    public AbstLine(int length) {
        setLength(length);
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "AbstLine(length:" + length + ")";
    }

    @Override
    public void draw() {}
}
