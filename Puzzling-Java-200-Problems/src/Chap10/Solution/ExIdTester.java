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
 a.getId() = 1
 b.getId() = 2
 c.getId() = 3
 d.getId() = 7
 e.getId() = 11
 f.getId() = 15
 max = 15
 max + ExId.getStep() = 154

 --------------------------------------- 에러 내용 ---------------------------------------
 없음

 =======================================================================================
 */
package Chap10.Solution;

public class ExIdTester {
    public static void main(String[] args) {
        ExId a = new ExId();
        ExId b = new ExId();
        ExId c = new ExId();
        ExId.setStep(4);
        ExId d = new ExId();
        ExId e = new ExId();
        ExId f = new ExId();

        System.out.println("a.getId() = " + a.getId());
        System.out.println("b.getId() = " + b.getId());
        System.out.println("c.getId() = " + c.getId());
        System.out.println("d.getId() = " + d.getId());
        System.out.println("e.getId() = " + e.getId());
        System.out.println("f.getId() = " + f.getId());
        
        int max = ExId.getMaxId();
        System.out.println("max = " + max);
        System.out.println("max + ExId.getStep() = " + max + ExId.getStep());
    }
}
