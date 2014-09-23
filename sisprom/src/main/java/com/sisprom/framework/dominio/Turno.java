package com.sisprom.framework.dominio;

import java.sql.Time;
import java.util.Date;

public class Turno {
	private int codigoTurno;
	private int codigoPaciente;
	private int codigoSecretaria;
	private Date fecha;
	private Date hora;
	private Auditoria auditoria;

	
	public Turno(int codigoTurno, int codigoPaciente, int codigoSecretaria,
			Date fecha, Date hora, Auditoria auditoria) {
		super();
		this.codigoTurno = codigoTurno;
		this.codigoPaciente = codigoPaciente;
		this.codigoSecretaria = codigoSecretaria;
		this.fecha = fecha;
		this.hora = hora;
		this.auditoria = auditoria;
	}
	public int getCodigoTurno() {
		return codigoTurno;
	}
	public void setCodigoTurno(int codigoTurno) {
		this.codigoTurno = codigoTurno;
	}
	public int getCodigoPaciente() {
		return codigoPaciente;
	}
	public void setCodigoPaciente(int codigoPaciente) {
		this.codigoPaciente = codigoPaciente;
	}
	public int getCodigoSecretaria() {
		return codigoSecretaria;
	}
	public void setCodigoSecretaria(int codigoSecretaria) {
		this.codigoSecretaria = codigoSecretaria;
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
	
}
