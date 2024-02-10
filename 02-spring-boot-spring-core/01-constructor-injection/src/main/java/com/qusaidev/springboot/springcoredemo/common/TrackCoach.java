package com.qusaidev.springboot.springcoredemo.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class TrackCoach implements Coach{

    public TrackCoach() {
        System.out.println(getClass().getSimpleName() + " has been init");

    }

    @Override
    public String getDailyWorkout() {
        return "Run for 30 minutes";
    }
}
