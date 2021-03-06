package com.sisprom.framework.dominio;

// Generated 11-feb-2015 11:06:52 by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * HistoriaClinica generated by hbm2java
 */
public class HistoriaClinica implements java.io.Serializable {

	private int historiaClinicaId;
	private Paciente paciente;
	private Usuario usuario;
	private String usuarioCreacion;
	private Date fechaCreacion;
	private String usuarioModificacion;
	private Date fechaModificacion;
	private Set antecedenteGenerals = new HashSet(0);
	private Set consultas = new HashSet(0);
	private Set antecedentePerPatologicos = new HashSet(0);

	public HistoriaClinica() {
	}

	public HistoriaClinica(int historiaClinicaId) {
		this.historiaClinicaId = historiaClinicaId;
	}

	

	public HistoriaClinica(int historiaClinicaId, Paciente paciente,
			Usuario usuario, String usuarioCreacion, Date fechaCreacion,
			String usuarioModificacion, Date fechaModificacion) {
		super();
		this.historiaClinicaId = historiaClinicaId;
		this.paciente = paciente;
		this.usuario = usuario;
		this.usuarioCreacion = usuarioCreacion;
		this.fechaCreacion = fechaCreacion;
		this.usuarioModificacion = usuarioModificacion;
		this.fechaModificacion = fechaModificacion;
	}

	public int getHistoriaClinicaId() {
		return this.historiaClinicaId;
	}

	public void setHistoriaClinicaId(int historiaClinicaId) {
		this.historiaClinicaId = historiaClinicaId;
	}

	public Paciente getPaciente() {
		return this.paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public Usuario getUsuario() {
		return this.usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
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

	public Set getAntecedenteGenerals() {
		return this.antecedenteGenerals;
	}

	public void setAntecedenteGenerals(Set antecedenteGenerals) {
		this.antecedenteGenerals = antecedenteGenerals;
	}

	public Set getConsultas() {
		return this.consultas;
	}

	public void setConsultas(Set consultas) {
		this.consultas = consultas;
	}

	public Set getAntecedentePerPatologicos() {
		return this.antecedentePerPatologicos;
	}

	public void setAntecedentePerPatologicos(Set antecedentePerPatologicos) {
		this.antecedentePerPatologicos = antecedentePerPatologicos;
	}

}
