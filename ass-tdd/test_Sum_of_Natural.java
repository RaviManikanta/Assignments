package com.java.MyTestClasses;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.java.MyClasses.Sum_of_Natural;


public class test_Sum_of_Natural 
{
	int  n, sum=0;
	
	@Test
	public void ifInput_is_One_shouldReturn_Zero()
	{
		Sum_of_Natural cal_sum = new Sum_of_Natural();
		assertEquals(cal_sum.CalculateSum(1), 0);
		
	}
	
	@Test
	public void ifInput_is_Two_shouldReturn_Zero()
	{
		Sum_of_Natural cal_sum = new Sum_of_Natural();
		assertEquals(cal_sum.CalculateSum(2), 0);
		
	}

	@Test
	public void ifInput_is_Three_shouldReturn_Value()
	{
		Sum_of_Natural cal_sum = new Sum_of_Natural();
		assertEquals(cal_sum.CalculateSum(3), 3);
		
	}
	
	@Test
	public void ifInput_is_Four_shouldReturn_Value()
	{
		Sum_of_Natural cal_sum = new Sum_of_Natural();
		assertEquals(cal_sum.CalculateSum(4), 3);
		
	}
	
	@Test
	public void ifInput_is_greaterThanFour_shouldReturn_Value()
	{
		Sum_of_Natural cal_sum = new Sum_of_Natural();
		assertEquals(cal_sum.CalculateSum(n), sum);
		
	}
}
