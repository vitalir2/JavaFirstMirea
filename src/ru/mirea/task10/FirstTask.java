package ru.mirea.task10;

import java.util.Scanner;

// 28 % 17 + 1 = 11 + 1 = 12
public class FirstTask {
    private static final Scanner reader = new Scanner(System.in);

    public static void printUneven() {
        int number = reader.nextInt();
        if (number % 2 == 1) {
            System.out.println(number);
        }
        if (number != 0) {
            printUneven();
        }
    }

    public static void main(String[] args) {
        printUneven();
    }
}
