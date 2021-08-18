package com.yash.streams;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class DateTime {

	public static void main(String[] args) {		
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
		LocalDateTime dt = LocalDateTime.now();
		System.out.println(dtf.format(dt));
		
		
		 Clock c = Clock.systemDefaultZone();      
		    System.out.println(c.getZone());
		    
		  
		   
		    
	}

}
