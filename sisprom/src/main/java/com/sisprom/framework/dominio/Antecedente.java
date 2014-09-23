package com.sisprom.framework.dominio;

public class Antecedente {
	private int codigoAntecedente;
	private String codigoHistoriaClinica;
	private String codigoTipoAntecedente;
	private String descripcion;
	private Auditoria auditoria;

	

	public Antecedente(int codigoAntecedente, String codigoHistoriaClinica,
			String codigoTipoAntecedente, String descripcion,
			Auditoria auditoria) {
		super();
		this.codigoAntecedente = codigoAntecedente;
		this.codigoHistoriaClinica = codigoHistoriaClinica;
		this.codigoTipoAntecedente = codigoTipoAntecedente;
		this.descripcion = descripcion;
		this.auditoria = auditoria;
	}
	public int getCodigoAntecedente() {
		return codigoAntecedente;
	}
	public void setCodigoAntecedente(int codigoAntecedente) {
		this.codigoAntecedente = codigoAntecedente;
	}
	public String getCodigoHistoriaClinica() {
		return codigoHistoriaClinica;
	}
	public void setCodigoHistoriaClinica(String codigoHistoriaClinica) {
		this.codigoHistoriaClinica = codigoHistoriaClinica;
	}
	public String getCodigoTipoAntecedente() {
		return codigoTipoAntecedente;
	}
	public void setCodigoTipoAntecedente(String codigoTipoAntecedente) {
		this.codigoTipoAntecedente = codigoTipoAntecedente;
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
