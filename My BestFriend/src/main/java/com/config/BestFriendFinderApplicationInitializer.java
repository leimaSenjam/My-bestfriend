package com.config;

	import javax.servlet.ServletContext;
	import javax.servlet.ServletException;
	import javax.servlet.ServletRegistration;

	import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.context.support.XmlWebApplicationContext;
	import org.springframework.web.servlet.DispatcherServlet;

	public class BestFriendFinderApplicationInitializer implements WebApplicationInitializer {

		public void onStartup(ServletContext servletContext) throws ServletException {
			// TODO Auto-generated method stub
			
			
		AnnotationConfigWebApplicationContext webApplicationContext = new AnnotationConfigWebApplicationContext();
		webApplicationContext.register(BestFrindAppConfig.class);	
			
			
	    DispatcherServlet dispatcherServlet = new DispatcherServlet(webApplicationContext);
		
		ServletRegistration.Dynamic myCustomaDispatcherServlet = servletContext.addServlet("myDispatcherServlet", dispatcherServlet);
		
		myCustomaDispatcherServlet.setLoadOnStartup(1);
		myCustomaDispatcherServlet.addMapping("/mywebsite.com/*");
		   
		   
		   
		   
		   
		   
		   
		   
		
		}

	}


