package com.sisprom.framework.dominio;


public abstract class Persona{
	private String nombre;
	private String apellido;
	private StringBuilder direccion;
	private String telefono;
	private String dni;
	
	public Persona(String dni, String nombre, String apellido,
			StringBuilder direccion, String telefono) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
		this.telefono = telefono;
		this.dni = dni;
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
	public StringBuilder getDireccion() {
		return direccion;
	}
	public void setDireccion(StringBuilder direccion) {
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
	
	
}
