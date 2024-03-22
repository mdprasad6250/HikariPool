package com.javaSpringProject.javaspringexample.repocontroller;

import com.javaSpringProject.javaspringexample.Dto.SportDto;
import com.javaSpringProject.javaspringexample.reposervice.SportsRepoServiceImpl;
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
public class SportsRepoController {

    @Autowired
    SportsRepoServiceImpl sportsRepoService;

    @PostMapping("/save-sport")
    public ResponseEntity<SportDto> saveSport(@RequestBody SportDto sport) {
        SportDto saveSports = sportsRepoService.saveSport(sport);
        return new ResponseEntity<>(saveSports, HttpStatus.CREATED);
    }

    @GetMapping("/get-sport")
    public Collection<SportDto> getSports() {
        return sportsRepoService.getSports();
    }

    @GetMapping("/get-sport/{sportId}")
    public SportDto getSportById(@PathVariable int sportId) {
        return sportsRepoService.getSportById(sportId);
    }

    @PatchMapping("/update-sport/{sportId}")
    public Optional<SportDto> updateSport(@RequestBody SportDto sportName) {
        return sportsRepoService.updateSport(sportName);
    }

    @DeleteMapping("/delete-sport/{sportId}")
    public ResponseEntity<Void> deleteSport(@PathVariable int sportId) {
        return sportsRepoService.deleteSport(sportId);
    }
}
