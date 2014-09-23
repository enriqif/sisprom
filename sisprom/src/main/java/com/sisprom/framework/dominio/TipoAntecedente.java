package com.sisprom.framework.dominio;

public class TipoAntecedente {
	private int codigoTipoAntecedente;
	private String nombre;
	private String descripcion;
	private Auditoria auditoria;

	
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
	
}
