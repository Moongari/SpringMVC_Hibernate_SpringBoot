package com.mooncode.springdemo;

public class TrackCoach implements ICoach {

	
	
	// define a private field for the dependency
	
	private FortuneService fortuneService;
	
	// define a contructor for dependency injection
	
	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	
	
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Run a hard 10 km !";
	}

	public TrackCoach() {
	
	}



	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
