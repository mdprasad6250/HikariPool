package com.javaSpringProject.javaspringexample.controller;

import com.javaSpringProject.javaspringexample.Entity.Book;
import com.javaSpringProject.javaspringexample.service.BooksServiceImpl;
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

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class BooksController {

    @Autowired
    BooksServiceImpl booksService;


    @PostMapping("/save-book")
    public ResponseEntity<Book> saveBook(@RequestBody Book book) {
          Book saveBook = booksService.saveBook(book);
          return new ResponseEntity<>(saveBook,HttpStatus.CREATED);
        }

    @GetMapping("/get-book")
    public List<Book> getBooks(Book book) {
        return booksService.getBook();
    }

    @GetMapping("/get-book/{bookId}")
    public Optional<Book> getBookById(@PathVariable int bookId) {
       return booksService.getBookById(bookId);
    }

    @PatchMapping("/update-book/{bookId}")
    public Optional<Book> updateBook(@PathVariable int bookId, @RequestBody Book bookName) {
        return booksService.updateBook(bookId,bookName);
    }


    @DeleteMapping("/delete-book/{bookId}")
    public ResponseEntity<Void> deleteStudent(@PathVariable int bookId) {
        return booksService.deleteBook(bookId);
    }

}










