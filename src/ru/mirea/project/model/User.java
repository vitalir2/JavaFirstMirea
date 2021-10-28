package ru.mirea.project.model;

public abstract class User {
    private String fullName;
    private int age;
    private Gender gender;

    public String getFullName() {
        return fullName;
    }

    public int getAge() {
        return age;
    }

    public char getGender() {
        return switch(gender) {
            case MALE -> 'M';
            case FEMALE -> 'F';
            case OTHER -> 'O';
        };
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(char gender) {
        this.gender = switch (gender) {
            case 'M' -> Gender.MALE;
            case 'F' -> Gender.FEMALE;
            case 'O' -> Gender.OTHER;
            default -> throw new IllegalArgumentException("Unexpected value: " + gender);
        };
    }
}
