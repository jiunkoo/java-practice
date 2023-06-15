/**
 =======================================================================================
 ------------------------------------- Problem 13-7 ------------------------------------
 Chap9의 Human3.java에 정의된 Human3 클래스를 수정하자.

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

public class Human5 {
    private String name;
    private int height;
    private int weight;
    private Day1 birthday;

    //--- 생성자 ---//
    public Human5(String name, int height, int weight, Day1 birthday) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.birthday = new Day1(birthday);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Day1 getBirthday() {
        return birthday;
    }

    public void setBirthday(Day1 birthday) {
        this.birthday = birthday;
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
