package ru.mirea.task30;

import org.junit.Assert;
import org.junit.Test;
import ru.mirea.project.core.db.UserDatabase;
import ru.mirea.project.model.Doctor;
import ru.mirea.project.model.User;

public class DbTest {

    private static final UserDatabase userDatabase = UserDatabase.getInstance();

    @Test
    public void testAddToAndGetFromDatabase() {
        User user = new Doctor("Henry");
        userDatabase.add(5L, user);
        Assert.assertEquals(userDatabase.get(5L), user);
    }

    @Test
    public void testDeleteFromDatabase() {
        User user = new Doctor("Harry");
        userDatabase.add(4L, user);
        userDatabase.delete(4L, user);
        Assert.assertNull(userDatabase.get(4L));
    }
}
