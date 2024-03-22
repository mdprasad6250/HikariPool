package com.javaSpringProject.javaspringexample.reposervice;

import com.javaSpringProject.javaspringexample.Dto.ParentsDto;
import com.javaSpringProject.javaspringexample.Entity.Parents;
import com.javaSpringProject.javaspringexample.repository.ParentsRepo;
import com.javaSpringProject.javaspringexample.util.MapperUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Optional;

@Service
public class ParentsRepoServiceImpl {
    @Autowired
    ParentsRepo parentsRepo;

    public ParentsDto saveParent(ParentsDto parentsDto) {
        Parents parents = MapperUtils.convertParentDtoToParentEntity(parentsDto);
        return MapperUtils.convertParentEntityToParentDto(parentsRepo.save(parents));
    }

    public Collection<ParentsDto> getParent() {

        return MapperUtils.convertParentEntityToParentDto(parentsRepo.findAll());
    }

    public ParentsDto getParentById(int parentId) {
        Optional<Parents> parents = parentsRepo.findById(parentId);
        if(parents.isPresent())
                return MapperUtils.convertParentEntityToParentDto(parents.get());
        return ParentsDto.builder().build();
    }

    public Optional<ParentsDto> updateParent(ParentsDto parentsDto) {
        Parents parents1 = MapperUtils.convertParentDtoToParentEntity(parentsDto);
        Optional<Parents> parents = parentsRepo.findById(parents1.getParentId());
        if (parents.isPresent()) {
            parents.get().setParentName(parentsDto.getParentName());
            return Optional.of(MapperUtils.convertParentEntityToParentDto(parentsRepo.save(parents.get())));
        }else{
            return Optional.empty();
        }
    }

    public ResponseEntity<Void> deleteParent(int parentId) {
        Optional<Parents> parents = parentsRepo.findById(parentId);
        if (parents.isPresent()) {
            parentsRepo.deleteById(parentId);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
