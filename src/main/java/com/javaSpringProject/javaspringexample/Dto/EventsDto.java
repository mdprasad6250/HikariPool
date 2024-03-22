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
public class EventsDto {
	private Integer eventId;

    private String eventName;

    private String eventOrganizer;
}
