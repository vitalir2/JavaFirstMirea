package ru.mirea.project.view;

import ru.mirea.project.core.annotation.ConsoleMode;
import ru.mirea.project.core.db.UserDatabase;
import ru.mirea.project.core.exceptions.InvalidDateFormatException;
import ru.mirea.project.model.*;

import java.security.InvalidParameterException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.Pattern;

public class MainScreen {
    // Now without any graphics, later I'm going to add some

    private static final String DATE_FORMAT_PATTERN = "dd.MM.yyyy";
    private static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat(DATE_FORMAT_PATTERN);

    private static final Scanner reader = new Scanner(System.in);
    private static final UserDatabase userDatabase = UserDatabase.getInstance();

    private static User currentUser;

    public static void main(String[] args) {
        System.out.println("You need to create the user");
        System.out.println("Enter your first name");
        String firstName = reader.nextLine();
        System.out.println("Enter your last name");
        String lastName = reader.nextLine();
        System.out.println("Enter your gender in format: M or W or T"); // T == they
        String genderString = reader.nextLine();
        Pattern genderPattern = Pattern.compile("[MWT]");
        Gender gender = null;
        if (genderPattern.matcher(genderString).matches()) {
            switch (genderString.toCharArray()[0]) {
                case 'M' -> gender = Gender.MALE;
                case 'W' -> gender = Gender.FEMALE;
                case 'T' -> gender = Gender.OTHER;
            }
        } else {
            throw new InvalidParameterException("Invalid gender, please enter the valid one");
        }
        System.out.println("Enter your birth date in a format: dd.mm.yyyy");
        String inputDate = reader.nextLine();
        int age;
        LocalDate validatedBirthDate = null;
        try {
            validatedBirthDate = validateDateFormatAndReturnDate(inputDate);
        } catch (InvalidDateFormatException exception) {
            System.err.println(exception.getLocalizedMessage());
            System.exit(0);
        }
        LocalDate currentDate = LocalDate.now(ZoneId.systemDefault());
        age = (int) ChronoUnit.YEARS.between(validatedBirthDate, currentDate);
        currentUser = new Patient(firstName + " " + lastName, age, gender, currentDate.toString());
        userDatabase.add(currentUser.getUid(), currentUser);
        System.out.println("New user has been created: " + currentUser);

        while (true) {
            showTasksChoicePatient();
            int choice = reader.nextInt();
            processPatientTaskChoice(choice);
        }
    }

    @ConsoleMode
    private static void showTasksChoicePatient() {
        String taskChoiceText =
                """
                Select what do you want to do:
                1) Create new appointment
                2) Show your list of appointments
                3) Show information about the appointment by its date
                """;
        System.out.println(taskChoiceText);
    }

    /**
     * Contract: can call only if current user is a patient,
     * otherwise throw ClassCastException
     */
    @ConsoleMode
    private static void processPatientTaskChoice(int choiceNumber) {
        switch (choiceNumber) {
            case 1 -> {
                System.out.println("Enter the username of the doctor");
                currentUser.addAppointment(Appointment.of(
                        new Doctor("name", 30, Gender.FEMALE, ""),
                        (Patient) currentUser,
                        Calendar.getInstance().getTime()
                ));
                System.out.println("Appointment was created successfully");
            }
            case 2 -> {
                System.out.println("List of appointments");
                for (Appointment appointment: currentUser.getAppointments()) {
                    System.out.println(appointment);
                }
            }
            case 3 -> {
                System.out.println("Enter the date of the appointment");
                String dateString = reader.nextLine();
                try {
                    validateDateFormat(dateString);
                    Date date = DateFormat.getInstance().parse(dateString);
                    Appointment appointmentByDate = userDatabase.findByDate(date);
                    System.out.println(appointmentByDate);
                } catch (InvalidDateFormatException | ParseException e) {
                    System.err.println(e.getLocalizedMessage());
                }
            }
            default -> System.out.println("Invalid choice number, enter only numbers 1, 2 or 3");
        }
    }

    private static void validateDateFormat(String date) throws InvalidDateFormatException {
        try {
            DATE_FORMAT.parse(date);
        } catch (ParseException e) {
            throw new InvalidDateFormatException(date);
        }
    }

    private static LocalDate validateDateFormatAndReturnDate(String date) throws InvalidDateFormatException {
        try {
            return DATE_FORMAT.parse(date).toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        } catch (ParseException e) {
            throw new InvalidDateFormatException(date);
        }
    }
}
