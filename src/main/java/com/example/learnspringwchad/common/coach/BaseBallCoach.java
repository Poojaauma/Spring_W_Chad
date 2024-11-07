package com.example.learnspringwchad.common.coach;

import org.springframework.stereotype.Component;

@Component
public class BaseBallCoach implements Coach{

    @Override
    public String getDailyWorkout() {
        return "Practice throw catch 100 times";
    }
}
