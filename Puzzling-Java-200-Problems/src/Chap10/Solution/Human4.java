/**
 =======================================================================================
 ------------------------------------- Problem 10-1 ------------------------------------
 Chap8의 Human2.java에 정의된 Human2 클래스를 수정하자.
 인스턴스에 식별 번호를 부여한다.
 (인스턴스 생성 시 1, 2, ... 형식으로 연속된 값을 부여한다).

 ----------------------------------------- 입력 -----------------------------------------
 없음

 ------------------------------------- 출력(실행결과) -------------------------------------
 없음

 --------------------------------------- 에러 내용 ---------------------------------------
 없음

 =======================================================================================
 */
package Chap10.Solution;

public class Human4 {
    private static int counter = 0;
    private String name;
    private int height;
    private int weight;
    private int id;

    public Human4(String name, int height, int weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        id = ++ counter;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    void gainWeight(int weight) {
        this.weight += weight;
    }

    void reduceWeight(int weight) {
        this.weight -= weight;
    }

    public void putData() {
        System.out.println("이름: " + name);
        System.out.println("신장: " + height);
        System.out.println("체중: " + weight);
    }
}
