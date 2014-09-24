package com.sisprom.framework.dominio;

import java.sql.Date;

public class Medico extends Persona{
	private String matricula;
	private String especialidad;
	private Date horarioAtencionMin;
	private Date horarioAtencionMax;
		
	
	public Medico(int id, String nombre, String apellido, String direccion,
			String telefono, String dni, String usuario, String contrasenia,
			Auditoria auditoria, String matricula, String especialidad,
			Date horarioAtencionMin, Date horarioAtencionMax) {
		super(id, nombre, apellido, direccion, telefono, dni, usuario,
				contrasenia, auditoria);
		this.matricula = matricula;
		this.especialidad = especialidad;
		this.horarioAtencionMin = horarioAtencionMin;
		this.horarioAtencionMax = horarioAtencionMax;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getEspecialidad() {
		return especialidad;
	}
	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
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
