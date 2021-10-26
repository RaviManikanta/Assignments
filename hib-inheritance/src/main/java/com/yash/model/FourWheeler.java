package com.yash.model;
import javax.persistence.*;

@Entity
@Table(name="FOUR_WHEELER")
//@DiscriminatorValue("Car")
public class FourWheeler extends Vehicle
{
 @Column(name="STEERING_TYPE")
 private String steeringFourWheeler;

 public String getSteeringFourWheeler() 
 {
  return steeringFourWheeler;
 }

 public void setSteeringFourWheeler(String steeringFourWheeler) 
 {
  this.steeringFourWheeler = steeringFourWheeler;
 }
}