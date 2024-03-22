package com.javaSpringProject.javaspringexample.repocontroller;

import com.javaSpringProject.javaspringexample.Dto.BookDto;
import com.javaSpringProject.javaspringexample.reposervice.BooksRepoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.Optional;

@RestController
@RequestMapping("/api/repo")
public class BooksRepoController {

    @Autowired
    BooksRepoServiceImpl booksRepoService;

    @PostMapping("/save-book")
    public ResponseEntity<BookDto> saveBook(@RequestBody BookDto book) {
        BookDto saveBook = booksRepoService.saveBook(book);
        return new ResponseEntity<>(saveBook, HttpStatus.CREATED);
    }

    @GetMapping("/get-book")
    public Collection<BookDto> getBooks() {
        return booksRepoService.getBook();
    }

    @GetMapping("/get-book/{bookId}")
    public BookDto getBookById(@PathVariable int bookId) {
        return booksRepoService.getBookById(bookId);
    }

    @PatchMapping("/update-book")
    public Optional<BookDto> updateBook(@RequestBody BookDto bookName) {
        return booksRepoService.updateBook(bookName);
    }

    @DeleteMapping("/delete-book/{bookId}")
    public ResponseEntity<Void> deleteStudent(@PathVariable int bookId) {
        return booksRepoService.deleteBook(bookId);
    }
}
