public class Author {
    private String authorName;
    private String authorSurname;

    public Author(String authorName, String authorSurname) {
        this.authorName = authorName;
        this.authorSurname = authorSurname;
    }

    public String getAuthorName() {
        return this.authorName;
    }

    public String getAuthorSurname() {
        return this.authorSurname;
    }

    @Override
    public String toString() {
        return "фамилия - " + authorSurname + ", имя - " + authorName;
    }

    @Override
    public boolean equals(Object author) {
        if (this.getClass() == author.getClass()) {
            Author testAuthor = (Author) author;
            return authorName.equals(testAuthor.getAuthorName()) && authorSurname.equals(testAuthor.getAuthorSurname());
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(authorName, authorSurname);
    }
}
