import java.util.Objects;

public class Book {
    private String bookName;
    private Author author;
    private int publishYear;

    public Book(String bookName, Author author, int publishYear) {
        this.bookName = bookName;
        this.author = author;
        this.publishYear = publishYear;
    }

    public String getBookName() {
        return this.bookName;
    }

    public Author getAuthor() {
        return this.author;
    }

    public int getPublishYear() {
        return this.publishYear;
    }

    public void setPublishYear(int year) {
        this.publishYear = year;
    }

    @Override
    public String toString() {
        return "Название книги: " + bookName + ", автор книги: " + author + ", год издания: " + publishYear;
    }

    public boolean equals(Object b) {
        if (this == b) {
            return true;
        }
        if (b == null || this.getClass() != b.getClass()) {
            return false;
        }
        Book testBook = (Book) b;
        return bookName.equals(testBook.bookName) && author.equals(testBook.author);
    }

    public int hashCode() {
        return Objects.hash(bookName, author, publishYear);
    }

}
