package ru.mirea.task10;

import java.util.Scanner;

public class FifthTask {
    private static final Scanner reader = new Scanner(System.in);

    public static int countMax(int max, Integer countMax) {
        int num = reader.nextInt();
        if (num == 0) {
            return countMax;
        }
        if (num > max) {
            max = num;
            countMax = 1;
        } else if (num == max) {
            ++countMax;
        }
        return countMax(max, countMax);
    }

    public static void main(String[] args) {
        System.out.println(countMax(0, 0));
    }
}