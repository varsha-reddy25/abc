package com.test;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StoreData {
	public static void main(String[] args) {
		//1.create config class obj
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		//2.create sessionFactory obj
		SessionFactory sf=cfg.buildSessionFactory();
		//3.create sesion  obj
		Session session=sf.openSession();
		//4.transaction obj
		Transaction t=session.beginTransaction();
		//transient
		/*
		Address adr1=new Address();
		adr1.setCity("chennai");
		adr1.setState("TN");
		adr1.setCountry("IN");
		
		Employee emp1=new Employee();
		emp1.setEmp_name("dhoni");
		emp1.setEmp_email("jsd@gmail.com");
		emp1.setAdress(adr1);*/
		//5.execute obj
		
		Skills skl1=new Skills();
		skl1.setS_name("spring");
		Skills skl2=new Skills();
		skl1.setS_name("Hibernate");
		List<Skills>listSkl=new ArrayList<>();
		listSkl.add(skl1);
		listSkl.add(skl2);
		Student std=new Student();
		std.setStd_name("mythili");
		std.setSkills(listSkl);
		session.save(std);//persistent state
		t.commit();
		System.out.println("done");
		//6.close session obj
		session.close();//detached state
		
	}
}
