package com.qusaidev.springboot.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach{

    public TennisCoach() {
        System.out.println(getClass().getSimpleName() + " has been init");

    }

    @Override
    public String getDailyWorkout() {
        return "Practice your backhand volley";
    }
}
