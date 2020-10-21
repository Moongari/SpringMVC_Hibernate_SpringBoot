package com.moonDemo.noXml;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BoxeCoach implements ICoach {
	
	@Autowired
	@Qualifier("randomFortuneService") // attention il faut utiliser une minuscule pour injecter cette classe 
	private FortuneService fortuneService;
	
	
	public BoxeCoach() {
		System.out.println(">> BoxeCoach : inside default constructor");
	}
	
	// define a setter method
	/*
	 * @Autowired public void myFortuneService(FortuneService thefortuneService) {
	 * System.out.println(">> BoxeCoach : inside default myFortuneService() method"
	 * ); fortuneService =thefortuneService; }
	 */

	/*
	 * @Autowired public BoxeCoach(FortuneService fortuneService) {
	 * this.fortuneService = fortuneService; }
	 */
	
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
