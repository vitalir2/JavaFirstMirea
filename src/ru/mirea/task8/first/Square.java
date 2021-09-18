package ru.mirea.task8.first;

import java.awt.*;
import java.awt.geom.Rectangle2D;

public class Square extends Shape {

    private final double sideLength;

    public Square(double x, double y, Color color, double sideLength) {
        super(x, y, color);
        this.sideLength = sideLength;
    }

    public double getSideLength() {
        return sideLength;
    }

    @Override
    void draw(Graphics graphics) {
        Graphics2D graphics2D = (Graphics2D) graphics;
        Rectangle2D.Double rectangle = new Rectangle2D.Double(x, y, sideLength, sideLength);
        graphics2D.setColor(color);
        graphics2D.fill(rectangle);
    }
}
