package com.yash.ass_collections_movie;

import java.util.Objects;

public class Customer
{
String name;
String movie_name;
@Override
public String toString() {
	return "Customer [name=" + name + ", movie_name=" + movie_name + "]";
}
public Customer(String name, String movie_name) {
	super();
	this.name = name;
	this.movie_name = movie_name;
}
@Override
public int hashCode() {
	return Objects.hash(movie_name, name);
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (!(obj instanceof Customer))
		return false;
	Customer other = (Customer) obj;
	return Objects.equals(movie_name, other.movie_name) && Objects.equals(name, other.name);
}

}
