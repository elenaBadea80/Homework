import java.util.Objects;

public class Book implements Comparable<Book> {

    private final String author;
    private final String title;
    private final int year;

    public Book(String title, String author, int year) {
        this.author = author;
        this.title = title;
        this.year = year;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Book{" +
                " title = '" + title + '\'' +
                ", author = '" + author + '\'' +
                ", year = " + year +
                '}';
    }

    @Override
    public int compareTo(Book o) {
        return 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return year == book.year && Objects.equals(author, book.author) && Objects.equals(title, book.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(author, title, year);
    }
}
