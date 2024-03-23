package com.javaSpringProject.javaspringexample.actionservice;

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

@Service
public class ActionFourImpl {
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
        booksService.getBooks();
        CsvWrite.writeDataLineByLine("ActionFour getBooks ");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        eventsService.getEvents();
        CsvWrite.writeDataLineByLine("ActionFour getEvents ");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        examsService.getExams();
        CsvWrite.writeDataLineByLine("ActionFour getExams ");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        managementRepoService.getManagement();
        CsvWrite.writeDataLineByLine("ActionFour getManagement ");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        parentsService.getParents();
        CsvWrite.writeDataLineByLine("ActionFour getParents ");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        sportsService.getSports();
        CsvWrite.writeDataLineByLine("ActionFour getSports ");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        studentService.getStudents();
        CsvWrite.writeDataLineByLine("ActionFour getStudents ");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        teacherService.getTeachers();
        CsvWrite.writeDataLineByLine("ActionFour getTeachers ");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
