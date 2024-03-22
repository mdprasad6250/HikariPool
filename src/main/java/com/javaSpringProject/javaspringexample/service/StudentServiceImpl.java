package com.javaSpringProject.javaspringexample.service;

import com.javaSpringProject.javaspringexample.repository.StdRepo;
import com.javaSpringProject.javaspringexample.services.StudentService;
import com.javaSpringProject.javaspringexample.Entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    StdRepo stdRepo;


    @Override
    public Student saveStudent(Student student) {
        return stdRepo.save(student);
    }

    @Override
    public List<Student> getStudent() {
        List<Student> studentsList = stdRepo.findAll();
        System.out.println(studentsList.size());
        return studentsList;
    }

    @Override
    public Optional<Student> getStudentById(int stdId) {
//        Optional<Student> stud = stdRepo.findById(stdId);
//            return stud;
       return stdRepo.findById(stdId);
    }

    @Override
    public Optional<Student> updateStudent(int stdId, Student studentName) {
        Optional<Student> students = stdRepo.findById(stdId);
        if (students.isPresent()) {
            students.get().setStudentName(studentName.getStudentName());
            //stdRepo.save(students.get());
            return Optional.of(stdRepo.save(students.get()));
        }else{
            return students;
        }
    }
   @Override
    public ResponseEntity<Void> deleteStudent(int stdId) {
        Optional<Student> students = stdRepo.findById(stdId);
        if (students.isPresent()) {
            stdRepo.deleteById(stdId);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
