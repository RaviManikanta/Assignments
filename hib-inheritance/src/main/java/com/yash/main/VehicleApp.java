package com.yash.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;


import com.yash.model.FourWheeler;
import com.yash.model.TwoWheeler;
import com.yash.model.Vehicle;

public class VehicleApp {
	public static void main(String[] args) 
	 {
		Configuration con = new Configuration().configure().addAnnotatedClass(Vehicle.class);
	    ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();       
	    SessionFactory sf= con.buildSessionFactory(reg);      
	    Session session= sf.openSession();
	    Transaction tx = session.beginTransaction();
	  
	  Vehicle vehicle = new Vehicle();
	  vehicle.setVehicleName("Car");
	 
	  
	  TwoWheeler twoWheeler = new TwoWheeler();
	  twoWheeler.setVehicleName("Bike");
	  twoWheeler.setSteeringTwoWheeler("Bike Steering Handle");
	  
	  FourWheeler fourWheeler = new FourWheeler();
	  fourWheeler.setVehicleName("Alto");
	  fourWheeler.setSteeringFourWheeler("Alto Steering Wheel");
	  
	  session.save(vehicle);
	  session.save(twoWheeler);
	  session.save(fourWheeler);
	  
	  session.close();
	  tx.commit();
	 }
}
