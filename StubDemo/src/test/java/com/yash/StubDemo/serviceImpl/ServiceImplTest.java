package com.yash.StubDemo.serviceImpl;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import com.yash.StubDemo.service.Service;
import com.yash.StubDemo.service.ServiceStub;

public class ServiceImplTest {

	@Test
	public void test() {
		Service serviceStub = new ServiceStub();
		ServiceImpl serviceImpl = new ServiceImpl(serviceStub);
		
		List<String> data = serviceImpl.getData("Dummy");
		
		assertEquals(2, data.size());
		System.out.println("stub is working correctly");
		
	}

}
