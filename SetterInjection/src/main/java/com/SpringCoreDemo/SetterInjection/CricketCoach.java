package com.SpringCoreDemo.SetterInjection;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach{

    @Override
    public String getMyDailyWorkout()
    {
        return "Practice Catch-Catch for 15 minutes";
    }
}
