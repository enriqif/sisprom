package com.sisprom.framework.managedBean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.apache.log4j.Logger;

import com.sisprom.framework.dominio.Usuario;



@ManagedBean
@SessionScoped
public class LoginManagedBean extends MasterManagedBean{
	
    final static Logger logger = Logger.getLogger(LoginManagedBean.class);
	public Usuario usuario = new Usuario();
        
	public LoginManagedBean() {
		
	}
	
	/**
	 * verifica que el log se haya realizado con exito para enviarlo al home
	 * o volver a intentarlo
	 * @return
	 */
	public String doLogin(){
		
		if (super.getServices().getUsuarioDao().LoginUser(usuario.getUsuarioUsuario(), usuario.getUsuarioContrasenia())!= null){

			logger.info(" entro ");
			logger.info("INFO TEST");
			logger.debug("DEBUG TEST");
			logger.error("ERROR TEST");
			setUsuario(super.getServices().getUsuarioDao().LoginUser(usuario.getUsuarioUsuario(), usuario.getUsuarioContrasenia()));
			return "bienvenido";
			
		} else {
			logger.info("error x");
			return "error";
		}
	}
	
	/**
	 * devuelve Fecha en una cadena
	 * @return
	 */

	
//	public String salir() {
//		return "loggin";
//	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	
	/**
	 * Verifica los permisos del usuario loggeado
	 * @return
	 */

		
	
}
