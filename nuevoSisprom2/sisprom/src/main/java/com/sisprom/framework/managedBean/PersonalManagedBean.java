package com.sisprom.framework.managedBean;


import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.ValidatorException;

import org.primefaces.event.FileUploadEvent;
import org.primefaces.event.SelectEvent;
import org.primefaces.event.UnselectEvent;

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
		return "confirmar";
	}
	public String limpiarlista() {
		setLista(super.getServices().getAllUsuario());

		return "confirmar";
	}
	public String buscar(){
		lista.clear();
		setLista(super.getServices().consultarUsuario(usuario));
		return limpiar();
	}
	
	
	
	//Metodos de Validacion
	
	 public void onRowSelect(SelectEvent event) {  
	        FacesMessage msg = new FacesMessage("Car Selected", ((Usuario) event.getObject()).getUsuarioDni());  
	  
	        FacesContext.getCurrentInstance().addMessage(null, msg);  
	    }  
	  
	    public void onRowUnselect(UnselectEvent event) {  
	        FacesMessage msg = new FacesMessage("Car Unselected", ((Usuario) event.getObject()).getUsuarioDni());  
	  
	        FacesContext.getCurrentInstance().addMessage(null, msg);  
	    }  
	  
	    public String onRowSelectNavigate(SelectEvent event) {  
	        FacesContext.getCurrentInstance().getExternalContext().getFlash().put("selectedCar", event.getObject());  
	  
	        return "carDetail?faces-redirect=true";  
	    }  
	
	
	
	// getters and setters
	
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
