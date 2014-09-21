package com.sisprom.framework.dominio;

import java.util.Date;

public class Secretaria extends Persona{
	private Date horarioAtencionMin;
	private Date horarioAtencionMax;

	public Secretaria(int id, String nombre, String apellido, String direccion,
			String telefono, String dni, Auditoria auditoria,
			Date horarioAtencionMin, Date horarioAtencionMax) {
		super(id, nombre, apellido, direccion, telefono, dni, auditoria);
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
	
	
	
}
