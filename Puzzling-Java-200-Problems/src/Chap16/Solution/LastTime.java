/**
 =======================================================================================
 ------------------------------------- Problem 16-4 ------------------------------------
 프로그램의 이전 실행 날짜 및 시간, 종료 날짜 및 시간을 표시하는 프로그램을 작성하자.
 처음 프로그램을 실행할 때는 "이 프로그램을 실행하는 것은 처음입니다."고 표시한다.

 ----------------------------------------- 입력 -----------------------------------------
 없음

 ------------------------------------- 출력(실행결과) -------------------------------------
 이 프로그램을 실행하는 것은 처음입니다.

 --------------------------------------- 에러 내용 ---------------------------------------
 없음

 =======================================================================================
 */
package Chap16.Solution;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.GregorianCalendar;
import static java.util.Calendar.*;

public class LastTime {
    static void init() {
        BufferedReader br = null;

        try {
            br = new BufferedReader(new FileReader("LastTime.txt"));
            String time = br.readLine();
            System.out.println("이전 시간은 " + time + "이었습니다.");
        } catch(IOException e) {
            System.out.println("이 프로그램을 실행하는 것은 처음입니다.");
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    System.out.println("파일 닫기 실패");
                }
            }
        }
    }

    static void term() {
        FileWriter fw = null;

        try {
            fw = new FileWriter("LastTime.txt");
            GregorianCalendar c = new GregorianCalendar();
            fw.write(
                    (String.format("%04d년 %02d월 %02d일 %02d시 %02d분 %02d초",
                            c.get(YEAR), c.get(MONTH) + 1, c.get(DATE),
                            c.get(HOUR_OF_DAY), c.get(MINUTE), c.get(SECOND))));
        } catch (IOException e) {
            System.out.println("오류 발생!!");
        } finally {
            if (fw != null) {
                try {
                    fw.close();
                } catch (IOException e) {
                    System.out.println("파일 닫기 실패");
                }
            }
        }
    }

    public static void main(String[] args) {
        init();
        term();
    }
}
