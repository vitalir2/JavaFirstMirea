package ru.mirea.task4;

public class TestAuthor {
    public static void main(String[] args) {
        Author author = new Author("Alexander Tolstoy", "alex_tolstoy@gmail.com", 'M');
        System.out.println(author);

        author.setGender('F');
        System.out.println(author);
    }
}
