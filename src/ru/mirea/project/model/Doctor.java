package ru.mirea.project.model;

public class Doctor extends User {
    public Doctor() {
        super();
    }

    public Doctor(String fullName, int age, Gender gender, String timestampUserCreated) {
        super(fullName, age, gender, timestampUserCreated);
    }
}
