package com.sisprom.framework.managedBean;

import java.util.Map;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

import org.apache.log4j.Logger;

import com.sisprom.framework.dominio.Usuario;
import com.sisprom.framework.model.services.Services;

@ManagedBean
@SessionScoped
public class LoginManagedBean extends MasterManagedBean {

	final static Logger logger = Logger.getLogger(LoginManagedBean.class);
	private Usuario usuario = new Usuario();
	private Map<String, Object> sessionMap;
		
	public LoginManagedBean() {
		// Exists only to defeat instantiation.
	}

	
	/**
	 * verifica que el log se haya realizado con exito para enviarlo al home o
	 * volver a intentarlo
	 * 
	 * @return
	 */
	public String doLogin() {
		String user = usuario.getUsuarioUsuario();
		String contr = usuario.getUsuarioContrasenia();
		
		Usuario userIn = super.getServices().getUsuarioDao().LoginUser(user, contr);
		
		if ( userIn!= null) {
			setUsuario(userIn);
		
			ExternalContext externalContext = FacesContext.getCurrentInstance().getExternalContext();
			sessionMap = externalContext.getSessionMap();
			sessionMap.put("usuario", userIn );
			
			return "bienvenido";

		} else {
			logger.info("error x");
			return "error";
		}
	}


	// public String salir() {
	//TODO
	// return "loggin";
	// }


	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}


	public Map<String, Object> getSessionMap() {
		return sessionMap;
	}


	public void setSessionMap(Map<String, Object> sessionMap) {
		this.sessionMap = sessionMap;
	}
	
	
}
