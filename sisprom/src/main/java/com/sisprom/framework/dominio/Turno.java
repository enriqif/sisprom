package com.sisprom.framework.dominio;

import java.sql.Time;
import java.util.Date;

public class Turno {
	private int codigoTurno;
	//private int codigoPaciente;
	//private int codigoSecretaria;
	private Date fecha;
	private Date hora;
	private Auditoria auditoria;

	private Paciente paciente;
	private Secretaria secretaria;
	



	public Turno(int codigoTurno, Date fecha, Date hora, Auditoria auditoria,
			Paciente paciente, Secretaria secretaria) {
		super();
		this.codigoTurno = codigoTurno;
		this.fecha = fecha;
		this.hora = hora;
		this.auditoria = auditoria;
		this.paciente = paciente;
		this.secretaria = secretaria;
	}
	public int getCodigoTurno() {
		return codigoTurno;
	}
	public void setCodigoTurno(int codigoTurno) {
		this.codigoTurno = codigoTurno;
	}
	
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public Date getHora() {
		return hora;
	}
	public void setHora(Date hora) {
		this.hora = hora;
	}
	public Auditoria getAuditoria() {
		return auditoria;
	}
	public void setAuditoria(Auditoria auditoria) {
		this.auditoria = auditoria;
	}
	public Paciente getPaciente() {
		return paciente;
	}
	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}
	public Secretaria getSecretaria() {
		return secretaria;
	}
	public void setSecretaria(Secretaria secretaria) {
		this.secretaria = secretaria;
	}
	
	
}
