package com.springboot.travelblog.travelblogapp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    @Value("${traveller.name}")
    private String travellerName;

    @Value("${location.name}")
    private String locationName;

    @GetMapping("/bloginfo")
    public String getBlogInfo() {
        return "Traveller: " + travellerName + ", Location: " + locationName;
    }

    @GetMapping("/")
    public String sayHello() {
        return "Hello World!";
    }

    @GetMapping("/workout")
    public String getDailyWorkout() {
        return "Run a hard 5k";
    }

    @GetMapping("/fortune")
    public String getDailyFortune() {
        return "Today is your lucky day.";
    }
}
