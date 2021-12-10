package ru.mirea.task27;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class People {
    public static void main(String[] args) {
        final Map<String, String> people = new HashMap<>();
        addPeopleInMap(people);
        Map<String, String> filteredPeople = removeNotUniquePeopleByName(people);
        System.out.println(filteredPeople.toString());
    }

    private static Map<String, String> removeNotUniquePeopleByName(Map<String, String> people) {
        Map<String, Long> namesByCount = people.values().stream()
                .collect(Collectors.groupingBy(value -> value, Collectors.counting()));
        Set<String> notIgnoredNames = namesByCount.entrySet().stream()
                .filter(entry -> entry.getValue() == 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toSet());
        return people.entrySet().stream()
                .filter(person -> notIgnoredNames.contains(person.getValue()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
    }

    private static void addPeopleInMap(Map<String, String> people) {
        people.put("Malishev", "Valeriy");
        people.put("Krestov", "Mikhail");
        people.put("Dolokhov", "Valeriy");
        people.put("Jerov", "Vitaly");
        people.put("Fragin", "Ivan");
        people.put("Marova", "Oksana");
        people.put("Kutina", "Jana");
        people.put("Vasiliev", "Ivan");
        people.put("Tsvetnov", "Petr");
        people.put("Koltsov", "Ivan");
    }
}
