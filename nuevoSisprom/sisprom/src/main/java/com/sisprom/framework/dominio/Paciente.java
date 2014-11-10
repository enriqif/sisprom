package com.sisprom.framework.dominio;

import java.util.HashSet;
import java.util.Set;

public class Paciente extends Persona{
	private String obraSocial;
	private String edad;
	private Set turnoMap = new HashSet(0);
	private Set historiaClinicaMap = new HashSet(0);

	
	public Paciente(int id, String nombre, String apellido, String direccion,
			String telefono, String dni, Auditoria auditoria,
			String obraSocial, String edad) {
		super(id, nombre, apellido, direccion, telefono, dni, auditoria);
		this.obraSocial = obraSocial;
		this.edad = edad;
	}
	public String getObraSocial() {
		return obraSocial;
	}
	public void setObraSocial(String obraSocial) {
		this.obraSocial = obraSocial;
	}
	public String getEdad() {
		return edad;
	}
	public void setEdad(String edad) {
		this.edad = edad;
	}
	public Set getTurnoMap() {
		return turnoMap;
	}
	public void setTurnoMap(Set turnoMap) {
		this.turnoMap = turnoMap;
	}
	public Set getHistoriaClinicaMap() {
		return historiaClinicaMap;
	}
	public void setHistoriaClinicaMap(Set historiaClinicaMap) {
		this.historiaClinicaMap = historiaClinicaMap;
	}

	
}
