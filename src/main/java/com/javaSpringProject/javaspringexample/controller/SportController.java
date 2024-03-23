package com.javaSpringProject.javaspringexample.controller;

import com.javaSpringProject.javaspringexample.Entity.Sports;
import com.javaSpringProject.javaspringexample.service.SportsServiceImpl;
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
public class SportController {

    @Autowired
    SportsServiceImpl sportsService;

    @PostMapping("/save-sport")
    public ResponseEntity<Sports> saveSport(@RequestBody Sports sport) {
        Sports saveSports = sportsService.saveSport(sport);
        return new ResponseEntity<>(saveSports, HttpStatus.CREATED);
    }

    @GetMapping("/get-sport")
    public List<Sports> getSports(Sports sport) {
        return sportsService.getSports();
    }

    @GetMapping("/get-sport/{sportId}")
    public Optional<Sports> getSportById(@PathVariable int sportId) {

        return sportsService.getSportById(sportId);
    }

    @PatchMapping("/update-sport/{sportId}")
    public Optional<Sports> updateSport(@PathVariable int sportId, @RequestBody Sports sportName) {
        return sportsService.updateSport(sportId, sportName);
    }

    @DeleteMapping("/delete-sport/{sportId}")
    public ResponseEntity<Void> deleteSport(@PathVariable int sportId) {
        return sportsService.deleteSports(sportId);
    }
}
