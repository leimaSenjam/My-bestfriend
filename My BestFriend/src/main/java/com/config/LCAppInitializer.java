package com.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class LCAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer{

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		Class arr[] = {BestFrindAppConfig.class};
		return null;
	}

	@Override
	protected String[] getServletMappings() {
		String arr[] = {"/mywebsite.com/*"};
		return null;
	}

}
