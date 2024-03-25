package com.javaSpringProject.javaspringexample.controller;

import com.javaSpringProject.javaspringexample.Entity.Teacher;
import com.javaSpringProject.javaspringexample.service.TeacherServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class TeacherController {

    @Autowired
    TeacherServiceImpl teacherService;

    @PostMapping("/save-teacher")
    public ResponseEntity<Teacher> saveTeacher(@RequestBody Teacher teacher) {
        Teacher saveTeachers = teacherService.saveTeacher(teacher);
        return new ResponseEntity<>(saveTeachers, HttpStatus.CREATED);
    }

    @GetMapping("/get-teacher")
    public List<Teacher> getTeachers(Teacher teacher) {
        return teacherService.getTeachers();
    }

    @GetMapping("/get-teacher/{teacherId}")
    public Optional<Teacher> getBookById(@PathVariable int teacherId) {
        return teacherService.getTeacherById(teacherId);
    }

    @PatchMapping("/update-teacher")
    public Optional<Teacher> updateTeacher(@RequestBody Teacher teacherName) {
        return teacherService.updateTeacher(teacherName);
    }

    @DeleteMapping("/delete-teacher/{teacherId}")
    public ResponseEntity<Void> deleteStudent(@PathVariable int teacherId) {
        return teacherService.deleteTeacher(teacherId);
    }
}
