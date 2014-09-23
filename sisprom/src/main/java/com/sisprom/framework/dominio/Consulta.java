package com.sisprom.framework.dominio;

public class Consulta {
	private int codigoConsulta;
	private String codigoHistoriaClinica;
	private String descripcion;
	private Auditoria auditoria;
	

	public Consulta(int codigoConsulta, String codigoHistoriaClinica,
			String descripcion, Auditoria auditoria) {
		super();
		this.codigoConsulta = codigoConsulta;
		this.codigoHistoriaClinica = codigoHistoriaClinica;
		this.descripcion = descripcion;
		this.auditoria = auditoria;
	}
	public int getCodigoConsulta() {
		return codigoConsulta;
	}
	public void setCodigoConsulta(int codigoConsulta) {
		this.codigoConsulta = codigoConsulta;
	}
	public String getCodigoHistoriaClinica() {
		return codigoHistoriaClinica;
	}
	public void setCodigoHistoriaClinica(String codigoHistoriaClinica) {
		this.codigoHistoriaClinica = codigoHistoriaClinica;
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
