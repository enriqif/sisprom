package com.sisprom.framework.dominio;

// Generated 11-feb-2015 11:06:52 by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Diagnostico generated by hbm2java
 */
public class Diagnostico implements java.io.Serializable {

	private int diagnosticoId;
	private Consulta consulta;
	private String diagnosticoDescripcion;
	private String usuarioCreacion;
	private Date fechaCreacion;
	private String usuarioModificacion;
	private Date fechaModificacion;
	private Set tratamientos = new HashSet(0);

	public Diagnostico() {
	}

	public Diagnostico(int diagnosticoId) {
		this.diagnosticoId = diagnosticoId;
	}

	

	public Diagnostico(int diagnosticoId, Consulta consulta,
			String diagnosticoDescripcion, String usuarioCreacion,
			Date fechaCreacion, String usuarioModificacion,
			Date fechaModificacion) {
		super();
		this.diagnosticoId = diagnosticoId;
		this.consulta = consulta;
		this.diagnosticoDescripcion = diagnosticoDescripcion;
		this.usuarioCreacion = usuarioCreacion;
		this.fechaCreacion = fechaCreacion;
		this.usuarioModificacion = usuarioModificacion;
		this.fechaModificacion = fechaModificacion;
	}

	public int getDiagnosticoId() {
		return this.diagnosticoId;
	}

	public void setDiagnosticoId(int diagnosticoId) {
		this.diagnosticoId = diagnosticoId;
	}

	public Consulta getConsulta() {
		return this.consulta;
	}

	public void setConsulta(Consulta consulta) {
		this.consulta = consulta;
	}

	public String getDiagnosticoDescripcion() {
		return this.diagnosticoDescripcion;
	}

	public void setDiagnosticoDescripcion(String diagnosticoDescripcion) {
		this.diagnosticoDescripcion = diagnosticoDescripcion;
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

	public Set getTratamientos() {
		return this.tratamientos;
	}

	public void setTratamientos(Set tratamientos) {
		this.tratamientos = tratamientos;
	}

}