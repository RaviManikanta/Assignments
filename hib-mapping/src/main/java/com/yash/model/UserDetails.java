package com.yash.model;
/**
 * model class performs varible initialization 
 * userdetails
 */

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table (name="USER_DETAIL")
public class UserDetails
{
	@Id
//	@OneToOne
//	@JoinColumn(name="VEHICLE_ID")
	@Column(name="USER_ID")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int userId;

	@Column(name="USER_NAME")
	private String userName;

	@OneToOne
	@JoinColumn(name="VEHICLE_ID")
	private Vehicle vehicle;

	public Vehicle getVehicle() {
		return vehicle;
	}
	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
}