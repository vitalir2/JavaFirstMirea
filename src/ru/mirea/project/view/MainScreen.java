package ru.mirea.project.view;

import ru.mirea.project.core.annotation.ConsoleMode;
import ru.mirea.project.core.db.UserDatabase;
import ru.mirea.project.core.exceptions.InvalidDateFormatException;
import ru.mirea.project.model.*;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class MainScreen {
    // Now without any graphics, later I'm going to add some

    private static final Scanner reader = new Scanner(System.in);
    private static final UserDatabase userDatabase = UserDatabase.getInstance();

    private static User currentUser;

    public static void main(String[] args) {
        System.out.println("You need to create the user");
        System.out.println("Enter your birth date in a format: dd.mm.yyyy");
        String inputDate = reader.nextLine();
        try {
            validateDateFormat(inputDate);
        } catch(InvalidDateFormatException exception) {
            System.err.println(exception.getLocalizedMessage());
            System.exit(0);
        }

        currentUser = new Patient("fullName", 12, Gender.MALE, LocalDate.now().toString());
        userDatabase.add(currentUser.getUid(), currentUser);
        System.out.println("New user has been created");

        while(true) {
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
        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");
        try {
            format.parse(date);
        } catch (ParseException e) {
            throw new InvalidDateFormatException(date);
        }
    }
}
