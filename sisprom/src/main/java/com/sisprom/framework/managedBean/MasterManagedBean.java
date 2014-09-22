package com.sisprom.framework.managedBean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.sisprom.framework.dominio.Auditoria;
import com.sisprom.framework.dominio.Secretaria;
import com.sisprom.framework.model.services.Services;
import com.sisprom.framework.model.xml.context.Context;


@ManagedBean
@SessionScoped
public class MasterManagedBean {

private Services services = Context.getBeanFacade();

public String redireccionar(){	
	    Auditoria audi=new Auditoria(null, null, null, null);
	    Secretaria secre= new Secretaria(1,"solex", "camus", "tupac","32234242","1232345",audi,null,null); 
	    services.save(secre);
		return "segundaPagina";
	
}

public Services getServices() {
	return services;
}

public void setServices(Services services) {
	this.services = services;
}



}
