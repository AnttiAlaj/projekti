package com.db.demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTVerificationException;
import com.auth0.jwt.interfaces.DecodedJWT;

@Service
public class SecurityService {
    
    @Autowired
    PersonRepository repo;

    @Value("${jwt.secret}")
    private String jwtKey;

    public user register(String username, String password){
        BCryptPasswordEncoder enc = new BCryptPasswordEncoder();
        user u = new user(username, enc.encode(password));
        repo.save(u);
        return u;
    }
    public String login(String username, String password){
        BCryptPasswordEncoder enc = new BCryptPasswordEncoder();

        user u = repo.findById(username).orElse(null);

        if(u == null || !enc.matches(password, u.password) ){
            return null;
        }

        Algorithm alg = Algorithm.HMAC256(jwtKey);
        return JWT.create().withSubject(u.username).sign(alg);
       
    }

    public String validateJwt(String jwtToken) {
        Algorithm alg = Algorithm.HMAC256(jwtKey);
        JWTVerifier verifier = JWT.require(alg).build();

        try {
            DecodedJWT jwt = verifier.verify(jwtToken);
            return jwt.getSubject();
        } catch (JWTVerificationException e){
        }

        return null;
    }
}
