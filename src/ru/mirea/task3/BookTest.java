package ru.mirea.task3;

public class BookTest {
    public static void main(String[] args) {
        Book firstBook = new Book("Donald Knuth",
                "The Art of Computer Programming, Volume 1",
                "Addison-Wesley",
                1968);
        Book secondBook = new Book("The \"Gang of Four\"",
                "Design Patterns: Elements of Reusable Object-Oriented Software",
                "Addison-Wesley",
                1994);

        System.out.println(firstBook);
        System.out.println(secondBook.getTitle());

        firstBook.setPublicationYear(2008);
        System.out.println(firstBook);
    }
}
