package com.javaSpringProject.javaspringexample.reposervice;

import com.javaSpringProject.javaspringexample.Dto.ExamDto;
import com.javaSpringProject.javaspringexample.Entity.Exams;
import com.javaSpringProject.javaspringexample.repository.ExamRepo;
import com.javaSpringProject.javaspringexample.util.MapperUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Optional;

@Service
public class ExamsRepoServiceImpl {
    @Autowired
    ExamRepo examRepo;

    public ExamDto saveExam(ExamDto examDto) {
        Exams exams = MapperUtils.convertExamDtoToExamEntity(examDto);
        return MapperUtils.convertExamsEntityToExamsDto(examRepo.save(exams));
    }

    public Collection<ExamDto> getExams() {
        return MapperUtils.convertExamsEntityToExamsDto(examRepo.findAll());
    }

    public ExamDto getExamById(int examId) {
        Optional<Exams> exams = examRepo.findById(examId);
        if (exams.isPresent())
            return MapperUtils.convertExamsEntityToExamsDto(exams.get());
        return ExamDto.builder().build();
    }

    public Optional<ExamDto> updateExam(ExamDto examDto) {
        Exams exams1 = MapperUtils.convertExamDtoToExamEntity(examDto);
        Optional<Exams> exams = examRepo.findById(exams1.getExamId());
        if (exams.isPresent()) {
            exams.get().setExamName(examDto.getExamName());
            return Optional.of(MapperUtils.convertExamsEntityToExamsDto(examRepo.save(exams.get())));
        } else {
            return Optional.empty();
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
