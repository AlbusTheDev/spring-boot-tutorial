package com.qusaidev.springboot.springcoredemo.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Primary
public class TrackCoach implements Coach{

    public TrackCoach() {
        System.out.println(getClass().getSimpleName() + " has been init");
    }

    @PostConstruct
    public void startupStuff() {
        System.out.println(getClass().getSimpleName() + " has started up");
    }

    @PreDestroy
    public void cleanupStuff() {
        System.out.println(getClass().getSimpleName() + " is being cleaned up");
    }

    @Override
    public String getDailyWorkout() {
        return "Run for 30 minutes";
    }
}
