package com.sisprom.framework.dominio;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Secretaria extends Persona{
	private Date horarioAtencionMin;
	private Date horarioAtencionMax;

	private Set turnoMap = new HashSet(0);

	
	public Secretaria(int id, String nombre, String apellido, String direccion,
			String telefono, String dni, String usuario, String contrasenia,
			Auditoria auditoria, Date horarioAtencionMin,
			Date horarioAtencionMax) {
		super(id, nombre, apellido, direccion, telefono, dni, usuario,
				contrasenia, auditoria);
		this.horarioAtencionMin = horarioAtencionMin;
		this.horarioAtencionMax = horarioAtencionMax;
	}
	public Date getHorarioAtencionMin() {
		return horarioAtencionMin;
	}
	public void setHorarioAtencionMin(Date horarioAtencionMin) {
		this.horarioAtencionMin = horarioAtencionMin;
	}
	public Date getHorarioAtencionMax() {
		return horarioAtencionMax;
	}
	public void setHorarioAtencionMax(Date horarioAtencionMax) {
		this.horarioAtencionMax = horarioAtencionMax;
	}
	public Set getTurnoMap() {
		return turnoMap;
	}
	public void setTurnoMap(Set turnoMap) {
		this.turnoMap = turnoMap;
	}
	
	
}
