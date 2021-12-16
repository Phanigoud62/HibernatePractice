package com.learn.map;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class mapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg= new Configuration();
    	SessionFactory factory= cfg.configure().buildSessionFactory();
    	Session session= factory.openSession();
    	
    	Question q1=new Question();
    	q1.setQuestion("What is Java?");
    	q1.setQuestion_id(101);
    	
    	Answer a1=new Answer();
    	a1.setAnswer_id(501);
    	a1.setAnswer("Java is a programming language");
    	a1.setQues(q1);
    	q1.setAns(a1);
    	
    	Question q2=new Question();
    	q2.setQuestion("What is a collection?");
    	q2.setQuestion_id(102);
    	
    	Answer a2=new Answer();
    	a2.setAnswer_id(502);
    	a2.setAnswer("It is an API which work on group of objects");
    	a2.setQues(q2);
    	q2.setAns(a2);
    	
    	Transaction tx= session.beginTransaction();
		session.save(q1);
		session.save(q2);
		session.save(a1);
		session.save(a2);

    	tx.commit();
    	
    	Question q = (Question)session.load(Question.class, 101);
    	System.out.println(q.getQuestion());
    	System.out.println(q.getAns());
    	
    	Answer a = session.load(Answer.class, 502);
    	System.out.println(a.getQues());
    	System.out.println(a.getAnswer());
    	
    	
    	session.close();
    	factory.close();
	}

}
