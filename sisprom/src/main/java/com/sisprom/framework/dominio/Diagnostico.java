package com.sisprom.framework.dominio;

public class Diagnostico {
	private int codigoDiagnostico;
	private String codigoConsulta;
	private String descripcion;
	private Auditoria auditoria;

	

	public Diagnostico(int codigoDiagnostico, String codigoConsulta,
			String descripcion, Auditoria auditoria) {
		super();
		this.codigoDiagnostico = codigoDiagnostico;
		this.codigoConsulta = codigoConsulta;
		this.descripcion = descripcion;
		this.auditoria = auditoria;
	}
	public int getCodigoDiagnostico() {
		return codigoDiagnostico;
	}
	public void setCodigoDiagnostico(int codigoDiagnostico) {
		this.codigoDiagnostico = codigoDiagnostico;
	}
	public String getCodigoConsulta() {
		return codigoConsulta;
	}
	public void setCodigoConsulta(String codigoConsulta) {
		this.codigoConsulta = codigoConsulta;
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
