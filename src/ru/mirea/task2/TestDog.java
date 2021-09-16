package ru.mirea.task2;

public class TestDog {
    public static void main(String[] args) {
        Dog dog = new Dog("Dave", 3);
        Dog dog2 = new Dog("Jiny", 7);
        Dog dog3 = new Dog("Keny");

        System.out.println(dog);
        System.out.println(dog2);
        dog3.setAge(1);
        System.out.println(dog3);

        dog.bark();
        dog3.bark();
        dog2.bark();
    }
}
