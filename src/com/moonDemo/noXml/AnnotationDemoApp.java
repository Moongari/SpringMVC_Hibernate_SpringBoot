package com.moonDemo.noXml;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		// read spring config file
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportiveConfig.class);
		
		// get the bean from spring container
		// ici on appele le component definit dans la class TennisCoach
		ICoach theCoach = context.getBean("boxeCoach",ICoach.class);

		System.out.println("---------------Boxe----------------");
		
		// call method on the bean
		System.out.println(theCoach.getDailyWorkout());
		
		System.out.println(theCoach.OtherWork());
		

		System.out.println("---------------END----------------");
	

		// close the context
		context.close();
		
		

	}

}
