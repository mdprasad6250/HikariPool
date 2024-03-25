package com.javaSpringProject.javaspringexample.service;

import com.javaSpringProject.javaspringexample.Entity.Management;
import com.javaSpringProject.javaspringexample.repository.ManagementRepo;
import lombok.NonNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class ManagementServiceImpl {
    @Autowired
    ManagementRepo managementRepo;

    public Management saveManagement(Management management) {

        return managementRepo.save(management);
    }

    public List<Management> getManagement() {

        return managementRepo.findAll();
    }

    public Optional<Management> getManagementById(int managementId) {

        return managementRepo.findById(managementId);
    }

    public Optional<Management> updateManagement(@NonNull Management managementName) {
        if(Objects.isNull(managementName.getManagementId())){
            return Optional.empty();
        }
        Optional<Management> management = managementRepo.findById(managementName.getManagementId());
        if (management.isPresent()) {
            management.get().setManagementName(managementName.getManagementName());
            return Optional.of(managementRepo.save(management.get()));
        }else{
            return management;
        }
    }

    public ResponseEntity<Void> deleteManagement(int managementId) {
        Optional<Management> management = managementRepo.findById(managementId);
        if (management.isPresent()) {
            managementRepo.deleteById(managementId);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
