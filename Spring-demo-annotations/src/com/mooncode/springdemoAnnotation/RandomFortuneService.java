package com.mooncode.springdemoAnnotation;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	// define a data Array
	private Random rd = new Random();
	
	public String[] data = {
			"Uppercute du droit ","Crochet du gauche","Esquive bien !!"
	};
	
	
	
	@Override
	public String getFortuneService() {
		
		
		return data[rd.nextInt(data.length)];
	}

}
