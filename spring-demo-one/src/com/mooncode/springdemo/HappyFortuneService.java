package com.mooncode.springdemo;

import java.util.Random;

public class HappyFortuneService implements FortuneService {
	
	
	private String[] arrayFortune = {"I'am Happy","Good job","Repeat Again"};
	
	

	@Override
	public String getFortune() {
		
		return "i'am very happy for your job !";
	}


	public String getRandomFortune() {
		Random random = new Random();
		int rd = random.nextInt(3);
		
		return arrayFortune[rd].toString();
	}

}
