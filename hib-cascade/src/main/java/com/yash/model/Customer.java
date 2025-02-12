package com.yash.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="cust_cascade")
public class Customer 

{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
   private int id;	
   private String name;
   
   @OneToOne(cascade = CascadeType.ALL)
   private Product product;
   
   
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
public Product getProduct() {
	return product;
}
public void setProduct(Product product) {
	this.product = product;
}
 

	
}
