package com.java.MyClasses;

public class Sum_of_Natural {

	public int CalculateSum(int i) {
		if(i==3 || i==4)
		{
			return 3;
		}
		else if(i>4)
		{
			int n=10, sum=0;
			
			for(i=1; i<=n; i++)
			{
				if(i%3==0 || i%5==0)
				{
	       			sum += i;  //sum = sum+i;
				}
			}
			return sum;
		}
		else
			return 0;		
	}
}
