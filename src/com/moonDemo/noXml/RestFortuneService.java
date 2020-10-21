package com.moonDemo.noXml;
import org.springframework.stereotype.Component;

@Component
public class RestFortuneService implements FortuneService {

	@Override
	public String getFortuneService() {

		return "Get API Rest....";
	}

	
}
