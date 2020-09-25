package com.mooncode.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
		
		
		// load the spring configuration file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// retrieve bean froim spring container
		BasketCoach basketCoach = context.getBean("myBasketCoach",BasketCoach.class);
		
		
		// call methods on the bean
		System.out.println(basketCoach.getDailyWorkout());
		
		//let's call our new methode for FortuneService 
		System.out.println(basketCoach.getDailyFortune());
		
		
		
		System.out.println(basketCoach.getEmailAdress());
		System.out.println(basketCoach.getTeam());
		//close the context
		context.close();
	}

}
