/**
=======================================================================================
------------------------------------- Problem 9-6 -------------------------------------
Chap8 패키지의 Human2.java에 정의된 Human2 클래스를 수정하자.

--- Human3 클래스 ---
변수
    1) 이름(문자열)
    2) 신장(정수)
    3) 체중(정수)
    4) 생일(날짜)

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
// 사람 클래스(ver.3)
public class Human3 {
    private String name;
    private int height;
    private int weight;
    private Day birthday;

    //--- 생성자 ---//
    public Human3(String name, int height, int weight, Day birthday) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.birthday = birthday;
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
    public Day getBirthDay() {
        return new Day(birthday);
    }


    void gainWeight(int weight) {
        this.weight += weight;
    }

    void reduceWeight(int weight) {
        this.weight -= weight;
    }

    public void putData() {
        System.out.println("이름: " + name);
        System.out.println("신장: " + height + "cm");
        System.out.println("체중: " + weight + "kg");
    }

    public String toString() {
        return "{" + name + ": " + height +  "cm " + weight + "kg " + birthday + "출생}";
    }
}
