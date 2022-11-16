package com.db.demo.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.db.demo.northernhemisphereannual;

@Repository
public interface nhaRepository extends JpaRepository<northernhemisphereannual, String> {
    
}
