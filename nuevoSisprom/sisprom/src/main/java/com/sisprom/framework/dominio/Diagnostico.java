package com.sisprom.framework.dominio;

import java.util.HashSet;
import java.util.Set;

public class Diagnostico {
	private int codigoDiagnostico;
	//private String codigoConsulta;
	private String descripcion;
	private Auditoria auditoria;
	
	private Consulta consulta;
	private Set tratamientoMap = new HashSet(0);
		
	
	public Diagnostico(int codigoDiagnostico, String descripcion,
			Auditoria auditoria, Consulta consulta) {
		super();
		this.codigoDiagnostico = codigoDiagnostico;
		this.descripcion = descripcion;
		this.auditoria = auditoria;
		this.consulta = consulta;
	}



	public int getCodigoDiagnostico() {
		return codigoDiagnostico;
	}
	public void setCodigoDiagnostico(int codigoDiagnostico) {
		this.codigoDiagnostico = codigoDiagnostico;
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
	public Consulta getConsulta() {
		return consulta;
	}
	public void setConsulta(Consulta consulta) {
		this.consulta = consulta;
	}
	public Set getTratamientoMap() {
		return tratamientoMap;
	}
	public void setTratamientoMap(Set tratamientoMap) {
		this.tratamientoMap = tratamientoMap;
	}
	
}
