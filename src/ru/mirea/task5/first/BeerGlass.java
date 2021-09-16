package ru.mirea.task5.first;

public class BeerGlass extends Dish {
    public BeerGlass(String name, String material) {
        super(name, material);
    }

    @Override
    public void eatIn() {
        System.out.println("Drinking cold beer...");
    }

    @Override
    public void cookIn() {
        throw new UnsupportedOperationException("Can't cook in BeerGlass!");
    }
}
