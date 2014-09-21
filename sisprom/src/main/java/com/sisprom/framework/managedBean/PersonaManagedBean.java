package com.sisprom.framework.managedBean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class PersonaManagedBean {
private String nombre;

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}
public String redireccionar(){		
		return "segundaPagina";
	
}

}
