package com.javaSpringProject.javaspringexample.reposervice;

import com.javaSpringProject.javaspringexample.Dto.EventDto;
import com.javaSpringProject.javaspringexample.Entity.Events;
import com.javaSpringProject.javaspringexample.repository.EventRepo;
import com.javaSpringProject.javaspringexample.util.MapperUtils;
import lombok.NonNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Objects;
import java.util.Optional;

@Service
public class EventsRepoServiceImpl {
    @Autowired
    EventRepo eventRepo;

    public EventDto saveEvent(EventDto eventDto) {
        Events events = MapperUtils.convertEventDtoToEventEntity(eventDto);
        return MapperUtils.convertEventsEntityToEventsDto(eventRepo.save(events));
    }

    public Collection<EventDto> getEvents() {
        return MapperUtils.convertEventEntityToEventDto(eventRepo.findAll());
    }

    public EventDto getEventById(int eventId) {
        Optional<Events> events = eventRepo.findById(eventId);
        if(events.isPresent())
                return MapperUtils.convertEventsEntityToEventsDto(events.get());
        return EventDto.builder().build();
    }

    public Optional<EventDto> updateEvent(@NonNull EventDto eventDto) {
        if(Objects.isNull(eventDto.getEventId())){
            return Optional.empty();
        }
        Events events1 = MapperUtils.convertEventDtoToEventEntity(eventDto);
        Optional<Events> events = eventRepo.findById(events1.getEventId());
        if (events.isPresent()) {
            events.get().setEventName(eventDto.getEventName());
            return Optional.of(MapperUtils.convertEventsEntityToEventsDto(eventRepo.save(events.get())));
        }else{
            return Optional.empty();
        }
    }

    public ResponseEntity<Void> deleteEvent(int eventId) {
        Optional<Events> events = eventRepo.findById(eventId);
        if (events.isPresent()) {
            eventRepo.deleteById(eventId);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
