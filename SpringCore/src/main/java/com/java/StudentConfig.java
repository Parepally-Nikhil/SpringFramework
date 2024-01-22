package com.java;

import org.springframework.context.annotation.Bean;

public class StudentConfig {
	
	//@Bean
	public Address address() {
		return new Address();
	}
	
	@Bean
	public Student student() {
		return new Student(address());	//manual autowiring so autowired annotation not required.
	}
	
//	@Bean
//	public Student student() {
//		return new Student();	//automatical autowiring so autowired annotation required.
//	}
}
