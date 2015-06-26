package com.sisprom.framework.managedBean;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import org.apache.log4j.Logger;
import org.primefaces.event.FileUploadEvent;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.sisprom.framework.dominio.Permiso;
import com.sisprom.framework.dominio.Usuario;


@ManagedBean
@SessionScoped
@ViewScoped
public class MedicoManagedBean extends MasterManagedBean implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */

	final static Logger logger = Logger.getLogger(LoginManagedBean.class);
	
	private Usuario usuario = new Usuario();
	public Usuario medicoSelect  = new Usuario();
	private List<Usuario> listaMedico = new ArrayList<Usuario>();
	private String mensajeError = "";
	
	private Usuario medico = new Usuario();
	public Usuario usu = new Usuario();
	private Permiso permiso = new Permiso();
	
	private String destination="D:\\tmp\\";
	

	public MedicoManagedBean(){
		setMedicoSelect(super.getServices().consultarMedico(LoginManagedBean.usuario).get(0));
		setListaMedico(super.getServices().getAllUsuario());
	}
	
	 
	public String nuevo(){
		try {
			permiso.setPermisoId(1);
			medico.setFechaCreacion(null);
			medico.setFechaModificacion(null);
			medico.setUsuarioHoraAtencionMax(null);
			medico.setUsuarioHoraAtencionMin(null);
			medico.setUsuarioRol("Medico");
			medico.setPermiso(permiso);
			super.getServices().saveUsuario(medico);
				
			return "hecho";			
		} catch (Exception e) {
			//TODO
			//Se debe definir la vista cuando se produce un error
			return "errorGuardado";
		}
	}
	
	public Usuario getMedico() {
		return medico;
	}

	public void setMedico(Usuario medico) {
		this.medico = medico;
	}
	public Permiso getPermiso() {
		return permiso;
	}
	public void setPermiso(Permiso permiso) {
		this.permiso = permiso;
	} 

	public String getMensajeError() {
		return mensajeError;
	}


	public void setMensajeError(String mensajeError) {
		this.mensajeError = mensajeError;
	}
	
	public void upload(FileUploadEvent event) {
		FacesMessage msg = new FacesMessage("Success! ", event.getFile()
				.getFileName() + " is uploaded.");
		FacesContext.getCurrentInstance().addMessage(null, msg);
		// Do what you want with the file
		try {
			copyFile(event.getFile().getFileName(), event.getFile()
					.getInputstream());
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public void copyFile(String fileName, InputStream in) {
		try {

			// write the inputStream to a FileOutputStream
			OutputStream out = new FileOutputStream(new File(destination
					+ fileName));

			int read = 0;
			byte[] bytes = new byte[1024];

			while ((read = in.read(bytes)) != -1) {
				out.write(bytes, 0, read);
			}

			in.close();
			out.flush();
			out.close();

			System.out.println("New file created!");
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
     
	    private String text = "PrimeFaces";
	 
	    public String getText() {
	        return text;
	    }
	 
	    public void setText(String text) {
	        this.text = text;
	    }
	
	    public String actualizar(){
			try {				
				medicoSelect.setUsuarioModificacion(LoginManagedBean.usuario.getUsuarioUsuario());
				if (usu.getUsuarioNombre()!=""){
					medicoSelect.setUsuarioNombre(usu.getUsuarioNombre());}
				if (usu.getUsuarioApellido()!=""){
					medicoSelect.setUsuarioApellido(usu.getUsuarioApellido());}
				if (usu.getUsuarioDni()!=""){
					medicoSelect.setUsuarioDni(usu.getUsuarioDni());}
				if (usu.getUsuarioTelefono()!=""){
					medicoSelect.setUsuarioTelefono(usu.getUsuarioTelefono());}
				if (usu.getUsuarioDomicilioCalle()!=""){
					medicoSelect.setUsuarioDomicilioCalle(usu.getUsuarioDomicilioCalle());}
				if (usu.getUsuarioDomicilioNumero()!=""){
					medicoSelect.setUsuarioDomicilioNumero(usu.getUsuarioDomicilioNumero());}
				if (usu.getUsuarioDomicilioBarrio()!=""){
					medicoSelect.setUsuarioDomicilioBarrio(usu.getUsuarioDomicilioBarrio());}
				super.getServices().updateUsuario(medicoSelect);
				return "hechoMedico";			
			} catch (Exception e) {
				//TODO
				//Se debe definir la vista cuando se produce un error
				return "error";
			}
		}  
	
	    public String buscar(){
			listaMedico.clear();
			setListaMedico(super.getServices().consultarUsuario(usuario));
			return limpiar();
		}
	    public String limpiar() {
			setUsuario(new Usuario());
			return "confirmar";
		}
	  
	    
	    public Usuario getUsu() {
			return usu;
		}


		public void setUsu(Usuario usu) {
			this.usu = usu;
		}


		public Usuario getUsuario() {
			return usuario;
		}

		public void setUsuario(Usuario usuario) {
			this.usuario = usuario;
		}
	    public List<Usuario> getListaMedico() {
			return listaMedico;
		}
		public void setListaMedico(List<Usuario> lista) {
			this.listaMedico = lista;
		}
		public Usuario getMedicoSelect() {
			return medicoSelect;
		}

		public void setMedicoSelect(Usuario medicoSelect) {
			this.medicoSelect = medicoSelect;
		}
}
