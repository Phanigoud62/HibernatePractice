package com.learn.hibernateTutorial;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FetchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg= new Configuration();
    	SessionFactory factory= cfg.configure().buildSessionFactory();
    	Session session= factory.openSession();
    	
    	//Get Demo
    	Student st=(Student)session.get(Student.class, 101);
    	System.out.println(st);
    	
    	//load Demo
    	Address ad=(Address)session.load(Address.class, 2);
    	System.out.println(ad);
    	
    	try{
    	Address ad1=(Address)session.load(Address.class, 20);
    	System.out.println(ad1);
    	}catch(Exception e){
    		System.out.println(e.getMessage());
    	}
    	
	}

}
