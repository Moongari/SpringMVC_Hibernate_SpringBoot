package com.mooncode.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApp {

	public static void main(String[] args) {
		
		//load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("BeanLifeCycle-applicationContext.xml");
		
		// retrieve bean from spring container
		
		ICoach theCoach = context.getBean("myCoach",ICoach.class);
		
		// call methods on the bean
		System.out.println(theCoach.getDailyWorkout());
		

		context.close();

	}

}
