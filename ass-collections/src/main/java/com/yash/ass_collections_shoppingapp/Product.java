package com.yash.ass_collections_shoppingapp;

import java.util.Objects;

public class Product 
{
   int id;
   String name;
   long price;
   
public Product(int id, String name, long price) {
	this.id=id;
	this.name=name;
	this.price=price;
}

@Override
public String toString() {
	return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
}

@Override
public int hashCode() {
	return Objects.hash(id, name, price);
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (!(obj instanceof Product))
		return false;
	Product other = (Product) obj;
	return id == other.id && Objects.equals(name, other.name) && price == other.price;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public long getPrice() {
	return price;
}

public void setPrice(long price) {
	this.price = price;
}

public int compareTo(String anotherString) {
	return name.compareTo(anotherString);
}


}

