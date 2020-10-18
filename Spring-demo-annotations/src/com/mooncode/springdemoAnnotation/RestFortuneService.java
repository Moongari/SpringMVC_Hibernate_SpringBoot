package com.mooncode.springdemoAnnotation;
import org.springframework.stereotype.Component;

@Component
public class RestFortuneService implements FortuneService {

	@Override
	public String getFortuneService() {

		return "Get API Rest....";
	}

}
