package com.javaSpringProject.javaspringexample.StudentController;

import com.javaSpringProject.javaspringexample.Dto.StudentDto;
import com.javaSpringProject.javaspringexample.Entity.Student;
import com.javaSpringProject.javaspringexample.controller.StudentController;
import com.javaSpringProject.javaspringexample.service.StudentServiceImpl;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;


@RunWith(MockitoJUnitRunner.class)
public class ControllerTests {

    @Mock
    StudentServiceImpl studentService;
    @InjectMocks
    StudentController studentcontroller;

    @Test
    @Ignore
    public void saveTest() {
        Student students = new Student();
        students.setStudentId(3);
        students.setStudentName("AKki");
        students.setRank("56");
        StudentDto studentDto = new StudentDto();
        studentDto.setStudentId(2);
        studentDto.setStudentName("Nikki");
        studentDto.setStudentMarks(65);
        Mockito.when(studentService.saveStudent(Mockito.any())).thenReturn((studentService.saveStudent(students)));
        Assertions.assertNotNull(studentcontroller.saveStudent(students));
    }
}

