package com.learn.hibernateTutorial;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmbeddedDemo {

	public static void main(String[] args) {
		Configuration cfg= new Configuration();
    	SessionFactory factory= cfg.configure().buildSessionFactory();
    	Session session= factory.openSession();
    	
    	Student st = new Student();
    	st.setId(102);
    	st.setCity("Eluru");
    	st.setName("Manoj");
    	
    	
    	Certificate cert= new Certificate();
    	cert.setCourse("Azure");
    	cert.setDuration(30);
    	st.setCert(cert);
    	
    	Transaction tx= session.beginTransaction();
    	session.save(st);
    	
    	tx.commit();
    	session.close();
    	
	}
}
