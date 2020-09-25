package com.mooncode.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopDemoApp {

	public static void main(String[] args) {
		
		//load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("BeanScope-applicationContext.xml");
		
		// retrieve bean from spring container
		
		ICoach theCoach = context.getBean("myCoach",ICoach.class);
		
		ICoach SecondCoach = context.getBean("myCoach",ICoach.class);
		
		// check if they are the same
		
		boolean result =(theCoach == SecondCoach);
		
		//print out the results
		
		System.out.println("\nPointing to the same object " + result);
		
		System.out.println("\nMemory location for theCoach " + theCoach);
		System.out.println("\nMemory location for SecondCoach " + SecondCoach+"\n");
		
		context.close();

	}

}
