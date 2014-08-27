package com.sisprom.framework.dominio;

public class Paciente extends Persona{
	private String codigoPaciente;
	private String obraSocial;
	private String edad;
	
	public Paciente(String dni, String nombre, String apellido,
			StringBuilder direccion, String telefono, String codigoPaciente,
			String obraSocial, String edad) {
		super(dni, nombre, apellido, direccion, telefono);
		this.codigoPaciente = codigoPaciente;
		this.obraSocial = obraSocial;
		this.edad = edad;
	}

	public String getCodigoPaciente() {
		return codigoPaciente;
	}
	public void setCodigoPaciente(String codigoPaciente) {
		this.codigoPaciente = codigoPaciente;
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
