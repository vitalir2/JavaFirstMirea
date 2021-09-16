package ru.mirea.task3;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        Circle circle2 = new Circle(125.1, 13.4, 5);
        Circle circle3 = new Circle(12.5);

        System.out.println(circle1);
        System.out.println(circle2.getRadius());
        System.out.println(circle3.getX());
    }
}
