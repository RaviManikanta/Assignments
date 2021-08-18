package com.yash.linkedlist;

import java.util.LinkedList;
/**
 * performs various methods in linkedlist
 * @author USER-PC
 *
 */

public class DemoOnLinkedList 
{
	public static void main(String[] args){
		// create linkedlist
		LinkedList<String> animals = new LinkedList<>();
		animals.add("Dog");
		animals.add("Cat");
		animals.add("Cow");
		System.out.println( animals);

		// add() method with the index parameter
		animals.add(1, "Horse");
		System.out.println(animals);

		// add elements at the end
		animals.addLast("Zebra");
		System.out.println(animals);

		// remove the first element
		animals.removeFirst();
		System.out.println(animals);

		// remove the last element
		animals.removeLast();
		System.out.println(animals);
	

		System.out.println(animals.size());  //gets size of linkedlist
		System.out.println(animals.contains("Cat"));//boolean checks wether required element is in linkedlist or not
		System.out.println(animals.indexOf("Cat"));
	}
}
