package com.yash;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CreatingPassword {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String[] password=new String[2];
		for (int i=0;i<2;i++) {

			System.out.print(i+"enter your password: ");
			password[i]=in.nextLine();
			
		}
		in.close();//in never close exception
        
		String regex = "^[A-S]\\d*[02468][a-z0-9_-]{3,19}$";

		Pattern pattern = Pattern.compile(regex);

		for(String Check : password )
		{
			Matcher matcher = pattern.matcher(Check);
			System.out.println(Check +" : "+ matcher.matches());
		}


	}

}
