package com.yash.main;
/**
 * class vehicle app is used to to store data

 * performs various operations
 *  one to one mapping
 */

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import com.yash.model.UserDetails;
import com.yash.model.Vehicle;

public class VehicleApp 
{

	public static void main(String[] args)
	{
	UserDetails user = new UserDetails(); //create the user entity
	Vehicle vehicle = new Vehicle(); //create the vehicle entity

	vehicle.setVehicleName("BMW"); //set vehicle name

	user.setUserName("Ravi"); //set the user name
	user.setVehicle(vehicle); //set the vehicle entity to the field of the user entity i.e. vehicle entity inside the user entity
	
	 Configuration con = new Configuration().configure().addAnnotatedClass(Vehicle.class);
     ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();       
     SessionFactory sf= con.buildSessionFactory(reg);      
     Session session= sf.openSession();
     Transaction tx = session.beginTransaction();

	session.save(vehicle); 
	session.save(user);

	tx.commit(); 
	session.close(); 
	}
}
