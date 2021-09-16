package ru.mirea.task7.second_task;

public class TestMovable {
    public static void main(String[] args) {
        MovableRectangle rectangle = new MovableRectangle(0, 0, 50, 50, 5, 4);
        rectangle.moveDown();
        rectangle.moveLeft();
        System.out.println(rectangle);

        MovableCircle circle = new MovableCircle(50, 25, 3, 3, 20);
        circle.moveRight();
        circle.moveUp();
        System.out.println(circle);
    }
}
