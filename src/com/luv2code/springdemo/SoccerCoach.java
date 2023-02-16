package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class SoccerCoach implements Coach {
	
	@Autowired
	@Qualifier("fileReaderRandomFortuneService")
	private FortuneService fortuneService;

	@Override
	public String getDailyWorkout() {
		
		return "Run a hard 6k";
	}

	@Override
	public String getDailyFortune() {
		
		return fortuneService.getFortune();
	}

}
