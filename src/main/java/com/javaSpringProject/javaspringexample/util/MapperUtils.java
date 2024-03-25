package com.javaSpringProject.javaspringexample.util;

import com.javaSpringProject.javaspringexample.Dto.BookDto;
import com.javaSpringProject.javaspringexample.Dto.EventDto;
import com.javaSpringProject.javaspringexample.Dto.ExamDto;
import com.javaSpringProject.javaspringexample.Dto.ManagementDto;
import com.javaSpringProject.javaspringexample.Dto.ParentDto;
import com.javaSpringProject.javaspringexample.Dto.SportDto;
import com.javaSpringProject.javaspringexample.Dto.StudentDto;
import com.javaSpringProject.javaspringexample.Dto.TeacherDto;
import com.javaSpringProject.javaspringexample.Entity.Book;
import com.javaSpringProject.javaspringexample.Entity.Events;
import com.javaSpringProject.javaspringexample.Entity.Exams;
import com.javaSpringProject.javaspringexample.Entity.Management;
import com.javaSpringProject.javaspringexample.Entity.Parents;
import com.javaSpringProject.javaspringexample.Entity.Sports;
import com.javaSpringProject.javaspringexample.Entity.Student;
import com.javaSpringProject.javaspringexample.Entity.Teacher;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import org.apache.commons.collections4.CollectionUtils;
import org.modelmapper.ModelMapper;
import org.modelmapper.PropertyMap;
import org.modelmapper.convention.MatchingStrategies;

