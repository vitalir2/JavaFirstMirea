package ru.mirea.task27;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WorkerCities {
    public static void main(String[] args) {
        Map<String, List<String>> countryToCityNames = new HashMap<>();
        putCity(countryToCityNames, new City("Moscow", "Russia"));
        putCity(countryToCityNames, new City("London", "United Kingdom"));
        putCity(countryToCityNames, new City("Omsk", "Russia"));
        putCity(countryToCityNames, new City("Boston", "USA"));
        putCity(countryToCityNames, new City("Bradford", "United Kingdom"));
        putCity(countryToCityNames, new City("Tvery", "Russia"));
        putCity(countryToCityNames, new City("New York", "USA"));
        putCity(countryToCityNames, new City("San Francisco", "USA"));
        System.out.println(countryToCityNames);
    }

    public static void putCity(Map<String, List<String>> cities, City city) {
        String country = city.getCountry();
        List<String> cityList = cities.getOrDefault(city.getCountry(), new ArrayList<>());
        cityList.add(city.getName());
        cities.put(country, cityList);
    }
}
