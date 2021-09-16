package ru.mirea.task3;

public class Circle {
    private double x, y;
    private double radius;

    public Circle() {
        this(0, 0, 0);
    }

    public Circle(double radius) {
        this(0, 0, radius);
    }

    public Circle(double x, double y) {
        this(x, y, 0);
    }

    public Circle(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
