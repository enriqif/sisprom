package com.sisprom.framework.managedBean;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.el.ELContext;
import javax.el.ExpressionFactory;
import javax.el.ValueExpression;
import javax.faces.application.Application;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.event.ValueChangeEvent;
import javax.faces.validator.ValidatorException;

import org.apache.log4j.Logger;
import org.primefaces.event.FileUploadEvent;
import org.primefaces.event.SelectEvent;
import org.primefaces.event.UnselectEvent;

import com.sisprom.framework.dominio.HistoriaClinica;
import com.sisprom.framework.dominio.Paciente;
import com.sisprom.framework.dominio.Permiso;
import com.sisprom.framework.dominio.Usuario;

@ManagedBean
@SessionScoped
@ViewScoped
public class PersonalManagedBean extends MasterManagedBean {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	final static Logger logger = Logger.getLogger(PersonalManagedBean.class);
	private Usuario usuario = new Usuario();
	public Usuario usuarioSelect = new Usuario();
	private Usuario usuarioMod = new Usuario();
	private Permiso permiso = new Permiso();
	private List<Usuario> lista = new ArrayList<Usuario>();

	public PersonalManagedBean() {
		usuario = new Usuario();
		usuarioSelect = new Usuario();
		lista.clear();
		
		setLista(super.getServices().getAllPersonal());
	}

