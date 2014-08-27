package com.sisprom.framework.dominio;

public class Consulta {
	private String codigoConsulta;
	private String codigoHistoriaClinica;
	private String descripcion;
	public Consulta(String codigoConsulta, String codigoHistoriaClinica,
			String descripcion) {
		super();
		this.codigoConsulta = codigoConsulta;
		this.codigoHistoriaClinica = codigoHistoriaClinica;
		this.descripcion = descripcion;
	}
	public String getCodigoConsulta() {
		return codigoConsulta;
	}
	public void setCodigoConsulta(String codigoConsulta) {
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
	
}
