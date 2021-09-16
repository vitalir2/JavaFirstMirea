package ru.mirea.task5.third;

public class Sofa extends Furniture {
    private String padding;

    public Sofa(double width, double height, String padding) {
        super(width, height);
        this.padding = padding;
    }

    public String getPadding() {
        return padding;
    }

    public void setPadding(String padding) {
        this.padding = padding;
    }

    @Override
    public String toString() {
        return "Sofa{" +
                "width=" + getWidth() + ", " +
                "length=" + getLength() + ", " +
                "padding='" + padding + '\'' +
                '}';
    }
}
