package com.guilherme.studentapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.guilherme.studentapp.entity.Roles;

@Repository
public interface RolesRepository extends JpaRepository<Roles, Long> {
    
}
