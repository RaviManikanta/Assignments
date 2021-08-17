package com.yash;


import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class PrintsYashMails {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		String[] mails=new String[2];
		for (int i=0;i<2;i++) {

			System.out.print(i+"enter your mail: ");
			mails[i]=in.nextLine();
			
		}
		in.close();//in never close exception
        
		String regex = "^[a-z.]+@(?:[yash.com])+$";

		Pattern pattern = Pattern.compile(regex);

		for(String Check : mails )
		{
			Matcher matcher = pattern.matcher(Check);
			System.out.println(Check +" : "+ matcher.matches());
		}

	}

}
