package com.mooncode.springdemoAnnotation;

import org.springframework.stereotype.Component;

@Component("BadCoach")
public class TennisCoach implements ICoach {

	@Override
	public String getDailyWorkout() {

		return "tu devrais ameliorer ton coup droit !";
	}
	
	@Override
	public String OtherWork() {
		return "cours plus vite sur le cour....!";
	}

}
