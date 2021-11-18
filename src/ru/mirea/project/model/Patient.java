package ru.mirea.project.model;

import java.util.ArrayList;
import java.util.List;

public class Patient extends User {
    public Patient() {
        super();
    }

    public Patient(String fullName, int age, Gender gender, String timestampUserCreated) {
        super(fullName, age, gender, timestampUserCreated);
    }
}
