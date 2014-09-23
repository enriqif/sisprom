package com.sisprom.framework.dominio;

public class HistoriaClinica {
	private int codigoHistoriaClinica;
	private String codigoMedico;
	private String codigoPaciente;
	private String descripcion;
	private Auditoria auditoria;

	
	
	public HistoriaClinica(int codigoHistoriaClinica, String codigoMedico,
			String codigoPaciente, String descripcion, Auditoria auditoria) {
		super();
		this.codigoHistoriaClinica = codigoHistoriaClinica;
		this.codigoMedico = codigoMedico;
		this.codigoPaciente = codigoPaciente;
		this.descripcion = descripcion;
		this.auditoria = auditoria;
	}
	public int getCodigoHistoriaClinica() {
		return codigoHistoriaClinica;
	}
	public void setCodigoHistoriaClinica(int codigoHistoriaClinica) {
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
	public Auditoria getAuditoria() {
		return auditoria;
	}
	public void setAuditoria(Auditoria auditoria) {
		this.auditoria = auditoria;
	}
	
}
