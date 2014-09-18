package com.sisprom.framework.model.xml.context;

//import javax.faces.context.FacesContext;

import javax.faces.context.FacesContext;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
//import org.springframework.web.jsf.FacesContextUtils;


import com.sisprom.framework.model.services.Services;



public class Context {

//public static final ApplicationContext context = FacesContextUtils.getWebApplicationContext(FacesContext.getCurrentInstance());
public static final ApplicationContext context= new ClassPathXmlApplicationContext("classpath*:**/SpringContext.xml");

		

		public static Services getBeanFacade() {
		return (Services) context.getBean("services");
	}
	
}
