package ru.mirea.project.model;

import java.util.Date;

public final class Appointment {
    private final Doctor doctor;
    private final Patient patient;
    private final Date date;

    private Appointment(Doctor doctor, Patient patient, Date date) {
        this.doctor = doctor;
        this.patient = patient;
        this.date = date;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public Patient getPatient() {
        return patient;
    }

    public Date getDate() {
        return date;
    }

    // Factory method
    public static Appointment of(Doctor doctor, Patient patient, Date date) {
        return new Appointment(doctor, patient, date);
    }

    @Override
    public String toString() {
        return "Appointment{" +
                "doctor=" + doctor +
                ", patient=" + patient +
                ", date=" + date +
                '}';
    }
}
