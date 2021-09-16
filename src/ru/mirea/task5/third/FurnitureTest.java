package ru.mirea.task5.third;

public class FurnitureTest {
    public static void main(String[] args) {
        Chair chair = new Chair(12, 12, "wood");
        Table table = new Table(20, 50, "glass");
        Sofa sofa = new Sofa(15.3, 60.1, "feather");

        System.out.println(chair.getBackMaterial());
        System.out.println(table);
        sofa.setWidth(15.5);
        System.out.println(sofa);
    }
}
