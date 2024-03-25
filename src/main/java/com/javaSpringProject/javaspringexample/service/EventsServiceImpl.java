package com.javaSpringProject.javaspringexample.service;

import com.javaSpringProject.javaspringexample.Entity.Events;
import com.javaSpringProject.javaspringexample.repository.EventRepo;
import lombok.NonNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class EventsServiceImpl {
    @Autowired
    EventRepo eventRepo;

    public Events saveEvent(Events events) {
        return eventRepo.save(events);
    }

    public List<Events> getEvents() {
        return eventRepo.findAll();
    }

    public Optional<Events> getEventsById(int eventId) {
       return eventRepo.findById(eventId);
    }

    public Optional<Events> updateEvents(@NonNull Events eventName) {
        if(Objects.isNull(eventName.getEventId())){
            return Optional.empty();
        }
        Optional<Events> events = eventRepo.findById(eventName.getEventId());
        if (events.isPresent()) {
            events.get().setEventName(eventName.getEventName());
            return Optional.of(eventRepo.save(events.get()));
        }else{
            return events;
        }
    }

    public ResponseEntity<Void> deleteEvents(int eventId) {
        Optional<Events> events = eventRepo.findById(eventId);
        if (events.isPresent()) {
            eventRepo.deleteById(eventId);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
