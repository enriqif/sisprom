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
public class MedicoManagedBean extends MasterManagedBean implements Serializable{
	
	public static String VALIDATE_USER="home";
	public static String VALIDATE_USER_ERROR = "error";
	final static Logger logger = Logger.getLogger(LoginManagedBean.class);
	
	
//	public String usertmp = "eflores";
//	public String passtmp = "naruto";
//	
	private String mensajeError = "";
	
	private Usuario medico = new Usuario();
	private Usuario u = new Usuario();
	private Permiso permiso = new Permiso();
	
	private String destination="D:\\tmp\\";
	
	
	 
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

//	public String validateUser(){
//		if (usertmp.equals(medico) && passtmp.equals(contrasenia)){
//			System.out.println("salida: "+VALIDATE_USER);
//			return VALIDATE_USER;
//		}else{
//			System.out.println("error: "+VALIDATE_USER_ERROR);
//			mensajeError = "Usuario o contraseña incorrecto";
//			return VALIDATE_USER_ERROR;
//		}
//	}
	

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
				u=LoginManagedBean.usuario;
				u.setUsuarioModificacion(LoginManagedBean.usuario.getUsuarioUsuario());
				super.getServices().updateUsuario(u);
				return "hechoMedico";			
			} catch (Exception e) {
				//TODO
				//Se debe definir la vista cuando se produce un error
				return "errorGuardado";
			}
		}
}
