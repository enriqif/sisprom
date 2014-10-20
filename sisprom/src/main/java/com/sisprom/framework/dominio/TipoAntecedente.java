package com.sisprom.framework.dominio;

import java.util.HashSet;
import java.util.Set;

public class TipoAntecedente {
	private int codigoTipoAntecedente;
	private String nombre;
	private String descripcion;
	private Auditoria auditoria;
	private Set antecedenteMap = new HashSet(0);

	
	public TipoAntecedente(int codigoTipoAntecedente, String nombre,
			String descripcion, Auditoria auditoria) {
		super();
		this.codigoTipoAntecedente = codigoTipoAntecedente;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.auditoria = auditoria;
	}
	public int getCodigoTipoAntecedente() {
		return codigoTipoAntecedente;
	}
	public void setCodigoTipoAntecedente(int codigoTipoAntecedente) {
		this.codigoTipoAntecedente = codigoTipoAntecedente;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
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
	public Set getAntecedenteMap() {
		return antecedenteMap;
	}
	public void setAntecedenteMap(Set antecedenteMap) {
		this.antecedenteMap = antecedenteMap;
	}
	
}
