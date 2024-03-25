package com.javaSpringProject.javaspringexample.reposervice;

import com.javaSpringProject.javaspringexample.Dto.StudentDto;
import com.javaSpringProject.javaspringexample.Entity.Student;
import com.javaSpringProject.javaspringexample.repository.StudentRepo;
import com.javaSpringProject.javaspringexample.util.MapperUtils;
import lombok.NonNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Objects;
import java.util.Optional;

@Service
public class StudentRepoServiceImpl {
    @Autowired
    StudentRepo studentRepo;

    public StudentDto saveStudent(StudentDto studentDto) {
        Student student = MapperUtils.convertStudentDtoToStudentEntity(studentDto);
        return MapperUtils.convertStudentEntityToStudentDto(studentRepo.save(student));
    }

    public Collection<StudentDto> getStudents() {
        return MapperUtils.convertStudentEntityToStudentDto(studentRepo.findAll());
    }

    public StudentDto getStudentById(int studentId) {
        Optional<Student> student = studentRepo.findById(studentId);
        if (student.isPresent())
            return MapperUtils.convertStudentEntityToStudentDto(student.get());
        return StudentDto.builder().build();
    }

    public Optional<StudentDto> updateStudent(@NonNull StudentDto studentDto) {
        if(Objects.isNull(studentDto.getStudentId())){
            return Optional.empty();
        }
        Student student1 = MapperUtils.convertStudentDtoToStudentEntity(studentDto);
        Optional<Student> student = studentRepo.findById(student1.getStudentId());
        if (student.isPresent()) {
            student.get().setStudentName(studentDto.getStudentName());
            return Optional.of(MapperUtils.convertStudentEntityToStudentDto(studentRepo.save(student.get())));
        } else {
            return Optional.empty();
        }
    }

    public ResponseEntity<Void> deleteStudent(int studentId) {
        Optional<Student> student = studentRepo.findById(studentId);
        if (student.isPresent()) {
            studentRepo.deleteById(studentId);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
