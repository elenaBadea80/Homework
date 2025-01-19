// 20. Create a class Book with fields title and author.
//
//Given a list of books, filter out duplicates by the title using distinct().
//Collect the distinct books into a new list.

import java.util.Arrays;
import java.util.List;

public class Hmw09ian20DistictBook {
    public static void main(String[] args) {

        List<DistinctBook> booksList = Arrays.asList(
                new DistinctBook("Title 1", "Author 1"),
                new DistinctBook("Title 2", "Author 2"),
                new DistinctBook("Title 2", "Author 3"),
                new DistinctBook("Title 4", "Author 1"),
                new DistinctBook("Title 1", "Author 1")
        );

        List<DistinctBook> distinctBooks = booksList.stream()
                .distinct()
                .toList();

        distinctBooks.forEach(System.out::println);

    }
}

class DistinctBook {

    private String author;
    private String title;

    public DistinctBook(String title, String author){
        this.title = title;
        this.author = author;
    }

    public String getAuthor(){
        return author;
    }

    public String getTitle(){
        return title;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", title='" + title + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DistinctBook book = (DistinctBook) o;
        return title.equals(book.title);
    }

    @Override
    public int hashCode() {
        return title.hashCode();
    }
}