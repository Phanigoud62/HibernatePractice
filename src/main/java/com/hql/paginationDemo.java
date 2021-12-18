package com.hql;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.learn.hibernateTutorial.Student;

public class paginationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg= new Configuration();
		SessionFactory factory= cfg.configure().buildSessionFactory();
		Session session= factory.openSession();
		
		Query<Student> q = session.createQuery("from Student");
		q.setFirstResult(10);
		q.setMaxResults(10);
		for(Student s : q.list()){
			System.out.println(s.getId()+" : "+s.getCity()+" : "+s.getCert().getCourse());
		}
		
		session.close();
		factory.close();
		
		
		
		
		
	}

}
