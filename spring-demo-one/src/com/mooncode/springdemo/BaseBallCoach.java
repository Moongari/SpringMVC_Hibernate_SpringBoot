package com.mooncode.springdemo;

public class BaseBallCoach implements ICoach{
	
	// define a private field for the dependency
	
	private FortuneService fortuneService;
	
	public BaseBallCoach() {
	}


	// define a contructor for dependency injection
	
	public BaseBallCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	
	@Override
	public String getDailyWorkout() {
		
		return "spend 30 minutes on batting practice";
	}

	@Override
	public String getDailyFortune() {
		
		//use my fortuneService to get a fortune
		return fortuneService.getFortune();
	}




}
