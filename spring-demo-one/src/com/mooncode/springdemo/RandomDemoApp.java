package com.mooncode.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RandomDemoApp {

	public static void main(String[] args) {
	
		// load the spring configuration file
				ClassPathXmlApplicationContext context = 
						new ClassPathXmlApplicationContext("applicationContext.xml");
				
				// retrieve bean froim spring container
				GymCoach GymCoach = context.getBean("myCoach",GymCoach.class);
				
				
				// call methods on the bean
				System.out.println(GymCoach.getDailyWorkout());
				
				//let's call our new methode for FortuneService 
				System.out.println(GymCoach.getDailyFortune());
				
		
		
				context.close();

	}

}
