package com.luv2code.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PracticeSpringConfig {
	
	@Bean
	public CoolFortuneService coolFortuneService() {
		return new CoolFortuneService();
	}
	
	@Bean
	public Coach cricketCoach() {
		CricketCoach myCricketCoach = new CricketCoach(coolFortuneService());
		
		return myCricketCoach;
	}

}
