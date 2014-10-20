package com.sisprom.framework.dominio;

public class Antecedente {
	private int codigoAntecedente;
	//private String codigoHistoriaClinica;
	//private String codigoTipoAntecedente;
	private String descripcion;
	private Auditoria auditoria;
	
	private TipoAntecedente tipoAntecedente;
	private HistoriaClinica historiaClinica;
		
	public Antecedente(int codigoAntecedente, String descripcion,
			Auditoria auditoria) {
		super();
		this.codigoAntecedente = codigoAntecedente;
		this.descripcion = descripcion;
		this.auditoria = auditoria;
	}
	
	
	public Antecedente(int codigoAntecedente, String descripcion,
			Auditoria auditoria, TipoAntecedente tipoAntecedente,
			HistoriaClinica historiaClinica) {
		super();
		this.codigoAntecedente = codigoAntecedente;
		this.descripcion = descripcion;
		this.auditoria = auditoria;
		this.tipoAntecedente = tipoAntecedente;
		this.historiaClinica = historiaClinica;
	}




	public int getCodigoAntecedente() {
		return codigoAntecedente;
	}
	public void setCodigoAntecedente(int codigoAntecedente) {
		this.codigoAntecedente = codigoAntecedente;
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
	public TipoAntecedente getTipoAntecedente() {
		return tipoAntecedente;
	}
	public void setTipoAntecedente(TipoAntecedente tipoAntecedente) {
		this.tipoAntecedente = tipoAntecedente;
	}
	public HistoriaClinica getHistoriaClinica() {
		return historiaClinica;
	}
	public void setHistoriaClinica(HistoriaClinica historiaClinica) {
		this.historiaClinica = historiaClinica;
	}
	
}
