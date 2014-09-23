package com.sisprom.framework.dominio;

public class Tratamiento {
	private int codigoTratamiento;
	private int codigoDiagnostico;
	private String nombre;
	private String descripcion;
	private Auditoria auditoria;

	
	
	public Tratamiento(int codigoTratamiento, int codigoDiagnostico,
			String nombre, String descripcion, Auditoria auditoria) {
		super();
		this.codigoTratamiento = codigoTratamiento;
		this.codigoDiagnostico = codigoDiagnostico;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.auditoria = auditoria;
	}
	public int getCodigoTratamiento() {
		return codigoTratamiento;
	}
	public void setCodigoTratamiento(int codigoTratamiento) {
		this.codigoTratamiento = codigoTratamiento;
	}
	public int getCodigoDiagnostico() {
		return codigoDiagnostico;
	}
	public void setCodigoDiagnostico(int codigoDiagnostico) {
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
	public Auditoria getAuditoria() {
		return auditoria;
	}
	public void setAuditoria(Auditoria auditoria) {
		this.auditoria = auditoria;
	}
	
}
