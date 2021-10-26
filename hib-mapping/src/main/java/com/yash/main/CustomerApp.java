package com.yash.main;
/**
 * mapping
 */
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import com.yash.model.Customer;
import com.yash.model.Product;

public class CustomerApp
{
	public static void main(String args[])
	{

    Product p1 =new Product();
    Product p2 =new Product();

    Customer cust = new Customer();
    
   p1.setName("charger");
   p1.setPrice(200);
   p2.setName("cable");
   p2.setPrice(300);

     cust.setName("allen");
     cust.getProduct().add(p1);
  
    p1.setCustomer(cust);
    p2.setCustomer(cust);
    
	 Configuration con = new Configuration().configure().addAnnotatedClass(Customer.class);
    ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();       
    SessionFactory sf= con.buildSessionFactory(reg);      
    Session session= sf.openSession();
    Transaction tx = session.beginTransaction();

    session.save(p1);
    
    session.save(cust);
    tx.commit();
    
	} 

}
