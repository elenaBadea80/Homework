package ro.itschool.hmw_30ian.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ro.itschool.hmw_30ian.model.Book;
import ro.itschool.hmw_30ian.service.BookService;

import java.util.List;

@RestController
@RequestMapping("/api/books")
public class BookController {

    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping
    public List<Book> getAllBooks() {
        return bookService.getAllBooks();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Book> getBookById(@PathVariable long id) {
        Book bookById = bookService.getBookById(id);
        if (bookById == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(bookById);
    }

    @PostMapping
    public ResponseEntity<String> addBook(@RequestBody Book book) {
        bookService.addBooks(book);
        return ResponseEntity.status(HttpStatus.CREATED)
                .body("Book added succesfully.");
    }

    @DeleteMapping("/{id}")
    public void deletebook(@PathVariable long id, @RequestBody Book book) {
        bookService.deleteBookById(id);
    }

    @PatchMapping("/{id}")
    public ResponseEntity<Book> updateBook(@PathVariable long id, @RequestBody Book book) {
        Book existingBook = bookService.getBookById(id);
        if (existingBook == null) {
            return ResponseEntity.notFound().build();
        }
        bookService.updeteBook(book, existingBook);

        return ResponseEntity.ok(existingBook);
    }


    @PutMapping("/{id}")
    public ResponseEntity<Book> replaceBook(@PathVariable long id, @RequestBody Book book) {

        Book existingBook = bookService.getBookById(id);

        if (existingBook == null) {
            return ResponseEntity.notFound().build();
        }
        bookService.replaceBook(book, existingBook);
        return ResponseEntity.ok(existingBook);
        }

    }



