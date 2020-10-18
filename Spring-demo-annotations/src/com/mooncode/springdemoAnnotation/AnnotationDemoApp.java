package com.mooncode.springdemoAnnotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		// read spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// get the bean from spring container
		// ici on appele le component definit dans la class TennisCoach
		ICoach theCoach = context.getBean("boxeCoach",ICoach.class);
		ICoach theCoachTennis = context.getBean("tennisCoach",ICoach.class);
		
		SwimCoach theCoachSwim = context.getBean("swimCoach",SwimCoach.class);
		
		System.out.println("---------------Boxe----------------");
		// call method on the bean
		System.out.println(theCoach.getDailyWorkout());
		
		System.out.println(theCoach.OtherWork());
		
		System.out.println("---------------TENNIS----------------");
		System.out.println(theCoachTennis.getDailyWorkout());
		
		System.out.println(theCoachTennis.OtherWork());
		
		System.out.println("---------------SWIM----------------");
		
		System.out.println(theCoachSwim.getDailyWorkout());
		
		System.out.println(theCoachSwim.OtherWork());
		System.out.println(theCoachSwim.getEmail());
		System.out.println(theCoachSwim.getTeam());
		
		System.out.println("---------------END----------------");
		
		// close the context
		
		context.close();

	}

}
