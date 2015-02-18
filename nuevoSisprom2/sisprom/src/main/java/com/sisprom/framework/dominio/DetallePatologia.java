package com.sisprom.framework.dominio;

// Generated 11-feb-2015 11:06:52 by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * DetallePatologia generated by hbm2java
 */
public class DetallePatologia implements java.io.Serializable {

	private int detallePatId;
	private Patologia patologia;
	private String detallePatNombre;
	private String detallePatDescripcion;
	private Date fechaCreacion;
	private Date fechaModificacion;
	private String usuarioCreacion;
	private String usuarioModificacion;
	private Set antecedentePerPatologicos = new HashSet(0);

	public DetallePatologia() {
	}

	public DetallePatologia(int detallePatId) {
		this.detallePatId = detallePatId;
	}


	public DetallePatologia(int detallePatId, Patologia patologia,
			String detallePatNombre, String detallePatDescripcion,
			Date fechaCreacion, Date fechaModificacion, String usuarioCreacion,
			String usuarioModificacion) {
		super();
		this.detallePatId = detallePatId;
		this.patologia = patologia;
		this.detallePatNombre = detallePatNombre;
		this.detallePatDescripcion = detallePatDescripcion;
		this.fechaCreacion = fechaCreacion;
		this.fechaModificacion = fechaModificacion;
		this.usuarioCreacion = usuarioCreacion;
		this.usuarioModificacion = usuarioModificacion;
	}

	public int getDetallePatId() {
		return this.detallePatId;
	}

	public void setDetallePatId(int detallePatId) {
		this.detallePatId = detallePatId;
	}

	public Patologia getPatologia() {
		return this.patologia;
	}

	public void setPatologia(Patologia patologia) {
		this.patologia = patologia;
	}

	public String getDetallePatNombre() {
		return this.detallePatNombre;
	}

	public void setDetallePatNombre(String detallePatNombre) {
		this.detallePatNombre = detallePatNombre;
	}

	public String getDetallePatDescripcion() {
		return this.detallePatDescripcion;
	}

	public void setDetallePatDescripcion(String detallePatDescripcion) {
		this.detallePatDescripcion = detallePatDescripcion;
	}

	public Date getFechaCreacion() {
		return this.fechaCreacion;
	}

	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public Date getFechaModificacion() {
		return this.fechaModificacion;
	}

	public void setFechaModificacion(Date fechaModificacion) {
		this.fechaModificacion = fechaModificacion;
	}

	public String getUsuarioCreacion() {
		return this.usuarioCreacion;
	}

	public void setUsuarioCreacion(String usuarioCreacion) {
		this.usuarioCreacion = usuarioCreacion;
	}

	public String getUsuarioModificacion() {
		return this.usuarioModificacion;
	}

	public void setUsuarioModificacion(String usuarioModificacion) {
		this.usuarioModificacion = usuarioModificacion;
	}

	public Set getAntecedentePerPatologicos() {
		return this.antecedentePerPatologicos;
	}

	public void setAntecedentePerPatologicos(Set antecedentePerPatologicos) {
		this.antecedentePerPatologicos = antecedentePerPatologicos;
	}

}
