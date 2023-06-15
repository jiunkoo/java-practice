/**
 =======================================================================================
 ------------------------------------- Problem 10-8 ------------------------------------
 Chap9의 Day1.java의 Day1 클래스를 개선하자.

 ----------------------------------------- 입력 -----------------------------------------
 2023
 6
 16
 1
 4
 3
 30
 5

 ------------------------------------- 출력(실행결과) -------------------------------------
 연:
 월:
 일:
 [1]날짜 관련 정보 표시
 [2]날짜 변경
 [3]다른 날짜와 비교
 [4]전후 날짜
 [5]종료
 >>>
 2023년 06월 16일(금)에 관한 정보
 윤년이 아닙니다.
 연도 내 경과 일수: 167
 연도 내 잔여 일수: 198
 [1]날짜 관련 정보 표시
 [2]날짜 변경
 [3]다른 날짜와 비교
 [4]전후 날짜
 [5]종료
 >>>
 [1]내일
 [2]어제
 [3]n일 후
 [4]n일 전
 >>>
 며칠:
 이 날은2023년 07월 16일(일)입니다.
 [1]날짜 관련 정보 표시
 [2]날짜 변경
 [3]다른 날짜와 비교
 [4]전후 날짜
 [5]종료
 >>>

 --------------------------------------- 에러 내용 ---------------------------------------
 없음

 =======================================================================================
 */
package Chap10.Solution;
import java.util.Scanner;

public class DayTester {
    static Scanner stdIn = new Scanner(System.in);

    static void display(Day2 day) {
        System.out.println(day + "에 관한 정보");
        System.out.println("윤년" + ((day.isLeap()) ? "입니다." : "이 아닙니다."));
        System.out.println("연도 내 경과 일수: " + day.dayOfYear());
        System.out.println("연도 내 잔여 일수: " + day.leftDayOfYear());
    }

    static void change(Day2 day) {
        System.out.println("[1]연월일을 변경");
        System.out.println("[2]연을 변경");
        System.out.println("[3]월을 변경");
        System.out.println("[4]일을 변경");
        System.out.println("[5]1일 뒤");
        System.out.println("[6]1일 앞");
        System.out.println("[7]n일 뒤");
        System.out.println("[8]n일 앞");
        System.out.print(">>> ");

        int change = stdIn.nextInt();
        int y = 0, m = 0, d = 0, n = 0;
        if (change == 1 || change == 2) {
            System.out.print("연: ");
            y = stdIn.nextInt();
        }
        if (change == 1 || change == 3) {
            System.out.print("월: ");
            m = stdIn.nextInt();
        }
        if (change == 1 || change == 4) {
            System.out.print("일: ");
            d = stdIn.nextInt();
        }
        if (change == 7 || change == 8) {
            System.out.print("며칠: ");
            n = stdIn.nextInt();
        }

        switch (change) {
            case 1:
                day.set(y, m, d);
                break;
            case 2:
                day.setYear(y);
                break;
            case 3:
                day.setMonth(m);
                break;
            case 4:
                day.setDate(d);
                break;
            case 5:
                day.succeed();
                break;
            case 6:
                day.precede();
                break;
            case 7:
                day.succeedDays(n);
                break;
            case 8:
                day.precedeDays(n);
                break;
        }
        System.out.println(day + "로 변경되었습니다.");
    }

    static void compare(Day2 day) {
        System.out.println("비교 대상 날짜를 입력하자.");
        System.out.print("연: ");
        int y = stdIn.nextInt();
        System.out.print("월: ");
        int m = stdIn.nextInt();
        System.out.print("일: ");
        int d = stdIn.nextInt();

        Day2 d2 = new Day2(y, m, d);

        int comp = day.compareTo(d2);
        System.out.print(day);

        switch (comp) {
            case -1:
                System.out.println("가 앞");
                break;
            case 0:
                System.out.println("와 같다.");
                break;
            case 1:
                System.out.println("가 뒤");
                break;
        }
    }

    static void beforeAfter(Day2 day) {
        System.out.println("[1]내일");
        System.out.println("[2]어제");
        System.out.println("[3]n일 후");
        System.out.println("[4]n일 전");
        System.out.print(">>> ");

        int type = stdIn.nextInt();
        int n = 0;
        if (type == 3 || type == 4) {
            System.out.print("며칠: ");
            n = stdIn.nextInt();
        }

        System.out.print("이 날은");
        switch (type) {
            case 1:
                System.out.print(day.succeedingDay());
                break;
            case 2:
                System.out.print(day.precedingDay());
                break;
            case 3:
                System.out.print(day.after(n));
                break;
            case 4:
                System.out.print(day.before(n));
                break;
        }
        System.out.println("입니다.");
    }

    public static void main(String[] args) {
        System.out.println("날짜를 입력하자.");
        System.out.print("연: ");
        int y = stdIn.nextInt();
        System.out.print("월: ");
        int m = stdIn.nextInt();
        System.out.print("일: ");
        int d = stdIn.nextInt();

        Day2 day = new Day2(y, m, d);

        while (true) {
            System.out.println("[1]날짜 관련 정보 표시");
            System.out.println("[2]날짜 변경");
            System.out.println("[3]다른 날짜와 비교");
            System.out.println("[4]전후 날짜");
            System.out.println("[5]종료");
            System.out.print(">>> ");

            int menu = stdIn.nextInt();
            if (menu == 5) {
                break;
            }

            switch (menu) {
                case 1:
                    display(day);
                    break;
                case 2:
                    change(day);
                    break;
                case 3:
                    compare(day);
                    break;
                case 4:
                    beforeAfter(day);
                    break;
            }
        }
    }
}
