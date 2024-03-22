package com.javaSpringProject.javaspringexample.repository;

import com.javaSpringProject.javaspringexample.Entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BooksRepo extends JpaRepository<Book,Integer> {



}