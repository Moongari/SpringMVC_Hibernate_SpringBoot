package com.mooncode.springdemoAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements ICoach {

	@Autowired
	@Qualifier("happyFortuneService")
	private FortuneService fortuneService;
	
	
	@Override
	public String getDailyWorkout() {

		return "tu devrais ameliorer ton coup droit !";
	}
	
	@Override
	public String OtherWork() {
		return fortuneService.getFortuneService();
	}
	
	
	
	

}
