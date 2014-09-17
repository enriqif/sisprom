package com.sisprom.framework.dominio;

import java.sql.Time;

public class Secretaria extends Persona{
	private Time horarioAtencionMin;
	private Time horarioAtencionMax;
	
	
	
	public Secretaria(int id, String nombre, String apellido, String direccion,
			String telefono, String dni,
			Time horarioAtencionMin, Time horarioAtencionMax, Auditoria auditoria) {
		super(id, nombre, apellido, direccion, telefono, dni, auditoria);
		this.horarioAtencionMin = horarioAtencionMin;
		this.horarioAtencionMax = horarioAtencionMax;
	}
	public Time getHorarioAtencionMin() {
		return horarioAtencionMin;
	}
	public void setHorarioAtencionMin(Time horarioAtencionMin) {
		this.horarioAtencionMin = horarioAtencionMin;
	}
	public Time getHorarioAtencionMax() {
		return horarioAtencionMax;
	}
	public void setHorarioAtencionMax(Time horarioAtencionMax) {
		this.horarioAtencionMax = horarioAtencionMax;
	}

}
