package ru.mirea.task2;

public class TestBook {
    public static void main(String[] args) {
        Book book = new Book("Alice in Wonderland", 12);
        Book book2 = new Book("Design Patterns", 16);
        Book book3 = new Book("Harry Potter and Prisoner of Azkaban");
        book.setFontSize(18);

        System.out.println(book);
        System.out.println(book2);
        System.out.println(book3);
    }
}
