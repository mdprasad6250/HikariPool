package com.javaSpringProject.javaspringexample.service;

import com.javaSpringProject.javaspringexample.Entity.Book;
import com.javaSpringProject.javaspringexample.repository.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Optional;

@Service
public class BooksServiceImpl {
    @Autowired
    BookRepo bookRepo;

    public Book saveBook(Book book) {
        return bookRepo.save(book);
    }

    public Collection<Book> saveBooks(Collection<Book> books) {
        return bookRepo.saveAll(books);
    }

    public Collection<Book> getBooks() {
        return bookRepo.findAll();
    }

    public Optional<Book> getBookById(int bookId) {
       return bookRepo.findById(bookId);
    }

    public Optional<Book> updateBook(Book bookName) {
        Optional<Book> books = bookRepo.findById(bookName.getBookId());
        if (books.isPresent()) {
            books.get().setBookName(bookName.getBookName());
            return Optional.of(bookRepo.save(books.get()));
        }else{
            return books;
        }
    }

    public ResponseEntity<Void> deleteBook(int bookId) {
        Optional<Book> books = bookRepo.findById(bookId);
        if (books.isPresent()) {
            bookRepo.deleteById(bookId);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
