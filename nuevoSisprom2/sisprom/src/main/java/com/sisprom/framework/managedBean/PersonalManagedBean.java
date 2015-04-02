package com.sisprom.framework.managedBean;

import java.util.Date;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.sisprom.framework.dominio.Permiso;
import com.sisprom.framework.dominio.Usuario;


@ManagedBean
@SessionScoped
public class PersonalManagedBean extends MasterManagedBean {

	private Usuario usuario = new Usuario();
	private Permiso permiso = new Permiso();

	public String nuevo(){
		try {
			permiso.setPermisoId(3);
			usuario.setFechaCreacion(null);
			usuario.setFechaModificacion(null);
			usuario.setUsuarioHoraAtencionMax(null);
			usuario.setUsuarioHoraAtencionMin(null);
			usuario.setUsuarioEspecialidad("Nulo");
			usuario.setUsuarioMatricula("Nulo");
			usuario.setUsuarioRol("Personal");
			usuario.setPermiso(permiso);
			super.getServices().saveUsuario(usuario);
			
			return "hecho";			
		} catch (Exception e) {
			//TODO
			//Se debe definir la vista cuando se produce un error
			return "errorGuardado";
		}
	}
	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	} 
	
	
}
