/**
=======================================================================================
------------------------------------- Problem 9-3 -------------------------------------
Chap8 패키지의 Human2.java에 정의된 Human2 클래스를 사용하는 프로그램을 작성하자.

----------------------------------------- 입력 -----------------------------------------
1
1호
163
43
2
1
2호
164
44
1
3호
165
45

------------------------------------- 출력(실행결과) -------------------------------------
배열 q의 요소 수: 1       
q[0]
이름: 1호
신장: 163
체중: 43
배열 y의 행 수: 2
y[0]의 열 수: 1
y[0][0]
이름: 2호
신장: 164
체중: 44
y[1]의 열 수: 1
y[1][0]
이름: 3호
신장: 165
체중: 45
---------- 배열 p ----------
No.0 철수 170cm  70kg
No.1 길동 160cm  59kg
---------- 배열 q ----------
No.0 1호 163cm  43kg
---------- 배열 x ----------
0행
No.0 철수 170cm  70kg
1행
No.0 길동 160cm  59kg
---------- 배열 y ----------
0행
No.0 2호 164cm  44kg
1행
No.0 3호 165cm  45kg

--------------------------------------- 에러 내용 ---------------------------------------
없음

=======================================================================================
*/
// 사람 클래스 인스턴스 배열
import java.util.Scanner;
import Chap8.Solution.Human2;

class HumanTester3 {
    static void printHumanArray(Human2[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.printf("No.%d %s %3dcm %3dkg\n",
            i, a[i].getName(), a[i].getHeight(), a[i].getWeight());
        }
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int n;

        Human2[] p = {
            new Human2("철수", 170, 70),
            new Human2("길동", 160, 59),
        };

        System.out.print("배열 q의 요소 수: ");
        n = stdIn.nextInt();

        Human2[] q = new Human2[n];
        for (int i = 0; i < q.length; i++) {
            System.out.println("q[" + i + "]");
            System.out.print("이름: ");
            String name = stdIn.next();
            System.out.print("신장: ");
            int height = stdIn.nextInt();
            System.out.print("체중: ");
            int weight = stdIn.nextInt();
            q[i] = new Human2(name, height, weight);
        }

        Human2[][] x = {
            {
                new Human2("철수", 170, 70),
            },
            {
                new Human2("길동", 160, 59),
            },
        };

        System.out.print("배열 y의 행 수: ");
        n = stdIn.nextInt();

        Human2[][] y = new Human2[n][];
        for (int i = 0; i < y.length; i++) {
            System.out.print("y[" + i + "]의 열 수: ");
            n = stdIn.nextInt();
            y[i] = new Human2[n];
            for (int j = 0; j < y[i].length; j++) {
                System.out.println("y[" + i + "][" + j + "]");
                System.out.print("이름: ");
                String name = stdIn.next();
                System.out.print("신장: ");
                int height = stdIn.nextInt();
                System.out.print("체중: ");
                int weight = stdIn.nextInt();
                y[i][j] = new Human2(name, height, weight);
            }
        }

        stdIn.close();

        System.out.println("---------- 배열 p ----------");
        printHumanArray(p);

        System.out.println("---------- 배열 q ----------");
        printHumanArray(q);

        System.out.println("---------- 배열 x ----------");
        for (int i= 0; i < x.length; i++) {
            System.out.printf("%d행\n", i);
            printHumanArray(x[i]);
        }
 
        System.out.println("---------- 배열 y ----------");
        for (int i= 0; i < y.length; i++) {
            System.out.printf("%d행\n", i);
            printHumanArray(y[i]);
        }
    }
}
