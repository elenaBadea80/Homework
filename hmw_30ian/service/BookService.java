package ro.itschool.hmw_30ian.service;

import org.springframework.stereotype.Service;
import ro.itschool.hmw_30ian.model.Book;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookService {

    private static final List<Book> BOOKS = new ArrayList<>();

    public List<Book> getAllBooks() {
        return BOOKS;
    }

    public Book getBookById(long id) {
        return BOOKS.stream()
                .filter(b -> b.getId() == id)
                .findFirst()
                .orElse(null);
    }

    public void addBooks(Book book) {
        BOOKS.add(book);
    }

    public void deleteBookById(long id) {
        BOOKS.removeIf(b -> b.getId() == id);
    }

    public void updeteBook(Book book, Book existingBook) {

        if (book.getTitle() != null){
            existingBook.setTitle(book.getTitle());
        }

        if (book.getAuthor() != null ){
            existingBook.setAuthor(book.getAuthor());
        }

        if (book.getYear() != 0){
            existingBook.setYear(book.getYear());
        }
    }

    public void replaceBook(Book book, Book existingBook){

        existingBook.setTitle(book.getTitle());
        existingBook.setAuthor(book.getAuthor());
        existingBook.setYear(book.getYear());
    }
}
