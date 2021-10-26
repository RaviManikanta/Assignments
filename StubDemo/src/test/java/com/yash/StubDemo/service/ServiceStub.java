package com.yash.StubDemo.service;

import java.util.Arrays;
import java.util.List;

public class ServiceStub implements Service{


	@Override
	public List<String> getlist(String users) {
		
		return Arrays.asList(" Use Core Java ", " Use Spring Core ", " Use Hibernate ", " Use Spring MVC ");
	}

}
