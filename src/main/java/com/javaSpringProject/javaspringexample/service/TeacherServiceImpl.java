package com.javaSpringProject.javaspringexample.service;

import com.javaSpringProject.javaspringexample.Entity.Teacher;
import com.javaSpringProject.javaspringexample.repository.TeacherRepo;
import lombok.NonNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class TeacherServiceImpl {
    @Autowired
    TeacherRepo teacherRepo;

    public Teacher saveTeacher(Teacher teacher) {

        return teacherRepo.save(teacher);
    }

    public List<Teacher> getTeachers() {
        return teacherRepo.findAll();
    }

    public Optional<Teacher> getTeacherById(int teacherId) {

        return teacherRepo.findById(teacherId);
    }

    public Optional<Teacher> updateTeacher(@NonNull  Teacher teacherName) {
        if(Objects.isNull(teacherName.getTeacherId())){
            return Optional.of(Teacher.builder().build());
        }
        Optional<Teacher> teachers = teacherRepo.findById(teacherName.getTeacherId());
        if (teachers.isPresent()) {
            teachers.get().setTeacherName(teacherName.getTeacherName());
            return Optional.of(teacherRepo.save(teachers.get()));
        }else{
            return teachers;
        }
    }

    public ResponseEntity<Void> deleteTeacher(int teacherId) {
        Optional<Teacher> teachers = teacherRepo.findById(teacherId);
        if (teachers.isPresent()) {
            teacherRepo.deleteById(teacherId);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
