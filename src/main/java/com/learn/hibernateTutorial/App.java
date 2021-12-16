package com.learn.hibernateTutorial;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	Student st =new Student(101,"Phani","Eluru");
    	Configuration cfg= new Configuration();
    	SessionFactory factory= cfg.configure().buildSessionFactory();
    	Session session= factory.openSession();
    	Transaction tx= session.beginTransaction();
    	session.save(st);
    	System.out.println(st);
    	tx.commit();
    	session.close();        
    }
}
