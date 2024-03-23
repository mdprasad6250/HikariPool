package com.javaSpringProject.javaspringexample.repocontroller;

import com.javaSpringProject.javaspringexample.Dto.StudentDto;
import com.javaSpringProject.javaspringexample.reposervice.StudentRepoServiceImpl;
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
public class StudentRepoController {

    @Autowired
    StudentRepoServiceImpl studentService;

    @PostMapping("/save-student")
    public ResponseEntity<StudentDto> saveStudent(@RequestBody StudentDto student) {
        StudentDto saveStudent = studentService.saveStudent(student);
        return new ResponseEntity<>(saveStudent, HttpStatus.CREATED);
    }

    @GetMapping("/get-student")
    public Collection<StudentDto> getStudents() {
        return studentService.getStudents();
    }

    @GetMapping("/get-student/{stdId}")
    public StudentDto getStudentById(@PathVariable int stdId) {
        return studentService.getStudentById(stdId);
    }

    @PatchMapping("/update-student/{stdId}")
    public Optional<StudentDto> updateStudent(@RequestBody StudentDto studentName) {
        return studentService.updateStudent(studentName);
    }

    @DeleteMapping("/delete-student/{stdId}")
    public ResponseEntity<Void> deleteStudent(@PathVariable int stdId) {
        return studentService.deleteStudent(stdId);
    }
}
