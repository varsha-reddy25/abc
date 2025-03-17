package com.test;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class StoreData {

	 public static void main(String[] args) {
		
		 //1 create configuration class object
		 
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		//2 create SeesionFactory object
		
		SessionFactory sf=cfg.buildSessionFactory();
		
		//3 create Session object
		
		Session session = sf.openSession();
		
		//4 transaction object
		
		Transaction t = session.beginTransaction();
		
		//transient state
		Skills sk1 =new Skills();
		sk1.setS_name("Spring");
		Skills sk2 =new Skills();
		sk2.setS_name("Hibernate");
		List<Skills> listsk = new ArrayList<>();
		listsk.add(sk1);
		listsk.add(sk2);
		
		
		Student std1 =new Student();
		std1.setStd_name("Kohli");
		std1.setSkills(listsk);
		
		
		
	   //5 execute the object
	   session.save(std1);
	   t.commit();
		
	  //6 close session object
	   session.close();
	 }
}
