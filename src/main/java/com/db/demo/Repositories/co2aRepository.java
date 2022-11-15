package com.db.demo.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.db.demo.co2annually;

@Repository
public interface co2aRepository extends JpaRepository<co2annually, String>{
    
}
