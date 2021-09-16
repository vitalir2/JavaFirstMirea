package ru.mirea.task1;

import java.util.Scanner;

public class FifthTask {
    private static int factorial(int number) {
        if (number == 0 || number == 1) {
            return 1;
        } else {
            return number * factorial(number - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter number for which factorial will be calculated");
        Scanner reader = new Scanner(System.in);
        int num = reader.nextInt();
        System.out.println("Factorial of " + num + " equals " + factorial(num));
    }
}
