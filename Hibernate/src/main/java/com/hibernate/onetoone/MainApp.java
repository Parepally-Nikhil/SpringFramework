package com.hibernate.onetoone;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class MainApp {

	public static void main(String[] args) {
		Configuration con=new Configuration().configure("relations.cfg.xml").addAnnotatedClass(Student.class).addAnnotatedClass(Laptop.class);
		ServiceRegistry sr=new StandardServiceRegistryBuilder().applySettings(con.getProperties()).build();
		SessionFactory sf=con.buildSessionFactory(sr);
		Session session=sf.openSession();
		Transaction t=session.beginTransaction();
		
		Laptop lapy1=new Laptop();
		lapy1.setLaptopId(1);
		lapy1.setLaptopName("Dell");
		
		Laptop lapy2=new Laptop();
		lapy2.setLaptopId(2);
		lapy2.setLaptopName("Lenovo");
		
		Student stud1=new Student();
		stud1.setStudentId(201);
		stud1.setStudentName("Nikhil");
		stud1.setLaptop(lapy1);
		
		Student stud2=new Student();
		stud2.setStudentId(202);
		stud2.setStudentName("Kumar");
		stud2.setLaptop(lapy2);
		
		session.save(lapy1);
		session.save(lapy2);
		session.save(stud1);
		session.save(stud2);
		t.commit();
		
	}

}
