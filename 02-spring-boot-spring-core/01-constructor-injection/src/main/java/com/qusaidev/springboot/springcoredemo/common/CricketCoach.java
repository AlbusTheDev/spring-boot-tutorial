package com.qusaidev.springboot.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {

    public CricketCoach() {
        System.out.println(getClass().getSimpleName() + " has been init");
    }

    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15 minutes!!!!";
    }
}
