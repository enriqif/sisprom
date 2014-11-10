package com.sisprom.framework.dominio;

import java.util.HashSet;
import java.util.Set;

public class HistoriaClinica {
	private int codigoHistoriaClinica;
//	private String codigoMedico;
//	private String codigoPaciente;
	private String descripcion;
	private Auditoria auditoria;

	private Paciente paciente;
	private Medico medico;
	private Set antecedenteMap = new HashSet(0);
	private Set consultaMap = new HashSet(0);

	
	
	public HistoriaClinica(int codigoHistoriaClinica, String descripcion,
			Auditoria auditoria, Paciente paciente, Medico medico) {
		super();
		this.codigoHistoriaClinica = codigoHistoriaClinica;
		this.descripcion = descripcion;
		this.auditoria = auditoria;
		this.paciente = paciente;
		this.medico = medico;
	}
	
	
	
	public HistoriaClinica(int codigoHistoriaClinica, String descripcion,
			Auditoria auditoria) {
		super();
		this.codigoHistoriaClinica = codigoHistoriaClinica;
		this.descripcion = descripcion;
		this.auditoria = auditoria;
	}



	public int getCodigoHistoriaClinica() {
		return codigoHistoriaClinica;
	}
	public void setCodigoHistoriaClinica(int codigoHistoriaClinica) {
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
	public Paciente getPaciente() {
		return paciente;
	}
	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}
	public Medico getMedico() {
		return medico;
	}
	public void setMedico(Medico medico) {
		this.medico = medico;
	}

	public Set getAntecedenteMap() {
		return antecedenteMap;
	}
	public void setAntecedenteMap(Set antecedenteMap) {
		this.antecedenteMap = antecedenteMap;
	}
	public Set getConsultaMap() {
		return consultaMap;
	}
	public void setConsultaMap(Set consultaMap) {
		this.consultaMap = consultaMap;
	}
	
	
}
