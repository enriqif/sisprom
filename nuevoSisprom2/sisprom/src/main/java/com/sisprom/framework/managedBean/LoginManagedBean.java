package com.sisprom.framework.managedBean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.apache.log4j.Logger;

import com.sisprom.framework.dominio.Usuario;

@ManagedBean
@SessionScoped
public class LoginManagedBean extends MasterManagedBean {

	final static Logger logger = Logger.getLogger(LoginManagedBean.class);
	static Usuario usuario = new Usuario();
		
	public LoginManagedBean() {
		// Exists only to defeat instantiation.
	}
	
	/**verifica que el log se haya realizado con exito para enviarlo al home o
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
			logger.info("mensaje: "+ userIn.getUsuarioUsuario());
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
		LoginManagedBean.usuario = usuario;
	}
}
