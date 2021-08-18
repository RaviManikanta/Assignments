package com.java.MyTestClasses;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.java.MyClasses.Power_of_two;

public class test_Power_of_two 
{
	int num;
	boolean flag;
	@Test
	public void ifInputis_lessThan_Two_Return_False()
	{
		Power_of_two p_two = new Power_of_two();
		assertEquals(p_two.CheckNumber(1), false);
	}
	
	@Test
	public void ifInputis_greaterThan_Two_thenCheckNumber_isPowerof_two_orNot()
	{
		Power_of_two p_two = new Power_of_two();
		assertEquals(p_two.CheckNumber(num), flag);
	}
}
