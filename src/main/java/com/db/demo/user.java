package com.db.demo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class user {
   @Id
   public String username;
   public String password;
   
   public user(){
    
   }


public user(String username, String password){
    this.username = username;
    this.password = password;
}}
