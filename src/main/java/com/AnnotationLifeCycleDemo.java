package com;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationLifeCycleDemo {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new
                ClassPathXmlApplicationContext("applicationContext.xml");
        Coach coach = context.getBean("tennisCoach" , Coach.class);
        Coach anotherCoach = context.getBean("tennisCoach" , Coach.class);
        System.out.println("Are these Same ? : " + (coach == anotherCoach));
        context.close();
    }
}
