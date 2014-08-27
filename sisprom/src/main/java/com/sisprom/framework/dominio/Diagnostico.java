package com.sisprom.framework.dominio;

public class Diagnostico {
	private String codigoDiagnostico;
	private String codigoConsulta;
	private String descripcion;
	public Diagnostico(String codigoDiagnostico, String codigoConsulta,
			String descripcion) {
		super();
		this.codigoDiagnostico = codigoDiagnostico;
		this.codigoConsulta = codigoConsulta;
		this.descripcion = descripcion;
	}
	public String getCodigoDiagnostico() {
		return codigoDiagnostico;
	}
	public void setCodigoDiagnostico(String codigoDiagnostico) {
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
	
}
