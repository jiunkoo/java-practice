/**
 =======================================================================================
 ------------------------------------ Problem 15-11 ------------------------------------
 3명이 참여하는 가위바위보 게임을 작성하자.

 ----------------------------------------- 입력 -----------------------------------------
 0
 0

 ------------------------------------- 출력(실행결과) -------------------------------------
 가위 바위 보! 0...가위/1...바위/2...보:
 컴퓨터1은 바위이고,
 컴퓨터2는 가위이며,
 당신은 가위이며,
 당신과 컴퓨터2가 이겼습니다.
 다시 한 번? 0...No/1...Yes:

 --------------------------------------- 에러 내용 ---------------------------------------
 없음

 =======================================================================================
 */
package Chap15.Solution;
import Chap13.Solution.ComputerPlayer;
import Chap13.Solution.HumanPlayer;
import java.util.Scanner;

public class FingerFlashing2 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        HumanPlayer hp = new HumanPlayer();
        ComputerPlayer cp1 = new ComputerPlayer();
        ComputerPlayer cp2 = new ComputerPlayer();

        String[] hands = {"가위", "바위", "보"};
        int retry;

        do {
            int comp1 = cp1.nextHand();
            int comp2 = cp2.nextHand();
            int user = hp.nextHand();

            System.out.println("컴퓨터1은 " + hands[comp1] + "이고, ");
            System.out.println("컴퓨터2는 " + hands[comp2] + "이며, ");
            System.out.println("당신은 " + hands[user] + "이며, ");

            int r1 = (user - comp1 + 3) % 3;
            int r2 = (user - comp2 + 3) % 3;

            if (r1 == 2 && r2 == 2) {
                System.out.println("당신이 이겼습니다.");
            } else if (r1 == 1 && r2 == 0) {
                System.out.println("컴퓨터1이 이겼습니다.");
            } else if (r1 == 0 && r2 == 1) {
                System.out.println("컴퓨터2가 이겼습니다.");
            } else if (r1 == 0 && r2 == 2) {
                System.out.println("당신과 컴퓨터1이 이겼습니다.");
            } else if (r1 == 2 && r2 == 0) {
                System.out.println("당신과 컴퓨터2가 이겼습니다.");
            } else if (r1 == 1 && r2 == 1) {
                System.out.println("컴퓨터1과 컴퓨터2가 이겼습니다.");
            } else {
                System.out.println("비겼습니다.");
            }
            do {
                System.out.print("다시 한 번? 0...No/1...Yes: ");
                retry = stdIn.nextInt();
            } while (retry != 0 && retry != 1);
        } while (retry == 1);
    }
}
