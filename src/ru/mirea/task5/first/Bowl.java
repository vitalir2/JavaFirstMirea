package ru.mirea.task5.first;

public class Bowl extends Dish {
    public Bowl(String name, String material) {
        super(name, material);
    }

    @Override
    public void eatIn() {
        System.out.println("Eat eat eat...");
    }

    @Override
    public void cookIn() {
        System.out.println("Mixing something...");
    }
}
