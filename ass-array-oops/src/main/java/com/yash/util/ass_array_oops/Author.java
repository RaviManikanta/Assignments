package com.yash.util.ass_array_oops;

/** 
 * The Author class model a book's author.
 */
public class Author {
	// The private instance variables
	private String name;
	private String email;
	private char gender;   // 'm' or 'f'

	/** Constructs a Author instance with the given inputs */
	public Author(String name, String email, char gender) {
		this.name = name;
		this.email = email;
		this.gender = gender;
	}


	public String getName() {
		return name;
	}

	public char getGender() {
		return gender;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}


	public String toString() {
		return name + " (" + gender + ") at " + email;
	}
}
