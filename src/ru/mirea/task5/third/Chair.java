package ru.mirea.task5.third;

public class Chair extends Furniture {
    private String backMaterial;

    public Chair(double width, double height, String backMaterial) {
        super(width, height);
        this.backMaterial = backMaterial;
    }

    public String getBackMaterial() {
        return backMaterial;
    }

    public void setBackMaterial(String backMaterial) {
        this.backMaterial = backMaterial;
    }

    @Override
    public String toString() {
        return "Chair{" +
                "width=" + getWidth() + ", " +
                "length=" + getLength() + ", " +
                "backMaterial='" + backMaterial + '\'' +
                '}';
    }
}
