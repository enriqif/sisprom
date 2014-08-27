package com.sisprom.framework.dominio;

import java.sql.Time;

public class Medico extends Persona{
	private String codigoMedico;
	private String matricula;
	private String especialidad;
	private Time horarioAtencionMin;
	private Time horarioAtencionMax;
	public Medico(String dni, String nombre, String apellido,
			StringBuilder direccion, String telefono, String codigoMedico,
			String matricula, String especialidad, Time horarioAtencionMin,
			Time horarioAtencionMax) {
		super(dni, nombre, apellido, direccion, telefono);
		this.codigoMedico = codigoMedico;
		this.matricula = matricula;
		this.especialidad = especialidad;
		this.horarioAtencionMin = horarioAtencionMin;
		this.horarioAtencionMax = horarioAtencionMax;
	}

	public String getCodigoMedico() {
		return codigoMedico;
	}
	public void setCodigoMedico(String codigoMedico) {
		this.codigoMedico = codigoMedico;
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
