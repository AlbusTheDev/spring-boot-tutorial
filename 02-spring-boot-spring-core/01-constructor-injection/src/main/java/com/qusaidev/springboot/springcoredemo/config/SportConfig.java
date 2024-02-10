package com.qusaidev.springboot.springcoredemo.config;

import com.qusaidev.springboot.springcoredemo.common.Coach;
import com.qusaidev.springboot.springcoredemo.common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {

    @Bean
    public Coach swimCoach() {
        return new SwimCoach();
    }
}
