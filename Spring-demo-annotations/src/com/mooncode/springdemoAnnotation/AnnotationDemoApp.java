package com.mooncode.springdemoAnnotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		// read spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// get the bean from spring container
		// ici on appele le component definit dans la class TennisCoach
		ICoach theCoach = context.getBean("boxeCoach",ICoach.class);
		
		// call method on the bean
		System.out.println(theCoach.getDailyWorkout());
		
		System.out.println(theCoach.OtherWork());
		
		
		
		// close the context
		
		context.close();

	}

}
