package com.qusaidev.springboot.firstapp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    @Value("${coach.name}")
    private String coach;

    @Value("${team.name}")
    private String team;

    @Value("")

    @GetMapping("/")
    public String sayHello() {

        return "<h1>Hello " + coach + ", " + team + "</h1>";
    }

    // expose a new endpoint of workout
    @GetMapping("/workout")
    public String getDailyWorkout() {
        return "Run a hard 5k!";
    }

    @GetMapping("/lol")
    public String getDailyLols() {
        return "Cats! llksds";
    }
}
