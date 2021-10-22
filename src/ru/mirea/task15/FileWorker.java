package ru.mirea.task15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Scanner;

// Not SOLID but ok
public class FileWorker {

    private static final String basePath = "src/ru/mirea/task15/";

    public void append(String fileName) {
        try {
            File file = new File(basePath + fileName);
            if (file.exists() && file.canWrite()) {
                FileWriter writer = new FileWriter(file, true);
                Scanner reader = new Scanner(System.in);
                while (reader.hasNextLine()) {
                    writer.write(reader.nextLine());
                }
                writer.close();
            }
        } catch (IOException exception) {
            System.err.println("Error occured during the working with the file");
        }
    }

    public void write(String fileName) {
        try {
            File file = new File(basePath + fileName);
            if (file.createNewFile()) {
                FileWriter writer = new FileWriter(file);
                Scanner reader = new Scanner(System.in);
                while (reader.hasNextLine()) {
                    writer.write(reader.nextLine());
                }
                writer.close();
            }
        } catch (IOException exception) {
            System.err.println("Error occured during the working with the file");
        }
    }

    public void read(String fileName) {
        try {
            File file = new File(basePath + fileName);
            if (file.exists() && file.canRead()) {
                Scanner reader = new Scanner(file);
                while (reader.hasNextLine()) {
                    System.out.println(reader.nextLine());
                }
            } else {
                throw new IllegalArgumentException("File with that name does not exist");
            }
        } catch (FileNotFoundException exception) {
            System.err.println("Error occured during the working with the file");
        }
    }

    public void replace(String fileName) {
        File file = new File(fileName);
        if (file.exists()) {
            this.write(fileName);
        }
    }

    public static void main(String[] args) {
        FileWorker worker = new FileWorker();
        Scanner scanner = new Scanner(System.in);
        // Text Block since Java SE 15
        System.out.println("""
                Enter mode of working:
                1) Write in new file
                2) Append to existing file
                3) Read existing file content
                4) Replace existing file content""");
        int mode = scanner.nextInt();
        System.out.println("Enter file name to work with");
        String fileName = scanner.next();
        switch (mode) {
            case 1:
                worker.write(fileName);
                break;
            case 2:
                worker.append(fileName);
                break;
            case 3:
                worker.read(fileName);
                break;
            case 4:
                worker.replace(fileName);
                break;
            default:
                System.out.println("Error input, please enter the valid mode");
        }
    }
}
