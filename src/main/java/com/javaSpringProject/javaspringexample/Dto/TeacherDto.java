package com.javaSpringProject.javaspringexample.Dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Component
@Builder
public class TeacherDto {
    private Integer teacherId;
    private String teacherName;
    private String subject;



}
