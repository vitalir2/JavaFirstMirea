package ru.mirea.task27;

// Not a record because task specifies it (but it will be better)
public final class City {
    private final String name;
    private final String country;

    public City(String name, String country) {
        this.name = name;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }
}
