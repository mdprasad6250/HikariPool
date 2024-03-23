package com.javaSpringProject.javaspringexample.actionservice;

import com.javaSpringProject.javaspringexample.Entity.Book;
import com.javaSpringProject.javaspringexample.Entity.Events;
import com.javaSpringProject.javaspringexample.Entity.Exams;
import com.javaSpringProject.javaspringexample.Entity.Management;
import com.javaSpringProject.javaspringexample.Entity.Parents;
import com.javaSpringProject.javaspringexample.Entity.Sports;
import com.javaSpringProject.javaspringexample.Entity.Student;
import com.javaSpringProject.javaspringexample.Entity.Teacher;
import com.javaSpringProject.javaspringexample.service.BooksServiceImpl;
import com.javaSpringProject.javaspringexample.service.EventsServiceImpl;
import com.javaSpringProject.javaspringexample.service.ExamsServiceImpl;
import com.javaSpringProject.javaspringexample.service.ManagementServiceImpl;
import com.javaSpringProject.javaspringexample.service.ParentsServiceImpl;
import com.javaSpringProject.javaspringexample.service.SportsServiceImpl;
import com.javaSpringProject.javaspringexample.service.StudentServiceImpl;
import com.javaSpringProject.javaspringexample.service.TeacherServiceImpl;
import com.javaSpringProject.javaspringexample.util.CsvWrite;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Collection;

@Service
public class ActionThreeImpl {
    @Autowired
    private BooksServiceImpl booksService;
    @Autowired
    private EventsServiceImpl eventsService;
    @Autowired
    private ExamsServiceImpl examsService;
    @Autowired
    private ManagementServiceImpl managementRepoService;
    @Autowired
    private ParentsServiceImpl parentsService;
    @Autowired
    private SportsServiceImpl sportsService;
    @Autowired
    private StudentServiceImpl studentService;
    @Autowired
    private TeacherServiceImpl teacherService;
    public void getAllDetails(){
        try{
            CsvWrite.writeDataLineByLine("ActionThree getBooks Start");
            Collection<Book> books = booksService.getBooks();
            CsvWrite.writeDataLineByLine("ActionThree getBooks Completed");
        }catch (Exception e){
            CsvWrite.writeDataLineByLine("ActionThree Exception Fetching_Books"+e.getMessage().replace(' ','_').replace(' ','_'));
        }
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        try{
            CsvWrite.writeDataLineByLine("ActionThree getEvents Start");
            Collection<Events> events = eventsService.getEvents();
            CsvWrite.writeDataLineByLine("ActionThree getEvents Completed");
        }catch (Exception e){
            CsvWrite.writeDataLineByLine("ActionThree Exception Fetching_Events"+e.getMessage().replace(' ','_').replace(' ','_'));
        }
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        try{
            CsvWrite.writeDataLineByLine("ActionThree getExams Start");
            Collection<Exams> exams = examsService.getExams();
            CsvWrite.writeDataLineByLine("ActionThree getExams Completed");
        }catch (Exception e){
            CsvWrite.writeDataLineByLine("ActionThree Exception Fetching_Exams"+e.getMessage().replace(' ','_').replace(' ','_'));
        }
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        try{
            CsvWrite.writeDataLineByLine("ActionThree getManagement Start");
            Collection<Management> managements = managementRepoService.getManagement();
            CsvWrite.writeDataLineByLine("ActionThree getManagement Completed");
        }catch (Exception e){
            CsvWrite.writeDataLineByLine("ActionThree Exception Fetching_Management"+e.getMessage().replace(' ','_').replace(' ','_'));
        }
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        try{
            CsvWrite.writeDataLineByLine("ActionThree getParents Start");
            Collection<Parents> parents = parentsService.getParents();
            CsvWrite.writeDataLineByLine("ActionThree getParents Completed");
        }catch (Exception e){
            CsvWrite.writeDataLineByLine("ActionThree Exception Fetching_Parents"+e.getMessage().replace(' ','_').replace(' ','_'));
        }
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        try{
            CsvWrite.writeDataLineByLine("ActionThree getSports Start");
            Collection<Sports> sports = sportsService.getSports();
            CsvWrite.writeDataLineByLine("ActionThree getSports Completed");
        }catch (Exception e){
            CsvWrite.writeDataLineByLine("ActionThree Exception Fetching_Sports"+e.getMessage().replace(' ','_').replace(' ','_'));
        }
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        try{
            CsvWrite.writeDataLineByLine("ActionThree getStudents Start");
            Collection<Student> students = studentService.getStudents();
            CsvWrite.writeDataLineByLine("ActionThree getStudents Completed");
        }catch (Exception e){
            CsvWrite.writeDataLineByLine("ActionThree Exception Fetching_Students"+e.getMessage().replace(' ','_').replace(' ','_'));
        }
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        try{
            CsvWrite.writeDataLineByLine("ActionThree getTeachers Start");
            Collection<Teacher> teachers = teacherService.getTeachers();
            CsvWrite.writeDataLineByLine("ActionThree getTeachers Completed");
        }catch (Exception e){
            CsvWrite.writeDataLineByLine("ActionThree Exception Fetching_Teachers"+e.getMessage().replace(' ','_').replace(' ','_'));
        }
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
