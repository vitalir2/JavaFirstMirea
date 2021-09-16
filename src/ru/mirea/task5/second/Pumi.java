package ru.mirea.task5.second;

public class Pumi extends Dog {
    public Pumi(String name, int age, String favoriteFood) {
        super(name, age, favoriteFood);
    }

    @Override
    public void speak() {
        System.out.println("Tyaff!");
    }
}
