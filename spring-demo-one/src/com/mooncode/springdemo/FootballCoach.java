package com.mooncode.springdemo;

public class FootballCoach implements ICoach {

	// define a private field for the dependency
	
	private FortuneService fortuneService;
	

	/**
	 * 
	 */
	public FootballCoach() {
		
	}
	
	public FootballCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "drible et jongle avec le ballon 24 min !!!";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "just do it : " + fortuneService.getFortune();
	}




}
