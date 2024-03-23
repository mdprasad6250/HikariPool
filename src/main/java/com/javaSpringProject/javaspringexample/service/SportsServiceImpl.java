package com.javaSpringProject.javaspringexample.service;

import com.javaSpringProject.javaspringexample.Entity.Sports;
import com.javaSpringProject.javaspringexample.repository.SportRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SportsServiceImpl {
    @Autowired
    SportRepo sportRepo;

    public Sports saveSport(Sports sports) {

        return sportRepo.save(sports);
    }

    public List<Sports> getSports() {
        return sportRepo.findAll();
    }

    public Optional<Sports> getSportById(int sportId) {

        return sportRepo.findById(sportId);
    }

    public Optional<Sports> updateSport(int sportId, Sports sportName) {
        Optional<Sports> sports = sportRepo.findById(sportId);
        if (sports.isPresent()) {
            sports.get().setSportName(sportName.getSportName());
            return Optional.of(sportRepo.save(sports.get()));
        }else{
            return sports;
        }
    }

    public ResponseEntity<Void> deleteSports(int sportId) {
        Optional<Sports> sports = sportRepo.findById(sportId);
        if (sports.isPresent()) {
            sportRepo.deleteById(sportId);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
