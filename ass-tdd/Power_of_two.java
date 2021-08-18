package com.java.MyClasses;

public class Power_of_two 
{
	boolean flag;
	public Object CheckNumber(int num) 
	{
		if(num>2)
		{
			num=16;
			while(num!=1)
			{
				if(num%2!=0)
				{
					;
					break;
				}
				num/=2;
			}
			
			return true;
		}
		else
			return false;
	}

}
