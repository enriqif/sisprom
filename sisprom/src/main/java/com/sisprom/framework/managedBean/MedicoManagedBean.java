package com.sisprom.framework.managedBean;

import java.util.Date;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.sisprom.framework.dominio.Auditoria;

@ManagedBean
@SessionScoped
public class MedicoManagedBean extends MasterManagedBean {
	
	public static String VALIDATE_USER="home";
	public static String VALIDATE_USER_ERROR = "error";
	
	public String usertmp = "eflores";
	public String passtmp = "naruto";
	
	private String nombre;
	private String apellido;
	private String direccion;
	private String telefono;
	private String dni;
	private Auditoria auditoria;
	private String matricula;
	private String especialidad;
	private Date horarioAtencionMin;
	private Date horarioAtencionMax;
	private String usuario;
	private String contrasenia;
	private String mensajeError = "";
	
	
	public String validateUser(){
		if (usertmp.equals(usuario) && passtmp.equals(contrasenia)){
			System.out.println("salida: "+VALIDATE_USER);
			return VALIDATE_USER;
		}else{
			System.out.println("error: "+VALIDATE_USER_ERROR);
			mensajeError = "Usuario o contraseña incorrecto";
			return VALIDATE_USER_ERROR;
		}
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public String getDireccion() {
		return direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	public String getTelefono() {
		return telefono;
	}


	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}


	public String getDni() {
		return dni;
	}


	public void setDni(String dni) {
		this.dni = dni;
	}


	public Auditoria getAuditoria() {
		return auditoria;
	}


	public void setAuditoria(Auditoria auditoria) {
		this.auditoria = auditoria;
	}


	public String getMatricula() {
		return matricula;
	}


	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}


	public String getEspecialidad() {
		return especialidad;
	}


	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}


	public Date getHorarioAtencionMin() {
		return horarioAtencionMin;
	}


	public void setHorarioAtencionMin(Date horarioAtencionMin) {
		this.horarioAtencionMin = horarioAtencionMin;
	}


	public Date getHorarioAtencionMax() {
		return horarioAtencionMax;
	}


	public void setHorarioAtencionMax(Date horarioAtencionMax) {
		this.horarioAtencionMax = horarioAtencionMax;
	}


	public String getUsuario() {
		return usuario;
	}


	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}


	public String getContrasenia() {
		return contrasenia;
	}


	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}


	public String getMensajeError() {
		return mensajeError;
	}


	public void setMensajeError(String mensajeError) {
		this.mensajeError = mensajeError;
	}

}
