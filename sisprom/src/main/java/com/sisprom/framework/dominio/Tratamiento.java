package com.sisprom.framework.dominio;

public class Tratamiento {
	private String codigoTratamiento;
	private String codigoDiagnostico;
	private String nombre;
	private String descripcion;
	public Tratamiento(String codigoTratamiento, String codigoDiagnostico,
			String nombre, String descripcion) {
		super();
		this.codigoTratamiento = codigoTratamiento;
		this.codigoDiagnostico = codigoDiagnostico;
		this.nombre = nombre;
		this.descripcion = descripcion;
	}
	public String getCodigoTratamiento() {
		return codigoTratamiento;
	}
	public void setCodigoTratamiento(String codigoTratamiento) {
		this.codigoTratamiento = codigoTratamiento;
	}
	public String getCodigoDiagnostico() {
		return codigoDiagnostico;
	}
	public void setCodigoDiagnostico(String codigoDiagnostico) {
		this.codigoDiagnostico = codigoDiagnostico;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
}
