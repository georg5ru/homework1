package library;

public class Book {
    private String  title;
    private Author  author;
    private int     yearPublished;

    public Book(String title, Author author, int yearPublished) {
        this.title         = title;
        this.author        = author;
        this.yearPublished = yearPublished;
    }

    /* -------- геттеры -------- */
    public String getTitle()        { return title;         }
    public Author getAuthor()       { return author;        }
    public int    getYearPublished(){ return yearPublished; }

    /* -------- сеттер только для года -------- */
    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }

    @Override
    public String toString() {
        return '"' + title + "\" (" + yearPublished + ") — " + author;
    }
}