/**
=======================================================================================
------------------------------------- Problem 8-2 -------------------------------------
아래 문제점을 해결하기 위해 Human1.java에 정의된 Human1 클래스를 수정하자.

문제점
- 데이터 보호 취약: 클래스의 값을 다른 클래스가 자유롭게 변경 가능
(ex. 사람의 이름을 다른 사람이 마음대로 바꾸는 것)
- 초기화 위험성: 인스턴스 초기화를 누락하면 에러 발생

--- Human2 클래스 ---
변수
    1)[접근제한] 이름(문자열)
    2)[접근제한] 신장(정수)
    3)[접근제한] 체중(정수)

메서드
    1) 변수 초기화
    2) 이름, 신장, 체중 변수값 반환
    3) 체중 증감

----------------------------------------- 입력 -----------------------------------------
없음

------------------------------------- 출력(실행결과) -------------------------------------
없음

--------------------------------------- 에러 내용 ---------------------------------------
없음

=======================================================================================
*/
package Chap8.Solution;

// 사람 클래스(ver.2)
public class Human2 {
    private String name;
    private int height;
    private int weight;

    //--- 생성자 ---//
    public Human2(String name, int height, int weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    void gainWeight(int weight) {
        this.weight += weight;
    }

    void reduceWeight(int weight) {
        this.weight -= weight;
    }
}
