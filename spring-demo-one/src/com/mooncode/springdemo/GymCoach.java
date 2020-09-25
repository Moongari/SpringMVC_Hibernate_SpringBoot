package com.mooncode.springdemo;

public class GymCoach implements ICoach {
	

	private FortuneService fortuneService;
	
	
	
	
	public GymCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "entraine toi pour améliorer tes saltos avant et arriere !";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
