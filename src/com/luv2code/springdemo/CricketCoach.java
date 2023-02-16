package com.luv2code.springdemo;

public class CricketCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public CricketCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		
		return "Do batting practice for 30 mins";
	}

	@Override
	public String getDailyFortune() {
		
		return fortuneService.getFortune();
	}

}
