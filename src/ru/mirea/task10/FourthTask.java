package ru.mirea.task10;

import java.util.Scanner;

public class FourthTask {
    public static void printFromRightToLeft(int num) {
        if (num != 0) {
            System.out.println(num % 10);
            printFromRightToLeft(num / 10);
        }
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int num = reader.nextInt();
        printFromRightToLeft(num);
    }
}
