package com.java;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class StudentMainApp {

	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(
                StudentConfig.class);
        Student st=ctx.getBean(Student.class);
        Address ob=st.getAddress();
        ob.setCity("gwl");
        ob.setCountry("india");
        System.out.println(ob.getCity()+"\t"+ob.getCountry());

	}

}
