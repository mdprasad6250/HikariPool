package com.javaSpringProject.javaspringexample.repository;

import com.javaSpringProject.javaspringexample.Entity.Student;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.mockito.ArgumentMatchers.any;

@DataJpaTest
public class StudentRepoTest {
    Student students=new Student();
    @Autowired
     StdRepo stdRepo;
     @Test
    public void saveStudentTest(){
         Student student = new Student();
         student.setStudentName("suma");
         student.setRank("88");
         student.setStudentId(5);

       //  when(stdRepo.save(any())).thenReturn(student1);
       //  ResponseEntity<Student> stdRepo.save(student);
}

}
