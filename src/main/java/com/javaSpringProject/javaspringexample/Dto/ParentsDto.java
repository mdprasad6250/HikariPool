package com.javaSpringProject.javaspringexample.Dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import javax.persistence.Column;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
@Builder
public class ParentsDto {
	private Integer parentId;

    private String parentName;

    private String parentFeedback;
}
