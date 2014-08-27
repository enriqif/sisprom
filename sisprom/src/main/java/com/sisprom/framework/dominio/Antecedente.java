package com.sisprom.framework.dominio;

public class Antecedente {
	private String codigoAntecedente;
	private String codigoHistoriaClinica;
	private String codigoTipoAntecedente;
	private String descripcion;
	public Antecedente(String codigoAntecedente, String codigoHistoriaClinica,
			String codigoTipoAntecedente, String descripcion) {
		super();
		this.codigoAntecedente = codigoAntecedente;
		this.codigoHistoriaClinica = codigoHistoriaClinica;
		this.codigoTipoAntecedente = codigoTipoAntecedente;
		this.descripcion = descripcion;
	}
	public String getCodigoAntecedente() {
		return codigoAntecedente;
	}
	public void setCodigoAntecedente(String codigoAntecedente) {
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
	
}
