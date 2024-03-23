package com.javaSpringProject.javaspringexample.repocontroller;

import com.javaSpringProject.javaspringexample.Dto.ParentDto;
import com.javaSpringProject.javaspringexample.reposervice.ParentsRepoServiceImpl;
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
public class ParentsRepoController {

    @Autowired
    ParentsRepoServiceImpl parentService;

    @PostMapping("/save-parent")
    public ResponseEntity<ParentDto> saveParent(@RequestBody ParentDto parents) {
        ParentDto saveParent = parentService.saveParent(parents);
          return new ResponseEntity<>(saveParent,HttpStatus.CREATED);
        }

    @GetMapping("/get-parent-details")
    public Collection<ParentDto> getParents() {
        return parentService.getParents();
    }

    @GetMapping("/get-parent/{parentId}")
    public ParentDto getParentById(@PathVariable int parentId) {
       return parentService.getParentById(parentId);
    }

    @PatchMapping("/update-parent/{parentId}")
    public Optional<ParentDto> updateParent(@RequestBody ParentDto parents) {
        return parentService.updateParent(parents);
    }

    @DeleteMapping("/delete-parent/{parentId}")
    public ResponseEntity<Void> deleteParent(@PathVariable int parentId) {
        return parentService.deleteParent(parentId);
    }
}
