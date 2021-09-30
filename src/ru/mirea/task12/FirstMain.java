package ru.mirea.task12;

import java.util.Arrays;

public class FirstMain {

    private static final int ARRAY_SIZE = 6;

    public static void insertionSort(Student[] students) {
        for (int i = 1; i < students.length; ++i) {
            Student key = students[i];
            int j = i - 1;
            for (; j >= 0 && students[j].compareTo(key) > 0; --j) {
                students[j + 1] = students[j];
            }
            students[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        Student[] idNumber = new Student[ARRAY_SIZE];
        idNumber[0] = new Student(1, "F", "FF", 15);
        idNumber[1] = new Student(5, "F", "MM", 10);
        idNumber[2] = new Student(4, "LL", "OEO", 21);
        idNumber[3] = new Student(12, "POL", "KORA", 22);
        idNumber[4] = new Student(3, "ER", "FAM", 12);
        idNumber[5] = new Student(11, "", "M", 7);
        System.out.println(Arrays.toString(idNumber));
        insertionSort(idNumber);
        System.out.println(Arrays.toString(idNumber));
    }
}
