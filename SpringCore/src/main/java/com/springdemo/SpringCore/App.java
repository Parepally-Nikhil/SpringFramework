package com.springdemo.SpringCore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context=new ClassPathXmlApplicationContext("Beans.xml");
    	HelloWorld hw1=(HelloWorld)context.getBean("hw");
    	HelloWorld hw2=(HelloWorld)context.getBean("hw");
    	
    	hw1.show();
    	
    	//hw1.setMsg("Welcome nikhil to spring framework");
    	System.out.println(hw1.getMsg());
    	
    	//Singleton design pattern if scope="prototype" is not given in Beans.xml
    	System.out.println(hw1);	
    	System.out.println(hw2);
    	
    	//Singleton means only one object created in spring container
    	//and this same instance is shared when we call getBean() method.
    	
    	//scope="prototype" means how many times we call getBean() method that many 
    	//times new instances will be created in spring container.
    	//It means objects will be created only when we call getBean() method.
    }
}
