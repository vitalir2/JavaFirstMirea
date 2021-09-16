package ru.mirea.task2;

public class TestBall {
    public static void main(String[] args) {
        Ball ball = new Ball("blue", 5);
        Ball ball2 = new Ball("red", 25);
        Ball ball3 = new Ball(15);
        ball.setColor("green");

        System.out.println(ball);
        System.out.println(ball2);
        System.out.println(ball3);
    }
}
