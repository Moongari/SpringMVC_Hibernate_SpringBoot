package com.mooncode.springdemoAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BoxeCoach implements ICoach {
	
	
	private FortuneService fortuneService;
	
	
	@Autowired
	public BoxeCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Surveille ton uppercut mon gars";
	}

	@Override
	public String OtherWork() {
		// TODO Auto-generated method stub
		return fortuneService.getFortuneService();
	}

}
