package com.qusaidev.springboot.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements Coach{

    public BaseballCoach() {
        System.out.println(getClass().getSimpleName() + " has been init");

    }

    @Override
    public String getDailyWorkout() {
        return "Batting for half an hour";
    }
}
