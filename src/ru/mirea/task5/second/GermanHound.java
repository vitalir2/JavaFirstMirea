package ru.mirea.task5.second;

public class GermanHound extends Dog {
    public GermanHound(String name, int age, String favoriteFood) {
        super(name, age, favoriteFood);
    }

    @Override
    public void speak() {
        System.out.println("Bark!");
    }
}
