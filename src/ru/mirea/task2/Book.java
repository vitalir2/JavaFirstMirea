package ru.mirea.task2;

public class Book {

    private final static int STANDARD_FONT_SIZE = 14;

    private String title;
    private int fontSize;

    public Book(String title, int fontSize) {
        this.title = title;
        this.fontSize = fontSize;
    }

    public Book(String title) {
        this(title, STANDARD_FONT_SIZE);
    }

    public String getTitle() {
        return title;
    }

    public int getFontSize() {
        return fontSize;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setFontSize(int fontSize) {
        this.fontSize = fontSize;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", fontSize=" + fontSize +
                '}';
    }
}
