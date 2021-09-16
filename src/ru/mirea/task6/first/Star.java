package ru.mirea.task6.first;

public class Star implements Nameable {

    private String name;
    private double temperatureCelsius;

    public Star(String name, double temperatureCelsius) {
        this.name = name;
        this.temperatureCelsius = temperatureCelsius;
    }

    @Override
    public String getName() {
        return name;
    }
}
