package ru.mirea.task12;

import java.util.Arrays;

public class SecondMain {

    private static final int ARRAY_SIZE = 6;

    public static void main(String[] args) {
        Student[] idNumber = new Student[ARRAY_SIZE];
        idNumber[0] = new Student(1, "F", "FF", 15);
        idNumber[1] = new Student(5, "F", "MM", 10);
        idNumber[2] = new Student(4, "LL", "OEO", 21);
        idNumber[3] = new Student(12, "POL", "KORA", 22);
        idNumber[4] = new Student(3, "ER", "FAM", 12);
        idNumber[5] = new Student(11, "", "M", 7);
        System.out.println(Arrays.toString(idNumber));
        Arrays.sort(idNumber, new SortingStudentsByGPA());
        System.out.println(Arrays.toString(idNumber));
    }
}
