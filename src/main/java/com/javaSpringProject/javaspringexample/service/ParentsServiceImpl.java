package com.javaSpringProject.javaspringexample.service;

import com.javaSpringProject.javaspringexample.Entity.Parents;
import com.javaSpringProject.javaspringexample.repository.ParentRepo;
import lombok.NonNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class ParentsServiceImpl {
    @Autowired
    ParentRepo parentRepo;

    public Parents saveParents(Parents parents) {
        return parentRepo.save(parents);
    }

    public List<Parents> getParents() {
        return parentRepo.findAll();
    }

    public Optional<Parents> getParentById(int parentId) {
       return parentRepo.findById(parentId);
    }

    public Optional<Parents> updateParent(@NonNull Parents parent) {
        if(Objects.isNull(parent.getParentId())){
            return Optional.empty();
        }
        Optional<Parents> parents = parentRepo.findById(parent.getParentId());
        if (parents.isPresent()) {
            parents.get().setParentName(parent.getParentName());
            return Optional.of(parentRepo.save(parents.get()));
        }else{
            return parents;
        }
    }

    public ResponseEntity<Void> deleteParent(int parentId) {
        Optional<Parents> parent = parentRepo.findById(parentId);
        if (parent.isPresent()) {
            parentRepo.deleteById(parentId);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
