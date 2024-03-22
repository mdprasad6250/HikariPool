package com.javaSpringProject.javaspringexample.service;

import com.javaSpringProject.javaspringexample.Entity.Sports;
import com.javaSpringProject.javaspringexample.repository.SportsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SportsServiceImpl {
    @Autowired
    SportsRepo sportsRepo;

    public Sports saveSport(Sports sports) {

        return sportsRepo.save(sports);
    }

    public List<Sports> getSport() {
        return sportsRepo.findAll();
    }

    public Optional<Sports> getSportById(int sportId) {

        return sportsRepo.findById(sportId);
    }

    public Optional<Sports> updateSport(int sportId, Sports sportName) {
        Optional<Sports> sports = sportsRepo.findById(sportId);
        if (sports.isPresent()) {
            sports.get().setSportName(sportName.getSportName());
            return Optional.of(sportsRepo.save(sports.get()));
        }else{
            return sports;
        }
    }

    public ResponseEntity<Void> deleteSports(int sportId) {
        Optional<Sports> sports = sportsRepo.findById(sportId);
        if (sports.isPresent()) {
            sportsRepo.deleteById(sportId);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
