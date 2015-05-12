package com.sisprom.framework.dominio;

// Generated 11-feb-2015 11:06:52 by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Paciente generated by hbm2java
 */
public class Paciente implements java.io.Serializable {

	private int pacienteId;
	private String pacienteNombre;
	private String pacienteApellido;
	private String pacienteDni;
	private String pacienteTelefono;
	private String pacienteDomicilioCalle;
	private String pacienteObraSocial;
	private String pacienteEdad;
	private String usuarioCreacion;
	private Date fechaCreacion;
	private String usuarioModificacion;
	private Date fechaModificacion;
	private String pacienteEstadoCivil;
	private Date pacienteFechaNacimiento;
	private String pacienteSexo;
	private String pacienteLugarNacimiento;
	private String pacienteProfesion;
	private String pacienteNumeroAfiliado;
	private String pacienteDomicilioNumero;
	private String pacienteDomicilioBarrio;
	private Set historiaClinicas = new HashSet(0);
	private Set turnos = new HashSet(0);
	private Boolean pacienteVisible;
	public Paciente() {
	}

	public Paciente(int pacienteId) {
		this.pacienteId = pacienteId;
	}



	public Paciente(int pacienteId, String pacienteNombre,
			String pacienteApellido, String pacienteDni,
			String pacienteTelefono, String pacienteDomicilioCalle,
			String pacienteObraSocial, String pacienteEdad,
			String usuarioCreacion, Date fechaCreacion,
			String usuarioModificacion, Date fechaModificacion,
			String pacienteEstadoCivil, Date pacienteFechaNacimiento,
			String pacienteSexo, String pacienteLugarNacimiento,
			String pacienteProfesion, String pacienteNumeroAfiliado,
			String pacienteDomicilioNumero, String pacienteDomicilioBarrio) {
		super();
		this.pacienteId = pacienteId;
		this.pacienteNombre = pacienteNombre;//check
		this.pacienteApellido = pacienteApellido;//check
		this.pacienteDni = pacienteDni;//check
		this.pacienteTelefono = pacienteTelefono;//check
		this.pacienteDomicilioCalle = pacienteDomicilioCalle;//check
		this.pacienteObraSocial = pacienteObraSocial;//check
		this.pacienteEdad = pacienteEdad;//check
		this.usuarioCreacion = usuarioCreacion;//check
		this.fechaCreacion = fechaCreacion;//check
		//TODO: usuarioModificacion, ver mas adelante
		this.usuarioModificacion = usuarioModificacion;//check
		this.fechaModificacion = fechaModificacion;//check
		this.pacienteEstadoCivil = pacienteEstadoCivil;//check
		this.pacienteFechaNacimiento = pacienteFechaNacimiento;//check
		this.pacienteSexo = pacienteSexo;//check
		this.pacienteLugarNacimiento = pacienteLugarNacimiento;//check
		this.pacienteProfesion = pacienteProfesion;//check
		this.pacienteNumeroAfiliado = pacienteNumeroAfiliado;//check
		this.pacienteDomicilioNumero = pacienteDomicilioNumero;//check
		this.pacienteDomicilioBarrio = pacienteDomicilioBarrio;//check
	}

	public int getPacienteId() {
		return this.pacienteId;
	}

	public void setPacienteId(int pacienteId) {
		this.pacienteId = pacienteId;
	}

	public String getPacienteNombre() {
		return this.pacienteNombre;
	}

	public void setPacienteNombre(String pacienteNombre) {
		this.pacienteNombre = pacienteNombre;
	}

	public String getPacienteApellido() {
		return this.pacienteApellido;
	}

	public void setPacienteApellido(String pacienteApellido) {
		this.pacienteApellido = pacienteApellido;
	}

	public String getPacienteDni() {
		return this.pacienteDni;
	}

	public void setPacienteDni(String pacienteDni) {
		this.pacienteDni = pacienteDni;
	}

	public String getPacienteTelefono() {
		return this.pacienteTelefono;
	}

	public void setPacienteTelefono(String pacienteTelefono) {
		this.pacienteTelefono = pacienteTelefono;
	}

	public String getPacienteDomicilioCalle() {
		return this.pacienteDomicilioCalle;
	}

	public void setPacienteDomicilioCalle(String pacienteDomicilioCalle) {
		this.pacienteDomicilioCalle = pacienteDomicilioCalle;
	}

	public String getPacienteObraSocial() {
		return this.pacienteObraSocial;
	}

	public void setPacienteObraSocial(String pacienteObraSocial) {
		this.pacienteObraSocial = pacienteObraSocial;
	}

	public String getPacienteEdad() {
		return this.pacienteEdad;
	}

	public void setPacienteEdad(String pacienteEdad) {
		this.pacienteEdad = pacienteEdad;
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

	public String getPacienteEstadoCivil() {
		return this.pacienteEstadoCivil;
	}

	public void setPacienteEstadoCivil(String pacienteEstadoCivil) {
		this.pacienteEstadoCivil = pacienteEstadoCivil;
	}

	public Date getPacienteFechaNacimiento() {
		return this.pacienteFechaNacimiento;
	}

	public void setPacienteFechaNacimiento(Date pacienteFechaNacimiento) {
		this.pacienteFechaNacimiento = pacienteFechaNacimiento;
	}

	public String getPacienteSexo() {
		return this.pacienteSexo;
	}

	public void setPacienteSexo(String pacienteSexo) {
		this.pacienteSexo = pacienteSexo;
	}

	public String getPacienteLugarNacimiento() {
		return this.pacienteLugarNacimiento;
	}

	public void setPacienteLugarNacimiento(String pacienteLugarNacimiento) {
		this.pacienteLugarNacimiento = pacienteLugarNacimiento;
	}

	public String getPacienteProfesion() {
		return this.pacienteProfesion;
	}

	public void setPacienteProfesion(String pacienteProfesion) {
		this.pacienteProfesion = pacienteProfesion;
	}

	public String getPacienteNumeroAfiliado() {
		return this.pacienteNumeroAfiliado;
	}

	public void setPacienteNumeroAfiliado(String pacienteNumeroAfiliado) {
		this.pacienteNumeroAfiliado = pacienteNumeroAfiliado;
	}

	public String getPacienteDomicilioNumero() {
		return this.pacienteDomicilioNumero;
	}

	public void setPacienteDomicilioNumero(String pacienteDomicilioNumero) {
		this.pacienteDomicilioNumero = pacienteDomicilioNumero;
	}

	public String getPacienteDomicilioBarrio() {
		return this.pacienteDomicilioBarrio;
	}

	public void setPacienteDomicilioBarrio(String pacienteDomicilioBarrio) {
		this.pacienteDomicilioBarrio = pacienteDomicilioBarrio;
	}

	public Set getHistoriaClinicas() {
		return this.historiaClinicas;
	}

	public void setHistoriaClinicas(Set historiaClinicas) {
		this.historiaClinicas = historiaClinicas;
	}

	public Set getTurnos() {
		return this.turnos;
	}

	public void setTurnos(Set turnos) {
		this.turnos = turnos;
	}

	public Boolean getPacienteVisible() {
		return pacienteVisible;
	}

	public void setPacienteVisible(Boolean pacienteVisible) {
		this.pacienteVisible = pacienteVisible;
	}

}
