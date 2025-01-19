// 16. Create a class Book with title and author fields. Given a list of books,
// find all books written by a specific author.

import java.util.Arrays;
import java.util.List;

public class Hmw09ian16Book {
    public static void main(String[] args) {

        List<Book> booksList = Arrays.asList(
                new Book("Title 1", "Author 1"),
                new Book("Title 2", "Author 2"),
                new Book("Title 3", "Author 2"),
                new Book("Title 4", "Author 1")
        );

        String specifiedAuthor = "Author 2";
        List<Book> books = booksList.stream()
                .filter(s -> s.getAuthor().equals(specifiedAuthor))
                .toList();

        books.forEach(System.out::println);

    }
}

class Book {

    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
