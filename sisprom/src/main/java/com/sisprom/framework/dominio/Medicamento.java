package com.sisprom.framework.dominio;

public class Medicamento {
	private String codigoMedicamento;
	private String nombre;
	private String descripcion;
	public Medicamento(String codigoMedicamento, String nombre,
			String descripcion) {
		super();
		this.codigoMedicamento = codigoMedicamento;
		this.nombre = nombre;
		this.descripcion = descripcion;
	}
	public String getCodigoMedicamento() {
		return codigoMedicamento;
	}
	public void setCodigoMedicamento(String codigoMedicamento) {
		this.codigoMedicamento = codigoMedicamento;
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
