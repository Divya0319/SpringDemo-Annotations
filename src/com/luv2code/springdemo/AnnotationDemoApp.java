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
		
		// call nthe method to get daily fortune
		System.out.println(theCoach.getDailyFortune());
		
		// close the context
		context.close();
	}
}
