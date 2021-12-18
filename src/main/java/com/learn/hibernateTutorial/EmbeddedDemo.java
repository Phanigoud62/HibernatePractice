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
    	Transaction tx= session.beginTransaction();
    	int i=1;
    	while(i<100){
    	Student st = new Student();
    	st.setId(1030+i);
    	st.setCity("Eluru"+i);
    	st.setName("Phani"+i);
    	
    	
    	Certificate cert= new Certificate();
    	cert.setCourse("Android"+i);
    	cert.setDuration(30+i);
    	st.setCert(cert);
    	
    	
    	session.save(st);
    	
    	i++;
    	
    	}
    	tx.commit();
    	session.close();
    	
	}
}
