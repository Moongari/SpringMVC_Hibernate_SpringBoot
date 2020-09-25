package com.mooncode.springdemo;

public class BasketCoach implements ICoach {

	
	private FortuneService fortuneService;
	
	
	//add new fields
	private String emailAdress;
	private String team;
	
	public String getEmailAdress() {
		return emailAdress;
	}

	public String getTeam() {
		return team;
	}

	// create a no arg constructor
	
	public BasketCoach() {
		System.out.println("BasketCoach : inside no-arg constructor");
	}
	
	
	
	// our setter method
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("BasketCoach : inside setter method- setFortuneService");
		
		this.fortuneService = fortuneService;
	}
	
	
	

	@Override
	public String getDailyWorkout() {
		
		return "Practice fast to put the ball in the Basket";
	}



	public BasketCoach(FortuneService fortuneService) {
		
		this.fortuneService = fortuneService;
	}


	@Override
	public String getDailyFortune() {

		return fortuneService.getFortune();
	}



	// create setter methods in class for injections
	public void setEmailAdress(String emailAdress) {
		System.out.println("BasketCoach : inside setter method- setEmailAdress");
		this.emailAdress = emailAdress;
	}




	public void setTeam(String team) {
		System.out.println("BasketCoach : inside setter method- setTeam");
		this.team = team;
	}

	
	
	
	
}
