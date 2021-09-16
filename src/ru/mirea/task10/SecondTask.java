package ru.mirea.task10;

import java.util.Scanner;

public class SecondTask {
    private static final Scanner reader = new Scanner(System.in);
    public static void printNumbers() {
        int number = reader.nextInt();
        if (number != 0) {
            System.out.println(number);
            reader.nextInt();
            printNumbers();
        }
    }

    public static void main(String[] args) {
        printNumbers();
    }
}
