package com.example.learnspringwchad.rest;

import com.example.learnspringwchad.common.coach.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    public Coach myCoach;
//  Constructor Injection
    @Autowired
    public DemoController(@Qualifier("trackCoach") Coach coach) {
        myCoach = coach;
    }

    //Setter Injection
//    @Autowired
//    public void setMyCoach(Coach myCoach) {
//        this.myCoach = myCoach;
//    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkout() {
        return myCoach.getDailyWorkout();
    }
}
