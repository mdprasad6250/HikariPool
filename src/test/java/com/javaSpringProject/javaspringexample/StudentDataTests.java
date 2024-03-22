package com.javaSpringProject.javaspringexample;

import com.javaSpringProject.javaspringexample.Entity.Student;
import com.javaSpringProject.javaspringexample.repository.StdRepo;
import com.javaSpringProject.javaspringexample.service.StudentServiceImpl;
import com.javaSpringProject.javaspringexample.services.StudentService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.Assert.assertNotEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class StudentDataTests {
    Student student = new Student();
    @Mock
    StudentService studentservice;
    @InjectMocks
    StudentServiceImpl studentserviceimpl;
    @Mock
    StdRepo stdRepo;

    @Test
    public void SaveStudentTest() {
        Student student1 = new Student();
        student1.setStudentName("suma");
        student1.setStudentMarks(88);
        student1.setStudentId(5);

      when(stdRepo.save(any())).thenReturn(student1);
      Student student = studentserviceimpl.saveStudent(student1);
        assertThat(student.getStudentId()).isGreaterThan(3);


    }
   @Test
    public void getStudentsTest(){
       Student student=new Student();
       student.setStudentId(6);
       student.setStudentName("Nikki");
       student.setStudentMarks(68);

       Student student1=new Student();
       student1.setStudentId(5);
       student1.setStudentName("Akki");
       student1.setStudentMarks(98);

       List<Student> liststudents=new ArrayList<>();
      liststudents.add(student);
       liststudents.add(student1);
       when(stdRepo.findAll()).thenReturn(liststudents);
       List<Student> students= studentserviceimpl.getStudent();
       assertNotEquals(student.getStudentMarks(), student1.getStudentMarks());

    }
    @Test
    public void getStudentByIdTest(){
        Student student=new Student();
        student.setStudentId(1);
        student.setStudentName("NikhilKumar");
        student.setStudentMarks(97);
        Student student1=new Student();
        student1.setStudentId(5);
        student1.setStudentName("Akki");
        student1.setStudentMarks(98);

        List<Student> liststudents=new ArrayList<>();
        liststudents.add(student);
        liststudents.add(student1);
        when(stdRepo.findById(anyInt())).thenReturn(Optional.of(student));
       Optional<Student> students=studentserviceimpl.getStudentById(2);
        assertNotEquals(student.getStudentId(),student1.getStudentId());
    }
    @Test
    public void updateStudentsTest(){
       Student students=new Student();
       students.setStudentId(9);
       students.setStudentName("Anu");
       students.setStudentMarks(68);
        when(stdRepo.findById(anyInt())).thenReturn(Optional.of(students));
        Optional<Student> student2=studentserviceimpl.updateStudent( 9,students);
        assertThat(student2).isNotEqualTo(students);

    }
    @Test
    public void DeleteStudentsTest(){
        Student students=new Student();
        students.setStudentId(9);
        students.setStudentName("Nikhil");
        students.setStudentMarks(98);
        when(stdRepo.findById(students.getStudentId())).thenReturn(Optional.of(students));
        studentserviceimpl.deleteStudent(students.getStudentId());
        Optional optional = stdRepo.findById(students.getStudentId());
        assertNotEquals(Optional.empty(),optional);
    }

}


















