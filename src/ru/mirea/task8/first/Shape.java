package ru.mirea.task8.first;

import java.awt.*;

public abstract class Shape {
    protected final double x;
    protected final double y;
    protected final Color color;

    public Shape(double x, double y, Color color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public Color getColor() {
        return color;
    }

    abstract void draw(Graphics graphics);
}
