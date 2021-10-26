package com.yash.main;
/**
 * 
 * performing cascading and criteria  Api
 */
import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Projections;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import com.yash.model.Customer;
import com.yash.model.Product;

public class CustomerApp
{

	public static void main(String[] args) 
	{
	
		Product p = new Product();
//		p.setPro_id(102);
//		p.setPro_name("mobile");
		
		Customer cust = new Customer();
//		cust.setName("alex");
//		cust.setProduct(p);

	
		 Configuration con = new Configuration().configure().addAnnotatedClass(Customer.class);
		    ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();       
		    SessionFactory sf= con.buildSessionFactory(reg);      
		    Session session= sf.openSession();
		    Transaction tx = session.beginTransaction();

//		    session.save(p);
//		   session.save(cust);
		 
		    Criteria crit = session.createCriteria(Customer.class);
		    List<Customer> results = crit.list();
		    
   //printing values using criteria API
		    for (Iterator iterator = results.iterator(); iterator.hasNext();) {
				Customer customer = (Customer) iterator.next();
				System.out.println("id::"+customer.getId()+"   name::"+customer.getName());				
			}
		    
	//printing total number of customers	    
		crit.setProjection(Projections.rowCount());  
		List rowCount = crit.list();
		System.out.println("total customers "+rowCount.get(0));
		
	//
		session.close();
		
		    tx.commit();  
		    
		    
		 
	}
}
