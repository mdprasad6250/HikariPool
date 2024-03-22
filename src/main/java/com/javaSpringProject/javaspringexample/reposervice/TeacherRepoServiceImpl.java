package com.javaSpringProject.javaspringexample.reposervice;

import com.javaSpringProject.javaspringexample.Dto.TeacherDto;
import com.javaSpringProject.javaspringexample.Entity.Teacher;
import com.javaSpringProject.javaspringexample.repository.TeacherRepo;
import com.javaSpringProject.javaspringexample.util.MapperUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Optional;

@Service
public class TeacherRepoServiceImpl {
    @Autowired
    TeacherRepo teacherRepo;

    public TeacherDto saveTeacher(TeacherDto teacherDto) {
        Teacher teacher = MapperUtils.convertTeacherDtoToTeacherEntity(teacherDto);
        return MapperUtils.convertTeacherEntityToTeacherDto(teacherRepo.save(teacher));
    }

    public Collection<TeacherDto> getTeacher() {

        return MapperUtils.convertTeacherEntityToTeacherDto(teacherRepo.findAll());
    }

    public TeacherDto getTeacherById(int teacherId) {
        Optional<Teacher> teacher = teacherRepo.findById(teacherId);
        if (teacher.isPresent())
            return MapperUtils.convertTeacherEntityToTeacherDto(teacher.get());
        return TeacherDto.builder().build();
    }

    public Optional<TeacherDto> updateTeacher(TeacherDto teacherDto) {
        Teacher teacher1 = MapperUtils.convertTeacherDtoToTeacherEntity(teacherDto);
        Optional<Teacher> teacher = teacherRepo.findById(teacher1.getTeacherId());
        if (teacher.isPresent()) {
            teacher.get().setTeacherName(teacherDto.getTeacherName());
            return Optional.of(MapperUtils.convertTeacherEntityToTeacherDto(teacherRepo.save(teacher.get())));
        } else {
            return Optional.empty();
        }
    }

    public ResponseEntity<Void> deleteTeacher(int teacherId) {
        Optional<Teacher> teacher = teacherRepo.findById(teacherId);
        if (teacher.isPresent()) {
            teacherRepo.deleteById(teacherId);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
