package com.db.demo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface southernhmRepository extends JpaRepository<southernhemispheremonthly, String>{
    
}
