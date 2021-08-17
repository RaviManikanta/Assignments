package com.yash.exceptionhandling2;

import java.util.Scanner;  

public class DoubleParseDouble
{  
    public static void main(String[] args) 
    {  
    Scanner scanner = new Scanner(System.in);  
    try {  
        System.out.print("Enter any string:");  
        String str = scanner.next();  
        Double d1 = Double.parseDouble(str);  
        String str1="null";  
        Double d2 = Double.parseDouble(str1);  
        System.out.println("1. Double value = " + d1);  
        System.out.println("2. Double value = " + d2);  
    }
    catch (NullPointerException e)
    {  
        System.out.println("An exception "+e+" has occured.\nPlz enter a valid double integer");  
    }
    catch (NumberFormatException ex)
    {  
        System.out.println("An exception "+ex+" has occured.\nPlz enter a valid double integer");  
    } 
    finally 
    {
    	scanner.close();
    }
  }  
}