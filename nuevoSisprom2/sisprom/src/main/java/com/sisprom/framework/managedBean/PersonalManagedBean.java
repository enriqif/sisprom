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
import javax.faces.context.FacesContext;

import org.primefaces.event.FileUploadEvent;

import com.sisprom.framework.dominio.Permiso;
import com.sisprom.framework.dominio.Usuario;



@ManagedBean
@SessionScoped
public class PersonalManagedBean extends MasterManagedBean {

	private Usuario usuario = new Usuario();
	private Permiso permiso = new Permiso();
	private List<Usuario> lista = new ArrayList<Usuario>();
	
	private String destination="D:\\tmp\\";
	
	public PersonalManagedBean(){
		setLista(super.getServices().getAllUsuario());
	}
	
	 public void upload(FileUploadEvent event) {  
	        FacesMessage msg = new FacesMessage("Success! ", event.getFile().getFileName() + " is uploaded.");  
	        FacesContext.getCurrentInstance().addMessage(null, msg);
	        // Do what you want with the file        
	        try {
	            copyFile(event.getFile().getFileName(), event.getFile().getInputstream());
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	 
	    }  
	 public void copyFile(String fileName, InputStream in) {
         try {
            
            
              // write the inputStream to a FileOutputStream
              OutputStream out = new FileOutputStream(new File(destination + fileName));
            
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
