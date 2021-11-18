package ru.mirea.project.model;

import java.util.ArrayList;
import java.util.List;

public abstract class User {
    private static long uidCounter = 1;

    private long uid;
    private String fullName;
    private int age;
    private Gender gender;
    private String timestampUserCreated;
    private final List<Appointment> appointments;

    public User() {
        this("", -1, Gender.OTHER, "");
    }

    public User(String fullName, int age, Gender gender, String timestampUserCreated) {
        this.uid = uidCounter++;
        this.fullName = fullName;
        this.age = age;
        this.gender = gender;
        this.timestampUserCreated = timestampUserCreated;
        this.appointments = new ArrayList<>();
    }

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

    public String getTimestampUserCreated() {
        return timestampUserCreated;
    }

    public void setTimestampUserCreated(String timestampUserCreated) {
        this.timestampUserCreated = timestampUserCreated;
    }

    public long getUid() {
        return uid;
    }

    @Override
    public String toString() {
        return "User{" +
                "uid=" + uid +
                ", fullName='" + fullName + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", timestampUserCreated='" + timestampUserCreated + '\'' +
                '}';
    }

    public List<Appointment> getAppointments() {
        return appointments;
    }

    public void addAppointment(Appointment appointment) {
        appointments.add(appointment);
    }
}
