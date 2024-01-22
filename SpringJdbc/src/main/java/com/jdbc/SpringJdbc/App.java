package com.jdbc.SpringJdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("db.xml");
        Operations op=(Operations)context.getBean("crud");
        System.out.println("displaying data:");
        op.displayData();
        System.out.println("insertion:");
        op.insertData();
        System.out.println("displaying data:");
        op.displayData();
        System.out.println("updation:");
        op.updateData();
        System.out.println("displaying data:");
        op.displayData();
        System.out.println("deletion:");
        op.deleteData();
        System.out.println("displaying data:");
        op.displayData();
    }
}