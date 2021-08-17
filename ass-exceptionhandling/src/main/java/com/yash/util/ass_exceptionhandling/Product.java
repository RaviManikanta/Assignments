package com.yash.util.ass_exceptionhandling;

public class Product {

	public static void main(String[] args) {

		String[] a= {"pen","book","papers","bag",null};
		
		
		 try {
			 System.out.println(a.length);
			 for (int i = 0; i < a.length; i++) {  
		            System.out.print(a[i] + " ");		            
	           
	        } 
		 }
		 catch(NullPointerException e) {
			 e.printStackTrace();
	            System.out.println("NullPointerException........at catch");
	        }

	}

}
