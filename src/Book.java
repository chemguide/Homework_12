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
}
