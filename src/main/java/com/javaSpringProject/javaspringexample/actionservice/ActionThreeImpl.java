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
import com.javaSpringProject.javaspringexample.util.MapperUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Optional;

@Service
public class ActionThreeImpl {
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


    public void getAllDetails(Integer iter) {
        Collection<Collection<Book>> books = new ArrayList<>(iter);
        Collection<Collection<com.javaSpringProject.javaspringexample.Entity.Events>> events = new ArrayList<>(iter);
        Collection<Collection<Exams>> exams = new ArrayList<>(iter);
        Collection<Collection<Management>> managements = new ArrayList<>(iter);
        Collection<Collection<Parents>> parents = new ArrayList<>(iter);
        Collection<Collection<Sports>> sports = new ArrayList<>(iter);
        Collection<Collection<Student>> students = new ArrayList<>(iter);
        Collection<Collection<Teacher>> teachers = new ArrayList<>(iter);
        for (int i = 0; i < iter; i++) {
            try {
                CsvWrite.writeDataLineByLine("ActionThree(Iteration:" + i + ") getBooks Start");
                books.add(booksService.getBooks());
                CsvWrite.writeDataLineByLine("ActionThree(Iteration:" + i + ") getBooks Completed");
            } catch (Exception e) {
                CsvWrite.writeDataLineByLine("ActionThree(Iteration:" + i + ") Exception Fetching_Books" + e.getMessage().replace(' ', '_'));
            }
            try {
                Thread.sleep(sleepTime);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            try {
                CsvWrite.writeDataLineByLine("ActionThree(Iteration:" + i + ") getEvents Start");
                events.add(eventsService.getEvents());
                CsvWrite.writeDataLineByLine("ActionThree(Iteration:" + i + ") getEvents Completed");
            } catch (Exception e) {
                CsvWrite.writeDataLineByLine("ActionThree(Iteration:" + i + ") Exception Fetching_Events" + e.getMessage().replace(' ', '_'));
            }
            try {
                Thread.sleep(sleepTime);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            try {
                CsvWrite.writeDataLineByLine("ActionThree(Iteration:" + i + ") getExams Start");
                exams.add(examsService.getExams());
                CsvWrite.writeDataLineByLine("ActionThree(Iteration:" + i + ") getExams Completed");
            } catch (Exception e) {
                CsvWrite.writeDataLineByLine("ActionThree(Iteration:" + i + ") Exception Fetching_Exams" + e.getMessage().replace(' ', '_'));
            }
            try {
                Thread.sleep(sleepTime);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            try {
                CsvWrite.writeDataLineByLine("ActionThree(Iteration:" + i + ") getManagement Start");
                managements.add(managementService.getManagement());
                CsvWrite.writeDataLineByLine("ActionThree(Iteration:" + i + ") getManagement Completed");
            } catch (Exception e) {
                CsvWrite.writeDataLineByLine("ActionThree(Iteration:" + i + ") Exception Fetching_Management" + e.getMessage().replace(' ', '_'));
            }
            try {
                Thread.sleep(sleepTime);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            try {
                CsvWrite.writeDataLineByLine("ActionThree(Iteration:" + i + ") getParents Start");
                parents.add(parentsService.getParents());
                CsvWrite.writeDataLineByLine("ActionThree(Iteration:" + i + ") getParents Completed");
            } catch (Exception e) {
                CsvWrite.writeDataLineByLine("ActionThree(Iteration:" + i + ") Exception Fetching_Parents" + e.getMessage().replace(' ', '_'));
            }
            try {
                Thread.sleep(sleepTime);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            try {
                CsvWrite.writeDataLineByLine("ActionThree(Iteration:" + i + ") getSports Start");
                sports.add(sportsService.getSports());
                CsvWrite.writeDataLineByLine("ActionThree(Iteration:" + i + ") getSports Completed");
            } catch (Exception e) {
                CsvWrite.writeDataLineByLine("ActionThree(Iteration:" + i + ") Exception Fetching_Sports" + e.getMessage().replace(' ', '_'));
            }
            try {
                Thread.sleep(sleepTime);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            try {
                CsvWrite.writeDataLineByLine("ActionThree(Iteration:" + i + ") getStudents Start");
                students.add(studentService.getStudents());
                CsvWrite.writeDataLineByLine("ActionThree(Iteration:" + i + ") getStudents Completed");
            } catch (Exception e) {
                CsvWrite.writeDataLineByLine("ActionThree(Iteration:" + i + ") Exception Fetching_Students" + e.getMessage().replace(' ', '_'));
            }
            try {
                Thread.sleep(sleepTime);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            try {
                CsvWrite.writeDataLineByLine("ActionThree(Iteration:" + i + ") getTeacher Start");
                teachers.add(teacherService.getTeachers());
                CsvWrite.writeDataLineByLine("ActionThree(Iteration:" + i + ") getTeacher Completed");
            } catch (Exception e) {
                CsvWrite.writeDataLineByLine("ActionThree(Iteration:" + i + ") Exception Fetching_Teacher" + e.getMessage().replace(' ', '_'));
            }
            try {
                Thread.sleep(sleepTime);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void getAllDetails() {
        try {
            CsvWrite.writeDataLineByLine("ActionThree getBooks Start");
            Collection<Book> books = booksService.getBooks();
            CsvWrite.writeDataLineByLine("ActionThree getBooks Completed");
        } catch (Exception e) {
            CsvWrite.writeDataLineByLine("ActionThree Exception Fetching_Books" + e.getMessage().replace(' ', '_'));
        }
        try {
            Thread.sleep(sleepTime);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        try {
            CsvWrite.writeDataLineByLine("ActionThree getEvents Start");
            Collection<com.javaSpringProject.javaspringexample.Entity.Events> events = eventsService.getEvents();
            CsvWrite.writeDataLineByLine("ActionThree getEvents Completed");
        } catch (Exception e) {
            CsvWrite.writeDataLineByLine("ActionThree Exception Fetching_Events" + e.getMessage().replace(' ', '_'));
        }
        try {
            Thread.sleep(sleepTime);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        try {
            CsvWrite.writeDataLineByLine("ActionThree getExams Start");
            Collection<Exams> exams = examsService.getExams();
            CsvWrite.writeDataLineByLine("ActionThree getExams Completed");
        } catch (Exception e) {
            CsvWrite.writeDataLineByLine("ActionThree Exception Fetching_Exams" + e.getMessage().replace(' ', '_'));
        }
        try {
            Thread.sleep(sleepTime);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        try {
            CsvWrite.writeDataLineByLine("ActionThree getManagement Start");
            Collection<Management> managements = managementService.getManagement();
            CsvWrite.writeDataLineByLine("ActionThree getManagement Completed");
        } catch (Exception e) {
            CsvWrite.writeDataLineByLine("ActionThree Exception Fetching_Management" + e.getMessage().replace(' ', '_'));
        }
        try {
            Thread.sleep(sleepTime);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        try {
            CsvWrite.writeDataLineByLine("ActionThree getParents Start");
            Collection<Parents> parents = parentsService.getParents();
            CsvWrite.writeDataLineByLine("ActionThree getParents Completed");
        } catch (Exception e) {
            CsvWrite.writeDataLineByLine("ActionThree Exception Fetching_Parents" + e.getMessage().replace(' ', '_'));
        }
        try {
            Thread.sleep(sleepTime);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        try {
            CsvWrite.writeDataLineByLine("ActionThree getSports Start");
            Collection<Sports> sports = sportsService.getSports();
            CsvWrite.writeDataLineByLine("ActionThree getSports Completed");
        } catch (Exception e) {
            CsvWrite.writeDataLineByLine("ActionThree Exception Fetching_Sports" + e.getMessage().replace(' ', '_'));
        }
        try {
            Thread.sleep(sleepTime);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        try {
            CsvWrite.writeDataLineByLine("ActionThree getStudents Start");
            Collection<Student> students = studentService.getStudents();
            CsvWrite.writeDataLineByLine("ActionThree getStudents Completed");
        } catch (Exception e) {
            CsvWrite.writeDataLineByLine("ActionThree Exception Fetching_Students" + e.getMessage().replace(' ', '_'));
        }
        try {
            Thread.sleep(sleepTime);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        try {
            CsvWrite.writeDataLineByLine("ActionThree getTeachers Start");
            Collection<Teacher> teachers = teacherService.getTeachers();
            CsvWrite.writeDataLineByLine("ActionThree getTeachers Completed");
        } catch (Exception e) {
            CsvWrite.writeDataLineByLine("ActionThree Exception Fetching_Teachers" + e.getMessage().replace(' ', '_'));
        }
        try {
            Thread.sleep(sleepTime);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void allOperations(Integer iter) {
        for (int i = 1; i <= iter; i++) {
            if (i % 5 == 0) {
                try {
                    CsvWrite.writeDataLineByLine("ActionThree(Iteration:" + i + ") deleteBooks Start");
                    Optional<Book> bookOptional = booksService.getBookById(i);
                    if (bookOptional.isPresent()) {
                        booksService.deleteBook(i);
                    }
                    CsvWrite.writeDataLineByLine("ActionThree(Iteration:" + i + ") deleteBooks Completed");
                } catch (Exception e) {
                    CsvWrite.writeDataLineByLine("ActionThree(Iteration:" + i + ") Exception Deleting_Books" + e.getMessage().replace(' ', '_'));
                }
                try {
                    Thread.sleep(sleepTime);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

                try {
                    CsvWrite.writeDataLineByLine("ActionThree(Iteration:" + i + ") deleteEvents Start");
                    Optional<com.javaSpringProject.javaspringexample.Entity.Events> eventOptional = eventsService.getEventsById(i);
                    if (eventOptional.isPresent()) {
                        eventsService.deleteEvents(i);
                    }
                    CsvWrite.writeDataLineByLine("ActionThree(Iteration:" + i + ") deleteEvents Completed");
                } catch (Exception e) {
                    CsvWrite.writeDataLineByLine("ActionThree(Iteration:" + i + ") Exception Deleting_Events" + e.getMessage().replace(' ', '_'));
                }
                try {
                    Thread.sleep(sleepTime);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

                try {
                    CsvWrite.writeDataLineByLine("ActionThree(Iteration:" + i + ") deleteExams Start");
                    Optional<Exams> exams = examsService.getExamsById(i);
                    if (exams.isPresent()) {
                        examsService.deleteExam(i);
                    }
                    CsvWrite.writeDataLineByLine("ActionThree(Iteration:" + i + ") deleteExams Completed");
                } catch (Exception e) {
                    CsvWrite.writeDataLineByLine("ActionThree(Iteration:" + i + ") Exception Deleting_Exams" + e.getMessage().replace(' ', '_'));
                }
                try {
                    Thread.sleep(sleepTime);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

                try {
                    CsvWrite.writeDataLineByLine("ActionThree(Iteration:" + i + ") deleteManagement Start");
                    Optional<Management> management = managementService.getManagementById(i);
                    if (management.isPresent()) {
                        managementService.deleteManagement(i);
                    }
                    CsvWrite.writeDataLineByLine("ActionThree(Iteration:" + i + ") deleteManagement Completed");
                } catch (Exception e) {
                    CsvWrite.writeDataLineByLine("ActionThree(Iteration:" + i + ") Exception Deleting_Management" + e.getMessage().replace(' ', '_'));
                }
                try {
                    Thread.sleep(sleepTime);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

                try {
                    CsvWrite.writeDataLineByLine("ActionThree(Iteration:" + i + ") deleteParents Start");
                    Optional<Parents> parent = parentsService.getParentById(i);
                    if (parent.isPresent()) {
                        parentsService.deleteParent(i);
                    }
                    CsvWrite.writeDataLineByLine("ActionThree(Iteration:" + i + ") deleteParents Completed");
                } catch (Exception e) {
                    CsvWrite.writeDataLineByLine("ActionThree(Iteration:" + i + ") Exception Deleting_Parents" + e.getMessage().replace(' ', '_'));
                }
                try {
                    Thread.sleep(sleepTime);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

                try {
                    CsvWrite.writeDataLineByLine("ActionThree(Iteration:" + i + ") deleteSports Start");
                    Optional<Sports> sport = sportsService.getSportById(i);
                    if (sport.isPresent()) {
                        sportsService.deleteSports(i);
                    }
                    CsvWrite.writeDataLineByLine("ActionThree(Iteration:" + i + ") deleteSports Completed");
                } catch (Exception e) {
                    CsvWrite.writeDataLineByLine("ActionThree(Iteration:" + i + ") Exception Deleting_Sports" + e.getMessage().replace(' ', '_'));
                }
                try {
                    Thread.sleep(sleepTime);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

                try {
                    CsvWrite.writeDataLineByLine("ActionThree(Iteration:" + i + ") deleteStudents Start");
                    Optional<Student> student = studentService.getStudentById(i);
                    if (student.isPresent()) {
                        studentService.deleteStudent(i);
                    }
                    CsvWrite.writeDataLineByLine("ActionThree(Iteration:" + i + ") deleteStudents Completed");
                } catch (Exception e) {
                    CsvWrite.writeDataLineByLine("ActionThree(Iteration:" + i + ") Exception Deleting_Students" + e.getMessage().replace(' ', '_'));
                }
                try {
                    Thread.sleep(sleepTime);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

                try {
                    CsvWrite.writeDataLineByLine("ActionThree(Iteration:" + i + ") deleteTeacher Start");
                    Optional<Teacher> teacher = teacherService.getTeacherById(i);
                    if (teacher.isPresent()) {
                        teacherService.deleteTeacher(i);
                    }
                    CsvWrite.writeDataLineByLine("ActionThree(Iteration:" + i + ") deleteTeacher Completed");
                } catch (Exception e) {
                    CsvWrite.writeDataLineByLine("ActionThree(Iteration:" + i + ") Exception Deleting_Teacher" + e.getMessage().replace(' ', '_'));
                }
                try {
                    Thread.sleep(sleepTime);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            } else if (i % 5 == 1) {
                try {
                    CsvWrite.writeDataLineByLine("ActionThree(Iteration:" + i + ") updateBooks Start");
                    Optional<Book> book = booksService.getBookById(i);
                    if (book.isPresent()) {
                        Book book1 = book.get();
                        book1.setBookName(MapperUtils.generateRandomString(10));
                        book1.setBookAuthor(MapperUtils.generateRandomString(15));
                        booksService.updateBook(book1);
                    }
                    CsvWrite.writeDataLineByLine("ActionThree(Iteration:" + i + ") updateBooks Completed");
                } catch (Exception e) {
                    CsvWrite.writeDataLineByLine("ActionThree(Iteration:" + i + ") Exception Updating_Books" + e.getMessage().replace(' ', '_'));
                }
                try {
                    Thread.sleep(sleepTime);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

                try {
                    CsvWrite.writeDataLineByLine("ActionThree(Iteration:" + i + ") updateEvents Start");
                    Optional<com.javaSpringProject.javaspringexample.Entity.Events> events = eventsService.getEventsById(i);
                    if (events.isPresent()) {
                        com.javaSpringProject.javaspringexample.Entity.Events events1 = events.get();
                        events1.setEventName(MapperUtils.generateRandomString(15));
                        events1.setEventOrganizer(MapperUtils.generateRandomString(15));
                        eventsService.updateEvents(events1);
                    }
                    CsvWrite.writeDataLineByLine("ActionThree(Iteration:" + i + ") updateEvents Completed");
                } catch (Exception e) {
                    CsvWrite.writeDataLineByLine("ActionThree(Iteration:" + i + ") Exception Updating_Events" + e.getMessage().replace(' ', '_'));
                }
                try {
                    Thread.sleep(sleepTime);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

                try {
                    CsvWrite.writeDataLineByLine("ActionThree(Iteration:" + i + ") updateExams Start");
                    Optional<Exams> exams = examsService.getExamsById(i);
                    if (exams.isPresent()) {
                        Exams exams1 = exams.get();
                        exams1.setExamName(MapperUtils.generateRandomString(10));
                        exams1.setExamResults("Pass");
                        examsService.updateExam(exams1);
                    }
                    CsvWrite.writeDataLineByLine("ActionThree(Iteration:" + i + ") updateExams Completed");
                } catch (Exception e) {
                    CsvWrite.writeDataLineByLine("ActionThree(Iteration:" + i + ") Exception Updating_Exams" + e.getMessage().replace(' ', '_'));
                }
                try {
                    Thread.sleep(sleepTime);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

                try {
                    CsvWrite.writeDataLineByLine("ActionThree(Iteration:" + i + ") updateManagement Start");
                    Optional<Management> management = managementService.getManagementById(i);
                    if (management.isPresent()) {
                        Management management1 = management.get();
                        management1.setManagementName(MapperUtils.generateRandomString(20));
                        management1.setManagementHead(MapperUtils.generateRandomString(15));
                        managementService.updateManagement(management1);
                    }
                    CsvWrite.writeDataLineByLine("ActionThree(Iteration:" + i + ") updateManagement Completed");
                } catch (Exception e) {
                    CsvWrite.writeDataLineByLine("ActionThree(Iteration:" + i + ") Exception Updating_Management" + e.getMessage().replace(' ', '_'));
                }
                try {
                    Thread.sleep(sleepTime);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

                try {
                    CsvWrite.writeDataLineByLine("ActionThree(Iteration:" + i + ") updateParents Start");
                    Optional<Parents> parent = parentsService.getParentById(i);
                    if (parent.isPresent()) {
                        Parents parents = parent.get();
                        parents.setParentName(MapperUtils.generateRandomString(15));
                        parents.setParentFeedback(MapperUtils.generateRandomString(50));
                        parentsService.updateParent(parents);
                    }
                    CsvWrite.writeDataLineByLine("ActionThree(Iteration:" + i + ") updateParents Completed");
                } catch (Exception e) {
                    CsvWrite.writeDataLineByLine("ActionThree(Iteration:" + i + ") Exception Updating_Parents" + e.getMessage().replace(' ', '_'));
                }
                try {
                    Thread.sleep(sleepTime);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

                try {
                    CsvWrite.writeDataLineByLine("ActionThree(Iteration:" + i + ") updateSports Start");
                    Optional<Sports> sport = sportsService.getSportById(i);
                    if (sport.isPresent()) {
                        Sports sports = sport.get();
                        sports.setSportName(MapperUtils.generateRandomString(15));
                        sports.setSportOrganizer(MapperUtils.generateRandomString(20));
                        sportsService.updateSport(sports);
                    }
                    CsvWrite.writeDataLineByLine("ActionThree(Iteration:" + i + ") updateSports Completed");
                } catch (Exception e) {
                    CsvWrite.writeDataLineByLine("ActionThree(Iteration:" + i + ") Exception Updating_Sports" + e.getMessage().replace(' ', '_'));
                }
                try {
                    Thread.sleep(sleepTime);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

                try {
                    CsvWrite.writeDataLineByLine("ActionThree(Iteration:" + i + ") updateStudents Start");
                    Optional<Student> student = studentService.getStudentById(i);
                    if (student.isPresent()) {
                        Student student1 = student.get();
                        student1.setStudentName(MapperUtils.generateRandomString(20));
                        student1.setRank("90");
                        studentService.updateStudent(student1);
                    }
                    CsvWrite.writeDataLineByLine("ActionThree(Iteration:" + i + ") updateStudents Completed");
                } catch (Exception e) {
                    CsvWrite.writeDataLineByLine("ActionThree(Iteration:" + i + ") Exception Updating_Students" + e.getMessage().replace(' ', '_'));
                }
                try {
                    Thread.sleep(sleepTime);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

                try {
                    CsvWrite.writeDataLineByLine("ActionThree(Iteration:" + i + ") updateTeacher Start");
                    Optional<Teacher> teacher = teacherService.getTeacherById(i);
                    if (teacher.isPresent()) {
                        Teacher teacher1 = teacher.get();
                        teacher1.setTeacherName(MapperUtils.generateRandomString(20));
                        teacher1.setSubject(MapperUtils.generateRandomString(10));
                        teacherService.updateTeacher(teacher1);
                    }
                    CsvWrite.writeDataLineByLine("ActionThree(Iteration:" + i + ") updateTeacher Completed");
                } catch (Exception e) {
                    CsvWrite.writeDataLineByLine("ActionThree(Iteration:" + i + ") Exception Updating_Teacher" + e.getMessage().replace(' ', '_'));
                }
                try {
                    Thread.sleep(sleepTime);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            } else {
                try {
                    CsvWrite.writeDataLineByLine("ActionThree(Iteration:" + i + ") saveBooks Start");
                    Book book = new Book();
                    book.setBookName(MapperUtils.generateRandomString(20));
                    book.setBookAuthor(MapperUtils.generateRandomString(20));
                    booksService.saveBook(book);
                    CsvWrite.writeDataLineByLine("ActionThree(Iteration:" + i + ") saveBooks Completed");
                } catch (Exception e) {
                    CsvWrite.writeDataLineByLine("ActionThree(Iteration:" + i + ") Exception Saving_Books" + e.getMessage().replace(' ', '_'));
                }
                try {
                    Thread.sleep(sleepTime);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

                try {
                    CsvWrite.writeDataLineByLine("ActionThree(Iteration:" + i + ") saveEvents Start");
                    Events events = new Events();
                    events.setEventName(MapperUtils.generateRandomString(15));
                    events.setEventOrganizer(MapperUtils.generateRandomString(20));
                    eventsService.saveEvent(events);
                    CsvWrite.writeDataLineByLine("ActionThree(Iteration:" + i + ") saveEvents Completed");
                } catch (Exception e) {
                    CsvWrite.writeDataLineByLine("ActionThree(Iteration:" + i + ") Exception Saving_Events" + e.getMessage().replace(' ', '_'));
                }
                try {
                    Thread.sleep(sleepTime);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

                try {
                    CsvWrite.writeDataLineByLine("ActionThree(Iteration:" + i + ") saveExams Start");
                    Exams exams = new Exams();
                    exams.setExamName(MapperUtils.generateRandomString(20));
                    exams.setExamResults(MapperUtils.generateRandomString(15));
                    examsService.saveExam(exams);
                    CsvWrite.writeDataLineByLine("ActionThree(Iteration:" + i + ") saveExams Completed");
                } catch (Exception e) {
                    CsvWrite.writeDataLineByLine("ActionThree(Iteration:" + i + ") Exception Saving_Exams" + e.getMessage().replace(' ', '_'));
                }
                try {
                    Thread.sleep(sleepTime);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

                try {
                    CsvWrite.writeDataLineByLine("ActionThree(Iteration:" + i + ") saveManagement Start");
                    Management management = new Management();
                    management.setManagementName(MapperUtils.generateRandomString(15));
                    management.setManagementHead(MapperUtils.generateRandomString(15));
                    managementService.saveManagement(management);
                    CsvWrite.writeDataLineByLine("ActionThree(Iteration:" + i + ") saveManagement Completed");
                } catch (Exception e) {
                    CsvWrite.writeDataLineByLine("ActionThree(Iteration:" + i + ") Exception Saving_Management" + e.getMessage().replace(' ', '_'));
                }
                try {
                    Thread.sleep(sleepTime);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

                try {
                    CsvWrite.writeDataLineByLine("ActionThree(Iteration:" + i + ") saveParents Start");
                    Parents parents = new Parents();
                    parents.setParentName(MapperUtils.generateRandomString(15));
                    parents.setParentFeedback(MapperUtils.generateRandomString(50));
                    parentsService.saveParents(parents);
                    CsvWrite.writeDataLineByLine("ActionThree(Iteration:" + i + ") saveParents Completed");
                } catch (Exception e) {
                    CsvWrite.writeDataLineByLine("ActionThree(Iteration:" + i + ") Exception Saving_Parents" + e.getMessage().replace(' ', '_'));
                }
                try {
                    Thread.sleep(sleepTime);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

                try {
                    CsvWrite.writeDataLineByLine("ActionThree(Iteration:" + i + ") saveSports Start");
                    Sports sports = new Sports();
                    sports.setSportName(MapperUtils.generateRandomString(15));
                    sports.setSportOrganizer(MapperUtils.generateRandomString(20));
                    sportsService.saveSport(sports);
                    CsvWrite.writeDataLineByLine("ActionThree(Iteration:" + i + ") saveSports Completed");
                } catch (Exception e) {
                    CsvWrite.writeDataLineByLine("ActionThree(Iteration:" + i + ") Exception Saving_Sports" + e.getMessage().replace(' ', '_'));
                }
                try {
                    Thread.sleep(sleepTime);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

                try {
                    CsvWrite.writeDataLineByLine("ActionThree(Iteration:" + i + ") saveStudents Start");
                    Student student = new Student();
                    student.setStudentName(MapperUtils.generateRandomString(20));
                    student.setRank("90");
                    studentService.saveStudent(student);
                    CsvWrite.writeDataLineByLine("ActionThree(Iteration:" + i + ") saveStudents Completed");
                } catch (Exception e) {
                    CsvWrite.writeDataLineByLine("ActionThree(Iteration:" + i + ") Exception Saving_Students" + e.getMessage().replace(' ', '_'));
                }
                try {
                    Thread.sleep(sleepTime);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

                try {
                    CsvWrite.writeDataLineByLine("ActionThree(Iteration:" + i + ") saveTeacher Start");
                    Teacher teacher = new Teacher();
                    teacher.setTeacherName(MapperUtils.generateRandomString(20));
                    teacher.setSubject(MapperUtils.generateRandomString(10));
                    teacherService.saveTeacher(teacher);
                    CsvWrite.writeDataLineByLine("ActionThree(Iteration:" + i + ") saveTeacher Completed");
                } catch (Exception e) {
                    CsvWrite.writeDataLineByLine("ActionThree(Iteration:" + i + ") Exception Saving_Teacher" + e.getMessage().replace(' ', '_'));
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
