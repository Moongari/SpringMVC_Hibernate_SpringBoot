package com.mooncode.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		
		
		// load the spring configuration file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//Retrieve bean from spring container
		ICoach theCoach = context.getBean("myCoach",ICoach.class);
		
		
		// call methods on the bean
		
		System.out.println(theCoach.getDailyWorkout());
		
		//let's call our new methode for FortuneService 
		System.out.println(theCoach.getDailyFortune());
		
		

		// close the context 
		
		context.close();

	}

}
