package com.sisprom.framework.dominio;

public class TipoAntecedente {
	private String codigoTipoAntecedente;
	private String nombre;
	private String descripcion;
	public TipoAntecedente(String codigoTipoAntecedente, String nombre,
			String descripcion) {
		super();
		this.codigoTipoAntecedente = codigoTipoAntecedente;
		this.nombre = nombre;
		this.descripcion = descripcion;
	}
	public String getCodigoTipoAntecedente() {
		return codigoTipoAntecedente;
	}
	public void setCodigoTipoAntecedente(String codigoTipoAntecedente) {
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
	
}
