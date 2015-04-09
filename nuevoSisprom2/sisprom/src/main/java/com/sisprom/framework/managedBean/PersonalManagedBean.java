package com.sisprom.framework.managedBean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.sisprom.framework.dominio.Permiso;
import com.sisprom.framework.dominio.Usuario;



@ManagedBean
@SessionScoped
public class PersonalManagedBean extends MasterManagedBean {

	private Usuario usuario = new Usuario();
	private Permiso permiso = new Permiso();
	
	private List<Usuario> lista = new ArrayList<Usuario>();
	
	public PersonalManagedBean(){
		setLista(super.getServices().getAllUsuario());
	}
	
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
	
	public String limpiar() {
		setUsuario(new Usuario());
		return "Confirmar";
	}
	public String buscar(){
		lista.clear();
		System.out.println("entro ");
//        setLista(super.getServicio().findRubro(rubro.getId(), rubro.getDescripcion().toUpperCase()));
		System.out.println(usuario.getUsuarioId());
		setLista(super.getServices().consultarUsuario(usuario));
		System.out.println("paso ");
		return limpiar();
	}
	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public Permiso getPermiso() {
		return permiso;
	}
	public void setPermiso(Permiso permiso) {
		this.permiso = permiso;
	}
	public List<Usuario> getLista() {
		return lista;
	}
	public void setLista(List<Usuario> lista) {
		this.lista = lista;
	} 
	
	
}
