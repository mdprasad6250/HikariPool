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
public class StudentDto {
    private Integer studentId;
    private String studentName;
    private String rank;
}
