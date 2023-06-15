/**
 =======================================================================================
 ------------------------------------- Problem 13-8 ------------------------------------
 Human5.java에 정의된 Human5 클래스에 javadoc 스타일로 주석을 달자.

 ----------------------------------------- 입력 -----------------------------------------
 없음

 ------------------------------------- 출력(실행결과) -------------------------------------
 없음

 --------------------------------------- 에러 내용 ---------------------------------------
 없음

 =======================================================================================
 */
package Chap13.Solution;
import Chap9.Solution.Day1;

/**
 * Human(ver.6) 클래스는 인간 클래스이다.
 * @author koubit
 */
public class Human6 {
    /** 이름을 나타내는 String 형 필드 */
    private String name;
    /** 신장을 나타내는 int 형 필드 */
    private int height;
    /** 체중을 나타내는 int 형 필드 */
    private int weight;
    /** 생일을 나타내는 Day 형 필드 */
    private Day1 birthday;

    /**
     * 사람 클래스 Human의 생성자
     * @param name 이름 문자열
     * @param height 신장 숫자
     * @param weight 체중 숫자
     * @param birthday 생일 날짜
     */
    public Human6(String name, int height, int weight, Day1 birthday) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.birthday = new Day1(birthday);
    }

    /**
     * 이름을 확인한다.
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * 신장을 확인한다.
     */
    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    /**
     * 체중을 확인한다.
     */
    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    /**
     * 생일을 확인한다.
     */
    public Day1 getBirthday() {
        return birthday;
    }

    public void setBirthday(Day1 birthday) {
        this.birthday = birthday;
    }

    /**
     * 살이 찐다. 인수에 지정한 값만큼 체중이 증가한다.
     */
    void gainWeight(int weight) {
        this.weight += weight;
    }

    /**
     * 살이 빠진다. 인수에 지정한 값만큼 체중이 감소한다.
     */
    void reduceWeight(int weight) {
        this.weight -= weight;
    }

    /**
     * 이름, 신장, 체중을 표시한다.
     */
    public void putData() {
        System.out.println("이름: " + name);
        System.out.println("신장: " + height + "cm");
        System.out.println("체중: " + weight + "kg");
    }

    /**
     * 문자열 표현을 반환한다.
     */
    public String toString() {
        return "{" + name + ": " + height +  "cm " + weight + "kg " + birthday + "출생}";
    }
}
