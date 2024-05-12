import java.util.Objects;

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
    public boolean equals(Object a) {
        if (this == a) {
            return true;
        }
        if (a == null || this.getClass() != a.getClass()) {
            return false;
        }
        Author testAuthor = (Author) a;
        return authorName.equals(testAuthor.authorName) && authorSurname.equals(testAuthor.authorSurname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(authorName, authorSurname);
    }
}
