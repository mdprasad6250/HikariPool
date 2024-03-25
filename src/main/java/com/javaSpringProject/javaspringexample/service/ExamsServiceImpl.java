package com.javaSpringProject.javaspringexample.service;

import com.javaSpringProject.javaspringexample.Entity.Exams;
import com.javaSpringProject.javaspringexample.repository.ExamRepo;
import lombok.NonNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class ExamsServiceImpl {
    @Autowired
    ExamRepo examRepo;

    public Exams saveExam(Exams exams) {
        return examRepo.save(exams);
    }

    public List<Exams> getExams() {
        return examRepo.findAll();
    }

    public Optional<Exams> getExamsById(int examId) {
       return examRepo.findById(examId);
    }

    public Optional<Exams> updateExam(@NonNull Exams exams) {
        if(Objects.isNull(exams.getExamId())){
            return Optional.empty();
        }
        Optional<Exams> exams1 = examRepo.findById(exams.getExamId());
        if (exams1.isPresent()) {
            exams1.get().setExamName(exams.getExamName());
            return Optional.of(examRepo.save(exams1.get()));
        }else{
            return exams1;
        }
    }

    public ResponseEntity<Void> deleteExam(int examId) {
        Optional<Exams> exams = examRepo.findById(examId);
        if (exams.isPresent()) {
            examRepo.deleteById(examId);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
