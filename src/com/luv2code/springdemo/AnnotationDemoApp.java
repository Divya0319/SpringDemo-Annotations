package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		
		// read spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// get the bean from spring container
		TennisCoach theCoach = context.getBean("tennisCoach", TennisCoach.class);
		
		// call a method on the bean
		System.out.println(theCoach.getDailyWorkout());
		
		// call the method to get daily fortune
		System.out.println(theCoach.getDailyFortune());
		
		// call email and team getters
		System.out.println(theCoach.getEmail());
		
		System.out.println(theCoach.getTeam());
		
		// close the context
		context.close();
	}
}
