package ru.mirea.task1;

import java.util.Arrays;

public class FirstTask {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Arrays.fill(arr, 5);
        // While
        int counter = 0;
        int sum = 0;
        while (counter < arr.length) {
            sum += arr[counter++];
        }
        System.out.println(sum);

        // For
        sum = 0;
        for (int j : arr) {
            sum += j;
        }
        System.out.println(sum);

        // Do...while
        sum = 0;
        int counter2 = 0;
        do {
            sum += arr[counter2++];
        } while (counter2 < arr.length);
        System.out.println(sum);
    }
}
