package com.sisprom.framework.dominio;

import java.util.Date;




public abstract class Persona{
	private int id;
	private String nombre;
	private String apellido;
	private String direccion;
	private String telefono;
	private String dni;
	private String usuario;
	private String contrasenia;
	private Auditoria auditoria;
	
	
	public Persona(int id, String nombre, String apellido, String direccion,
			String telefono, String dni, String usuario, String contrasenia,
			Auditoria auditoria) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
		this.telefono = telefono;
		this.dni = dni;
		this.usuario = usuario;
		this.contrasenia = contrasenia;
		this.auditoria = auditoria;
	}

	public Persona(int id, String nombre, String apellido, String direccion,
			String telefono, String dni, Auditoria auditoria) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
		this.telefono = telefono;
		this.dni = dni;
		this.auditoria = auditoria;
	}


	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	
	
}
