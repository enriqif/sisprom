package com.sisprom.framework.dominio;

// Generated 11-feb-2015 11:06:52 by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Consulta generated by hbm2java
 */
public class Consulta implements java.io.Serializable {

	private int consultaId;
	private HistoriaClinica historiaClinica;
	private String consultaDescripcion;
	private String usuarioCreacion;
	private Date fechaCreacion;
	private String usuarioModificacion;
	private Date fechaModificacion;
	private Date consultaFecha;
	private String consultaExamenFisico;
	private String consultaEvolucion;
	private Set diagnosticos = new HashSet(0);

	public Consulta() {
	}

	public Consulta(int consultaId) {
		this.consultaId = consultaId;
	}

	

	public Consulta(int consultaId, HistoriaClinica historiaClinica,
			String consultaDescripcion, String usuarioCreacion,
			Date fechaCreacion, String usuarioModificacion,
			Date fechaModificacion, Date consultaFecha,
			String consultaExamenFisico, String consultaEvolucion) {
		super();
		this.consultaId = consultaId;
		this.historiaClinica = historiaClinica;
		this.consultaDescripcion = consultaDescripcion;
		this.usuarioCreacion = usuarioCreacion;
		this.fechaCreacion = fechaCreacion;
		this.usuarioModificacion = usuarioModificacion;
		this.fechaModificacion = fechaModificacion;
		this.consultaFecha = consultaFecha;
		this.consultaExamenFisico = consultaExamenFisico;
		this.consultaEvolucion = consultaEvolucion;
	}

	public int getConsultaId() {
		return this.consultaId;
	}

	public void setConsultaId(int consultaId) {
		this.consultaId = consultaId;
	}

	public HistoriaClinica getHistoriaClinica() {
		return this.historiaClinica;
	}

	public void setHistoriaClinica(HistoriaClinica historiaClinica) {
		this.historiaClinica = historiaClinica;
	}

	public String getConsultaDescripcion() {
		return this.consultaDescripcion;
	}

	public void setConsultaDescripcion(String consultaDescripcion) {
		this.consultaDescripcion = consultaDescripcion;
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

	public Date getConsultaFecha() {
		return this.consultaFecha;
	}

	public void setConsultaFecha(Date consultaFecha) {
		this.consultaFecha = consultaFecha;
	}

	public String getConsultaExamenFisico() {
		return this.consultaExamenFisico;
	}

	public void setConsultaExamenFisico(String consultaExamenFisico) {
		this.consultaExamenFisico = consultaExamenFisico;
	}

	public String getConsultaEvolucion() {
		return this.consultaEvolucion;
	}

	public void setConsultaEvolucion(String consultaEvolucion) {
		this.consultaEvolucion = consultaEvolucion;
	}

	public Set getDiagnosticos() {
		return this.diagnosticos;
	}

	public void setDiagnosticos(Set diagnosticos) {
		this.diagnosticos = diagnosticos;
	}

}
