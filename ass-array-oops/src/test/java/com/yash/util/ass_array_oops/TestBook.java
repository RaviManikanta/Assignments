package com.yash.util.ass_array_oops;

//import static org.junit.Assert.*;

//import org.junit.Test;

public class TestBook {
	   public static void main(String[] args) {
	   
	      Author ahTeck = new Author(" sirerra", "bert@someperson.com", 'm');
	      System.out.println(ahTeck);  
	     
	      Book dummyBook = new Book("head first java", ahTeck, 9.99, 99);
	      System.out.println(dummyBook); 
	      dummyBook.setPrice(8.88);
	      dummyBook.setQty(88);
	      System.out.println("name is: " + dummyBook.getName());
	   
	      System.out.println("price is: " + dummyBook.getPrice());
	  
	      System.out.println("qty is: " + dummyBook.getQty());
	   
	      System.out.println("author is: " + dummyBook.getAuthor()); 
	     
	      System.out.println("author's name is: " + dummyBook.getAuthor().getName());
	     
	      System.out.println("author's email is: " + dummyBook.getAuthor().getEmail());
	     
	      System.out.println("author's gender is: " + dummyBook.getAuthor().getGender());
	 
	      Book moreDummyBook = new Book("head first hjava",
	            new Author("Kathy sirerra", "kathy@nowhere.com", 'f'),19.99, 8);
	      System.out.println(moreDummyBook);  
	     
	   }
	}

