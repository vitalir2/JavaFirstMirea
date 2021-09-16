package ru.mirea.task3;

public class Book {
    private String authorFullName;
    private String title;
    private String publisher;
    private int publicationYear;

    public Book(String authorFullName, String title, String publisher, int publicationYear) {
        this.authorFullName = authorFullName;
        this.title = title;
        this.publisher = publisher;
        this.publicationYear = publicationYear;
    }

    public String getAuthorFullName() {
        return authorFullName;
    }

    public void setAuthorFullName(String authorFullName) {
        this.authorFullName = authorFullName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    @Override
    public String toString() {
        return "Book{" +
                "authorFullName='" + authorFullName + '\'' +
                ", title='" + title + '\'' +
                ", publisher='" + publisher + '\'' +
                ", publicationYear=" + publicationYear +
                '}';
    }
}
