package com.javaSpringProject.javaspringexample.repocontroller;

import com.javaSpringProject.javaspringexample.Dto.EventDto;
import com.javaSpringProject.javaspringexample.reposervice.EventsRepoServiceImpl;
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

import java.util.Collection;
import java.util.Optional;

@RestController
@RequestMapping("/api/repo")
public class EventsRepoController {

    @Autowired
    EventsRepoServiceImpl eventsRepoService;

    @PostMapping("/save-event")
    public ResponseEntity<EventDto> saveEvents(@RequestBody EventDto events) {
        EventDto saveEvents = eventsRepoService.saveEvent(events);
        return new ResponseEntity<>(saveEvents, HttpStatus.CREATED);
    }

    @GetMapping("/get-event")
    public Collection<EventDto> getEvents() {
        return eventsRepoService.getEvents();
    }

    @GetMapping("/get-event/{eventId}")
    public EventDto getEventById(@PathVariable int eventId) {
        return eventsRepoService.getEventById(eventId);
    }

    @PatchMapping("/update-event/{eventId}")
    public Optional<EventDto> updateEvent(@RequestBody EventDto eventName) {
        return eventsRepoService.updateEvent(eventName);
    }

    @DeleteMapping("/delete-event/{eventId}")
    public ResponseEntity<Void> deleteEvent(@PathVariable int eventId) {
        return eventsRepoService.deleteEvent(eventId);
    }
}
