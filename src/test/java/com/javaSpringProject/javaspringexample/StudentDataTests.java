package com.javaSpringProject.javaspringexample;

import com.javaSpringProject.javaspringexample.Entity.Student;
import com.javaSpringProject.javaspringexample.repository.StudentRepo;
import com.javaSpringProject.javaspringexample.service.StudentServiceImpl;
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
    @InjectMocks
    StudentServiceImpl studentserviceimpl;
    @Mock
    StudentRepo studentRepo;

    @Test
    public void SaveStudentTest() {
        Student student1 = new Student();
        student1.setStudentName("suma");
        student1.setRank("88");
        student1.setStudentId(5);

      when(studentRepo.save(any())).thenReturn(student1);
      Student student = studentserviceimpl.saveStudent(student1);
        assertThat(student.getStudentId()).isGreaterThan(3);


    }
   @Test
    public void getStudentsTest(){
       Student student=new Student();
       student.setStudentId(6);
       student.setStudentName("Nikki");
       student.setRank("68");

       Student student1=new Student();
       student1.setStudentId(5);
       student1.setStudentName("Akki");
       student1.setRank("98");

       List<Student> liststudents=new ArrayList<>();
      liststudents.add(student);
       liststudents.add(student1);
       when(studentRepo.findAll()).thenReturn(liststudents);
       List<Student> students= studentserviceimpl.getStudents();
       assertNotEquals(student.getRank(), student1.getRank());

    }
    @Test
    public void getStudentByIdTest(){
        Student student=new Student();
        student.setStudentId(1);
        student.setStudentName("NikhilKumar");
        student.setRank("97");
        Student student1=new Student();
        student1.setStudentId(5);
        student1.setStudentName("Akki");
        student1.setRank("98");

        List<Student> liststudents=new ArrayList<>();
        liststudents.add(student);
        liststudents.add(student1);
        when(studentRepo.findById(anyInt())).thenReturn(Optional.of(student));
       Optional<Student> students=studentserviceimpl.getStudentById(2);
        assertNotEquals(student.getStudentId(),student1.getStudentId());
    }
    @Test
    public void updateStudentsTest(){
       Student students=new Student();
       students.setStudentId(9);
       students.setStudentName("Anu");
       students.setRank("68");
        when(studentRepo.findById(anyInt())).thenReturn(Optional.of(students));
        Optional<Student> student2=studentserviceimpl.updateStudent( 9,students);
        assertThat(student2).isNotEqualTo(students);

    }
    @Test
    public void DeleteStudentsTest(){
        Student students=new Student();
        students.setStudentId(9);
        students.setStudentName("Nikhil");
        students.setRank("98");
        when(studentRepo.findById(students.getStudentId())).thenReturn(Optional.of(students));
        studentserviceimpl.deleteStudent(students.getStudentId());
        Optional optional = studentRepo.findById(students.getStudentId());
        assertNotEquals(Optional.empty(),optional);
    }

}



















