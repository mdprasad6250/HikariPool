package com.javaSpringProject.javaspringexample.reposervice;

import com.javaSpringProject.javaspringexample.Dto.ExamsDto;
import com.javaSpringProject.javaspringexample.Entity.Exams;
import com.javaSpringProject.javaspringexample.repository.ExamsRepo;
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
    ExamsRepo examsRepo;

    public ExamsDto saveExam(ExamsDto examsDto) {
        Exams exams = MapperUtils.convertExamDtoToExamEntity(examsDto);
        return MapperUtils.convertExamsEntityToExamsDto(examsRepo.save(exams));
    }

    public Collection<ExamsDto> getExam() {

        return MapperUtils.convertExamsEntityToExamsDto(examsRepo.findAll());
    }

    public ExamsDto getExamById(int examId) {
        Optional<Exams> exams = examsRepo.findById(examId);
        if(exams.isPresent())
                return MapperUtils.convertExamsEntityToExamsDto(exams.get());
        return ExamsDto.builder().build();
    }

    public Optional<ExamsDto> updateExam(ExamsDto examsDto) {
        Exams exams1 = MapperUtils.convertExamDtoToExamEntity(examsDto);
        Optional<Exams> exams = examsRepo.findById(exams1.getExamId());
        if (exams.isPresent()) {
            exams.get().setExamName(examsDto.getExamName());
            return Optional.of(MapperUtils.convertExamsEntityToExamsDto(examsRepo.save(exams.get())));
        }else{
            return Optional.empty();
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
