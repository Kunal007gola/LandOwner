package com.rme.landOwner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Insert {

	public static void main(String[] args) {
		
		SessionFactory s = new Configuration().configure().addAnnotatedClass(User.class).addAnnotatedClass(Discussion.class).addAnnotatedClass(Replies.class).addAnnotatedClass(Comments.class).addAnnotatedClass(TrendingDiscussion.class).buildSessionFactory();
		Session session = s.openSession();
		session.beginTransaction();
		
		User u1 = new User(123,"kbfks",12,(short)2);
		User u2 = new User(124,"sfijhi",6,(short)1);
		User u3 = new User(1234,"swdfho",200,(short)3);
		
		Discussion d1 = new Discussion();
		
		session.save(u1);
		session.save(u2);
		session.save(u3);
		session.getTransaction().commit();
		session.close();
		s.close();
	}

}
