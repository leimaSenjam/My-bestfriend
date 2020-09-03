package com.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceView;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import formatter.PhoneNumberFormatter;

@EnableWebMvc 
@Configuration
@ComponentScan(basePackages = "com.controller")
public class BestFrindAppConfig implements WebMvcConfigurer{

	@Bean
	public InternalResourceViewResolver viewResolver() {
	
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		viewResolver.setPrefix("/WEB-INF/view/");
		viewResolver.setSuffix(".jsp");
		
		return viewResolver;
	}
	
	
	@Override
	public void addFormatters(FormatterRegistry registry) {
		// TODO Auto-generated method stub
		System.out.println("inside addFormatter method");
		registry.addFormatter(new PhoneNumberFormatter());
	}
	
	
	
}
