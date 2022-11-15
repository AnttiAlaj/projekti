package com.db.demo.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.db.demo.user;

@Repository
public interface PersonRepository extends JpaRepository<user, String>{
    
}
