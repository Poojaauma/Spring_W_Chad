package com.example.learnspringwchad.common.coach;

import org.springframework.stereotype.Component;

@Component
public class TrackCoach implements Coach{

    @Override
    public String getDailyWorkout() {
        return "Run 10 rounds around the track";
    }
}
