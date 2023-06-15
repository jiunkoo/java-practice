/**
 =======================================================================================
 ------------------------------------- Problem 10-4 ------------------------------------
 Id2.java의 Id2 클래스를 수정하자.
 인스턴스를 생성할 때마다 식별 번호를 n씩 증가시켜서 부여한다(n은 양의 정수).
 n값을 지정하지 않으면 1로 설정하고 메서드를 통해서 확인 및 변경한다.
 인스턴스를 3개 생성한 후에 n을 4로 설정한 경우 인스턴스에 부여하는 식별 번호는 1, 2, 3, 7, 11, 15, ...이다.

 ----------------------------------------- 입력 -----------------------------------------
 없음

 ------------------------------------- 출력(실행결과) -------------------------------------
 없음

 --------------------------------------- 에러 내용 ---------------------------------------
 없음

 =======================================================================================
 */
package Chap10.Solution;

public class ExId {
    static int counter = 0;
    private static int step = 1;
    private int id;

    public ExId() {
        id = counter += step;
    }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        ExId.counter = counter;
    }

    public static int getStep() {
        return step;
    }

    public static void setStep(int step) {
        ExId.step = step;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static int getMaxId() {
        return counter;
    }
}
