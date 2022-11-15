package com.db.demo.Repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.db.demo.southernhemispheremonthly;

@Repository
public interface southernhmRepository extends JpaRepository<southernhemispheremonthly, String>{
    
}
