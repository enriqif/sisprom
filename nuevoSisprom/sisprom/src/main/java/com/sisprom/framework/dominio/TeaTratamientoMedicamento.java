package com.sisprom.framework.dominio;

public class TeaTratamientoMedicamento {
	private int codigoTratamientoMedico;
	//private String codigoTratamiento;
	//private String codigoMedicamento;
	private Auditoria auditoria;
	
	private Tratamiento tratamiento;
	private Medicamento medicamento;

	
	
	public TeaTratamientoMedicamento(int codigoTratamientoMedico,
			Auditoria auditoria, Tratamiento tratamiento,
			Medicamento medicamento) {
		super();
		this.codigoTratamientoMedico = codigoTratamientoMedico;
		this.auditoria = auditoria;
		this.tratamiento = tratamiento;
		this.medicamento = medicamento;
	}

	public int getCodigoTratamientoMedico() {
		return codigoTratamientoMedico;
	}
	public void setCodigoTratamientoMedico(int codigoTratamientoMedico) {
		this.codigoTratamientoMedico = codigoTratamientoMedico;
	}
	public Auditoria getAuditoria() {
		return auditoria;
	}
	public void setAuditoria(Auditoria auditoria) {
		this.auditoria = auditoria;
	}
	public Tratamiento getTratamiento() {
		return tratamiento;
	}
	public void setTratamiento(Tratamiento tratamiento) {
		this.tratamiento = tratamiento;
	}
	public Medicamento getMedicamento() {
		return medicamento;
	}
	public void setMedicamento(Medicamento medicamento) {
		this.medicamento = medicamento;
	}
	
	
}
