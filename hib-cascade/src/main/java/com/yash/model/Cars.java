package com.yash.model;

import javax.persistence.Cacheable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Table(name="CARS")
@Cacheable
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class Cars 
{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int s_no;
	
	private int car_no;
	private String car_name;
	public int getCar_no() {
		return car_no;
	}
	public void setCar_no(int car_no) {
		this.car_no = car_no;
	}
	public String getCar_name() {
		return car_name;
	}
	public void setCar_name(String car_name) {
		this.car_name = car_name;
	}

	public int getS_no() {
		return s_no;
	}
	public void setS_no(int s_no) {
		this.s_no = s_no;
	}
	@Override
	public String toString() {
		return "Cars [s_no=" + s_no + ", car_no=" + car_no + ", car_name=" + car_name + "]";
	}
}
