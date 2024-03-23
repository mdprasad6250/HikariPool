package com.javaSpringProject.javaspringexample.actionservice;

import com.javaSpringProject.javaspringexample.Dto.BookDto;
import com.javaSpringProject.javaspringexample.Dto.EventDto;
import com.javaSpringProject.javaspringexample.Dto.ExamDto;
import com.javaSpringProject.javaspringexample.Dto.ManagementDto;
import com.javaSpringProject.javaspringexample.Dto.ParentDto;
import com.javaSpringProject.javaspringexample.Dto.SportDto;
import com.javaSpringProject.javaspringexample.Dto.StudentDto;
import com.javaSpringProject.javaspringexample.Dto.TeacherDto;
import com.javaSpringProject.javaspringexample.Entity.Events;
import com.javaSpringProject.javaspringexample.Entity.Parents;
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

        try{
            CsvWrite.writeDataLineByLine("ActionOne getBooks Start");
            Collection<BookDto> bookDtos = booksRepoService.getBooks();
            CsvWrite.writeDataLineByLine("ActionOne getBooks Completed");
        }catch (Exception e){
            CsvWrite.writeDataLineByLine("ActionOne Exception Fetching_Books"+e.getMessage().replace(' ','_'));
        }
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        try{
            CsvWrite.writeDataLineByLine("ActionOne getEvents Start");
            Collection<EventDto> eventDtos = eventsRepoService.getEvents();
            CsvWrite.writeDataLineByLine("ActionOne getEvents Completed");
        }catch (Exception e){
            CsvWrite.writeDataLineByLine("ActionOne Exception Fetching_Events"+e.getMessage().replace(' ','_'));
        }
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        try{
            CsvWrite.writeDataLineByLine("ActionOne getExams Start");
            Collection<ExamDto> examDtos =examsRepoService.getExams();
            CsvWrite.writeDataLineByLine("ActionOne getExams Completed");
        }catch (Exception e){
            CsvWrite.writeDataLineByLine("ActionOne Exception Fetching_Exams"+e.getMessage().replace(' ','_'));
        }
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        try{
            CsvWrite.writeDataLineByLine("ActionOne getManagement Start");
            Collection<ManagementDto> managementDtos =managementRepoService.getManagement();
            CsvWrite.writeDataLineByLine("ActionOne getManagement Completed");
        }catch (Exception e){
            CsvWrite.writeDataLineByLine("ActionOne Exception Fetching_Management"+e.getMessage().replace(' ','_'));
        }
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        try{
            CsvWrite.writeDataLineByLine("ActionOne getParents Start");
            Collection<ParentDto> parentDtos =parentsRepoService.getParents();
            CsvWrite.writeDataLineByLine("ActionOne getParents Completed");
        }catch (Exception e){
            CsvWrite.writeDataLineByLine("ActionOne Exception Fetching_Parents"+e.getMessage().replace(' ','_'));
        }
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        try{
            CsvWrite.writeDataLineByLine("ActionOne getSports Start");
            Collection<SportDto> sportDtos =sportsRepoService.getSports();
            CsvWrite.writeDataLineByLine("ActionOne getSports Completed");
        }catch (Exception e){
            CsvWrite.writeDataLineByLine("ActionOne Exception Fetching_Sports"+e.getMessage().replace(' ','_'));
        }
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        try{
            CsvWrite.writeDataLineByLine("ActionOne getStudents Start");
            Collection<StudentDto> studentDtos =studentRepoService.getStudents();
            CsvWrite.writeDataLineByLine("ActionOne getStudents Completed");
        }catch (Exception e){
            CsvWrite.writeDataLineByLine("ActionOne Exception Fetching_Students"+e.getMessage().replace(' ','_'));
        }
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        try{
            CsvWrite.writeDataLineByLine("ActionOne getTeacher Start");
            Collection<TeacherDto> teacherDtos = teacherRepoService.getTeachers();
            CsvWrite.writeDataLineByLine("ActionOne getTeacher Completed");
        }catch (Exception e){
            CsvWrite.writeDataLineByLine("ActionOne Exception Fetching_Teacher"+e.getMessage().replace(' ','_'));
        }
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
