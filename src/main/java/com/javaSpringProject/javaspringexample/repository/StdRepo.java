package com.javaSpringProject.javaspringexample.repository;

import com.javaSpringProject.javaspringexample.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StdRepo extends JpaRepository<Student,Integer> {



}