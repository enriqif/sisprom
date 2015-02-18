package com.sisprom.framework.dominio;

// Generated 11-feb-2015 11:06:52 by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Permiso generated by hbm2java
 */
public class Permiso implements java.io.Serializable {

	private int permisoId;
	private String permisoNombre;
	private String permisoPermiso;
	private String permisoDescripcion;
	private Date fechaCreacion;
	private Date fechaModificacion;
	private String usuarioCreacion;
	private String usuarioModificacion;
	private Set usuarios = new HashSet(0);

	public Permiso() {
	}

	public Permiso(int permisoId) {
		this.permisoId = permisoId;
	}


	public Permiso(int permisoId, String permisoNombre, String permisoPermiso,
			String permisoDescripcion, Date fechaCreacion,
			Date fechaModificacion, String usuarioCreacion,
			String usuarioModificacion) {
		super();
		this.permisoId = permisoId;
		this.permisoNombre = permisoNombre;
		this.permisoPermiso = permisoPermiso;
		this.permisoDescripcion = permisoDescripcion;
		this.fechaCreacion = fechaCreacion;
		this.fechaModificacion = fechaModificacion;
		this.usuarioCreacion = usuarioCreacion;
		this.usuarioModificacion = usuarioModificacion;
	}

	public int getPermisoId() {
		return this.permisoId;
	}

	public void setPermisoId(int permisoId) {
		this.permisoId = permisoId;
	}

	public String getPermisoNombre() {
		return this.permisoNombre;
	}

	public void setPermisoNombre(String permisoNombre) {
		this.permisoNombre = permisoNombre;
	}

	public String getPermisoPermiso() {
		return this.permisoPermiso;
	}

	public void setPermisoPermiso(String permisoPermiso) {
		this.permisoPermiso = permisoPermiso;
	}

	public String getPermisoDescripcion() {
		return this.permisoDescripcion;
	}

	public void setPermisoDescripcion(String permisoDescripcion) {
		this.permisoDescripcion = permisoDescripcion;
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

	public Set getUsuarios() {
		return this.usuarios;
	}

	public void setUsuarios(Set usuarios) {
		this.usuarios = usuarios;
	}

}
