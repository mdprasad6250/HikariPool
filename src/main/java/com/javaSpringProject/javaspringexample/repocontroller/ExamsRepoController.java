package com.javaSpringProject.javaspringexample.repocontroller;

import com.javaSpringProject.javaspringexample.Dto.ExamDto;
import com.javaSpringProject.javaspringexample.Entity.Exams;
import com.javaSpringProject.javaspringexample.reposervice.ExamsRepoServiceImpl;
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
public class ExamsRepoController {

    @Autowired
    ExamsRepoServiceImpl examsService;

    @PostMapping("/save-exam")
    public ResponseEntity<ExamDto> saveExam(@RequestBody ExamDto exams) {
        ExamDto saveExam = examsService.saveExam(exams);
        return new ResponseEntity<>(saveExam, HttpStatus.CREATED);
    }

    @GetMapping("/get-exam-details")
    public Collection<ExamDto> getExams(Exams exams) {
        return examsService.getExams();
    }

    @GetMapping("/get-exam-details/{examId}")
    public ExamDto getExamById(@PathVariable int examId) {
        return examsService.getExamById(examId);
    }

    @PatchMapping("/update-exam/{examId}")
    public Optional<ExamDto> updateExams(@RequestBody ExamDto exams) {
        return examsService.updateExam(exams);
    }

    @DeleteMapping("/delete-exam/{examId}")
    public ResponseEntity<Void> deleteExamById(@PathVariable int examId) {
        return examsService.deleteExam(examId);
    }
}
