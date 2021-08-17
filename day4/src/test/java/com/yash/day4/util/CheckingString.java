package com.yash.day4.util;

import static org.junit.Assert.*;

import org.junit.Test;

public class CheckingString {

	@Test
	public void test_Print_ValuesIn_GivenString() {
		CheckingStr cs= new CheckingStr();
		cs.append(st);
		String st="one 9two4 three7 four1five";
		String op="one 9two4 three7 four1five";
		assertEquals(st,op);
		
	}

}
