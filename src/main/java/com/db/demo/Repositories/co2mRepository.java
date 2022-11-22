package com.db.demo.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.db.demo.co2monthly;

@Repository
public interface co2mRepository extends JpaRepository<co2monthly, String> {
    
}
