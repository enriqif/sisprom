package com.sisprom.framework.dominio;

import java.sql.Time;

public class Secretaria extends Persona{
	private String codigoSecretaria;
	private Time horarioAtencionMin;
	private Time horarioAtencionMax;
	
	public Secretaria(String dni, String nombre, String apellido,
			StringBuilder direccion, String telefono, String codigoSecretaria,
			Time horarioAtencionMin, Time horarioAtencionMax) {
		super(dni, nombre, apellido, direccion, telefono);
		this.codigoSecretaria = codigoSecretaria;
		this.horarioAtencionMin = horarioAtencionMin;
		this.horarioAtencionMax = horarioAtencionMax;
	}

	public String getCodigoSecretaria() {
		return codigoSecretaria;
	}
	public void setCodigoSecretaria(String codigoSecretaria) {
		this.codigoSecretaria = codigoSecretaria;
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
