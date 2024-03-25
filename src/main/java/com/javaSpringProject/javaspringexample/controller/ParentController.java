package com.javaSpringProject.javaspringexample.controller;

import com.javaSpringProject.javaspringexample.Entity.Parents;
import com.javaSpringProject.javaspringexample.service.ParentsServiceImpl;
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
public class ParentController {

    @Autowired
    ParentsServiceImpl parentService;

    @PostMapping("/save-parent")
    public ResponseEntity<Parents> saveParent(@RequestBody Parents parents) {
        Parents saveParent = parentService.saveParents(parents);
        return new ResponseEntity<>(saveParent, HttpStatus.CREATED);
    }

    @GetMapping("/get-parent-details")
    public List<Parents> getParents(Parents parents) {
        return parentService.getParents();
    }

    @GetMapping("/get-parent/{parentId}")
    public Optional<Parents> getParentById(@PathVariable int parentId) {
        return parentService.getParentById(parentId);
    }

    @PatchMapping("/update-parent")
    public Optional<Parents> updateParent(@RequestBody Parents parents) {
        return parentService.updateParent(parents);
    }

    @DeleteMapping("/delete-parent/{parentId}")
    public ResponseEntity<Void> deleteParent(@PathVariable int parentId) {
        return parentService.deleteParent(parentId);
    }

}
