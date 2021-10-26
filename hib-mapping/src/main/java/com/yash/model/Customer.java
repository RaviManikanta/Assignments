package com.yash.model;

import java.util.ArrayList;
import java.util.List;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="CUSTOMER")
public class Customer
{
	@Id
	@Column(name="CUSTOMER_ID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column(name="CUSTOMER_NAME")
	private String name;
	
	@OneToMany(mappedBy ="name")

	private List <Product> product = new ArrayList<Product>();

	
	public List<Product> getProduct() {
		return product;
	}

	public void setProduct(List<Product> product) {
		this.product = product;
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


	
}
