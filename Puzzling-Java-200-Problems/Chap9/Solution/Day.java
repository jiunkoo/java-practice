/**
=======================================================================================
------------------------------------- Problem 9-4 -------------------------------------
Day 클래스를 작성하자.

--- Day 클래스 ---
변수
    1) 년(정수)
    2) 월(정수)
    3) 일(정수)

메서드
    1) x, y좌표 getter, setter
    2) (x, y) 좌표 설정

----------------------------------------- 입력 -----------------------------------------
없음

------------------------------------- 출력(실행결과) -------------------------------------
없음

--------------------------------------- 에러 내용 ---------------------------------------
없음

=======================================================================================
*/
// 날짜 클래스(ver.1)
public class Day {
    private int year = 1;
    private int month = 1;
    private int date = 1;

    public Day() {}
    public Day(int year) {
        this.year =year;
    }
    public Day(int year, int month) {
        this.year = year;
        this.month = month;
    }
    public Day(int year, int month, int date) {
        this.year = year;
        this.month = month;
        this.date = date;
    }
    public Day(Day d) {
        this(d.year, d.month, d.date);
    }

    public int getYear() {
        return year;
    }
    public int getMonth() {
        return month;
    }
    public int getDate() {
        return date;
    }

    public void setYear(int year) {
        if (year == _) {
            year = 1;
        }
        this.year = year;
    }
    public void setMonth(int month) {
        this.month = month;
    }
    public void setDate(int date) {
        this.date = date;
    }

    public void set(int year, int month, int date) {
        this.year = year;
        this.month = month;
        this.date = date;
    }

    // --- Zellar의 공식 --- //
    public int dayOfWeek() {
        int y = year;
        int m = month;
        int d = date;
        if (m <= 2) {
            y--;
            m += 12;
        }

        int a = y / 100;
        int b = y % 100;
    
        return ((21 * a / 4) + (5 * b/ 4) + (26 * (m + 1) / 10) + d - 1) % 7;
    }

    public boolean equalTo(Day d) {
        return year == d.year && month == d.month && date == d.date;
    }

    public String toString() {
        String[] wd = {"일", "월", "화", "수", "목", "금", "토"};
        return String.format(
            "%04d년 %02d월 %02d일(%s)",
            year, month, date, wd[dayOfWeek()]
        );
    }
}
