package com.hql;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.learn.hibernateTutorial.Student;

public class hqlDemo {
public static void main(String[] args) {
	Configuration cfg= new Configuration();
	SessionFactory factory= cfg.configure().buildSessionFactory();
	Session session= factory.openSession();
	
	String query="from Student where city= :n";
	Query q=session.createQuery(query);
	q.setParameter("n", "Eluru");
	List<Student> l =q.list();
	
	for(Student s : l){
		System.out.println(s.getName()+":"+ s.getCert().getCourse());
	}
	
	String query2="Select e.empId,e.empName,a.assetName from Employee as e INNER JOIN e.assets as a";
	
	Query q2=session.createQuery(query2);
	List<Object[]> li=q2.getResultList();
	for(Object[] arr: li){
		System.out.println(Arrays.toString(arr));
	}
	
	session.close();
	factory.close();
	
}
}
