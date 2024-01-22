package com.example.demo.Hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args)
    {
        StandardServiceRegistry ssr=new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
        Metadata md=new MetadataSources(ssr).getMetadataBuilder().build();
        SessionFactory sf=md.getSessionFactoryBuilder().build();
        Session session=sf.openSession();
        Transaction t=session.beginTransaction();
        
        Movie m1=new Movie();
        m1.setMovieName("Varsham");
        m1.setMovieHero("Prabhas");
        m1.setMovieHeroine("Trisha");
        
        session.persist(m1);
//        Movie m=session.get(Movie.class,4);
//        session.delete(m);
        System.out.println("successfully saved");
        t.commit();
        sf.close();
        session.close();
        
            
    }
}
