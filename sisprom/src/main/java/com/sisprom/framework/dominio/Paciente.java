package com.sisprom.framework.dominio;

public class Paciente extends Persona{
	private String obraSocial;
	private String edad;


	public Paciente(int id, String nombre, String apellido, String direccion,
			String telefono, String dni, Auditoria auditoria,
			String obraSocial, String edad) {
		super(id, nombre, apellido, direccion, telefono, dni, auditoria);
		this.obraSocial = obraSocial;
		this.edad = edad;
	}
	public String getObraSocial() {
		return obraSocial;
	}
	public void setObraSocial(String obraSocial) {
		this.obraSocial = obraSocial;
	}
	public String getEdad() {
		return edad;
	}
	public void setEdad(String edad) {
		this.edad = edad;
	}
	
}
