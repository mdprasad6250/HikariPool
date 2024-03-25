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
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;

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
    private final long sleepTime = 1;
    public void getAllDetails(Integer iter){
        Collection<Collection<BookDto>> bookDtos = new ArrayList<>(iter);
        Collection<Collection<EventDto>> eventDtos = new ArrayList<>(iter);
        Collection<Collection<ExamDto>> examDtos = new ArrayList<>(iter);
        Collection<Collection<ManagementDto>> managementDtos = new ArrayList<>(iter);
        Collection<Collection<ParentDto>> parentDtos = new ArrayList<>(iter);
        Collection<Collection<SportDto>> sportDtos = new ArrayList<>(iter);
        Collection<Collection<StudentDto>> studentDtos = new ArrayList<>(iter);
        Collection<Collection<TeacherDto>> teacherDtos = new ArrayList<>(iter);
        for (int i=0;i<iter;i++){
            try{
                CsvWrite.writeDataLineByLine("ActionTwo(Iteration:"+ i +") getBooks Start");
                bookDtos.add(booksRepoService.getBooks());
                CsvWrite.writeDataLineByLine("ActionTwo(Iteration:"+ i +") getBooks Completed");
            }catch (Exception e){
                CsvWrite.writeDataLineByLine("ActionTwo(Iteration:"+ i +") Exception Fetching_Books"+e.getMessage().replace(' ','_'));
            }
            try {
                Thread.sleep(sleepTime);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            try{
                CsvWrite.writeDataLineByLine("ActionTwo(Iteration:"+ i +") getEvents Start");
                eventDtos.add(eventsRepoService.getEvents());
                CsvWrite.writeDataLineByLine("ActionTwo(Iteration:"+ i +") getEvents Completed");
            }catch (Exception e){
                CsvWrite.writeDataLineByLine("ActionTwo(Iteration:"+ i +") Exception Fetching_Events"+e.getMessage().replace(' ','_'));
            }
            try {
                Thread.sleep(sleepTime);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            try{
                CsvWrite.writeDataLineByLine("ActionTwo(Iteration:"+ i +") getExams Start");
                examDtos.add(examsRepoService.getExams());
                CsvWrite.writeDataLineByLine("ActionTwo(Iteration:"+ i +") getExams Completed");
            }catch (Exception e){
                CsvWrite.writeDataLineByLine("ActionTwo(Iteration:"+ i +") Exception Fetching_Exams"+e.getMessage().replace(' ','_'));
            }
            try {
                Thread.sleep(sleepTime);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            try{
                CsvWrite.writeDataLineByLine("ActionTwo(Iteration:"+ i +") getManagement Start");
                managementDtos.add(managementRepoService.getManagement());
                CsvWrite.writeDataLineByLine("ActionTwo(Iteration:"+ i +") getManagement Completed");
            }catch (Exception e){
                CsvWrite.writeDataLineByLine("ActionTwo(Iteration:"+ i +") Exception Fetching_Management"+e.getMessage().replace(' ','_'));
            }
            try {
                Thread.sleep(sleepTime);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            try{
                CsvWrite.writeDataLineByLine("ActionTwo(Iteration:"+ i +") getParents Start");
                parentDtos.add(parentsRepoService.getParents());
                CsvWrite.writeDataLineByLine("ActionTwo(Iteration:"+ i +") getParents Completed");
            }catch (Exception e){
                CsvWrite.writeDataLineByLine("ActionTwo(Iteration:"+ i +") Exception Fetching_Parents"+e.getMessage().replace(' ','_'));
            }
            try {
                Thread.sleep(sleepTime);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            try{
                CsvWrite.writeDataLineByLine("ActionTwo(Iteration:"+ i +") getSports Start");
                sportDtos.add(sportsRepoService.getSports());
                CsvWrite.writeDataLineByLine("ActionTwo(Iteration:"+ i +") getSports Completed");
            }catch (Exception e){
                CsvWrite.writeDataLineByLine("ActionTwo(Iteration:"+ i +") Exception Fetching_Sports"+e.getMessage().replace(' ','_'));
            }
            try {
                Thread.sleep(sleepTime);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            try{
                CsvWrite.writeDataLineByLine("ActionTwo(Iteration:"+ i +") getStudents Start");
                studentDtos.add(studentRepoService.getStudents());
                CsvWrite.writeDataLineByLine("ActionTwo(Iteration:"+ i +") getStudents Completed");
            }catch (Exception e){
                CsvWrite.writeDataLineByLine("ActionTwo(Iteration:"+ i +") Exception Fetching_Students"+e.getMessage().replace(' ','_'));
            }
            try {
                Thread.sleep(sleepTime);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            try{
                CsvWrite.writeDataLineByLine("ActionTwo(Iteration:"+ i +") getTeacher Start");
                teacherDtos.add(teacherRepoService.getTeachers());
                CsvWrite.writeDataLineByLine("ActionTwo(Iteration:"+ i +") getTeacher Completed");
            }catch (Exception e){
                CsvWrite.writeDataLineByLine("ActionTwo(Iteration:"+ i +") Exception Fetching_Teacher"+e.getMessage().replace(' ','_'));
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
            CsvWrite.writeDataLineByLine("ActionTwo getBooks Start");
            Collection<BookDto> bookDtos = booksRepoService.getBooks();
            CsvWrite.writeDataLineByLine("ActionTwo getBooks Completed");
        }catch (Exception e){
            CsvWrite.writeDataLineByLine("ActionTwo Exception Fetching_Books"+e.getMessage().replace(' ','_'));
        }
        try {
            Thread.sleep(sleepTime);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        try{
            CsvWrite.writeDataLineByLine("ActionTwo getEvents Start");
            Collection<EventDto> eventDtos = eventsRepoService.getEvents();
            CsvWrite.writeDataLineByLine("ActionTwo getEvents Completed");
        }catch (Exception e){
            CsvWrite.writeDataLineByLine("ActionTwo Exception Fetching_Events"+e.getMessage().replace(' ','_'));
        }
        try {
            Thread.sleep(sleepTime);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        try{
            CsvWrite.writeDataLineByLine("ActionTwo getExams Start");
            Collection<ExamDto> examDtos =examsRepoService.getExams();
            CsvWrite.writeDataLineByLine("ActionTwo getExams Completed");
        }catch (Exception e){
            CsvWrite.writeDataLineByLine("ActionTwo Exception Fetching_Exams"+e.getMessage().replace(' ','_'));
        }
        try {
            Thread.sleep(sleepTime);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        try{
            CsvWrite.writeDataLineByLine("ActionTwo getManagement Start");
            Collection<ManagementDto> managementDtos =managementRepoService.getManagement();
            CsvWrite.writeDataLineByLine("ActionTwo getManagement Completed");
        }catch (Exception e){
            CsvWrite.writeDataLineByLine("ActionTwo Exception Fetching_Management"+e.getMessage().replace(' ','_'));
        }
        try {
            Thread.sleep(sleepTime);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        try{
            CsvWrite.writeDataLineByLine("ActionTwo getParents Start");
            Collection<ParentDto> parentDtos =parentsRepoService.getParents();
            CsvWrite.writeDataLineByLine("ActionTwo getParents Completed");
        }catch (Exception e){
            CsvWrite.writeDataLineByLine("ActionTwo Exception Fetching_Parents"+e.getMessage().replace(' ','_'));
        }
        try {
            Thread.sleep(sleepTime);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        try{
            CsvWrite.writeDataLineByLine("ActionTwo getSports Start");
            Collection<SportDto> sportDtos =sportsRepoService.getSports();
            CsvWrite.writeDataLineByLine("ActionTwo getSports Completed");
        }catch (Exception e){
            CsvWrite.writeDataLineByLine("ActionTwo Exception Fetching_Sports"+e.getMessage()+e.getMessage().replace(' ','_'));
        }
        try {
            Thread.sleep(sleepTime);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        try{
            CsvWrite.writeDataLineByLine("ActionTwo getStudents Start");
            Collection<StudentDto> studentDtos =studentRepoService.getStudents();
            CsvWrite.writeDataLineByLine("ActionTwo getStudents Completed");
        }catch (Exception e){
            CsvWrite.writeDataLineByLine("ActionTwo Exception Fetching_Students"+e.getMessage().replace(' ','_'));
        }
        try {
            Thread.sleep(sleepTime);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        try{
            CsvWrite.writeDataLineByLine("ActionTwo getTeacher Start");
            Collection<TeacherDto> teacherDtos = teacherRepoService.getTeachers();
            CsvWrite.writeDataLineByLine("ActionTwo getTeacher Completed");
        }catch (Exception e){
            CsvWrite.writeDataLineByLine("ActionTwo Exception Fetching_Teacher"+e.getMessage().replace(' ','_'));
        }
        try {
            Thread.sleep(sleepTime);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
