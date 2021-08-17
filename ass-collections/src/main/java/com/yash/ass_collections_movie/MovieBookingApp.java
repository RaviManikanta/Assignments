package com.yash.ass_collections_movie;

import java.util.Iterator;
import java.util.LinkedList;

import com.yash.ass_collections_hospital.Patient;

public class MovieBookingApp {

	public static void main(String[] args) {
		LinkedList<Ticket> t = new LinkedList<Ticket>();
		LinkedList<Customer>c=new LinkedList<Customer>();
         t.add(new Ticket(1,32,"12;15"));
         t.add(new Ticket(2,33,"12;15"));
         t.add(new Ticket(3,34,"12;15"));
         
         c.add(new Customer("anvesh","spiderman"));
         c.add(new Customer("ravi","onepiece"));
         
        c.addAll(t);
        
	}

}
