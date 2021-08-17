package com.yash.day4.util;

import java.util.regex.Pattern;
import java.util.ArrayList;
import java.util.regex.*;

public class Landlinenums {

	public static boolean matches(String s) {
		Pattern p = Pattern.compile("0755");
		Matcher m = p.matcher(s);
		return (m.matches());
	
	}
	public static void main (String[] args) {
		String s = "25362663";
		String s_1="0755";
		ArrayList<Long> list = new ArrayList<>();
		
		 list= {0758,0755,3249};
		if(matches(s)) 
			System.out.println("valid number");
			else 
				System.out.println("invalid number");
			
		if (matches(s_1))
			System.out.println("valid number");
		else
			System.out.println("invalid number");
			
	}
	

}
