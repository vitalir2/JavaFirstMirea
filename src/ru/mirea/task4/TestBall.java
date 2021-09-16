package ru.mirea.task4;

public class TestBall {
    public static void main(String[] args) {
        Ball ball = new Ball();
        Ball ball2 = new Ball(20, 50);

        System.out.println(ball);
        ball.setXY(10, 10);
        System.out.println(ball);

        ball2.move(10, -5);
        System.out.println(ball2);

        ball.setSpeed(2);
        ball.move(10, 10);
        System.out.println(ball);
    }
}
