package com;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoApp {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //     Coach tenCoach = context.getBean("TennyCoach" , Coach.class);
        //Default bean Id
        TennisCoach tenCoach = context.getBean("tennisCoach" , TennisCoach.class);
        System.out.println(tenCoach.getDailyWorkout());
        System.out.println(tenCoach.getMyFortune());

    }
}
