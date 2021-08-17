package com.yash.util.ass_exceptionhandling;
/**
 * program to store a value into an array of incompatible class or type.
 * @author USER-PC
 *
 */

public class CheckException 
{
	void  badArrayStore (  )
	{
		int[]  storeArray  = new int[15]; 		 // An array of integers
		boolean[] boolArray  =new boolean[5];          // An array of booleans 
		
		try {
			System.arraycopy(storeArray, 2, boolArray, 2, 4);
			// Copy the element boolArray[3,4,5] into storeArray starting at storeArray[2]
			System.out.println(storeArray.length);
			System.out.println(boolArray);
		}
		catch(Exception e) 
		{
			System.out.println(e);
		}
	}
}