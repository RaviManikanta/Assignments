package com.java.MyTestClasses;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.java.MyClasses.Increasing_Number;

public class test_Increasing_Number
{
	int num;
	boolean flag;
	
	@Test
	public void ifInput_is_One_shouldReturn_False() 
	{
		Increasing_Number inc_num = new Increasing_Number();
		assertEquals(inc_num.CheckNumber(1),false);
		
	}
	
	@Test
	public void ifInput_is_greaterThan_One_thenCheckNumberIs_Increasing_orNot() 
	{
		Increasing_Number inc_num = new Increasing_Number();
		assertEquals(inc_num.CheckNumber(num),flag);
		
	}
}
