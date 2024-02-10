package com.qusaidev.springboot.springcoredemo.common;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Primary
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class TrackCoach implements Coach{

    public TrackCoach() {
        System.out.println(getClass().getSimpleName() + " has been init");

    }

    @Override
    public String getDailyWorkout() {
        return "Run for 30 minutes";
    }
}
