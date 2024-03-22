package com.javaSpringProject.javaspringexample.repository;

import com.javaSpringProject.javaspringexample.Entity.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeacherRepo extends JpaRepository<Teacher,Integer> {}
