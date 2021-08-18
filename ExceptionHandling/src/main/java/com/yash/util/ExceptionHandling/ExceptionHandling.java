package com.yash.util.ExceptionHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * crating a class to show default behavior of exceptions
 * @author USER-PC
 *
 */
public class ExceptionHandling {
	public static void main(String args[])
	{
		
		int[]num= {1,2,3,4,5,6,7};
		try {
		 String name="yash";
		System.out.println(name.length());
		 System.out.println(num[9]);            //raises array index out of bounds exception
		
		}
		catch(Exception e) {
			e.printStackTrace();
			System.out.print(num.length);
			System.out.println("  at catch");
		}
		finally
		{
			System.out.print(num[4]);
			System.out.println("  at finally");
		}
	
/////-------------------------------------------////////
		
		try {
			int k=5/0;          //raises arthmeticexception
		    System.out.println(k);
		      System.out.println("Rest of code in try block");
		    }
		    
		    catch (Exception e) {
		     e.printStackTrace();		   
		     System.out.println("Arthimatic exception ......at catch");		      
		    }
		
		
/////////--------------------------------------////////////
		
		 try {
	            String a = null; //raises nullpointer exception
	            System.out.println(a.charAt(2));
	        } 
		 catch(NullPointerException e) {
			 e.printStackTrace();
	            System.out.println("NullPointerException........at catch");
	        }
/////////-----------------------------------------------////////////
		  try {
			  
	            // Following file does not exist
	            File file = new File("E:// file.txt");
	  
	            FileReader fr = new FileReader(file);
	        }
	        catch (FileNotFoundException e) {
	            System.out.println("File does not exist");
	        }
		 
	}

}
