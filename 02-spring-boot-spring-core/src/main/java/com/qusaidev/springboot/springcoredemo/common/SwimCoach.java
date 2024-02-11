package com.qusaidev.springboot.springcoredemo.common;

public class SwimCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "Swim for half an hour";
    }
}
