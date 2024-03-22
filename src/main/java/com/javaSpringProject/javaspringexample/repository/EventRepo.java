package com.javaSpringProject.javaspringexample.repository;

import com.javaSpringProject.javaspringexample.Entity.Events;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventRepo extends JpaRepository<Events,Integer> {}