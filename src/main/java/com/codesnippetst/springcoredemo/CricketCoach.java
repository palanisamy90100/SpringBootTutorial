package com.codesnippetst.springcoredemo;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach{

    @Override
    public String getDailyWorkout() {
        return "Practice Batting/Bowling for 30min!! !";
    }
}
