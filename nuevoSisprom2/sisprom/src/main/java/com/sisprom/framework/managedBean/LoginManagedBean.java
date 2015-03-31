package com.sisprom.framework.managedBean;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.component.html.HtmlDataTable;

import com.sisprom.framework.dominio.Usuario;



@ManagedBean
@SessionScoped
public class LoginManagedBean extends MasterManagedBean{
	
	
	public Usuario usuario = new Usuario();
        
	public LoginManagedBean() {
		
	}
	
	/**
	 * verifica que el log se haya realizado con exito para enviarlo al home
	 * o volver a intentarlo
	 * @return
	 */
	public String doLogin(){
		
		if (super.getServices().getUsuarioDao().LoginUser(usuario.getUsuarioUsuario(), usuario.getUsuarioContrasenia())!= null)
			{System.out.print(" entro ");
			setUsuario(super.getServices().getUsuarioDao().LoginUser(usuario.getUsuarioUsuario(), usuario.getUsuarioContrasenia()));
		
//			return "paciente";
			return "bienvenido";
			
		} else {
			System.out.print(" error x ");
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
