package com.sisprom.framework.dominio;

public class Tratamiento {
	private int codigoTratamiento;
	//private int codigoDiagnostico;
	private String nombre;
	private String descripcion;
	private Auditoria auditoria;

	private Diagnostico diagnostico;
	
	
	public Tratamiento(int codigoTratamiento, String nombre,
			String descripcion, Auditoria auditoria) {
		super();
		this.codigoTratamiento = codigoTratamiento;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.auditoria = auditoria;
	}
	
	
	public Tratamiento(int codigoTratamiento, String nombre,
			String descripcion, Auditoria auditoria, Diagnostico diagnostico) {
		super();
		this.codigoTratamiento = codigoTratamiento;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.auditoria = auditoria;
		this.diagnostico = diagnostico;
	}


	public int getCodigoTratamiento() {
		return codigoTratamiento;
	}
	public void setCodigoTratamiento(int codigoTratamiento) {
		this.codigoTratamiento = codigoTratamiento;
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
	public Auditoria getAuditoria() {
		return auditoria;
	}
	public void setAuditoria(Auditoria auditoria) {
		this.auditoria = auditoria;
	}
	public Diagnostico getDiagnostico() {
		return diagnostico;
	}
	public void setDiagnostico(Diagnostico diagnostico) {
		this.diagnostico = diagnostico;
	}
	
}
