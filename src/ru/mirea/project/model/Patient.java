package ru.mirea.project.model;

public class Patient extends User {
    public Patient(String fullName, int age, Gender gender, String timestampUserCreated) {
        super(fullName, age, gender, timestampUserCreated);
    }
}
