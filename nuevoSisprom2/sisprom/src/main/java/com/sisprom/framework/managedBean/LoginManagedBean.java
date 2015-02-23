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
	
	
	private Usuario usuario = new Usuario();
        
	public LoginManagedBean() {
		
	}
	
	/**
	 * verifica que el log se haya realizado con exito para enviarlo al home
	 * o volver a intentarlo
	 * @return
	 */
	public String doLogin(){
		
		if (super.getServices().getUsuarioDao().LoginUser(usuario.getUsuarioNombre(), usuario.getUsuarioContrasenia())!= null)
			{
			System.out.print("exito");
//				setUsuario(super.getServicio().getServicioUsuario().LoginUser(usuario.getUsuario(), usuario.getPassword()));
			return "index2.xhtml";
			
			
			
			
		} else {
			
			return "index.xhtml";
		}
	}
	
	/**
	 * devuelve Fecha en una cadena
	 * @return
	 */

	
	public String salir() {
		return "loggin";
	}
	
	
	/**
	 * Verifica los permisos del usuario loggeado
	 * @return
	 */

		
	
}
