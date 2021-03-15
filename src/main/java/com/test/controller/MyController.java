package com.test.controller;


import com.test.services.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.test.model.MyObject;

// annotation for rest com.test.controller
@RestController
@RequestMapping(path = "/api")
public class MyController {

    @Autowired
    MyService myService;

    //This annotation can be used both at the class and at the method level.
    @RequestMapping("")
    public String index() {
        return "Greetings from Spring Boot!";
    }

    // Specific to Get Mapping
    @GetMapping("/object")
    public ResponseEntity<MyObject> getMyObject() {
        return new ResponseEntity<MyObject>(myService.getMyObject(), HttpStatus.OK);
    }
}
