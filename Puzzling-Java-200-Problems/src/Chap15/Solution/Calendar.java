/**
 =======================================================================================
 ------------------------------------ Problem 15-15 ------------------------------------
 커맨드라인 인수로 지정한 월의 달력을 표시하는 프로그램을 작성하자.

 ----------------------------------------- 입력 -----------------------------------------
 없음

 ------------------------------------- 출력(실행결과) -------------------------------------
 2023년 6월 달력
 일 월 화 수 목 금 토
 ----------------
 1  2  3
 4  5  6  7  8  9 10
 11 12 13 14 15 16 17
 18 19 20 21 22 23 24
 25 26 27 28 29 30

 --------------------------------------- 에러 내용 ---------------------------------------
 없음

 =======================================================================================
 */
package Chap15.Solution;
import java.util.GregorianCalendar;
import static java.util.Calendar.*;

public class Calendar {
    static int[] mday = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    static int dayOfWeek(int y, int m, int d) {
        if (m == 1 || m == 2) {
            y--;
            m += 12;
        }
        return (y + y/4 - y/100 + y/400 + (13*m + 8) / 5 + d) % 7;
    }

    static boolean isLeap(int y) {
        return y % 4 == 0 && y % 100 != 0 || y % 400 == 0;
    }

    static int monthDays(int year, int month) {
        if (month-- != 2) {
            return mday[month];
        }
        return mday[month] + (isLeap(year) ? 1 : 0);
    }

    static void putCalendar(int year, int month) {
        int wd =  dayOfWeek(year, month, 1);
        int mdays = monthDays(year, month);

        System.out.println("일 월 화 수 목 금 토");
        System.out.println("----------------");

        for (int i = 0; i < wd; i++) {
            System.out.print("   ");
        }

        for (int i = 1; i <= mdays; i++) {
            System.out.printf("%3d", i);
            if (++wd % 7 == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int year = 1, month = 1;
        if (args.length == 0) {
            GregorianCalendar today = new GregorianCalendar();
            year = today.get(YEAR);
            month = today.get(MONTH) + 1;
        } else {
            if (args.length > 1) {
                year = Integer.parseInt(args[0]);
                if (year < 0) {
                    System.out.println("년 지정이 잘못됐습니다.");
                    return;
                }
            }
            if (args.length >= 2) {
                month = Integer.parseInt(args[1]);
                if (month < 1 || month > 12) {
                    System.out.println("월 지정이 잘못됐습니다.");
                    return;
                }
            }
        }
        if (args.length == 0 || args.length >= 2) {
            System.out.printf("%d년 %d월 달력\n", year, month);
            putCalendar(year, month);
        } else {
            System.out.printf("%d년의 달력\n", year);
            for (month = 1; month <= 12; month++) {
                System.out.printf("%d월\n", month);
                putCalendar(year, month);
                System.out.println();
            }
        }
    }
}
