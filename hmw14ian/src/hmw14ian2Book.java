
//2. Create a Book class with:
//- String isbn
//- String title
//- String author
//- double price
//
//- Override equals and hashCode so books are distinct based on isbn.
//- Create a list of books with duplicate ISBNs and varying prices.
//
//- Use streams to:
//-- Remove duplicates based on the ISBN.
//-- Find the book with the highest price.
//-- Group books by author and count how many books each author has.

import java.util.*;
import java.util.stream.Collectors;

public class hmw14ian2Book {
    public static void main(String[] args) {
        List<Book> bookList = Arrays.asList(
                new Book("ISBN139", "Title 1", "Author 1", 45),
                new Book("ISBN148", "Title 1", "Author 2", 38),
                new Book("ISBN165", "Title 1", "Author 1", 51),
                new Book("ISBN139", "Title 1", "Author 2", 87),
                new Book("ISBN148", "Title 1", "Author 5", 76),
                new Book("ISBN17", "Title 1", "Author 6", 123),
                new Book("ISBN197", "Title 1", "Author 1", 64),
                new Book("ISBN201", "Title 1", "Author 8", 41),
                new Book("ISBN68", "Title 1", "Author 2", 37),
                new Book("ISBN197", "Title 1", "Author 2", 55)
        );

        List<Book> uniquedBoobk = bookList.stream()
                .distinct()
                .toList();

        uniquedBoobk.forEach(System.out::println);

        Book bookMaxPrice = bookList.stream()
                .max(Comparator.comparingDouble(Book::getPrice))
                .orElse(null);

        Map<String, Long> booksByAuthor = bookList.stream()
                .collect(Collectors.groupingBy(Book::getAuthor, Collectors.counting()));

        System.out.println(" ");
        System.out.println("Most expensive book: " + bookMaxPrice);
        System.out.println(" ");
        System.out.println("Books by author: " + booksByAuthor);


    }
}

class Book {

    private String isbn;
    private String title;
    private String author;
    private double price;

    public Book(String isbn, String title, String author, double price) {
        this.isbn = isbn;
        this.author = author;
        this.title = title;
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public String getIsbn() {
        return isbn;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(isbn, book.isbn);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(isbn);
    }

    @Override
    public String toString() {
        return "Book{" +
                "isbn='" + isbn + '\'' +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }
}