package com.edu.sandbox.weather.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class DummyController {


    @RequestMapping
    public ResponseEntity test() {
        return ResponseEntity.ok().build();
    }


}
