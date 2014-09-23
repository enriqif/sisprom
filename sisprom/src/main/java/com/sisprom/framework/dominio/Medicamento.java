package com.sisprom.framework.dominio;

public class Medicamento {
	private int codigoMedicamento;
	private String nombre;
	private String descripcion;
	private Auditoria auditoria;
	
	public Medicamento(int codigoMedicamento, String nombre,
			String descripcion, Auditoria auditoria) {
		super();
		this.codigoMedicamento = codigoMedicamento;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.auditoria = auditoria;
	}
	public int getCodigoMedicamento() {
		return codigoMedicamento;
	}
	public void setCodigoMedicamento(int codigoMedicamento) {
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
	public Auditoria getAuditoria() {
		return auditoria;
	}
	public void setAuditoria(Auditoria auditoria) {
		this.auditoria = auditoria;
	}
	
}
