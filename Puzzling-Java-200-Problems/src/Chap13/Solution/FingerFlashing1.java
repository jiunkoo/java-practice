/**
 =======================================================================================
 ------------------------------------- Problem 13-6 ------------------------------------
 Player 클래스를 이용해서 가위바위보 게임을 하는 프로그램을 작성하자.

 ----------------------------------------- 입력 -----------------------------------------
 없음

 ------------------------------------- 출력(실행결과) -------------------------------------
 가위 바위 보! 0...가위/1...바위/2...보: 1
 컴퓨터는 보이고,
 당신은 바위이며,
 당신이 이겼습니다.
 다시 한 번? 0...No/1...Yes: 0

 --------------------------------------- 에러 내용 ---------------------------------------
 없음

 =======================================================================================
 */
package Chap13.Solution;
import java.util.Scanner;

public class FingerFlashing1 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        HumanPlayer hp = new HumanPlayer();
        ComputerPlayer cp = new ComputerPlayer();
        String[] hands = {"가위", "바위", "보"};
        int retry;

        do {
            int comp = cp.nextHand();
            int user = hp.nextHand();

            System.out.println("컴퓨터는 " + hands[comp] + "이고, ");
            System.out.println("당신은 " + hands[user] + "이며, ");

            int judge = (user - comp + 3) % 3;
            switch (judge) {
                case 0:
                    System.out.println("비겼습니다.");
                    break;
                case 1:
                    System.out.println("당신이 졌습니다.");
                    break;
                case 2:
                    System.out.println("당신이 이겼습니다.");
                    break;
            }
            do {
                System.out.print("다시 한 번? 0...No/1...Yes: ");
                retry = stdIn.nextInt();
            } while (retry != 0 && retry != 1);
        } while (retry == 1);
    }
}
