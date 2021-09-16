package ru.mirea.task6.first;

public class NameableTest {
    public static void main(String[] args) {
        Horse horse = new Horse("Alice");
        Star star = new Star("Sun", 10_000);
        System.out.println(horse.makeSound());

        System.out.println(horse.getName());
        System.out.println(star.getName());
    }
}
