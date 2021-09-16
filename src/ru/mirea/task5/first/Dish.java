package ru.mirea.task5.first;

public abstract class Dish {
    private String name;
    private String material;

    public Dish(String name, String material) {
        this.name = name;
        this.material = material;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "Dish{" +
                "name='" + name + '\'' +
                ", material='" + material + '\'' +
                '}';
    }

    public abstract void eatIn();
    public abstract void cookIn();
}
