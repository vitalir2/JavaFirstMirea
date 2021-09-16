package ru.mirea.task2;

public class Ball {
    private final static String STANDARD_COLOR = "white";

    private String color;
    private double radius; // cm

    public Ball(String color, double radius) {
        this.color = color;
        this.radius = radius;
    }

    public Ball(double radius) {
        this(STANDARD_COLOR, radius);
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Ball{" +
                "color='" + color + '\'' +
                ", radius=" + radius +
                '}';
    }
}
