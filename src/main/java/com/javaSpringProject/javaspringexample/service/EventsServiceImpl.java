package com.javaSpringProject.javaspringexample.service;

import com.javaSpringProject.javaspringexample.Entity.Events;
import com.javaSpringProject.javaspringexample.repository.EventsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EventsServiceImpl {
    @Autowired
    EventsRepo eventsRepo;

    public Events saveEvent(Events events) {
        return eventsRepo.save(events);
    }

    public List<Events> getEvents() {
        return eventsRepo.findAll();
    }

    public Optional<Events> getEventsById(int eventId) {
       return eventsRepo.findById(eventId);
    }

    public Optional<Events> updateEvents(int eventId, Events eventName) {
        Optional<Events> events = eventsRepo.findById(eventId);
        if (events.isPresent()) {
            events.get().setEventName(eventName.getEventName());
            return Optional.of(eventsRepo.save(events.get()));
        }else{
            return events;
        }
    }

    public ResponseEntity<Void> deleteEvents(int eventId) {
        Optional<Events> events = eventsRepo.findById(eventId);
        if (events.isPresent()) {
            eventsRepo.deleteById(eventId);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
