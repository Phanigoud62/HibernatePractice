package com.learn.hibernateTutorial;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class AnnotationsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg= new Configuration();
    	SessionFactory factory= cfg.configure().buildSessionFactory();
    	Session session= factory.openSession();
    	
    	Address ad=new Address();
    	ad.setCity("Eluru");
    	ad.setStreet("M.R.C Colony");
    	ad.setAddedDate(new Date());
    	ad.setX(2048.36);
    	
    	Address ad1=new Address();
    	ad1.setCity("Vijayawada");
    	ad1.setStreet("M.G Road");
    	ad1.setAddedDate(new Date());
    	ad1.setX(2788.36);
    	
    	Transaction tx= session.beginTransaction();
    	session.save(ad);
    	session.save(ad1);
    	
    	tx.commit();
    	session.close();
    	
	}

}
