package com.sisprom.framework.dominio;

public class HistoriaClinica {
	private String codigoHistoriaClinica;
	private String codigoMedico;
	private String codigoPaciente;
	private String descripcion;
	public HistoriaClinica(String codigoHistoriaClinica, String codigoMedico,
			String codigoPaciente, String descripcion) {
		super();
		this.codigoHistoriaClinica = codigoHistoriaClinica;
		this.codigoMedico = codigoMedico;
		this.codigoPaciente = codigoPaciente;
		this.descripcion = descripcion;
	}
	public String getCodigoHistoriaClinica() {
		return codigoHistoriaClinica;
	}
	public void setCodigoHistoriaClinica(String codigoHistoriaClinica) {
		this.codigoHistoriaClinica = codigoHistoriaClinica;
	}
	public String getCodigoMedico() {
		return codigoMedico;
	}
	public void setCodigoMedico(String codigoMedico) {
		this.codigoMedico = codigoMedico;
	}
	public String getCodigoPaciente() {
		return codigoPaciente;
	}
	public void setCodigoPaciente(String codigoPaciente) {
		this.codigoPaciente = codigoPaciente;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
}
