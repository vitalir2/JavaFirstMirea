package ru.mirea.task3;

public class HumanTest {
    public static void main(String[] args) {
        Human human = new Human.HumanBuilder()
                .head("blue", 25)
                .body("white", 155.5)
                .leftHand(45.5, 5)
                .rightHand(47.1, 4.8)
                .leftLeg(40.5, 1.2)
                .rightLeg(41, 1.3)
                .build();
        System.out.println(human);
        System.out.println(human.getBody());
    }
}
