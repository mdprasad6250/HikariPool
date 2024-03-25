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

import java.util.ArrayList;
import java.util.Collection;

@Service
public class ActionFourImpl {
    @Autowired
    private BooksServiceImpl booksService;
    @Autowired
    private EventsServiceImpl eventsService;
    @Autowired
    private ExamsServiceImpl examsService;
    @Autowired
    private ManagementServiceImpl managementService;
    @Autowired
    private ParentsServiceImpl parentsService;
    @Autowired
    private SportsServiceImpl sportsService;
    @Autowired
    private StudentServiceImpl studentService;
    @Autowired
    private TeacherServiceImpl teacherService;
    private final long sleepTime = 1;
    
    public void getAllDetails(Integer iter){
        Collection<Collection<Book>> books = new ArrayList<>(iter);
        Collection<Collection<Events>> events = new ArrayList<>(iter);
        Collection<Collection<Exams>> exams = new ArrayList<>(iter);
        Collection<Collection<Management>> managements = new ArrayList<>(iter);
        Collection<Collection<Parents>> parents = new ArrayList<>(iter);
        Collection<Collection<Sports>> sports = new ArrayList<>(iter);
        Collection<Collection<Student>> students = new ArrayList<>(iter);
        Collection<Collection<Teacher>> teachers = new ArrayList<>(iter);
        for (int i=0;i<iter;i++){
            try{
                CsvWrite.writeDataLineByLine("ActionFour(Iteration:"+ i +")  getBooks Start");
                books.add(booksService.getBooks());
                CsvWrite.writeDataLineByLine("ActionFour(Iteration:"+ i +")  getBooks Completed");
            }catch (Exception e){
                CsvWrite.writeDataLineByLine("ActionFour(Iteration:"+ i +")  Exception Fetching_Books"+e.getMessage().replace(' ','_'));
            }
            try {
                Thread.sleep(sleepTime);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            try{
                CsvWrite.writeDataLineByLine("ActionFour(Iteration:"+ i +")  getEvents Start");
                events.add(eventsService.getEvents());
                CsvWrite.writeDataLineByLine("ActionFour(Iteration:"+ i +")  getEvents Completed");
            }catch (Exception e){
                CsvWrite.writeDataLineByLine("ActionFour(Iteration:"+ i +")  Exception Fetching_Events"+e.getMessage().replace(' ','_'));
            }
            try {
                Thread.sleep(sleepTime);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            try{
                CsvWrite.writeDataLineByLine("ActionFour(Iteration:"+ i +")  getExams Start");
                exams.add(examsService.getExams());
                CsvWrite.writeDataLineByLine("ActionFour(Iteration:"+ i +")  getExams Completed");
            }catch (Exception e){
                CsvWrite.writeDataLineByLine("ActionFour(Iteration:"+ i +")  Exception Fetching_Exams"+e.getMessage().replace(' ','_'));
            }
            try {
                Thread.sleep(sleepTime);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            try{
                CsvWrite.writeDataLineByLine("ActionFour(Iteration:"+ i +")  getManagement Start");
                managements.add(managementService.getManagement());
                CsvWrite.writeDataLineByLine("ActionFour(Iteration:"+ i +")  getManagement Completed");
            }catch (Exception e){
                CsvWrite.writeDataLineByLine("ActionFour(Iteration:"+ i +")  Exception Fetching_Management"+e.getMessage().replace(' ','_'));
            }
            try {
                Thread.sleep(sleepTime);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            try{
                CsvWrite.writeDataLineByLine("ActionFour(Iteration:"+ i +")  getParents Start");
                parents.add(parentsService.getParents());
                CsvWrite.writeDataLineByLine("ActionFour(Iteration:"+ i +")  getParents Completed");
            }catch (Exception e){
                CsvWrite.writeDataLineByLine("ActionFour(Iteration:"+ i +")  Exception Fetching_Parents"+e.getMessage().replace(' ','_'));
            }
            try {
                Thread.sleep(sleepTime);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            try{
                CsvWrite.writeDataLineByLine("ActionFour(Iteration:"+ i +")  getSports Start");
                sports.add(sportsService.getSports());
                CsvWrite.writeDataLineByLine("ActionFour(Iteration:"+ i +")  getSports Completed");
            }catch (Exception e){
                CsvWrite.writeDataLineByLine("ActionFour(Iteration:"+ i +")  Exception Fetching_Sports"+e.getMessage().replace(' ','_'));
            }
            try {
                Thread.sleep(sleepTime);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            try{
                CsvWrite.writeDataLineByLine("ActionFour(Iteration:"+ i +")  getStudents Start");
                students.add(studentService.getStudents());
                CsvWrite.writeDataLineByLine("ActionFour(Iteration:"+ i +")  getStudents Completed");
            }catch (Exception e){
                CsvWrite.writeDataLineByLine("ActionFour(Iteration:"+ i +")  Exception Fetching_Students"+e.getMessage().replace(' ','_'));
            }
            try {
                Thread.sleep(sleepTime);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            try{
                CsvWrite.writeDataLineByLine("ActionFour(Iteration:"+ i +")  getTeacher Start");
                teachers.add(teacherService.getTeachers());
                CsvWrite.writeDataLineByLine("ActionFour(Iteration:"+ i +")  getTeacher Completed");
            }catch (Exception e){
                CsvWrite.writeDataLineByLine("ActionFour(Iteration:"+ i +")  Exception Fetching_Teacher"+e.getMessage().replace(' ','_'));
            }
            try {
                Thread.sleep(sleepTime);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
    public void getAllDetails(){
        try{
            CsvWrite.writeDataLineByLine("ActionFour getBooks Start");
            Collection<Book> books = booksService.getBooks();
            CsvWrite.writeDataLineByLine("ActionFour getBooks Completed");
        }catch (Exception e){
            CsvWrite.writeDataLineByLine("ActionFour Exception Fetching_Books"+e.getMessage().replace(' ','_'));
        }
        try {
            Thread.sleep(sleepTime);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        try{
            CsvWrite.writeDataLineByLine("ActionFour getEvents Start");
            Collection<Events> events = eventsService.getEvents();
            CsvWrite.writeDataLineByLine("ActionFour getEvents Completed");
        }catch (Exception e){
            CsvWrite.writeDataLineByLine("ActionFour Exception Fetching_Events"+e.getMessage().replace(' ','_'));
        }
        try {
            Thread.sleep(sleepTime);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        try{
            CsvWrite.writeDataLineByLine("ActionFour getExams Start");
            Collection<Exams> exams = examsService.getExams();
            CsvWrite.writeDataLineByLine("ActionFour getExams Completed");
        }catch (Exception e){
            CsvWrite.writeDataLineByLine("ActionFour Exception Fetching_Exams"+e.getMessage().replace(' ','_'));
        }
        try {
            Thread.sleep(sleepTime);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        try{
            CsvWrite.writeDataLineByLine("ActionFour getManagement Start");
            Collection<Management> managements = managementService.getManagement();
            CsvWrite.writeDataLineByLine("ActionFour getManagement Completed");
        }catch (Exception e){
            CsvWrite.writeDataLineByLine("ActionFour Exception Fetching_Management"+e.getMessage().replace(' ','_'));
        }
        try {
            Thread.sleep(sleepTime);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        try{
            CsvWrite.writeDataLineByLine("ActionFour getParents Start");
            Collection<Parents> parents = parentsService.getParents();
            CsvWrite.writeDataLineByLine("ActionFour getParents Completed");
        }catch (Exception e){
            CsvWrite.writeDataLineByLine("ActionFour Exception Fetching_Parents"+e.getMessage().replace(' ','_'));
        }
        try {
            Thread.sleep(sleepTime);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        try{
            CsvWrite.writeDataLineByLine("ActionFour getSports Start");
            Collection<Sports> sports = sportsService.getSports();
            CsvWrite.writeDataLineByLine("ActionFour getSports Completed");
        }catch (Exception e){
            CsvWrite.writeDataLineByLine("ActionFour Exception Fetching_Sports"+e.getMessage().replace(' ','_'));
        }
        try {
            Thread.sleep(sleepTime);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        try{
            CsvWrite.writeDataLineByLine("ActionFour getStudents Start");
            Collection<Student> students = studentService.getStudents();
            CsvWrite.writeDataLineByLine("ActionFour getStudents Completed");
        }catch (Exception e){
            CsvWrite.writeDataLineByLine("ActionFour Exception Fetching_Students"+e.getMessage().replace(' ','_'));
        }
        try {
            Thread.sleep(sleepTime);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        try{
            CsvWrite.writeDataLineByLine("ActionFour getTeachers Start");
            Collection<Teacher> teachers = teacherService.getTeachers();
            CsvWrite.writeDataLineByLine("ActionFour getTeachers Completed");
        }catch (Exception e){
            CsvWrite.writeDataLineByLine("ActionFour Exception Fetching_Teachers"+e.getMessage().replace(' ','_'));
        }
        try {
            Thread.sleep(sleepTime);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
