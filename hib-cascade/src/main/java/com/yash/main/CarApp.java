package com.yash.main;
/**
 * Performing caching operations
 * level1 and level2
 */
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import com.yash.model.Cars;

public class CarApp {

	public static void main(String[] args) {
		Cars c = new Cars();		
//		c.setCar_no(6467);
//		c.setCar_name("verna");	

		 Configuration con = new Configuration().configure().addAnnotatedClass(Cars.class);
		    ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();       
		    SessionFactory sf= con.buildSessionFactory(reg); 
		    
		    //---------------------session1------------------------------//
		    Session session1= sf.openSession();
		    session1.beginTransaction();

		  //  session.save(c);
		    
		    c = (Cars)session1.get(Cars.class,1);
		    System.out.println(c);

		    session1.getTransaction().commit();
		    session1.close();
		    
		    
		    //-------------------session2---------------------------------//
		    
		    Session session2= sf.openSession();
		    session2.beginTransaction();
		    
		    c = (Cars)session2.get(Cars.class,1);
		    System.out.println(c);
		  
		    session2.getTransaction().commit();
		    session2.close();
		 
	}

}
