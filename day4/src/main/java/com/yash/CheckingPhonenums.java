package com.yash;

import java.util.ArrayList;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckingPhonenums {

	public static void main(String[] args) {
	
	ArrayList<String> phoneNumbers = new ArrayList<String>();
		phoneNumbers.add("0755276545");
		phoneNumbers.add("0755765426");
		phoneNumbers.add("0755265426");
		phoneNumbers.add("265426555");
		 
		phoneNumbers.add("515615655");
		 
		String regex = "^(\\+\\d{0,7}\\s)?\\(?\\d{3}\\)?[\\s.-]?\\d{3}[\\s.-]?\\d{4}$";
		 
		Pattern pattern = Pattern.compile(regex);
		 
		for(String Check : phoneNumbers)
		{
		    Matcher matcher = pattern.matcher(Check);
		    System.out.println(Check +" : "+ matcher.matches());
		}
		 

	}

}
