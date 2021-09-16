package ru.mirea.task5.second;

public class Dalmatian extends Dog {
    public Dalmatian(String name, int age, String favoriteFood) {
        super(name, age, favoriteFood);
    }

    @Override
    public void speak() {
        System.out.println("Gaff!");
    }
}
