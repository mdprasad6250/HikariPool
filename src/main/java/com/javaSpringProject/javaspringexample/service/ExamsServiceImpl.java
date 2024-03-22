package com.javaSpringProject.javaspringexample.service;

import com.javaSpringProject.javaspringexample.Entity.Exams;
import com.javaSpringProject.javaspringexample.repository.ExamsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ExamsServiceImpl {
    @Autowired
    ExamsRepo examsRepo;

    public Exams saveExam(Exams exams) {
        return examsRepo.save(exams);
    }

    public List<Exams> getExams() {
        return examsRepo.findAll();
    }

    public Optional<Exams> getExamsById(int examId) {
       return examsRepo.findById(examId);
    }

    public Optional<Exams> updateExam(int examId, Exams exams) {
        Optional<Exams> exams1 = examsRepo.findById(examId);
        if (exams1.isPresent()) {
            exams1.get().setExamName(exams.getExamName());
            return Optional.of(examsRepo.save(exams1.get()));
        }else{
            return exams1;
        }
    }

    public ResponseEntity<Void> deleteExam(int examId) {
        Optional<Exams> exams = examsRepo.findById(examId);
        if (exams.isPresent()) {
            examsRepo.deleteById(examId);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
