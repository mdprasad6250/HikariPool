package com.javaSpringProject.javaspringexample.reposervice;

import com.javaSpringProject.javaspringexample.Dto.BookDto;
import com.javaSpringProject.javaspringexample.Dto.EventsDto;
import com.javaSpringProject.javaspringexample.Entity.Book;
import com.javaSpringProject.javaspringexample.Entity.Events;
import com.javaSpringProject.javaspringexample.repository.EventsRepo;
import com.javaSpringProject.javaspringexample.util.MapperUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Optional;

@Service
public class EventsRepoServiceImpl {
    @Autowired
    EventsRepo eventsRepo;

    public EventsDto saveEvent(EventsDto eventsDto) {
        Events events = MapperUtils.convertEventDtoToEventEntity(eventsDto);
        return MapperUtils.convertEventsEntityToEventsDto(eventsRepo.save(events));
    }

    public Collection<EventsDto> getEvent() {

        return MapperUtils.convertEventEntityToEventDto(eventsRepo.findAll());
    }

    public EventsDto getEventById(int eventId) {
        Optional<Events> events = eventsRepo.findById(eventId);
        if(events.isPresent())
                return MapperUtils.convertEventsEntityToEventsDto(events.get());
        return EventsDto.builder().build();
    }

    public Optional<EventsDto> updateEvent(EventsDto eventsDto) {
        Events events1 = MapperUtils.convertEventDtoToEventEntity(eventsDto);
        Optional<Events> events = eventsRepo.findById(events1.getEventId());
        if (events.isPresent()) {
            events.get().setEventName(eventsDto.getEventName());
            return Optional.of(MapperUtils.convertEventsEntityToEventsDto(eventsRepo.save(events.get())));
        }else{
            return Optional.empty();
        }
    }

    public ResponseEntity<Void> deleteEvent(int eventId) {
        Optional<Events> events = eventsRepo.findById(eventId);
        if (events.isPresent()) {
            eventsRepo.deleteById(eventId);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
