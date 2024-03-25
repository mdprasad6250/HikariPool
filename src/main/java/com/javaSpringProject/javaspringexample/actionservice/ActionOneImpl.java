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
import com.javaSpringProject.javaspringexample.util.MapperUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Optional;

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
                CsvWrite.writeDataLineByLine("ActionOne(Iteration:"+ i +") getBooks Start");
                bookDtos.add(booksRepoService.getBooks());
                CsvWrite.writeDataLineByLine("ActionOne(Iteration:"+ i +") getBooks Completed");
            }catch (Exception e){
                CsvWrite.writeDataLineByLine("ActionOne(Iteration:"+ i +") Exception Fetching_Books"+e.getMessage().replace(' ','_'));
            }
            try {
                Thread.sleep(sleepTime);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            try{
                CsvWrite.writeDataLineByLine("ActionOne(Iteration:"+ i +") getEvents Start");
                eventDtos.add(eventsRepoService.getEvents());
                CsvWrite.writeDataLineByLine("ActionOne(Iteration:"+ i +") getEvents Completed");
            }catch (Exception e){
                CsvWrite.writeDataLineByLine("ActionOne(Iteration:"+ i +") Exception Fetching_Events"+e.getMessage().replace(' ','_'));
            }
            try {
                Thread.sleep(sleepTime);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            try{
                CsvWrite.writeDataLineByLine("ActionOne(Iteration:"+ i +") getExams Start");
                examDtos.add(examsRepoService.getExams());
                CsvWrite.writeDataLineByLine("ActionOne(Iteration:"+ i +") getExams Completed");
            }catch (Exception e){
                CsvWrite.writeDataLineByLine("ActionOne(Iteration:"+ i +") Exception Fetching_Exams"+e.getMessage().replace(' ','_'));
            }
            try {
                Thread.sleep(sleepTime);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            try{
                CsvWrite.writeDataLineByLine("ActionOne(Iteration:"+ i +") getManagement Start");
                managementDtos.add(managementRepoService.getManagement());
                CsvWrite.writeDataLineByLine("ActionOne(Iteration:"+ i +") getManagement Completed");
            }catch (Exception e){
                CsvWrite.writeDataLineByLine("ActionOne(Iteration:"+ i +") Exception Fetching_Management"+e.getMessage().replace(' ','_'));
            }
            try {
                Thread.sleep(sleepTime);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            try{
                CsvWrite.writeDataLineByLine("ActionOne(Iteration:"+ i +") getParents Start");
                parentDtos.add(parentsRepoService.getParents());
                CsvWrite.writeDataLineByLine("ActionOne(Iteration:"+ i +") getParents Completed");
            }catch (Exception e){
                CsvWrite.writeDataLineByLine("ActionOne(Iteration:"+ i +") Exception Fetching_Parents"+e.getMessage().replace(' ','_'));
            }
            try {
                Thread.sleep(sleepTime);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            try{
                CsvWrite.writeDataLineByLine("ActionOne(Iteration:"+ i +") getSports Start");
                sportDtos.add(sportsRepoService.getSports());
                CsvWrite.writeDataLineByLine("ActionOne(Iteration:"+ i +") getSports Completed");
            }catch (Exception e){
                CsvWrite.writeDataLineByLine("ActionOne(Iteration:"+ i +") Exception Fetching_Sports"+e.getMessage().replace(' ','_'));
            }
            try {
                Thread.sleep(sleepTime);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            try{
                CsvWrite.writeDataLineByLine("ActionOne(Iteration:"+ i +") getStudents Start");
                studentDtos.add(studentRepoService.getStudents());
                CsvWrite.writeDataLineByLine("ActionOne(Iteration:"+ i +") getStudents Completed");
            }catch (Exception e){
                CsvWrite.writeDataLineByLine("ActionOne(Iteration:"+ i +") Exception Fetching_Students"+e.getMessage().replace(' ','_'));
            }
            try {
                Thread.sleep(sleepTime);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            try{
                CsvWrite.writeDataLineByLine("ActionOne(Iteration:"+ i +") getTeacher Start");
                teacherDtos.add(teacherRepoService.getTeachers());
                CsvWrite.writeDataLineByLine("ActionOne(Iteration:"+ i +") getTeacher Completed");
            }catch (Exception e){
                CsvWrite.writeDataLineByLine("ActionOne(Iteration:"+ i +") Exception Fetching_Teacher"+e.getMessage().replace(' ','_'));
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
            CsvWrite.writeDataLineByLine("ActionOne getBooks Start");
            Collection<BookDto> bookDtos = booksRepoService.getBooks();
            CsvWrite.writeDataLineByLine("ActionOne getBooks Completed");
        }catch (Exception e){
            CsvWrite.writeDataLineByLine("ActionOne Exception Fetching_Books"+e.getMessage().replace(' ','_'));
        }
        try {
            Thread.sleep(sleepTime);
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
            Thread.sleep(sleepTime);
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
            Thread.sleep(sleepTime);
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
            Thread.sleep(sleepTime);
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
            Thread.sleep(sleepTime);
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
            Thread.sleep(sleepTime);
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
            Thread.sleep(sleepTime);
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
            Thread.sleep(sleepTime);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }


    public void allOperations(Integer iter){
        for (int i=0;i<iter;i++) {
            if (i % 5 == 0) {
                try {
                    CsvWrite.writeDataLineByLine("ActionOne(Iteration:" + i + ") deleteBooks Start");
                    Optional<BookDto> bookOptional = Optional.ofNullable(booksRepoService.getBookById(i));
                    if(bookOptional.isPresent()) {
                        booksRepoService.deleteBook(i);
                    }
                    CsvWrite.writeDataLineByLine("ActionOne(Iteration:" + i + ") deleteBooks Completed");
                } catch (Exception e) {
                    CsvWrite.writeDataLineByLine("ActionOne(Iteration:" + i + ") Exception Deleting_Books" + e.getMessage().replace(' ', '_'));
                }
                try {
                    Thread.sleep(sleepTime);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

                try {
                    CsvWrite.writeDataLineByLine("ActionOne(Iteration:" + i + ") deleteEvents Start");
                    Optional<EventDto> eventDtoOptional = Optional.ofNullable(eventsRepoService.getEventById(i));
                    if(eventDtoOptional.isPresent()) {
                        eventsRepoService.deleteEvent(i);
                    }
                    CsvWrite.writeDataLineByLine("ActionOne(Iteration:" + i + ") deleteEvents Completed");
                } catch (Exception e) {
                    CsvWrite.writeDataLineByLine("ActionOne(Iteration:" + i + ") Exception Deleting_Events" + e.getMessage().replace(' ', '_'));
                }
                try {
                    Thread.sleep(sleepTime);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

                try {
                    CsvWrite.writeDataLineByLine("ActionOne(Iteration:" + i + ") deleteExams Start");
                    Optional<ExamDto> examDtoOptional = Optional.ofNullable(examsRepoService.getExamById(i));
                    if(examDtoOptional.isPresent()) {
                        examsRepoService.deleteExam(i);
                    }
                    CsvWrite.writeDataLineByLine("ActionOne(Iteration:" + i + ") deleteExams Completed");
                } catch (Exception e) {
                    CsvWrite.writeDataLineByLine("ActionOne(Iteration:" + i + ") Exception Deleting_Exams" + e.getMessage().replace(' ', '_'));
                }
                try {
                    Thread.sleep(sleepTime);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

                try {
                    CsvWrite.writeDataLineByLine("ActionOne(Iteration:" + i + ") deleteManagement Start");
                    Optional<ManagementDto> managementDtoOptional = Optional.ofNullable(managementRepoService.getManagementById(i));
                    if(managementDtoOptional.isPresent()) {
                        managementRepoService.deleteManagement(i);
                    }
                    CsvWrite.writeDataLineByLine("ActionOne(Iteration:" + i + ") deleteManagement Completed");
                } catch (Exception e) {
                    CsvWrite.writeDataLineByLine("ActionOne(Iteration:" + i + ") Exception Deleting_Management" + e.getMessage().replace(' ', '_'));
                }
                try {
                    Thread.sleep(sleepTime);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

                try {
                    CsvWrite.writeDataLineByLine("ActionOne(Iteration:" + i + ") deleteParents Start");
                    Optional<ParentDto> parentDtoOptional = Optional.ofNullable(parentsRepoService.getParentById(i));
                    if(parentDtoOptional.isPresent()) {
                        parentsRepoService.deleteParent(i);
                    }
                    CsvWrite.writeDataLineByLine("ActionOne(Iteration:" + i + ") deleteParents Completed");
                } catch (Exception e) {
                    CsvWrite.writeDataLineByLine("ActionOne(Iteration:" + i + ") Exception Deleting_Parents" + e.getMessage().replace(' ', '_'));
                }
                try {
                    Thread.sleep(sleepTime);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

                try {
                    CsvWrite.writeDataLineByLine("ActionOne(Iteration:" + i + ") deleteSports Start");
                    Optional<SportDto> sportDtoOptional = Optional.ofNullable(sportsRepoService.getSportById(i));
                    if(sportDtoOptional.isPresent()) {
                        sportsRepoService.deleteSport(i);
                    }
                    CsvWrite.writeDataLineByLine("ActionOne(Iteration:" + i + ") deleteSports Completed");
                } catch (Exception e) {
                    CsvWrite.writeDataLineByLine("ActionOne(Iteration:" + i + ") Exception Deleting_Sports" + e.getMessage().replace(' ', '_'));
                }
                try {
                    Thread.sleep(sleepTime);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

                try {
                    CsvWrite.writeDataLineByLine("ActionOne(Iteration:" + i + ") deleteStudents Start");
                    Optional<StudentDto> studentDtoOptional = Optional.ofNullable(studentRepoService.getStudentById(i));
                    if(studentDtoOptional.isPresent()) {
                        studentRepoService.deleteStudent(i);
                    }
                    CsvWrite.writeDataLineByLine("ActionOne(Iteration:" + i + ") deleteStudents Completed");
                } catch (Exception e) {
                    CsvWrite.writeDataLineByLine("ActionOne(Iteration:" + i + ") Exception Deleting_Students" + e.getMessage().replace(' ', '_'));
                }
                try {
                    Thread.sleep(sleepTime);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

                try {
                    CsvWrite.writeDataLineByLine("ActionOne(Iteration:" + i + ") deleteTeacher Start");
                    Optional<TeacherDto> teacherDtoOptional = Optional.ofNullable(teacherRepoService.getTeacherById(i));
                    if(teacherDtoOptional.isPresent()) {
                        teacherRepoService.deleteTeacher(i);
                    }
                    CsvWrite.writeDataLineByLine("ActionOne(Iteration:" + i + ") deleteTeacher Completed");
                } catch (Exception e) {
                    CsvWrite.writeDataLineByLine("ActionOne(Iteration:" + i + ") Exception Deleting_Teacher" + e.getMessage().replace(' ', '_'));
                }
                try {
                    Thread.sleep(sleepTime);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

            if (i % 5 == 1) {
                try {
                    CsvWrite.writeDataLineByLine("ActionOne(Iteration:" + i + ") updateBooks Start");
                    Optional<BookDto> bookDtoOptional = Optional.ofNullable(booksRepoService.getBookById(i));
                    if(bookDtoOptional.isPresent()) {
                        BookDto bookDto = new BookDto();
                        bookDto.setBookName(MapperUtils.generateRandomString(10));
                        bookDto.setBookAuthor(MapperUtils.generateRandomString(15));
                        booksRepoService.updateBook(bookDto);
                    }
                    CsvWrite.writeDataLineByLine("ActionOne(Iteration:" + i + ") updateBooks Completed");
                } catch (Exception e) {
                    CsvWrite.writeDataLineByLine("ActionOne(Iteration:" + i + ") Exception Updating_Books" + e.getMessage().replace(' ', '_'));
                }
                try {
                    Thread.sleep(sleepTime);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

                try {
                    CsvWrite.writeDataLineByLine("ActionOne(Iteration:" + i + ") updateEvents Start");
                    Optional<EventDto> eventDtoOptional = Optional.ofNullable(eventsRepoService.getEventById(i));
                    if(eventDtoOptional.isPresent()) {
                        EventDto eventDto = new EventDto();
                        eventDto.setEventName(MapperUtils.generateRandomString(15));
                        eventDto.setEventOrganizer(MapperUtils.generateRandomString(15));
                        eventsRepoService.updateEvent(eventDto);
                    }
                    CsvWrite.writeDataLineByLine("ActionOne(Iteration:" + i + ") updateEvents Completed");
                } catch (Exception e) {
                    CsvWrite.writeDataLineByLine("ActionOne(Iteration:" + i + ") Exception Updating_Events" + e.getMessage().replace(' ', '_'));
                }
                try {
                    Thread.sleep(sleepTime);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

                try {
                    CsvWrite.writeDataLineByLine("ActionOne(Iteration:" + i + ") updateExams Start");
                    Optional<ExamDto> examDtoOptional = Optional.ofNullable(examsRepoService.getExamById(i));
                    if(examDtoOptional.isPresent()) {
                        ExamDto examDto = new ExamDto();
                        examDto.setExamName(MapperUtils.generateRandomString(10));
                        examDto.setExamResults("Pass");
                        examsRepoService.updateExam(examDto);
                    }
                    CsvWrite.writeDataLineByLine("ActionOne(Iteration:" + i + ") updateExams Completed");
                } catch (Exception e) {
                    CsvWrite.writeDataLineByLine("ActionOne(Iteration:" + i + ") Exception Updating_Exams" + e.getMessage().replace(' ', '_'));
                }
                try {
                    Thread.sleep(sleepTime);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

                try {
                    CsvWrite.writeDataLineByLine("ActionOne(Iteration:" + i + ") updateManagement Start");
                    Optional<ManagementDto> managementDtoOptional = Optional.ofNullable(managementRepoService.getManagementById(i));
                    if(managementDtoOptional.isPresent()) {
                        ManagementDto managementDto = new ManagementDto();
                        managementDto.setManagementName(MapperUtils.generateRandomString(20));
                        managementDto.setManagementHead(MapperUtils.generateRandomString(15));
                        managementRepoService.updateManagement(managementDto);
                    }
                    CsvWrite.writeDataLineByLine("ActionOne(Iteration:" + i + ") updateManagement Completed");
                } catch (Exception e) {
                    CsvWrite.writeDataLineByLine("ActionOne(Iteration:" + i + ") Exception Updating_Management" + e.getMessage().replace(' ', '_'));
                }
                try {
                    Thread.sleep(sleepTime);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

                try {
                    CsvWrite.writeDataLineByLine("ActionOne(Iteration:" + i + ") updateParents Start");
                    Optional<ParentDto> parentDtoOptional = Optional.ofNullable(parentsRepoService.getParentById(i));
                    if(parentDtoOptional.isPresent()) {
                        ParentDto parentDto = new ParentDto();
                        parentDto.setParentName(MapperUtils.generateRandomString(15));
                        parentDto.setParentFeedback(MapperUtils.generateRandomString(100));
                        parentsRepoService.updateParent(parentDto);
                    }
                    CsvWrite.writeDataLineByLine("ActionOne(Iteration:" + i + ") updateParents Completed");
                } catch (Exception e) {
                    CsvWrite.writeDataLineByLine("ActionOne(Iteration:" + i + ") Exception Updating_Parents" + e.getMessage().replace(' ', '_'));
                }
                try {
                    Thread.sleep(sleepTime);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

                try {
                    CsvWrite.writeDataLineByLine("ActionOne(Iteration:" + i + ") updateSports Start");
                    Optional<SportDto> sportDtoOptional = Optional.ofNullable(sportsRepoService.getSportById(i));
                    if(sportDtoOptional.isPresent()) {
                        SportDto sportDto = new SportDto();
                        sportDto.setSportName(MapperUtils.generateRandomString(15));
                        sportDto.setSportOrganizer(MapperUtils.generateRandomString(20));
                        sportsRepoService.updateSport(sportDto);
                    }
                    CsvWrite.writeDataLineByLine("ActionOne(Iteration:" + i + ") updateSports Completed");
                } catch (Exception e) {
                    CsvWrite.writeDataLineByLine("ActionOne(Iteration:" + i + ") Exception Updating_Sports" + e.getMessage().replace(' ', '_'));
                }
                try {
                    Thread.sleep(sleepTime);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

                try {
                    CsvWrite.writeDataLineByLine("ActionOne(Iteration:" + i + ") updateStudents Start");
                    Optional<StudentDto> studentDtoOptional = Optional.ofNullable(studentRepoService.getStudentById(i));
                    if(studentDtoOptional.isPresent()) {
                        StudentDto studentDto = new StudentDto();
                        studentDto.setStudentName(MapperUtils.generateRandomString(20));
                        studentDto.setRank("90");
                        studentRepoService.updateStudent(studentDto);
                    }
                    CsvWrite.writeDataLineByLine("ActionOne(Iteration:" + i + ") updateStudents Completed");
                } catch (Exception e) {
                    CsvWrite.writeDataLineByLine("ActionOne(Iteration:" + i + ") Exception Updating_Students" + e.getMessage().replace(' ', '_'));
                }
                try {
                    Thread.sleep(sleepTime);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

                try {
                    CsvWrite.writeDataLineByLine("ActionOne(Iteration:" + i + ") updateTeacher Start");
                    Optional<TeacherDto> teacherDtoOptional = Optional.ofNullable(teacherRepoService.getTeacherById(i));
                    if(teacherDtoOptional.isPresent()) {
                        TeacherDto teacherDto = new TeacherDto();
                        teacherDto.setTeacherName(MapperUtils.generateRandomString(20));
                        teacherDto.setSubject(MapperUtils.generateRandomString(10));
                        teacherRepoService.updateTeacher(teacherDto);
                    }
                    CsvWrite.writeDataLineByLine("ActionOne(Iteration:" + i + ") updateTeacher Completed");
                } catch (Exception e) {
                    CsvWrite.writeDataLineByLine("ActionOne(Iteration:" + i + ") Exception Updating_Teacher" + e.getMessage().replace(' ', '_'));
                }
                try {
                    Thread.sleep(sleepTime);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            else{
                try {
                    CsvWrite.writeDataLineByLine("ActionOne(Iteration:" + i + ") saveBooks Start");
                    BookDto bookDto = new BookDto();
                    bookDto.setBookName(MapperUtils.generateRandomString(20));
                    bookDto.setBookAuthor(MapperUtils.generateRandomString(20));
                    booksRepoService.saveBook(bookDto);
                    CsvWrite.writeDataLineByLine("ActionOne(Iteration:" + i + ") saveBooks Completed");
                } catch (Exception e) {
                    CsvWrite.writeDataLineByLine("ActionOne(Iteration:" + i + ") Exception Saving_Books" + e.getMessage().replace(' ', '_'));
                }
                try {
                    Thread.sleep(sleepTime);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

                try {
                    CsvWrite.writeDataLineByLine("ActionOne(Iteration:" + i + ") saveEvents Start");
                    EventDto eventDto = new EventDto();
                    eventDto.setEventName(MapperUtils.generateRandomString(15));
                    eventDto.setEventOrganizer(MapperUtils.generateRandomString(20));
                    eventsRepoService.saveEvent(eventDto);
                    CsvWrite.writeDataLineByLine("ActionOne(Iteration:" + i + ") saveEvents Completed");
                } catch (Exception e) {
                    CsvWrite.writeDataLineByLine("ActionOne(Iteration:" + i + ") Exception Saving_Events" + e.getMessage().replace(' ', '_'));
                }
                try {
                    Thread.sleep(sleepTime);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

                try {
                    CsvWrite.writeDataLineByLine("ActionOne(Iteration:" + i + ") saveExams Start");
                    ExamDto examDto = new ExamDto();
                    examDto.setExamName(MapperUtils.generateRandomString(20));
                    examDto.setExamResults(MapperUtils.generateRandomString(15));
                    examsRepoService.saveExam(examDto);
                    CsvWrite.writeDataLineByLine("ActionOne(Iteration:" + i + ") saveExams Completed");
                } catch (Exception e) {
                    CsvWrite.writeDataLineByLine("ActionOne(Iteration:" + i + ") Exception Saving_Exams" + e.getMessage().replace(' ', '_'));
                }
                try {
                    Thread.sleep(sleepTime);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

                try {
                    CsvWrite.writeDataLineByLine("ActionOne(Iteration:" + i + ") saveManagement Start");
                    ManagementDto managementDto = new ManagementDto();
                    managementDto.setManagementName(MapperUtils.generateRandomString(15));
                    managementDto.setManagementHead(MapperUtils.generateRandomString(15));
                    managementRepoService.saveManagement(managementDto);
                    CsvWrite.writeDataLineByLine("ActionOne(Iteration:" + i + ") saveManagement Completed");
                } catch (Exception e) {
                    CsvWrite.writeDataLineByLine("ActionOne(Iteration:" + i + ") Exception Saving_Management" + e.getMessage().replace(' ', '_'));
                }
                try {
                    Thread.sleep(sleepTime);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

                try {
                    CsvWrite.writeDataLineByLine("ActionOne(Iteration:" + i + ") saveParents Start");
                    ParentDto parentDto = new ParentDto();
                    parentDto.setParentName(MapperUtils.generateRandomString(15));
                    parentDto.setParentFeedback(MapperUtils.generateRandomString(100));
                    parentsRepoService.saveParent(parentDto);
                    CsvWrite.writeDataLineByLine("ActionOne(Iteration:" + i + ") saveParents Completed");
                } catch (Exception e) {
                    CsvWrite.writeDataLineByLine("ActionOne(Iteration:" + i + ") Exception Saving_Parents" + e.getMessage().replace(' ', '_'));
                }
                try {
                    Thread.sleep(sleepTime);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

                try {
                    CsvWrite.writeDataLineByLine("ActionOne(Iteration:" + i + ") saveSports Start");
                    SportDto sportDto = new SportDto();
                    sportDto.setSportName(MapperUtils.generateRandomString(15));
                    sportDto.setSportOrganizer(MapperUtils.generateRandomString(20));
                    sportsRepoService.saveSport(sportDto);
                    CsvWrite.writeDataLineByLine("ActionOne(Iteration:" + i + ") saveSports Completed");
                } catch (Exception e) {
                    CsvWrite.writeDataLineByLine("ActionOne(Iteration:" + i + ") Exception Saving_Sports" + e.getMessage().replace(' ', '_'));
                }
                try {
                    Thread.sleep(sleepTime);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

                try {
                    CsvWrite.writeDataLineByLine("ActionOne(Iteration:" + i + ") saveStudents Start");
                    StudentDto studentDto = new StudentDto();
                    studentDto.setStudentName(MapperUtils.generateRandomString(20));
                    studentDto.setRank("90");
                    studentRepoService.saveStudent(studentDto);
                    CsvWrite.writeDataLineByLine("ActionOne(Iteration:" + i + ") saveStudents Completed");
                } catch (Exception e) {
                    CsvWrite.writeDataLineByLine("ActionOne(Iteration:" + i + ") Exception Saving_Students" + e.getMessage().replace(' ', '_'));
                }
                try {
                    Thread.sleep(sleepTime);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

                try {
                    CsvWrite.writeDataLineByLine("ActionOne(Iteration:" + i + ") saveTeacher Start");
                    TeacherDto teacherDto = new TeacherDto();
                    teacherDto.setTeacherName(MapperUtils.generateRandomString(20));
                    teacherDto.setSubject(MapperUtils.generateRandomString(10));
                    teacherRepoService.saveTeacher(teacherDto);
                    CsvWrite.writeDataLineByLine("ActionOne(Iteration:" + i + ") saveTeacher Completed");
                } catch (Exception e) {
                    CsvWrite.writeDataLineByLine("ActionOne(Iteration:" + i + ") Exception Saving_Teacher" + e.getMessage().replace(' ', '_'));
                }
                try {
                    Thread.sleep(sleepTime);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }

    }

}
