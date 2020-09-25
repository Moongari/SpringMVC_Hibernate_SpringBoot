package com.mooncode.springdemo;

import java.util.Random;

public class RandomFortuneService implements FortuneService {

	
	private String[] arrayFortune = {"I'am Happy","Good job","Repeat Again","Faut te bouger mon gars !!"};
	
	private Random rand = new Random();
	
	
	
	@Override
	public String getFortune() {
		return arrayFortune[rand.nextInt(arrayFortune.length)];
	}

}
