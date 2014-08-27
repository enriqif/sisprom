package com.sisprom.framework.dominio;

import java.sql.Time;
import java.util.Date;

public class Turno {
	private String codigoTurno;
	private String codigoPaciente;
	private String codigoSecretaria;
	private Date fecha;
	private Time hora;
	
	public Turno(String codigoTurno, String codigoPaciente,
			String codigoSecretaria, Date fecha, Time hora) {
		super();
		this.codigoTurno = codigoTurno;
		this.codigoPaciente = codigoPaciente;
		this.codigoSecretaria = codigoSecretaria;
		this.fecha = fecha;
		this.hora = hora;
	}
	public String getCodigoTurno() {
		return codigoTurno;
	}
	public void setCodigoTurno(String codigoTurno) {
		this.codigoTurno = codigoTurno;
	}
	public String getCodigoPaciente() {
		return codigoPaciente;
	}
	public void setCodigoPaciente(String codigoPaciente) {
		this.codigoPaciente = codigoPaciente;
	}
	public String getCodigoSecretaria() {
		return codigoSecretaria;
	}
	public void setCodigoSecretaria(String codigoSecretaria) {
		this.codigoSecretaria = codigoSecretaria;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public Time getHora() {
		return hora;
	}
	public void setHora(Time hora) {
		this.hora = hora;
	}
	
}
