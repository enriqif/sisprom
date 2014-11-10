package com.sisprom.framework.dominio;

import java.util.HashSet;
import java.util.Set;

public class Consulta {
	private int codigoConsulta;
	//private String codigoHistoriaClinica;
	private String descripcion;
	private Auditoria auditoria;
	
	private HistoriaClinica historiaClinica;
	private Set diagnosticoMap = new HashSet(0);

	
	public Consulta(int codigoConsulta, String descripcion, Auditoria auditoria) {
		super();
		this.codigoConsulta = codigoConsulta;
		this.descripcion = descripcion;
		this.auditoria = auditoria;
	}
	
	
	public Consulta(int codigoConsulta, String descripcion,
			Auditoria auditoria, HistoriaClinica historiaClinica) {
		super();
		this.codigoConsulta = codigoConsulta;
		this.descripcion = descripcion;
		this.auditoria = auditoria;
		this.historiaClinica = historiaClinica;
	}


	public int getCodigoConsulta() {
		return codigoConsulta;
	}
	public void setCodigoConsulta(int codigoConsulta) {
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
	public HistoriaClinica getHistoriaClinica() {
		return historiaClinica;
	}
	public void setHistoriaClinica(HistoriaClinica historiaClinica) {
		this.historiaClinica = historiaClinica;
	}
	public Set getDiagnosticoMap() {
		return diagnosticoMap;
	}
	public void setDiagnosticoMap(Set diagnosticoMap) {
		this.diagnosticoMap = diagnosticoMap;
	}
	
}
