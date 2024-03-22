package com.javaSpringProject.javaspringexample.controller;

import com.javaSpringProject.javaspringexample.Entity.Exams;
import com.javaSpringProject.javaspringexample.service.ExamsServiceImpl;
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
public class ExamController {

    @Autowired
    ExamsServiceImpl examsService;


    @PostMapping("/save-exam")
    public ResponseEntity<Exams> saveExam(@RequestBody Exams exams) {
          Exams saveExam = examsService.saveExam(exams);
          return new ResponseEntity<>(saveExam,HttpStatus.CREATED);
        }

    @GetMapping("/get-exam-details")
    public List<Exams> getExams(Exams exams) {
        return examsService.getExams();
    }

    @GetMapping("/get-exam-details/{examId}")
    public Optional<Exams> getExamById(@PathVariable int examId) {
       return examsService.getExamsById(examId);
    }

    @PatchMapping("/update-exam/{examId}")
    public Optional<Exams> updateExams(@PathVariable int examId, @RequestBody Exams exams) {
        return examsService.updateExam(examId,exams);
    }


    @DeleteMapping("/delete-exam/{examId}")
    public ResponseEntity<Void> deleteExamById(@PathVariable int examId) {
        return examsService.deleteExam(examId);
    }

}










