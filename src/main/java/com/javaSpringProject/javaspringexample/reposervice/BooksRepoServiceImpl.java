package com.javaSpringProject.javaspringexample.reposervice;

import com.javaSpringProject.javaspringexample.Dto.BookDto;
import com.javaSpringProject.javaspringexample.Entity.Book;
import com.javaSpringProject.javaspringexample.repository.BooksRepo;
import com.javaSpringProject.javaspringexample.util.MapperUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

@Service
public class BooksRepoServiceImpl {
    @Autowired
    BooksRepo bookRepo;

    public BookDto saveBook(BookDto bookDto) {
        Book book = MapperUtils.convertBookDtoToBookEntity(bookDto);
        return MapperUtils.convertBookEntityToBookDto(bookRepo.save(book));
    }

    public Collection<BookDto> getBook() {
        return MapperUtils.convertBookEntityToBookDto(bookRepo.findAll());
    }

    public BookDto getBookById(int bookId) {
        Optional<Book> book = bookRepo.findById(bookId);
        if(book.isPresent())
                return MapperUtils.convertBookEntityToBookDto(book.get());
        return BookDto.builder().build();
    }

    public Optional<Book> updateBook(BookDto bookDto) {
        Optional<Book> book = bookRepo.findById(bookDto.getBookId());
        if (book.isPresent()) {
            book.get().setBookName(bookDto.getBookName());
            return Optional.of(bookRepo.save(book.get()));
        }else{
            return book;
        }
    }

    public ResponseEntity<Void> deleteBook(int bookId) {
        Optional<Book> book = bookRepo.findById(bookId);
        if (book.isPresent()) {
            bookRepo.deleteById(bookId);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
