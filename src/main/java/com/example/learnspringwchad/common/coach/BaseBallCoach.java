package com.example.learnspringwchad.common.coach;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class BaseBallCoach implements Coach{

    public BaseBallCoach() {
        System.out.println("BaseBallCoach");
    }

    @Override
    public String getDailyWorkout() {
        return "Practice throw catch 100 times";
    }
}
