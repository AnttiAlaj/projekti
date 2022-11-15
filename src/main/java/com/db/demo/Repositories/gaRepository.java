package com.db.demo.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.db.demo.globalannual;

@Repository
public interface gaRepository extends JpaRepository<globalannual, String> {
    
}
