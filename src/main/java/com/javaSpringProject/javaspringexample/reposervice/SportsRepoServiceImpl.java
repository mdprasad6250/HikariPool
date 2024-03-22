package com.javaSpringProject.javaspringexample.reposervice;

import com.javaSpringProject.javaspringexample.Dto.SportDto;
import com.javaSpringProject.javaspringexample.Entity.Sports;
import com.javaSpringProject.javaspringexample.repository.SportRepo;
import com.javaSpringProject.javaspringexample.util.MapperUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Optional;

@Service
public class SportsRepoServiceImpl {
    @Autowired
    SportRepo sportRepo;

    public SportDto saveSport(SportDto sportDto) {
        Sports sports = MapperUtils.convertSportsDtoToSportsEntity(sportDto);
        return MapperUtils.convertSportsEntityToSportsDto(sportRepo.save(sports));
    }

    public Collection<SportDto> getSports() {
        return MapperUtils.convertSportsEntityToSportsDto(sportRepo.findAll());
    }

    public SportDto getSportById(int sportId) {
        Optional<Sports> sports = sportRepo.findById(sportId);
        if (sports.isPresent())
            return MapperUtils.convertSportsEntityToSportsDto(sports.get());
        return SportDto.builder().build();
    }

    public Optional<SportDto> updateSport(SportDto sportDto) {
        Sports sports1 = MapperUtils.convertSportsDtoToSportsEntity(sportDto);
        Optional<Sports> sports = sportRepo.findById(sports1.getSportId());
        if (sports.isPresent()) {
            sports.get().setSportName(sportDto.getSportName());
            return Optional.of(MapperUtils.convertSportsEntityToSportsDto(sportRepo.save(sports.get())));
        } else {
            return Optional.empty();
        }
    }

    public ResponseEntity<Void> deleteSport(int sportId) {
        Optional<Sports> sport = sportRepo.findById(sportId);
        if (sport.isPresent()) {
            sportRepo.deleteById(sportId);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
