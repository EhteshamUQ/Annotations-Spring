package com;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach{

    private FortuneService sadFortuneService;
    @Value("${coach.email}")
    private String email;
    @Value("${coach.team}")
    private String team;

    public String getEmail() {
        return email;
    }

    public String getTeam() {
        return team;
    }

    public SwimCoach(FortuneService sadFortuneService) {
        this.sadFortuneService = sadFortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Swim 100m * 4";
    }

    @Override
    public String getMyFortune() {
        return sadFortuneService.getFortune();
    }
}
