package com.java.MyTestClasses;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.java.MyClasses.Sum_of_Square_itsDifference;

public class test_Sum_of_Square_itsDifference 
{
	int num,difference;
	
	@Test
	public void ifInput_isOne_shoiuldReturn_Zero()
	{
		Sum_of_Square_itsDifference cal_diff = new Sum_of_Square_itsDifference();
		assertEquals(cal_diff.CalculateDifference(1), 0);
	}
	
	@Test
	public void ifInput_is_greaterThanOne_shoiuldReturn_Difference()
	{
		Sum_of_Square_itsDifference cal_diff = new Sum_of_Square_itsDifference();
		assertEquals(cal_diff.CalculateDifference(num), difference);
	}
}
