package ru.mirea.task5.third;

public class Table extends Furniture {
    private String tabletopMaterial;
    public Table(double width, double height, String tabletopMaterial) {
        super(width, height);
        this.tabletopMaterial = tabletopMaterial;
    }

    public String getTabletopMaterial() {
        return tabletopMaterial;
    }

    public void setTabletopMaterial(String tabletopMaterial) {
        this.tabletopMaterial = tabletopMaterial;
    }

    @Override
    public String toString() {
        return "Table{" +
                "width=" + getWidth() + ", " +
                "length=" + getLength() + ", " +
                "tabletopMaterial='" + tabletopMaterial + '\'' +
                '}';
    }
}
