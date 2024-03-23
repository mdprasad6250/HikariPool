package com.javaSpringProject.javaspringexample.actionservice;

import com.javaSpringProject.javaspringexample.Dto.BookDto;
import com.javaSpringProject.javaspringexample.Dto.EventDto;
import com.javaSpringProject.javaspringexample.Dto.ExamDto;
import com.javaSpringProject.javaspringexample.Dto.ManagementDto;
import com.javaSpringProject.javaspringexample.Dto.ParentDto;
import com.javaSpringProject.javaspringexample.Dto.SportDto;
import com.javaSpringProject.javaspringexample.Dto.StudentDto;
import com.javaSpringProject.javaspringexample.Dto.TeacherDto;
import com.javaSpringProject.javaspringexample.reposervice.BooksRepoServiceImpl;
import com.javaSpringProject.javaspringexample.reposervice.EventsRepoServiceImpl;
import com.javaSpringProject.javaspringexample.reposervice.ExamsRepoServiceImpl;
import com.javaSpringProject.javaspringexample.reposervice.ManagementRepoServiceImpl;
import com.javaSpringProject.javaspringexample.reposervice.ParentsRepoServiceImpl;
import com.javaSpringProject.javaspringexample.reposervice.SportsRepoServiceImpl;
import com.javaSpringProject.javaspringexample.reposervice.StudentRepoServiceImpl;
import com.javaSpringProject.javaspringexample.reposervice.TeacherRepoServiceImpl;
import com.javaSpringProject.javaspringexample.util.CsvWrite;
import com.opencsv.CSVWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Collection;
import java.util.Locale;

@Service
public class ActionTwoImpl {
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
        CsvWrite.writeDataLineByLine("ActionTwo getBooks ");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        eventsRepoService.getEvents();
        CsvWrite.writeDataLineByLine("ActionTwo getEvents ");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        examsRepoService.getExams();
        CsvWrite.writeDataLineByLine("ActionTwo getExams ");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        managementRepoService.getManagement();
        CsvWrite.writeDataLineByLine("ActionTwo getManagement ");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        parentsRepoService.getParents();
        CsvWrite.writeDataLineByLine("ActionTwo getParents ");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        sportsRepoService.getSports();
        CsvWrite.writeDataLineByLine("ActionTwo getSports ");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        studentRepoService.getStudents();
        CsvWrite.writeDataLineByLine("ActionTwo getStudents ");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        teacherRepoService.getTeachers();
        CsvWrite.writeDataLineByLine("ActionTwo getTeacher ");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
