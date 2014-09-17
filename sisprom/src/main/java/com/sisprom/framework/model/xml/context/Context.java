package com.sisprom.framework.model.xml.context;

//import javax.faces.context.FacesContext;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
//import org.springframework.web.jsf.FaceContextUtils;

import com.sisprom.framework.model.dao.impl.SecretariaDaoImpl;
import com.sisprom.framework.model.services.Services;



public class Context {

//public static final ApplicationContext context = FacesContextUtils.getWebApplicationContext(FacesContext.getCurrentInstance());
public static final ApplicationContext context= new ClassPathXmlApplicationContext("classpath*:**/SpringContext.xml");
		

		public static SecretariaDaoImpl getBeanFacade() {
		return (SecretariaDaoImpl) context.getBean("secretariaDao");
	}
	
}
