package ru.mirea.project.core.exceptions;

public class InvalidDateFormatException extends Exception {
    public InvalidDateFormatException(String invalidDate) {
        super("Invalid date: " + invalidDate);
    }
}
