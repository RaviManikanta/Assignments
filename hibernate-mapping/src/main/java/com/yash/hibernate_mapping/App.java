package com.yash.hibernate_mapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

/**
 * performing mapping 
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Laptop laptop=new Laptop();
        laptop.setLid(104);
        laptop.setLname("lenovo");
   
        Student student=new Student();
        student.setName("Raj");
        student.setRollno(4);
        student.setMarks(50);
        student.getLaptop().add(laptop);
       
        
        Configuration con = new Configuration().configure().addAnnotatedClass(Student.class).addAnnotatedClass(Laptop.class);
        
        ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry(); 
        
        SessionFactory sf= con.buildSessionFactory(reg);
        
        Session session= sf.openSession();
        
        session.beginTransaction();
        session.save(laptop);
        session.save(student);
        
        session.getTransaction().commit();

    }
}
