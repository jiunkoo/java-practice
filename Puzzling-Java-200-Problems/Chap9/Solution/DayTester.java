/**
=======================================================================================
------------------------------------- Problem 9-4 -------------------------------------
Day.java에 정의된 Day 클래스를 사용하자.

----------------------------------------- 입력 -----------------------------------------
2017
5
25

------------------------------------- 출력(실행결과) -------------------------------------
년/월/일을 입력하세요.
년:
월:
일:
p = 2017년 05월 25일(목)
p와 q를 동일 날짜로 만들었습니다.
q = 2017년 05월 25일(목)
p와 q의 날짜가 같습니다.
d1 = 0001년 01월 01일(월)
d2 = 2017년 01월 01일(일)
d3 = 2017년 10월 01일(일)
d4 = 2017년 10월 01일(일)
a[0] = 0001년 01월 01일(월)
a[1] = 0001년 01월 01일(월)

--------------------------------------- 에러 내용 ---------------------------------------
없음

=======================================================================================
*/
// 날짜 클래스(ver.1) 사용 예시
import java.util.Scanner;

class DayTester {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("년/월/일을 입력하세요.");
        System.out.print("년: ");
        int year = stdIn.nextInt();
        System.out.print("월: ");
        int month = stdIn.nextInt();
        System.out.print("일: ");
        int date = stdIn.nextInt();
        stdIn.close();

        Day p = new Day(year, month, date);
        System.out.println("p = " + p);
        Day q = new Day(p);
        System.out.println("p와 q를 동일 날짜로 만들었습니다.");
        System.out.println("q = " + q);

        System.out.println((p.equalTo(q)) ? "p와 q의 날짜가 같습니다." : "p와 q의 날짜가 다릅니다.");

        Day d1 = new Day();
        Day d2 = new Day(2017);
        Day d3 = new Day(2017, 10);
        Day d4 = new Day(2017, 10, 1);

        System.out.println("d1 = " + d1);
        System.out.println("d2 = " + d2);
        System.out.println("d3 = " + d3);
        System.out.println("d4 = " + d4);

        Day[] a = new Day[2];
        for (int i = 0; i < a.length; i++) {
            a[i] = new Day();
        }
 
        for (int i = 0; i < a.length; i++) {
            System.out.println("a[" + i + "] = " + a[i]);
        }
    }
}
