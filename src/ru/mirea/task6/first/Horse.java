package ru.mirea.task6.first;

public class Horse implements Nameable {

    private final String name;

    public Horse(String name) {
        this.name = name;
    }

    public String makeSound() {
        return "Iggogo";
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Horse{" +
                "name='" + name + '\'' +
                '}';
    }
}
