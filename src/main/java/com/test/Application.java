package com.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
//TODO build pokemon constructor /class
//TODO populate the DB
//TODO Build Interface
//TODO Build Business layer
//TODO GET: /pokemon/{id} Returns pokemon
//TODO PUT: /pokemon/{id} Updates pokemon
//TODO POST: /pokemon Add pokemon
//TODO GET: /pokemon Returns list of pokemon
//TODO POST: /pokemon/battle (takes in 2 pokemon) Returns the winning pokemon
//TODO CHALLENGE: updates history table

@SpringBootApplication
public class Application extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}