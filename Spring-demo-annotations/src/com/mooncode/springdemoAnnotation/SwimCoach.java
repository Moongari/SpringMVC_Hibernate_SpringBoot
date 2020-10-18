package com.mooncode.springdemoAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SwimCoach implements ICoach {
	
	
	
	@Value("${foo.email}")
	private String email;
	
	@Value("${foo.team}")
	private String team;
	
	@Autowired
	@Qualifier("restFortuneService")
	private FortuneService fortuneservice;
	
	public SwimCoach() {
		System.out.println(">>> injection by Field : SwimCoach");
	}

	public String getEmail() {
		return email;
	}

	public String getTeam() {
		return team;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Nage papillon et, nage crowl...";
	}

	@Override
	public String OtherWork() {
		// TODO Auto-generated method stub
		return fortuneservice.getFortuneService();
	}

}
