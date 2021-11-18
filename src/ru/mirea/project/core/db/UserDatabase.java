package ru.mirea.project.core.db;

import ru.mirea.project.model.User;

public class UserDatabase extends Database<Long, User> {

    private static final String DEFAULT_NAME = "userDb";

    public UserDatabase() {
        super();
        name = DEFAULT_NAME;
    }
}
