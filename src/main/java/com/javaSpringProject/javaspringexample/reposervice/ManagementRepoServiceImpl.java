package com.javaSpringProject.javaspringexample.reposervice;

import com.javaSpringProject.javaspringexample.Dto.ManagementDto;
import com.javaSpringProject.javaspringexample.Entity.Management;
import com.javaSpringProject.javaspringexample.repository.ManagementRepo;
import com.javaSpringProject.javaspringexample.util.MapperUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Optional;

@Service
public class ManagementRepoServiceImpl {
    @Autowired
    ManagementRepo managementRepo;

    public ManagementDto saveManagement(ManagementDto managementDto) {
        Management management = MapperUtils.convertManagementDtoToManagementEntity(managementDto);
        return MapperUtils.convertManagementEntityToManagementDto(managementRepo.save(management));
    }

    public Collection<ManagementDto> getManagement() {
        return MapperUtils.convertManagementEntityToManagementDto(managementRepo.findAll());
    }

    public ManagementDto getManagementById(int managementId) {
        Optional<Management> management = managementRepo.findById(managementId);
        if(management.isPresent())
                return MapperUtils.convertManagementEntityToManagementDto(management.get());
        return ManagementDto.builder().build();
    }

    public Optional<ManagementDto> updateManagement(ManagementDto managementDto) {
        Management management1 = MapperUtils.convertManagementDtoToManagementEntity(managementDto);
        Optional<Management> management = managementRepo.findById(management1.getManagementId());
        if (management.isPresent()) {
            management.get().setManagementName(managementDto.getManagementName());
            return Optional.of(MapperUtils.convertManagementEntityToManagementDto(managementRepo.save(management.get())));
        }else{
            return Optional.empty();
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
