package com.java;

import org.springframework.context.annotation.Bean;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class ScopeDemoConfig {
	@Bean
	@Scope("prototype")
	public ScopeDemo scopeDemo() {
		return new ScopeDemo();
	}
}
