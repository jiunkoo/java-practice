/**
 =======================================================================================
 ------------------------------------- Problem 14-4 ------------------------------------
 Pet을 상속한 RobotPet 클래스를 작성하자.

 ----------------------------------------- 입력 -----------------------------------------
 없음

 ------------------------------------- 출력(실행결과) -------------------------------------
 없음

 --------------------------------------- 에러 내용 ---------------------------------------
 없음

 =======================================================================================
 */
package Chap14.Solution;

public class RobotPet extends Pet {
    public RobotPet(String name, String masterName) {
        super(name, masterName);
    }

    @Override
    public void introduce() {
        System.out.println("나는 로봇! 이름은 " + getName() + ".");
        System.out.println("주인님의 이름은 " + getMasterName() + ".");
    }

    public void work(int sw) {
        switch (sw) {
            case 0:
                System.out.println("청소를 합니다.");
                break;
            case 1:
                System.out.println("세탁을 합니다.");
                break;
            case 2:
                System.out.println("밥을 합니다.");
                break;
        }
    }
}
