package com.moonDemo.noXml;

import org.springframework.stereotype.Component;

@Component
public class DataBaseFortuneService implements FortuneService {

	@Override
	public String getFortuneService() {
	
		return "Connection a la Database.";
	}

	
}
