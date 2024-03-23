package com.javaSpringProject.javaspringexample.repocontroller;

import com.javaSpringProject.javaspringexample.Dto.TeacherDto;
import com.javaSpringProject.javaspringexample.reposervice.TeacherRepoServiceImpl;
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

import java.util.Collection;
import java.util.Optional;

@RestController
@RequestMapping("/api/repo")
public class TeacherRepoController {

    @Autowired
    TeacherRepoServiceImpl teacherService;

    @PostMapping("/save-teacher")
    public ResponseEntity<TeacherDto> saveTeacher(@RequestBody TeacherDto teacher) {
        TeacherDto saveTeachers = teacherService.saveTeacher(teacher);
        return new ResponseEntity<>(saveTeachers, HttpStatus.CREATED);
    }

    @GetMapping("/get-teacher")
    public Collection<TeacherDto> getTeachers() {
        return teacherService.getTeachers();
    }

    @GetMapping("/get-teacher/{teacherId}")
    public TeacherDto getBookById(@PathVariable int teacherId) {
        return teacherService.getTeacherById(teacherId);
    }

    @PatchMapping("/update-teacher")
    public Optional<TeacherDto> updateTeacher(@RequestBody TeacherDto teacherName) {
        return teacherService.updateTeacher(teacherName);
    }

    @DeleteMapping("/delete-teacher/{teacherId}")
    public ResponseEntity<Void> deleteStudent(@PathVariable int teacherId) {
        return teacherService.deleteTeacher(teacherId);
    }
}
