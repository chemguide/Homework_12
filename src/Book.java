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
    public  String toString() {
        return "Название книги: " + bookName + ", автор книги: " + author + ", год издания: " + publishYear;
    }

    public boolean equals(Object book) {
        if (this.getClass() == book.getClass()) {
            Book testBook = (Book) book;
            return bookName.equals(testBook.getBookName()) && author.equals(testBook.getAuthor());
        } else {
            return false;
        }
    }

    public int hashCode() {
        return java.util.Objects.hash(bookName, author, publishYear);
    }
}