import java.util.Collection;
import java.util.Objects;
import java.util.Random;
import java.util.stream.Collectors;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class MapperUtils {

    private static final ModelMapper BOOK_TO_BOOK_DTO_MODEL_MAPPER;
    private static final ModelMapper BOOK_DTO_TO_BOOK_MODEL_MAPPER;

    private static final ModelMapper EVENT_TO_EVENT_DTO_MODEL_MAPPER;
    private static final ModelMapper EVENT_DTO_TO_EVENT_MODEL_MAPPER;

    private static final ModelMapper EXAMS_TO_EXAMS_DTO_MODEL_MAPPER;
    private static final ModelMapper EXAMS_DTO_TO_EXAMS_MODEL_MAPPER;

    private static final ModelMapper MANAGEMENT_TO_MANAGEMENT_DTO_MODEL_MAPPER;
    private static final ModelMapper MANAGEMENT_DTO_TO_MANAGEMENT_MODEL_MAPPER;

    private static final ModelMapper PARENT_TO_PARENT_DTO_MODEL_MAPPER;
    private static final ModelMapper PARENT_DTO_TO_PARENT_MODEL_MAPPER;

    private static final ModelMapper SPORTS_TO_SPORTS_DTO_MODEL_MAPPER;
    private static final ModelMapper SPORTS_DTO_TO_SPORTS_MODEL_MAPPER;

    private static final ModelMapper STUDENT_TO_STUDENT_DTO_MODEL_MAPPER;
    private static final ModelMapper STUDENT_DTO_TO_STUDENT_MODEL_MAPPER;

    private static final ModelMapper TEACHER_TO_TEACHER_DTO_MODEL_MAPPER;
    private static final ModelMapper TEACHER_DTO_TO_TEACHER_MODEL_MAPPER;


    static {
        BOOK_TO_BOOK_DTO_MODEL_MAPPER = new ModelMapper();
        BOOK_TO_BOOK_DTO_MODEL_MAPPER
                .getConfiguration()
                .setMatchingStrategy(MatchingStrategies.STRICT);
        PropertyMap<Book, BookDto> bookDtoPropertyMap = new PropertyMap<>() {
            @Override
            protected void configure() {
                map().setBookId(source.getBookId());
            }
        };

        BOOK_TO_BOOK_DTO_MODEL_MAPPER.addMappings(bookDtoPropertyMap);
        BOOK_DTO_TO_BOOK_MODEL_MAPPER = new ModelMapper();
        BOOK_DTO_TO_BOOK_MODEL_MAPPER
                .getConfiguration()
                .setMatchingStrategy(MatchingStrategies.STRICT);
        PropertyMap<BookDto, Book> bookPropertyMap = new PropertyMap<>() {
            @Override
            protected void configure() {
                map().setBookId(source.getBookId());
            }
        };
        BOOK_DTO_TO_BOOK_MODEL_MAPPER.addMappings(bookPropertyMap);
    }

    static {
        EVENT_TO_EVENT_DTO_MODEL_MAPPER = new ModelMapper();
        EVENT_TO_EVENT_DTO_MODEL_MAPPER
                .getConfiguration()
                .setMatchingStrategy(MatchingStrategies.STRICT);
        PropertyMap<Events, EventDto> eventDtoPropertyMap = new PropertyMap<>() {
            @Override
            protected void configure() {
                map().setEventId(source.getEventId());
            }
        };

        EVENT_TO_EVENT_DTO_MODEL_MAPPER.addMappings(eventDtoPropertyMap);
        EVENT_DTO_TO_EVENT_MODEL_MAPPER = new ModelMapper();
        EVENT_DTO_TO_EVENT_MODEL_MAPPER
                .getConfiguration()
                .setMatchingStrategy(MatchingStrategies.STRICT);
        PropertyMap<EventDto, Events> eventsPropertyMap = new PropertyMap<>() {
            @Override
            protected void configure() {
                map().setEventId(source.getEventId());
            }
        };
        EVENT_DTO_TO_EVENT_MODEL_MAPPER.addMappings(eventsPropertyMap);
    }

    static {
        EXAMS_TO_EXAMS_DTO_MODEL_MAPPER = new ModelMapper();
        EXAMS_TO_EXAMS_DTO_MODEL_MAPPER
                .getConfiguration()
                .setMatchingStrategy(MatchingStrategies.STRICT);
        PropertyMap<Exams, ExamDto> examDtoPropertyMap = new PropertyMap<>() {
            @Override
            protected void configure() {
                map().setExamId(source.getExamId());
            }
        };

        EXAMS_TO_EXAMS_DTO_MODEL_MAPPER.addMappings(examDtoPropertyMap);
        EXAMS_DTO_TO_EXAMS_MODEL_MAPPER = new ModelMapper();
        EXAMS_DTO_TO_EXAMS_MODEL_MAPPER
                .getConfiguration()
                .setMatchingStrategy(MatchingStrategies.STRICT);
        PropertyMap<Exams, ExamDto> examsPropertyMap = new PropertyMap<>() {
            @Override
            protected void configure() {
                map().setExamId(source.getExamId());
            }
        };
        EXAMS_DTO_TO_EXAMS_MODEL_MAPPER.addMappings(examsPropertyMap);
    }

    static {
        MANAGEMENT_TO_MANAGEMENT_DTO_MODEL_MAPPER = new ModelMapper();
        MANAGEMENT_TO_MANAGEMENT_DTO_MODEL_MAPPER
                .getConfiguration()
                .setMatchingStrategy(MatchingStrategies.STRICT);
        PropertyMap<Management, ManagementDto> managementDtoPropertyMap = new PropertyMap<>() {
            @Override
            protected void configure() {
                map().setManagementId(source.getManagementId());
            }
        };

        MANAGEMENT_TO_MANAGEMENT_DTO_MODEL_MAPPER.addMappings(managementDtoPropertyMap);
        MANAGEMENT_DTO_TO_MANAGEMENT_MODEL_MAPPER = new ModelMapper();
        MANAGEMENT_DTO_TO_MANAGEMENT_MODEL_MAPPER
                .getConfiguration()
                .setMatchingStrategy(MatchingStrategies.STRICT);
        PropertyMap<Management, ManagementDto> managementPropertyMap = new PropertyMap<>() {
            @Override
            protected void configure() {
                map().setManagementId(source.getManagementId());
            }
        };
        MANAGEMENT_DTO_TO_MANAGEMENT_MODEL_MAPPER.addMappings(managementPropertyMap);
    }

    static {
        PARENT_TO_PARENT_DTO_MODEL_MAPPER = new ModelMapper();
        PARENT_TO_PARENT_DTO_MODEL_MAPPER
                .getConfiguration()
                .setMatchingStrategy(MatchingStrategies.STRICT);
        PropertyMap<Parents, ParentDto> parentsDtoPropertyMap = new PropertyMap<>() {
            @Override
            protected void configure() {
                map().setParentId(source.getParentId());
            }
        };

        PARENT_TO_PARENT_DTO_MODEL_MAPPER.addMappings(parentsDtoPropertyMap);
        PARENT_DTO_TO_PARENT_MODEL_MAPPER = new ModelMapper();
        PARENT_DTO_TO_PARENT_MODEL_MAPPER
                .getConfiguration()
                .setMatchingStrategy(MatchingStrategies.STRICT);
        PropertyMap<Parents, ParentDto> parentsPropertyMap = new PropertyMap<>() {
            @Override
            protected void configure() {
                map().setParentId(source.getParentId());
            }
        };
        PARENT_DTO_TO_PARENT_MODEL_MAPPER.addMappings(parentsPropertyMap);
    }

    static {
        SPORTS_TO_SPORTS_DTO_MODEL_MAPPER = new ModelMapper();
        SPORTS_TO_SPORTS_DTO_MODEL_MAPPER
                .getConfiguration()
                .setMatchingStrategy(MatchingStrategies.STRICT);
        PropertyMap<Sports, SportDto> sportDtoPropertyMap = new PropertyMap<>() {
            @Override
            protected void configure() {
                map().setSportId(source.getSportId());
            }
        };

        SPORTS_TO_SPORTS_DTO_MODEL_MAPPER.addMappings(sportDtoPropertyMap);
        SPORTS_DTO_TO_SPORTS_MODEL_MAPPER = new ModelMapper();
        SPORTS_DTO_TO_SPORTS_MODEL_MAPPER
                .getConfiguration()
                .setMatchingStrategy(MatchingStrategies.STRICT);
        PropertyMap<Sports, SportDto> sportsPropertyMap = new PropertyMap<>() {
            @Override
            protected void configure() {
                map().setSportId(source.getSportId());
            }
        };
        SPORTS_DTO_TO_SPORTS_MODEL_MAPPER.addMappings(sportsPropertyMap);

    }

    static {
        STUDENT_TO_STUDENT_DTO_MODEL_MAPPER = new ModelMapper();
        STUDENT_TO_STUDENT_DTO_MODEL_MAPPER
                .getConfiguration()
                .setMatchingStrategy(MatchingStrategies.STRICT);
        PropertyMap<Student, StudentDto> studentDtoPropertyMap = new PropertyMap<>() {
            @Override
            protected void configure() {
                map().setStudentId(source.getStudentId());
            }
        };

        STUDENT_TO_STUDENT_DTO_MODEL_MAPPER.addMappings(studentDtoPropertyMap);
        STUDENT_DTO_TO_STUDENT_MODEL_MAPPER = new ModelMapper();
        STUDENT_DTO_TO_STUDENT_MODEL_MAPPER
                .getConfiguration()
                .setMatchingStrategy(MatchingStrategies.STRICT);
        PropertyMap<Student, StudentDto> studentPropertyMap = new PropertyMap<>() {
            @Override
            protected void configure() {
                map().setStudentId(source.getStudentId());
            }
        };
        STUDENT_DTO_TO_STUDENT_MODEL_MAPPER.addMappings(studentPropertyMap);
    }

    static {
        TEACHER_TO_TEACHER_DTO_MODEL_MAPPER = new ModelMapper();
        TEACHER_TO_TEACHER_DTO_MODEL_MAPPER
                .getConfiguration()
                .setMatchingStrategy(MatchingStrategies.STRICT);
        PropertyMap<Teacher, TeacherDto> teacherDtoPropertyMap = new PropertyMap<>() {
            @Override
            protected void configure() {
                map().setTeacherId(source.getTeacherId());
            }
        };

        TEACHER_TO_TEACHER_DTO_MODEL_MAPPER.addMappings(teacherDtoPropertyMap);
        TEACHER_DTO_TO_TEACHER_MODEL_MAPPER = new ModelMapper();
        TEACHER_DTO_TO_TEACHER_MODEL_MAPPER
                .getConfiguration()
                .setMatchingStrategy(MatchingStrategies.STRICT);
        PropertyMap<Teacher, TeacherDto> teacherPropertyMap = new PropertyMap<>() {
            @Override
            protected void configure() {
                map().setTeacherId(source.getTeacherId());
            }
        };
        EXAMS_DTO_TO_EXAMS_MODEL_MAPPER.addMappings(teacherPropertyMap);
    }

    public static BookDto convertBookEntityToBookDto(Book bookEntity) {
        if (Objects.isNull(bookEntity)) {
            return BookDto.builder().build();
        }
        return UtilsMapper.map(BOOK_TO_BOOK_DTO_MODEL_MAPPER, bookEntity, BookDto.class);
    }

    public static Collection<BookDto> convertBookEntityToBookDto(Collection<Book> bookEntities) {
        if (CollectionUtils.isEmpty(bookEntities)) {
            return CollectionUtils.emptyCollection();
        }
        return bookEntities.stream().filter(Objects::nonNull).map(book -> {
            return UtilsMapper.map(BOOK_TO_BOOK_DTO_MODEL_MAPPER, book, BookDto.class);
        }).collect(Collectors.toList());
    }

    public static Book convertBookDtoToBookEntity(BookDto bookDto) {
        if (Objects.isNull(bookDto)) {
            throw new IllegalArgumentException();
        }
        return UtilsMapper.map(BOOK_DTO_TO_BOOK_MODEL_MAPPER, bookDto, Book.class);
    }

    public static Collection<Book> convertBookDtoToBookEntity(Collection<BookDto> booksDto) {
        if (CollectionUtils.isEmpty(booksDto)) {
            throw new IllegalArgumentException();
        }
        return booksDto.stream().filter(Objects::nonNull).map(bookDto -> {
            return UtilsMapper.map(BOOK_TO_BOOK_DTO_MODEL_MAPPER, bookDto, Book.class);
        }).collect(Collectors.toList());
    }

    public static EventDto convertEventsEntityToEventsDto(Events eventEntity) {
        if (Objects.isNull(eventEntity)) {
            return EventDto.builder().build();
        }
        return UtilsMapper.map(EVENT_TO_EVENT_DTO_MODEL_MAPPER, eventEntity, EventDto.class);
    }

    public static Collection<EventDto> convertEventEntityToEventDto(Collection<Events> eventEntities) {
        if (CollectionUtils.isEmpty(eventEntities)) {
            return CollectionUtils.emptyCollection();
        }
        return eventEntities.stream().filter(Objects::nonNull).map(events -> {
            return UtilsMapper.map(EVENT_DTO_TO_EVENT_MODEL_MAPPER, events, EventDto.class);
        }).collect(Collectors.toList());
    }

    public static Events convertEventDtoToEventEntity(EventDto eventDto) {
        if (Objects.isNull(eventDto)) {
            throw new IllegalArgumentException();
        }
        return UtilsMapper.map(EVENT_DTO_TO_EVENT_MODEL_MAPPER, eventDto, Events.class);
    }

    public static ExamDto convertExamsEntityToExamsDto(Exams examsEntity) {
        if (Objects.isNull(examsEntity)) {
            return ExamDto.builder().build();
        }
        return UtilsMapper.map(EXAMS_TO_EXAMS_DTO_MODEL_MAPPER, examsEntity, ExamDto.class);
    }

    public static Collection<ExamDto> convertExamsEntityToExamsDto(Collection<Exams> examEntities) {
        if (CollectionUtils.isEmpty(examEntities)) {
            return CollectionUtils.emptyCollection();
        }
        return examEntities.stream().filter(Objects::nonNull).map(exams -> {
            return UtilsMapper.map(EXAMS_DTO_TO_EXAMS_MODEL_MAPPER, exams, ExamDto.class);
        }).collect(Collectors.toList());
    }

    public static Exams convertExamDtoToExamEntity(ExamDto examDto) {
        if (Objects.isNull(examDto)) {
            throw new IllegalArgumentException();
        }
        return UtilsMapper.map(EXAMS_DTO_TO_EXAMS_MODEL_MAPPER, examDto, Exams.class);
    }

    public static ManagementDto convertManagementEntityToManagementDto(Management managementEntity) {
        if (Objects.isNull(managementEntity)) {
            return ManagementDto.builder().build();
        }
        return UtilsMapper.map(MANAGEMENT_TO_MANAGEMENT_DTO_MODEL_MAPPER, managementEntity, ManagementDto.class);
    }

    public static Collection<ManagementDto> convertManagementEntityToManagementDto(Collection<Management> managementEntities) {
        if (CollectionUtils.isEmpty(managementEntities)) {
            return CollectionUtils.emptyCollection();
        }
        return managementEntities.stream().filter(Objects::nonNull).map(management -> {
            return UtilsMapper.map(MANAGEMENT_DTO_TO_MANAGEMENT_MODEL_MAPPER, management, ManagementDto.class);
        }).collect(Collectors.toList());
    }

    public static Management convertManagementDtoToManagementEntity(ManagementDto managementDto) {
        if (Objects.isNull(managementDto)) {
            throw new IllegalArgumentException();
        }
        return UtilsMapper.map(MANAGEMENT_DTO_TO_MANAGEMENT_MODEL_MAPPER, managementDto, Management.class);
    }


    public static ParentDto convertParentEntityToParentDto(Parents parentsEntity) {
        if (Objects.isNull(parentsEntity)) {
            return ParentDto.builder().build();
        }
        return UtilsMapper.map(PARENT_TO_PARENT_DTO_MODEL_MAPPER, parentsEntity, ParentDto.class);
    }

    public static Collection<ParentDto> convertParentEntityToParentDto(Collection<Parents> parentEntities) {
        if (CollectionUtils.isEmpty(parentEntities)) {
            return CollectionUtils.emptyCollection();
        }
        return parentEntities.stream().filter(Objects::nonNull).map(parents -> {
            return UtilsMapper.map(PARENT_DTO_TO_PARENT_MODEL_MAPPER, parents, ParentDto.class);
        }).collect(Collectors.toList());
    }

    public static Parents convertParentDtoToParentEntity(ParentDto parentDto) {
        if (Objects.isNull(parentDto)) {
            throw new IllegalArgumentException();
        }
        return UtilsMapper.map(PARENT_DTO_TO_PARENT_MODEL_MAPPER, parentDto, Parents.class);
    }


    public static SportDto convertSportsEntityToSportsDto(Sports sportsEntity) {
        if (Objects.isNull(sportsEntity)) {
            return SportDto.builder().build();
        }
        return UtilsMapper.map(SPORTS_TO_SPORTS_DTO_MODEL_MAPPER, sportsEntity, SportDto.class);
    }

    public static Collection<SportDto> convertSportsEntityToSportsDto(Collection<Sports> sportsEntities) {
        if (CollectionUtils.isEmpty(sportsEntities)) {
            return CollectionUtils.emptyCollection();
        }
        return sportsEntities.stream().filter(Objects::nonNull).map(sports -> {
            return UtilsMapper.map(SPORTS_DTO_TO_SPORTS_MODEL_MAPPER, sports, SportDto.class);
        }).collect(Collectors.toList());
    }

    public static Sports convertSportsDtoToSportsEntity(SportDto sportDto) {
        if (Objects.isNull(sportDto)) {
            throw new IllegalArgumentException();
        }
        return UtilsMapper.map(SPORTS_DTO_TO_SPORTS_MODEL_MAPPER, sportDto, Sports.class);
    }

    public static StudentDto convertStudentEntityToStudentDto(Student studentEntity) {
        if (Objects.isNull(studentEntity)) {
            return StudentDto.builder().build();
        }
        return UtilsMapper.map(STUDENT_TO_STUDENT_DTO_MODEL_MAPPER, studentEntity, StudentDto.class);
    }

    public static Collection<StudentDto> convertStudentEntityToStudentDto(Collection<Student> studentEntities) {
        if (CollectionUtils.isEmpty(studentEntities)) {
            return CollectionUtils.emptyCollection();
        }
        return studentEntities.stream().filter(Objects::nonNull).map(student -> {
            return UtilsMapper.map(STUDENT_DTO_TO_STUDENT_MODEL_MAPPER, student, StudentDto.class);
        }).collect(Collectors.toList());
    }

    public static Student convertStudentDtoToStudentEntity(StudentDto studentDto) {
        if (Objects.isNull(studentDto)) {
            throw new IllegalArgumentException();
        }
        return UtilsMapper.map(STUDENT_DTO_TO_STUDENT_MODEL_MAPPER, studentDto, Student.class);
    }
    public static TeacherDto convertTeacherEntityToTeacherDto(Teacher teacherEntity) {
        if (Objects.isNull(teacherEntity)) {
            return TeacherDto.builder().build();
        }
        return UtilsMapper.map(TEACHER_TO_TEACHER_DTO_MODEL_MAPPER, teacherEntity, TeacherDto.class);
    }

    public static Collection<TeacherDto> convertTeacherEntityToTeacherDto(Collection<Teacher> teacherEntities) {
        if (CollectionUtils.isEmpty(teacherEntities)) {
            return CollectionUtils.emptyCollection();
        }
        return teacherEntities.stream().filter(Objects::nonNull).map(teacher -> {
            return UtilsMapper.map(TEACHER_DTO_TO_TEACHER_MODEL_MAPPER, teacher, TeacherDto.class);
        }).collect(Collectors.toList());
    }

    public static Teacher convertTeacherDtoToTeacherEntity(TeacherDto teacherDto) {
        if (Objects.isNull(teacherDto)) {
            throw new IllegalArgumentException();
        }
        return UtilsMapper.map(TEACHER_DTO_TO_TEACHER_MODEL_MAPPER, teacherDto, Teacher.class);
    }

    public static String generateRandomString(int length) {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder randomString = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            int randomIndex = random.nextInt(characters.length());
            randomString.append(characters.charAt(randomIndex));
        }
        return randomString.toString();
    }

}
