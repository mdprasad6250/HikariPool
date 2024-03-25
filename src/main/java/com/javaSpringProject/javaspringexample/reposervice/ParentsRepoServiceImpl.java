package com.javaSpringProject.javaspringexample.reposervice;

import com.javaSpringProject.javaspringexample.Dto.ParentDto;
import com.javaSpringProject.javaspringexample.Entity.Parents;
import com.javaSpringProject.javaspringexample.repository.ParentRepo;
import com.javaSpringProject.javaspringexample.util.MapperUtils;
import lombok.NonNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Objects;
import java.util.Optional;

@Service
public class ParentsRepoServiceImpl {
    @Autowired
    ParentRepo parentRepo;

    public ParentDto saveParent(ParentDto parentDto) {
        Parents parents = MapperUtils.convertParentDtoToParentEntity(parentDto);
        return MapperUtils.convertParentEntityToParentDto(parentRepo.save(parents));
    }

    public Collection<ParentDto> getParents() {

        return MapperUtils.convertParentEntityToParentDto(parentRepo.findAll());
    }

    public ParentDto getParentById(int parentId) {
        Optional<Parents> parents = parentRepo.findById(parentId);
        if (parents.isPresent())
            return MapperUtils.convertParentEntityToParentDto(parents.get());
        return ParentDto.builder().build();
    }

    public Optional<ParentDto> updateParent(@NonNull ParentDto parentDto) {
        if(Objects.isNull(parentDto.getParentId())){
            return Optional.empty();
        }
        Parents parents1 = MapperUtils.convertParentDtoToParentEntity(parentDto);
        Optional<Parents> parents = parentRepo.findById(parents1.getParentId());
        if (parents.isPresent()) {
            parents.get().setParentName(parentDto.getParentName());
            return Optional.of(MapperUtils.convertParentEntityToParentDto(parentRepo.save(parents.get())));
        } else {
            return Optional.empty();
        }
    }

    public ResponseEntity<Void> deleteParent(int parentId) {
        Optional<Parents> parents = parentRepo.findById(parentId);
        if (parents.isPresent()) {
            parentRepo.deleteById(parentId);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
