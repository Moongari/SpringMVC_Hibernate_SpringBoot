package com.mooncode.springdemo;

public class MyApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// create the object
		//BaseBallCoach theCoach = new BaseBallCoach();
		
		// je remplace par l'interface et cela fonctionne toujours
		
		ICoach theCoach = new BaseBallCoach(null);
		ICoach theCoach2 = new TrackCoach();
		ICoach theCoach3 = new FootballCoach();
		
		// use the object
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach2.getDailyWorkout());
		System.out.println(theCoach3.getDailyWorkout());
	}

}
