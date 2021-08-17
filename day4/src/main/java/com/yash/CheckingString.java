package com.yash;

public class CheckingString {

	public static void main(String[] args) {

		String string = "one 9two4 three7 four1five";
		char[] chars = string.toCharArray();
		
		StringBuilder le = new StringBuilder();
		for(char c : chars){
			if(Character.isLetter(c)){
				le.append(c);

			}

		}
		StringBuilder di = new StringBuilder();
		for(char c : chars){
			if(Character.isDigit(c)){
				di.append(c);

			}

		}
		System.out.println(di);
		System.out.println(le);


	}
}

