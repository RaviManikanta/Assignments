package com.yash;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckingAdharcard {

	public static void main(String[] args) {
		ArrayList<String> adharCard = new ArrayList<String>();
		adharCard.add("3646-2598-7893");
		adharCard.add("36461-2598-7893");
		adharCard.add("364-2598-7893");
		adharCard.add("0646-2598-7893");		 
		adharCard.add("3646-02598-789");
		 
		String regex = "^[0-9]{4}[-][0-9]{4}[-][0-9]{4}$";
		 
		Pattern pattern = Pattern.compile(regex);
		 
		for(String Check : adharCard)
		{
		    Matcher matcher = pattern.matcher(Check);
		    System.out.println(Check +" : "+ matcher.matches());
		}

	}

}
