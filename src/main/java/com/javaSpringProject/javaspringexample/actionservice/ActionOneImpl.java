package com.javaSpringProject.javaspringexample.actionservice;

import com.javaSpringProject.javaspringexample.Dto.BookDto;
import com.javaSpringProject.javaspringexample.Dto.EventDto;
import com.javaSpringProject.javaspringexample.Dto.ExamDto;
import com.javaSpringProject.javaspringexample.Dto.ManagementDto;
import com.javaSpringProject.javaspringexample.reposervice.BooksRepoServiceImpl;
import com.javaSpringProject.javaspringexample.reposervice.EventsRepoServiceImpl;
import com.javaSpringProject.javaspringexample.reposervice.ExamsRepoServiceImpl;
import com.javaSpringProject.javaspringexample.reposervice.ManagementRepoServiceImpl;
import com.javaSpringProject.javaspringexample.reposervice.ParentsRepoServiceImpl;
import com.javaSpringProject.javaspringexample.reposervice.SportsRepoServiceImpl;
import com.javaSpringProject.javaspringexample.reposervice.StudentRepoServiceImpl;
import com.javaSpringProject.javaspringexample.reposervice.TeacherRepoServiceImpl;
import com.javaSpringProject.javaspringexample.util.CsvWrite;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Collection;

@Service
public class ActionOneImpl {
    @Autowired
    private BooksRepoServiceImpl booksRepoService;
    @Autowired
    private EventsRepoServiceImpl eventsRepoService;
    @Autowired
    private ExamsRepoServiceImpl examsRepoService;
    @Autowired
    private ManagementRepoServiceImpl managementRepoService;
    @Autowired
    private ParentsRepoServiceImpl parentsRepoService;
    @Autowired
    private SportsRepoServiceImpl sportsRepoService;
    @Autowired
    private StudentRepoServiceImpl studentRepoService;
    @Autowired
    private TeacherRepoServiceImpl teacherRepoService;


    public void getAllDetails(){
        booksRepoService.getBooks();
        CsvWrite.writeDataLineByLine("ActionOne getBooks ");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        eventsRepoService.getEvents();
        CsvWrite.writeDataLineByLine("ActionOne getEvents ");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        examsRepoService.getExams();
        CsvWrite.writeDataLineByLine("ActionOne getExams ");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        managementRepoService.getManagement();
        CsvWrite.writeDataLineByLine("ActionOne getManagement ");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        parentsRepoService.getParents();
        CsvWrite.writeDataLineByLine("ActionOne getParents ");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        sportsRepoService.getSports();
        CsvWrite.writeDataLineByLine("ActionOne getSports ");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        studentRepoService.getStudents();
        CsvWrite.writeDataLineByLine("ActionOne getStudents ");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        teacherRepoService.getTeachers();
        CsvWrite.writeDataLineByLine("ActionOne getTeacher ");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