	public String nuevo() {
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
			usuario.setUsuarioVisible(true);
			super.getServices().saveUsuario(usuario);

			return "homePersonal";
		} catch (Exception e) {
			// TODO
			// Se debe definir la vista cuando se produce un error
			return "errorGuardado";
		}
	}

	public void archivar() {
		try {
			usuario.setUsuarioId(usuarioSelect.getUsuarioId());			
			Permiso per = new Permiso(usuarioSelect.getPermiso().getPermisoId());
			usuario.setPermiso(per);
			
			usuario.setUsuarioNombre(usuarioSelect.getUsuarioNombre());
			usuario.setUsuarioApellido(usuarioSelect.getUsuarioApellido());
			usuario.setUsuarioDni(usuarioSelect.getUsuarioDni());
			usuario.setUsuarioTelefono(usuarioSelect.getUsuarioTelefono());
			usuario.setUsuarioDomicilioBarrio(usuarioSelect.getUsuarioDomicilioBarrio());
			usuario.setUsuarioUsuario(usuarioSelect.getUsuarioUsuario());
			usuario.setUsuarioContrasenia(usuarioSelect.getUsuarioContrasenia());
			usuario.setUsuarioRol(usuarioSelect.getUsuarioRol());
			usuario.setUsuarioObraSocial(usuarioSelect.getUsuarioObraSocial());
			usuario.setUsuarioEdad(usuarioSelect.getUsuarioEdad());
			usuario.setUsuarioMatricula("Nulo");
			usuario.setUsuarioEspecialidad("Nulo");
		
			usuario.setUsuarioHoraAtencionMax(usuarioSelect.getUsuarioHoraAtencionMax());
			usuario.setUsuarioHoraAtencionMin(usuarioSelect.getUsuarioHoraAtencionMin());			
			usuario.setFechaCreacion(usuarioSelect.getFechaCreacion());
			usuario.setFechaModificacion(usuarioSelect.getFechaModificacion());
						
			usuario.setUsuarioCreacion(usuarioSelect.getUsuarioCreacion());
			usuario.setUsuarioModificacion(usuarioSelect.getUsuarioModificacion());
			usuario.setUsuarioDomicilioCalle(usuarioSelect.getUsuarioDomicilioCalle());
			usuario.setUsuarioDomicilioNumero(usuarioSelect.getUsuarioDomicilioNumero());
		
			usuario.setUsuarioVisible(false);
			
			super.getServices().updateUsuario(usuario);			
			
	
			lista.clear();
			setLista(super.getServices().consultarPersonal(usuario = new Usuario()));
		
		} catch (Exception e) {
		
			return;
		}
	}
	

	public String modificar() {
		logger.info("Ejecutando metodo modificar");
		//setUsuarioSelect(super.getServices().consultarPersonal(usuarioSelect).get(0));
		return "modificarPersonal";
	}
	
	public String guardarModificar() {
		try {
			//atributos que setea por codigo
			//No son ingresados por el usuario
			usuarioSelect.setUsuarioId(usuarioSelect.getUsuarioId());
			usuarioSelect.setPermiso(new Permiso(3));
			
			usuarioSelect.setUsuarioObraSocial("");
			usuarioSelect.setUsuarioMatricula("");
			usuarioSelect.setUsuarioEspecialidad("");
			
			usuarioSelect.setUsuarioModificacion(LoginManagedBean.usuario.getUsuarioUsuario());
			SimpleDateFormat formateador = new SimpleDateFormat("dd-MM-yyyy");
			usuarioSelect.setFechaModificacion(formateador.parse(formateador
					.format(new Date())));
			usuarioSelect.setUsuarioHoraAtencionMax(formateador.parse(formateador
					.format(new Date())));
			usuarioSelect.setUsuarioHoraAtencionMin(formateador.parse(formateador
					.format(new Date())));
			usuarioSelect.setUsuarioVisible(true);

			usuarioSelect.setFechaCreacion(usuarioSelect.getFechaCreacion());
			
			//campos q no son ingresados por el usuario
			// pero si estan disponibles para ser editados
			if (usuarioMod.getUsuarioNombre()!=""){
				usuarioSelect.setUsuarioNombre(usuarioMod.getUsuarioNombre());
				}
			if (usuarioMod.getUsuarioApellido()!=""){
				usuarioSelect.setUsuarioApellido(usuarioMod.getUsuarioApellido());
			}
			if (usuarioMod.getUsuarioDni()!=""){
				usuarioSelect.setUsuarioDni(usuarioMod.getUsuarioDni());
			}
			if (usuarioMod.getUsuarioTelefono()!=""){
				usuarioSelect.setUsuarioTelefono(usuarioMod.getUsuarioTelefono());
			}
			if (usuarioMod.getUsuarioDomicilioCalle()!=""){
				usuarioSelect.setUsuarioDomicilioCalle(usuarioMod.getUsuarioDomicilioCalle());
			}
			if (usuarioMod.getUsuarioDomicilioNumero()!=""){
				usuarioSelect.setUsuarioDomicilioNumero(usuarioMod.getUsuarioDomicilioNumero());
			}
			if (usuarioMod.getUsuarioDomicilioBarrio()!=""){
				usuarioSelect.setUsuarioDomicilioBarrio(usuarioMod.getUsuarioDomicilioBarrio());
			}
			if (usuarioMod.getUsuarioRol()!=""){
				usuarioSelect.setUsuarioRol(usuarioMod.getUsuarioRol());
			}
			if (usuarioMod.getUsuarioUsuario()!=""){
				usuarioSelect.setUsuarioUsuario(usuarioMod.getUsuarioUsuario());
			}
			
			super.getServices().updateUsuario(usuarioSelect);
			limpiar();
			lista.clear();
			setLista(super.getServices().consultarPersonal(usuario = new Usuario()));
			return "guardadoOk";
			//return "homePersonal";		
		} catch (Exception e) {
			// TODO
			// Se debe definir la vista cuando se produce un error
			return "errorGuardado";
		}
	}
	
	
	public String limpiar() {
		setUsuarioSelect(new Usuario());
		setUsuarioMod(new Usuario());
		setUsuario(new Usuario());
		return "confirmar";
	}

	public String limpiarlista() {
		lista.clear();
		setLista(super.getServices().getAllPersonal());

		return "confirmar";
	}

	public String buscar() {
		lista.clear();
		setLista(super.getServices().consultarPersonal(usuario));
		return limpiar();
	}
	
	public String continuar(){
		logger.info("termino el proceso de actualizacion..");
		limpiar();
		return "homePersonal";
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

	public Usuario getUsuarioSelect() {
		return usuarioSelect;
	}

	public void setUsuarioSelect(Usuario usuarioSelect) {
		this.usuarioSelect = usuarioSelect;
	}
	

	//getters and setters UsuarioModificado
	public Usuario getUsuarioMod() {
		return usuarioMod;
	}

	public void setUsuarioMod(Usuario usuarioMod) {
		this.usuarioMod = usuarioMod;
	}
}
