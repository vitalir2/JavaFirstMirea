package ru.mirea.task10;

import java.util.Scanner;

public class ThirdTask {
    public static void printFromLeftToRight(int number, int shift) {
        if (shift >= 0) {
            int tenthPower = (int) (Math.pow(10, shift));
            int digit = number / tenthPower;
            System.out.println(digit);
            printFromLeftToRight(number - digit * tenthPower, shift - 1);
        }
    }
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int num = reader.nextInt();
        int powerOfTen = (int) Math.floor(Math.log10(num));
        printFromLeftToRight(num, powerOfTen);
    }
}
