package ru.mirea.project.core.db;

import ru.mirea.project.model.Appointment;
import ru.mirea.project.model.Doctor;
import ru.mirea.project.model.Patient;
import ru.mirea.project.model.User;

import java.util.Date;

public class UserDatabase extends Database<Long, User> {

    private static final String DEFAULT_NAME = "userDb";

    private volatile static UserDatabase INSTANCE;

    public static UserDatabase getInstance() {
        if (INSTANCE == null) {
            synchronized (UserDatabase.class) {
                if (INSTANCE == null) {
                    INSTANCE = new UserDatabase();
                }
            }
        }
        return INSTANCE;
    }

    private UserDatabase() {
        super();
        name = DEFAULT_NAME;
    }

    public Appointment findByDate(Date date) {
        return Appointment.of(new Doctor(), new Patient(), date);
    }
}
