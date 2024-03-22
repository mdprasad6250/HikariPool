package com.javaSpringProject.javaspringexample.controller;

import com.javaSpringProject.javaspringexample.Entity.Events;
import com.javaSpringProject.javaspringexample.service.EventsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class EventsController {

    @Autowired
    EventsServiceImpl eventsService;


    @PostMapping("/save-event")
    public ResponseEntity<Events> saveEvents(@RequestBody Events events) {
          Events saveEvents = eventsService.saveEvent(events);
          return new ResponseEntity<>(saveEvents,HttpStatus.CREATED);
        }

    @GetMapping("/get-event")
    public List<Events> getEvents(Events events) {
        return eventsService.getEvents();
    }

    @GetMapping("/get-event/{eventId}")
    public Optional<Events> getEventById(@PathVariable int eventId) {

        return eventsService.getEventsById(eventId);
    }

    @PatchMapping("/update-event/{eventId}")
    public Optional<Events> updateEvent(@PathVariable int eventId, @RequestBody Events eventName) {
        return eventsService.updateEvents(eventId,eventName);
    }


    @DeleteMapping("/delete-event/{eventId}")
    public ResponseEntity<Void> deleteEvent(@PathVariable int eventId) {

        return eventsService.deleteEvents(eventId);
    }

}










