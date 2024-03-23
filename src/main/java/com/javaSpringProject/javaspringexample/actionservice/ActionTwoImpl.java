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

        try{
            CsvWrite.writeDataLineByLine("ActionTwo getBooks Start");
            Collection<BookDto> bookDtos = booksRepoService.getBooks();
            CsvWrite.writeDataLineByLine("ActionTwo getBooks Completed");
        }catch (Exception e){
            CsvWrite.writeDataLineByLine("ActionTwo Exception Fetching_Books"+e.getMessage());
        }
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        try{
            CsvWrite.writeDataLineByLine("ActionTwo getEvents Start");
            Collection<EventDto> eventDtos = eventsRepoService.getEvents();
            CsvWrite.writeDataLineByLine("ActionTwo getEvents Completed");
        }catch (Exception e){
            CsvWrite.writeDataLineByLine("ActionTwo Exception Fetching_Events"+e.getMessage());
        }
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        try{
            CsvWrite.writeDataLineByLine("ActionTwo getExams Start");
            Collection<ExamDto> examDtos =examsRepoService.getExams();
            CsvWrite.writeDataLineByLine("ActionTwo getExams Completed");
        }catch (Exception e){
            CsvWrite.writeDataLineByLine("ActionTwo Exception Fetching_Exams"+e.getMessage());
        }
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        try{
            CsvWrite.writeDataLineByLine("ActionTwo getManagement Start");
            Collection<ManagementDto> managementDtos =managementRepoService.getManagement();
            CsvWrite.writeDataLineByLine("ActionTwo getManagement Completed");
        }catch (Exception e){
            CsvWrite.writeDataLineByLine("ActionTwo Exception Fetching_Management"+e.getMessage());
        }
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        try{
            CsvWrite.writeDataLineByLine("ActionTwo getParents Start");
            Collection<ParentDto> parentDtos =parentsRepoService.getParents();
            CsvWrite.writeDataLineByLine("ActionTwo getParents Completed");
        }catch (Exception e){
            CsvWrite.writeDataLineByLine("ActionTwo Exception Fetching_Parents"+e.getMessage());
        }
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        try{
            CsvWrite.writeDataLineByLine("ActionTwo getSports Start");
            Collection<SportDto> sportDtos =sportsRepoService.getSports();
            CsvWrite.writeDataLineByLine("ActionTwo getSports Completed");
        }catch (Exception e){
            CsvWrite.writeDataLineByLine("ActionTwo Exception Fetching_Sports"+e.getMessage());
        }
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        try{
            CsvWrite.writeDataLineByLine("ActionTwo getStudents Start");
            Collection<StudentDto> studentDtos =studentRepoService.getStudents();
            CsvWrite.writeDataLineByLine("ActionTwo getStudents Completed");
        }catch (Exception e){
            CsvWrite.writeDataLineByLine("ActionTwo Exception Fetching_Students"+e.getMessage());
        }
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        try{
            CsvWrite.writeDataLineByLine("ActionTwo getTeacher Start");
            Collection<TeacherDto> teacherDtos = teacherRepoService.getTeachers();
            CsvWrite.writeDataLineByLine("ActionTwo getTeacher Completed");
        }catch (Exception e){
            CsvWrite.writeDataLineByLine("ActionTwo Exception Fetching_Teacher"+e.getMessage());
        }
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
