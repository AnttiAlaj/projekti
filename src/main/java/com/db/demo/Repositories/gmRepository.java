package com.db.demo.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.db.demo.globalmonthly;

@Repository
public interface gmRepository extends JpaRepository<globalmonthly, String>{
    
}
