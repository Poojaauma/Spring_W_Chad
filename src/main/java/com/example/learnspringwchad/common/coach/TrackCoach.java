package com.example.learnspringwchad.common.coach;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary // Note Qualifier has highest priority over Primary and Use of Qualifier is recommended
public class TrackCoach implements Coach{


    public TrackCoach() {
        System.out.println("Track Coach");
    }

    @Override
    public String getDailyWorkout() {
        return "Run 10 rounds around the track";
    }
}
