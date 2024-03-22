package com.javaSpringProject.javaspringexample.services;

import com.javaSpringProject.javaspringexample.Entity.Student;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

public interface StudentService {

    Student saveStudent(@RequestBody Student students);
    List<Student> getStudent();
    Optional<Student> getStudentById(@PathVariable int stdId);
    Optional<Student> updateStudent(@PathVariable int stdId, @RequestBody Student studentName);
    ResponseEntity<Void> deleteStudent(@PathVariable int stdId);

}
