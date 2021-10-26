package com.yash.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.Table;
import javax.persistence.*;

@Entity
@Table(name="VEHICLE_INHER")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE) //Least normalisation strategy
public class Vehicle 
{
 @Id
 @GeneratedValue(strategy=GenerationType.AUTO)
 @Column(name="VEHICLE_ID")
 private int vehicleId;
 
 @Column(name="VEHICLE_NAME")
 private String vehicleName;
 
 public int getVehicleId() {
  return vehicleId;
 }
 public void setVehicleId(int vehicleId) {
  this.vehicleId = vehicleId;
 }
 public String getVehicleName() {
  return vehicleName;
 }
 public void setVehicleName(String vehicleName) {
  this.vehicleName = vehicleName;
 }
}