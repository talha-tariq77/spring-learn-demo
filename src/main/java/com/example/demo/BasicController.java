package com.example.demo;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasicController {

    @CrossOrigin(origins = "http://127.0.0.1:5500")
    @GetMapping("/{scoreUpdate}")
    public String testingThing(@PathVariable String scoreUpdate) {
        String returnVar = scoreUpdate + "33";
        System.out.println("hi");
        return returnVar;
    }
}
