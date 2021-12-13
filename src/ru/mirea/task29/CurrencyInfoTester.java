package ru.mirea.task29;

import java.io.*;
import java.util.List;

public class CurrencyInfoTester {

    // Specify absolute path for yourself
    private static final String FILE_PATH = "/home/vitalir/Documents/file.txt";

    public static void main(String[] args) {
        CurrencyInfo testInfo = new CurrencyInfo("euro", "EUR", List.of("France", "Germany", "Spain"));
        try {
            FileOutputStream outputStream = new FileOutputStream(FILE_PATH);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
            objectOutputStream.writeObject(testInfo);
            objectOutputStream.close();
            FileInputStream fileInputStream = new FileInputStream(FILE_PATH);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            CurrencyInfo restoredCurrencyInfo = (CurrencyInfo) objectInputStream.readObject();
            System.out.println(restoredCurrencyInfo);
        } catch (IOException | ClassNotFoundException exception) {
            exception.printStackTrace();
        }
    }
}
