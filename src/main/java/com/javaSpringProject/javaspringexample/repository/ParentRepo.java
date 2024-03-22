package com.javaSpringProject.javaspringexample.repository;

import com.javaSpringProject.javaspringexample.Entity.Parents;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParentRepo extends JpaRepository<Parents,Integer> {}
