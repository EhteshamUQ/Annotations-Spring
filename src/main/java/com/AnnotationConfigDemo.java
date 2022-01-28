package com;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationConfigDemo {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AnnotationConfiguration.class);
        //Default bean Id
        Coach theCoach = context.getBean("swimCoach" , Coach.class);
        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getMyFortune());
        SwimCoach swimCoach = (SwimCoach)theCoach;
        System.out.println(swimCoach.getEmail());
        System.out.println(swimCoach.getTeam());
        context.close();

    }
}
