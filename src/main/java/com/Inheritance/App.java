package com.Inheritance;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) {

		System.out.println("______________________________________START_________________________________");
		
		Employee e1 = new Employee();
		e1.setName("Ram");
		
		Employee e2 = new Employee();
		e2.setName("Sham");
		
		RegularEmployee e3 = new RegularEmployee();
		e3.setName("laxman");
		e3.setSalary(50000);
		e3.setBonus(4000);
		
		RegularEmployee e4 = new RegularEmployee();
		e4.setName("Sita");
		e4.setSalary(80000);
		e4.setBonus(6000);
		
		ContractEmployee e5 = new ContractEmployee();
		e5.setName("Vali");
		e5.setDuration("6 months");
		e5.setPayPerHour(750);
		
		ContractEmployee e6 = new ContractEmployee();
		e6.setName("Sugreev");
		e6.setDuration("3 months");
		e6.setPayPerHour(850);
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		
		session.persist(e1);
		session.persist(e2);
		session.persist(e3);
		session.persist(e4);
		session.persist(e5);
		session.persist(e6);

		session.flush();
		tx.commit();
		session.close();
		factory.close();
		System.out.println("______________________________________DONE_________________________________");
	}
}
