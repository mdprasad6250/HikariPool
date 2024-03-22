package com.javaSpringProject.javaspringexample.service;

import com.javaSpringProject.javaspringexample.Entity.Parents;
import com.javaSpringProject.javaspringexample.repository.ParentsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ParentsServiceImpl {
    @Autowired
    ParentsRepo parentsRepo;

    public Parents saveParents(Parents parents) {
        return parentsRepo.save(parents);
    }

    public List<Parents> getParents() {
        return parentsRepo.findAll();
    }

    public Optional<Parents> getParentById(int parentId) {
       return parentsRepo.findById(parentId);
    }

    public Optional<Parents> updateParent(int parentId, Parents parent) {
        Optional<Parents> parents = parentsRepo.findById(parentId);
        if (parents.isPresent()) {
            parents.get().setParentName(parent.getParentName());
            return Optional.of(parentsRepo.save(parents.get()));
        }else{
            return parents;
        }
    }

    public ResponseEntity<Void> deleteParent(int parentId) {
        Optional<Parents> parent = parentsRepo.findById(parentId);
        if (parent.isPresent()) {
            parentsRepo.deleteById(parentId);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
