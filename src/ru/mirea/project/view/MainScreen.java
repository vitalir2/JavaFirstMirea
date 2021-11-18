package ru.mirea.project.view;

import ru.mirea.project.core.db.UserDatabase;
import ru.mirea.project.core.exceptions.InvalidDateFormatException;
import ru.mirea.project.model.Gender;
import ru.mirea.project.model.Patient;
import ru.mirea.project.model.User;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Scanner;
import java.util.regex.Pattern;

public class MainScreen {
    // Now without any graphics, later I'm going to add some

    public static void main(String[] args) {
        System.out.println("You need to create the user");
        System.out.println("Enter your birth date in a format: dd.mm.yyyy");
        Scanner reader = new Scanner(System.in);
        String inputDate = reader.nextLine();
        try {
            validateDateFormat(inputDate);
        } catch(InvalidDateFormatException exception) {
            System.err.println(exception.getLocalizedMessage());
            System.exit(0);
        }

        UserDatabase userDatabase = new UserDatabase();
        User newUser = new Patient("fullName", 12, Gender.MALE, LocalDate.now().toString());
        userDatabase.add(newUser.getUid(), newUser);
        System.out.println("New user has been created");
    }

    private static void validateDateFormat(String date) throws InvalidDateFormatException {
        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");
        try {
            format.parse(date);
        } catch (ParseException e) {
            throw new InvalidDateFormatException(date);
        }
    }
}
