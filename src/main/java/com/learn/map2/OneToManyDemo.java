package com.learn.map2;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class OneToManyDemo {
	
	public static void main(String[] args) {
		Configuration cfg= new Configuration();
    	SessionFactory factory= cfg.configure().buildSessionFactory();
    	Session session= factory.openSession();
    	
//    	Employee e1=new Employee();
//    	e1.setEmpId(2415);
//    	e1.setEmpName("Phanindra");
//    	
//    	Employee e2=new Employee();
//    	e2.setEmpId(2416);
//    	e2.setEmpName("Ravi");
//    	
//    	Asset a1=new Asset();
//    	a1.setAssetId(511);
//    	a1.setAssetName("Samsung Note 9");
//    	a1.setEmployee(e1);
//    	
//    	Asset a2=new Asset();
//    	a2.setAssetId(512);
//    	a2.setAssetName("Samsung Note 10");
//    	a2.setEmployee(e2);
//    	
//    	Asset a3=new Asset();
//    	a3.setAssetId(513);
//    	a3.setAssetName("Samsung Note 11");
//    	a3.setEmployee(e1);
//    	
//    	Asset a4=new Asset();
//    	a4.setAssetId(514);
//    	a4.setAssetName("Samsung Note 12");
//    	a4.setEmployee(e2);
//    	
//    	List<Asset> l1=new ArrayList<Asset>();
//    	l1.add(a1);
//    	l1.add(a3);
//    	e1.setAssets(l1);
//    	
//    	List<Asset> l2=new ArrayList<Asset>();
//    	l2.add(a2);
//    	l2.add(a4);
//    	e2.setAssets(l2);
    	
//    	Transaction tx= session.beginTransaction();
//		session.save(e1);
//		session.save(e2);
//		session.save(a1);
//		session.save(a2);
//		session.save(a3);
//		session.save(a4);
//
//    	tx.commit();
    	
    	 Employee e= (Employee) session.get(Employee.class, 2415); 
    	 	System.out.println(e.getEmpName());
    	 for(Asset l : e.getAssets()){
    		 System.out.println(l.getAssetId()+" : "+l.getAssetName());
    		 
    	 }
    	 
    	 Employee e5= (Employee) session.get(Employee.class, 2416); 
 	 	System.out.println(e5.getEmpName());
 	 for(Asset l : e5.getAssets()){
 		 System.out.println(l.getAssetId()+" : "+l.getAssetName());
 		 
 	 }
    	
    	session.close();
    	factory.close();
    	
    	
	}
}
