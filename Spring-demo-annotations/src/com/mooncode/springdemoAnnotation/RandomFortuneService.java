package com.mooncode.springdemoAnnotation;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	// define a data Array
	
	public String[] data = {
			"Attention au loup","Oups les loups sont la !","Bonne chance mon gars"
	};
	
	private Random rd = new Random();
	
	@Override
	public String getFortuneService() {
		
		
		return data[rd.nextInt(data.length)];
	}

}
