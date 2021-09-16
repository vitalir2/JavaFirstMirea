package ru.mirea.task5.second;

public class DogTest {
    public static void main(String[] args) {
        Dalmatian dalmatian = new Dalmatian("Jerry", 4, "bone");
        GermanHound germanHound = new GermanHound("Harry", 8, "cow's raw steak");
        Pumi pumi = new Pumi("Taffy", 2, "Blue Buffalo");

        dalmatian.speak();
        germanHound.speak();
        pumi.speak();

        dalmatian.setAge(5);
        System.out.println(dalmatian);
    }
}
