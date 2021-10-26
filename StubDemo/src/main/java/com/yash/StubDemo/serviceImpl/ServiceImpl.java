package com.yash.StubDemo.serviceImpl;
import java.util.ArrayList;
import java.util.List;

import com.yash.StubDemo.service.Service;

public class ServiceImpl{

	public Service service;

	public ServiceImpl(Service service) {
		this.service = service;
	}

	public List<String> getData(String user){
		List<String> data = new ArrayList<String>();
		List<String> list1= service.getlist(user);
		
		for(String list : list1) {
			if(list.contains("Spring")) {
				data.add(list);
			}
		}
		return data;
	}

}
