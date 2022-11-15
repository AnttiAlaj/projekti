package com.db.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecurityRestApi {
    @Autowired
    SecurityService secService;

    @PostMapping("register")
    public ResponseEntity<String> register(
        @RequestParam String username, 
        @RequestParam String password)
        {
            user u = secService.register(username, password);
            return new ResponseEntity<>(u.username, HttpStatus.OK);
        }
  
        @PostMapping("login")
        public ResponseEntity<String> login(
            @RequestParam String username, 
            @RequestParam String password)
            {
               String token = secService.login(username, password);

                if(token == null){
                    return new ResponseEntity<>(HttpStatus.UNAUTHORIZED);
                }
                
                return new ResponseEntity<>(token, HttpStatus.OK);
            }

    @GetMapping("private")
    public ResponseEntity<String> getPrivateData(@RequestHeader("Authorization")String bearer){

        if(bearer.startsWith("Bearer")){
            String token = bearer.split(" ")[1];
            String username = secService.validateJwt(token);
            if(username!=null){
                return new ResponseEntity<>("Private data for "+username, HttpStatus.OK);
            }
        }

        return new ResponseEntity<>(HttpStatus.FORBIDDEN); 
    }
 
}
