package com.yash.exceptionhandling2;

import java.util.Scanner;
public class IndexTest 
{
	public static void main(String[] args)
	{
		String[] names = {"ravi", "sam","anvesh", "michael","tom", "Andrew", "Wlliam", "Joseph", "Matthew", "snoopy"};
		String integer;
		try
		{
			System.out.println("enter an integer from 1 to 10 to display a name");
			Scanner input= new Scanner(System.in);
			integer = input.nextLine(); 
			int i = Integer.parseInt(integer);
			i = i-1;
			System.out.println(names[i]);
			input.close();
		}
		catch (Exception e){
			System.out.println(e);
			System.out.println("Your number is out of range");
		}

	}	
}