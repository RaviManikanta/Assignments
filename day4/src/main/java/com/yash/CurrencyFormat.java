package com.yash;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class CurrencyFormat {

	public static void main(String[] args) {
		System.out.println("Input: ");
		Scanner sc = new Scanner(System.in);
		double payment = sc.nextDouble();
		sc.close();
		Locale indiaLocale = new Locale("IN");
		NumberFormat india = NumberFormat.getCurrencyInstance(indiaLocale);
		System.out.println("Indian Format: "+india.format(payment));
	}

}
