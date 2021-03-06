package com.sisprom.framework.dominio;

// Generated 11-feb-2015 11:06:52 by Hibernate Tools 3.4.0.CR1

import java.util.Date;

/**
 * AntecedentePerPatologico generated by hbm2java
 */
public class AntecedentePerPatologico implements java.io.Serializable {

	private int antecedentePerPatId;
	private DetallePatologia detallePatologia;
	private HistoriaClinica historiaClinica;
	private String antecedentePerNombre;
	private String antecedentePerDescripcion;
	private String usuarioCreacion;
	private Date fechaCreacion;
	private String usuarioModificacion;
	private Date fechaModificacion;

	public AntecedentePerPatologico() {
	}

	public AntecedentePerPatologico(int antecedentePerPatId) {
		this.antecedentePerPatId = antecedentePerPatId;
	}

	public AntecedentePerPatologico(int antecedentePerPatId,
			DetallePatologia detallePatologia, HistoriaClinica historiaClinica,
			String antecedentePerNombre, String antecedentePerDescripcion,
			String usuarioCreacion, Date fechaCreacion,
			String usuarioModificacion, Date fechaModificacion) {
		this.antecedentePerPatId = antecedentePerPatId;
		this.detallePatologia = detallePatologia;
		this.historiaClinica = historiaClinica;
		this.antecedentePerNombre = antecedentePerNombre;
		this.antecedentePerDescripcion = antecedentePerDescripcion;
		this.usuarioCreacion = usuarioCreacion;
		this.fechaCreacion = fechaCreacion;
		this.usuarioModificacion = usuarioModificacion;
		this.fechaModificacion = fechaModificacion;
	}

	public int getAntecedentePerPatId() {
		return this.antecedentePerPatId;
	}

	public void setAntecedentePerPatId(int antecedentePerPatId) {
		this.antecedentePerPatId = antecedentePerPatId;
	}

	public DetallePatologia getDetallePatologia() {
		return this.detallePatologia;
	}

	public void setDetallePatologia(DetallePatologia detallePatologia) {
		this.detallePatologia = detallePatologia;
	}

	public HistoriaClinica getHistoriaClinica() {
		return this.historiaClinica;
	}

	public void setHistoriaClinica(HistoriaClinica historiaClinica) {
		this.historiaClinica = historiaClinica;
	}

	public String getAntecedentePerNombre() {
		return this.antecedentePerNombre;
	}

	public void setAntecedentePerNombre(String antecedentePerNombre) {
		this.antecedentePerNombre = antecedentePerNombre;
	}

	public String getAntecedentePerDescripcion() {
		return this.antecedentePerDescripcion;
	}

	public void setAntecedentePerDescripcion(String antecedentePerDescripcion) {
		this.antecedentePerDescripcion = antecedentePerDescripcion;
	}

	public String getUsuarioCreacion() {
		return this.usuarioCreacion;
	}

	public void setUsuarioCreacion(String usuarioCreacion) {
		this.usuarioCreacion = usuarioCreacion;
	}

	public Date getFechaCreacion() {
		return this.fechaCreacion;
	}

	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public String getUsuarioModificacion() {
		return this.usuarioModificacion;
	}

	public void setUsuarioModificacion(String usuarioModificacion) {
		this.usuarioModificacion = usuarioModificacion;
	}

	public Date getFechaModificacion() {
		return this.fechaModificacion;
	}

	public void setFechaModificacion(Date fechaModificacion) {
		this.fechaModificacion = fechaModificacion;
	}

}
