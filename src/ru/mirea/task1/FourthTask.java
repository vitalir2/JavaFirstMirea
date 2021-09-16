package ru.mirea.task1;

import java.util.Arrays;

public class FourthTask {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; ++i) {
            arr[i] = (int) (Math.random() * 10);
        }
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
