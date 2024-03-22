package com.javaSpringProject.javaspringexample.reposervice;

import com.javaSpringProject.javaspringexample.Dto.SportsDto;
import com.javaSpringProject.javaspringexample.Entity.Sports;
import com.javaSpringProject.javaspringexample.repository.SportsRepo;
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
    SportsRepo sportsRepo;

    public SportsDto saveSport(SportsDto sportsDto) {
        Sports sports = MapperUtils.convertSportsDtoToSportsEntity(sportsDto);
        return MapperUtils.convertSportsEntityToSportsDto(sportsRepo.save(sports));
    }

    public Collection<SportsDto> getSport() {

        return MapperUtils.convertSportsEntityToSportsDto(sportsRepo.findAll());
    }

    public SportsDto getSportById(int sportId) {
        Optional<Sports> sports = sportsRepo.findById(sportId);
        if(sports.isPresent())
                return MapperUtils.convertSportsEntityToSportsDto(sports.get());
        return SportsDto.builder().build();
    }

    public Optional<SportsDto> updateSport(SportsDto sportsDto) {
        Sports sports1 = MapperUtils.convertSportsDtoToSportsEntity(sportsDto);
        Optional<Sports> sports = sportsRepo.findById(sports1.getSportId());
        if (sports.isPresent()) {
            sports.get().setSportName(sportsDto.getSportName());
            return Optional.of(MapperUtils.convertSportsEntityToSportsDto(sportsRepo.save(sports.get())));
        }else{
            return Optional.empty();
        }
    }

    public ResponseEntity<Void> deleteSport(int sportId) {
        Optional<Sports> sport = sportsRepo.findById(sportId);
        if (sport.isPresent()) {
            sportsRepo.deleteById(sportId);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
