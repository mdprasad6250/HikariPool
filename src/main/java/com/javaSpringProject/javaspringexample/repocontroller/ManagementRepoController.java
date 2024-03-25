package com.javaSpringProject.javaspringexample.repocontroller;

import com.javaSpringProject.javaspringexample.Dto.ManagementDto;
import com.javaSpringProject.javaspringexample.reposervice.ManagementRepoServiceImpl;
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
public class ManagementRepoController {

    @Autowired
    ManagementRepoServiceImpl managementRepoService;

    @PostMapping("/save-management")
    public ResponseEntity<ManagementDto> saveManagement(@RequestBody ManagementDto management) {
        ManagementDto saveManagement = managementRepoService.saveManagement(management);
        return new ResponseEntity<>(saveManagement, HttpStatus.CREATED);
    }

    @GetMapping("/get-management-details")
    public Collection<ManagementDto> getManagement(ManagementDto management) {
        return managementRepoService.getManagement();
    }

    @GetMapping("/get-management/{managementId}")
    public ManagementDto getManagementById(@PathVariable int managementId) {
        return managementRepoService.getManagementById(managementId);
    }

    @PatchMapping("/update-management/{managementId}")
    public Optional<ManagementDto> updateManagement(@RequestBody ManagementDto management) {
        return managementRepoService.updateManagement(management);
    }

    @DeleteMapping("/delete-management/{managementId}")
    public ResponseEntity<Void> deleteManagement(@PathVariable int managementId) {
        return managementRepoService.deleteManagement(managementId);
    }
}
