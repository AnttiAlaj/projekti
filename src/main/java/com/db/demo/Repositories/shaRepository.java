package com.db.demo.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.db.demo.southernhemisphereannual;

@Repository
public interface shaRepository extends JpaRepository<southernhemisphereannual, String>{
    
}
