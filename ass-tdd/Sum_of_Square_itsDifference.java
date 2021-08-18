package com.java.MyClasses;

public class Sum_of_Square_itsDifference 
{

	public Object CalculateDifference(int i) 
	{
		if(i>1)
		{
			int num=10, sum_of_square=0, square_of_sum, sum=0, difference;		

			System.out.println("Number you want upto natural numbers: "+num);
		

			for(i=1; i<=num; i++)
			{			
				sum_of_square+=(i*i);
			} 
				
			System.out.println("Sum of square is: "+sum_of_square);	

			
			for(i=1; i<=num; i++)
			{			
				sum+=i;
			} 

			square_of_sum=(sum*sum);

			System.out.println("Square of sum is: "+square_of_sum);

			difference = sum_of_square - square_of_sum;

			System.out.println("Difference between Sum of square and square of sum is: "+difference);
				return difference;
		}
		else
			return 0;
	}

}
