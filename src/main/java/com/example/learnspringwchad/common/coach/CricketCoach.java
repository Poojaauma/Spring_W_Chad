package com.example.learnspringwchad.common.coach;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {


    public CricketCoach() {
        System.out.println("Cricket Coach");
    }

    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15 minutes!!!";
    }
}
