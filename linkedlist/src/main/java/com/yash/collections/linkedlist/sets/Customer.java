package com.yash.collections.linkedlist.sets;

import java.util.Objects;

public class Customer
{
	int id;
	String name;
	double qua;
	public Customer(int id, String name, double qua)
	{
		this.id=id;
		this.name=name;
		this.qua=qua;
	}
	@Override
	public String toString() {
		return " id=" + id + ", name=" + name + ", qua=" + qua + " ";
	}
	@Override
	public int hashCode() {
		return Objects.hash(id, name, qua);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Customer))
			return false;
		Customer other = (Customer) obj;
		return id == other.id && Objects.equals(name, other.name)
				&& Double.doubleToLongBits(qua) == Double.doubleToLongBits(other.qua);
	}
	public String getName() {
		return name;
	}
		public int getId() {
			// TODO Auto-generated method stub
			return 0;
		}
		
	
}	


