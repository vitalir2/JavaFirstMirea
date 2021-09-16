package ru.mirea.task5.third;

public abstract class Furniture {
    // in cm
    private double width;
    private double length;

    public Furniture(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Furniture{" +
                "width=" + width +
                ", length=" + length +
                '}';
    }
}