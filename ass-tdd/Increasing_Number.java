package com.java.MyClasses;

public class Increasing_Number 
{


	boolean flag;
	public boolean CheckNumber(int num) 
	{	
		if(num==1)
		{
			return false;
		}	
		else
		{	
		  num=1234;
			int currentDigit = num % 10;
			num = num/10;
	        
			while(num>0)
			{
	           if(currentDigit <= num % 10)
	           {
	               flag = true;
	               break;
	           }

	           currentDigit = num % 10;
	           num = num/10;
	       }
	        
			if(flag)
			{
	           return true;
			}
			else
			{
				return false;
			}	
		}
	}
	
}	


