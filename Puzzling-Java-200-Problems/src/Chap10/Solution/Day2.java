/**
 =======================================================================================
 ------------------------------------- Problem 10-8 ------------------------------------
 Chap9의 Day1.java의 Day1 클래스를 개선하자.

 ----------------------------------------- 입력 -----------------------------------------
 없음

 ------------------------------------- 출력(실행결과) -------------------------------------
 없음

 --------------------------------------- 에러 내용 ---------------------------------------
 없음

 =======================================================================================
 */
package Chap10.Solution;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Day2 {
    private int year = 1;
    private int month = 1;
    private int date = 1;
    private static int[][] mdays = {
            {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},
            {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},
    };

    public static boolean isLeap(int y) {
        return y % 4 == 0 && y % 100 != 0 || y % 400 == 0;
    }

    private static int dayOfMonth(int y, int m) {
        return mdays[isLeap(y) ? 1 : 0][m - 1];
    }

    private static int adjustedMonth(int m) {
        return m < 1 ? 1 : m > 12 ? 12 : m;
    }

    private static int adjustedDay(int y, int m, int d) {
        if (d < 1) {
            return 1;
        }
        int dMax = dayOfMonth(y, m);
        return d > dMax ? dMax : d;
    }

    public Day2() {
        GregorianCalendar today = new GregorianCalendar();
        this.year = today.get(Calendar.YEAR);
        this.month = today.get(Calendar.MONTH) + 1;
        this.date = today.get(Calendar.DATE);
    }

    public Day2(int year) {
        this.year = year;
    }

    public Day2(int year, int month) {
        this.year = year;
        this.month = month;
    }

    public Day2(int year, int month, int date) {
        this.year = year;
        this.month = month;
        this.date = date;
    }

    public Day2(Day2 d) {
        this(d.year, d.month, d.date);
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
        this.date = adjustedDay(year, month, date);
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = adjustedMonth(month);
        this.date = adjustedDay(year, this.month, date);
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = adjustedDay(year, month, date);
    }

    public void set(int year, int month, int date) {
        this.year = year;
        this.month = adjustedMonth(month);
        this.date = adjustedDay(year, this.month, date);
    }

    public static int[][] getMdays() {
        return mdays;
    }

    public static void setMdays(int[][] mdays) {
        Day2.mdays = mdays;
    }

    public boolean isLeap() {
        return isLeap(year);
    }

    public int dayOfWeek() {
        int y = year;
        int m = month;
        if (m == 1 || m == 2) {
            y--;
            m += 12;
        }
        return (y + y/4 - y/100 + y/400 + (13*m + 8) / 5 + date) % 7;
    }

    public boolean equalTo(Day2 d) {
        return year == d.year && month == d.month && date == d.date;
    }

    public String toString() {
        String[] wd = {"일", "월", "화", "수", "목", "금", "토"};
        return String.format(
                "%04d년 %02d월 %02d일(%s)",
                year, month, date, wd[dayOfWeek()]
        );
    }

    public int dayOfYear() {
        int days = date;
        for (int i = 1; i < month; i++) {
            days += dayOfMonth(year, i);
        }
        return days;
    }

    public int leftDayOfYear() {
        return 365 + (isLeap(year) ? 1 : 0) - dayOfYear();
    }

    public int compareTo(Day2 d) {
        return compare(this, d);
    }

    public static int compare(Day2 d1, Day2 d2) {
        if (d1.year > d2.year) {
            return 1;
        }
        if (d1.year < d2.year) {
            return -1;
        }
        if (d1.month > d2.month) {
            return 1;
        }
        if (d1.month < d2.month) {
            return -1;
        }

        return d1.date > d2.date ? 1 : d1.date < d2.date ? -1 : 0;
    }

    public void succeed() {
        if (date < dayOfMonth(year, month)) {
            date++;
        } else {
            if (++month > 12) {
                year++;
                month = 1;
            }
            date = 1;
        }
    }

    public Day2 succeedingDay() {
        Day2 temp = new Day2(this);
        temp.succeed();
        return temp;
    }

    public void precede() {
        if (date > 1) {
            date--;
        } else {
            if (--month < 1) {
                year--;
                month = 12;
            }
            date = dayOfMonth(year, month);
        }
    }

    public Day2 precedingDay() {
        Day2 temp = new Day2(this);
        temp.precede();
        return temp;
    }

    public void succeedDays(int n) {
        if (n < 0) {
            precedeDays(-n);
        } else if (n > 0) {
            date += n;
            while (date > dayOfMonth(year, month)) {
                date -= dayOfMonth(year, month);
                if (++month > 12) {
                    year++;
                    month = 1;
                }
            }
        }
    }

    public Day2 after(int n) {
        Day2 temp = new Day2(this);
        temp.succeedDays(n);
        return temp;
    }

    public void precedeDays(int n) {
        if (n < 0) {
            succeedDays(-n);
        } else if (n > 0) {
            date -= n;
            while (date < 1) {
                if (--month < 1) {
                    year--;
                    month = 12;
                }
                date += dayOfMonth(year, month);
            }
        }
    }

    public Day2 before(int n) {
        Day2 temp = new Day2(this);
        temp.precedeDays(n);
        return temp;
    }
}
