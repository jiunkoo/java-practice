/**
=======================================================================================
------------------------------------- Problem 5-7 -------------------------------------
int형 변환에 실숫값을 대입해서 표시하는 프로그램을 작성하자.

----------------------------------------- 입력 -----------------------------------------
없음

------------------------------------- 출력(실행결과) -------------------------------------
a = 10

--------------------------------------- 에러 내용 ---------------------------------------
없음

=======================================================================================
*/
// int형 변환에 실숫값을 대입
class FloatToInteger {
    public static void main(String[] args) {
        int a;
        a = (int) 10.0; // 형변환 없이 입력하면 오류

        System.out.println("a = " + a);
    }
}
