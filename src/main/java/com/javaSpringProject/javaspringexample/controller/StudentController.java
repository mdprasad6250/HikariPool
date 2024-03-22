package com.javaSpringProject.javaspringexample.controller;

import com.javaSpringProject.javaspringexample.Entity.Student;
import com.javaSpringProject.javaspringexample.service.StudentServiceImpl;
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
public class StudentController {
    
    @Autowired
    StudentServiceImpl studentService;

    @PostMapping("/save-student")
    public ResponseEntity<Student> saveStudent(@RequestBody Student student) {

          Student saveStudent = studentService.saveStudent(student);
          return new ResponseEntity<>(saveStudent,HttpStatus.CREATED);
        }

    @GetMapping("/get-student")
    public List<Student> getStudents(Student student) {

        return studentService.getStudent();
    }

    @GetMapping("/get-student/{stdId}")
    public Optional<Student> getStudentById(@PathVariable int stdId) {
       return studentService.getStudentById(stdId);
    }

    @PatchMapping("/update-student/{stdId}")
    public Optional<Student> updateStudent(@PathVariable int stdId, @RequestBody Student studentName) {
        return studentService.updateStudent(stdId,studentName);
    }


    @DeleteMapping("/delete-student/{stdId}")
    public ResponseEntity<Void> deleteStudent(@PathVariable int stdId) {
        return studentService.deleteStudent(stdId);
    }

}










