package com.SpringCoreDemo.SetterInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    private Coach myCoach;

    @Autowired
    public void setMyCoach(Coach myCoach)
    {
        this.myCoach = myCoach;
    }

    @GetMapping("/")
    public String getMyWorkout()
    {
        return myCoach.getMyDailyWorkout();
    }

}
