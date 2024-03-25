package com.javaSpringProject.javaspringexample.controller;

import com.javaSpringProject.javaspringexample.Entity.Management;
import com.javaSpringProject.javaspringexample.service.ManagementServiceImpl;
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
public class ManagementController {

    @Autowired
    ManagementServiceImpl managementService;

    @PostMapping("/save-management")
    public ResponseEntity<Management> saveManagement(@RequestBody Management management) {
        Management saveManagement = managementService.saveManagement(management);
        return new ResponseEntity<>(saveManagement, HttpStatus.CREATED);
    }

    @GetMapping("/get-management-details")
    public List<Management> getManagement(Management management) {
        return managementService.getManagement();
    }

    @GetMapping("/get-management/{managementId}")
    public Optional<Management> getManagementById(@PathVariable int managementId) {
        return managementService.getManagementById(managementId);
    }

    @PatchMapping("/update-management")
    public Optional<Management> updateManagement(@RequestBody Management management) {
        return managementService.updateManagement(management);
    }

    @DeleteMapping("/delete-management/{managementId}")
    public ResponseEntity<Void> deleteManagement(@PathVariable int managementId) {
        return managementService.deleteManagement(managementId);
    }
}
