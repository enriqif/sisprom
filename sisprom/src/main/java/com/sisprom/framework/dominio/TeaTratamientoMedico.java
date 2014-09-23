package com.sisprom.framework.dominio;

public class TeaTratamientoMedico {
	private int codigoTratamientoMedico;
	private String codigoTratamiento;
	private String codigoMedicamento;
	private Auditoria auditoria;

	
	
	public TeaTratamientoMedico(int codigoTratamientoMedico,
			String codigoTratamiento, String codigoMedicamento,
			Auditoria auditoria) {
		super();
		this.codigoTratamientoMedico = codigoTratamientoMedico;
		this.codigoTratamiento = codigoTratamiento;
		this.codigoMedicamento = codigoMedicamento;
		this.auditoria = auditoria;
	}
	public int getCodigoTratamientoMedico() {
		return codigoTratamientoMedico;
	}
	public void setCodigoTratamientoMedico(int codigoTratamientoMedico) {
		this.codigoTratamientoMedico = codigoTratamientoMedico;
	}
	public String getCodigoTratamiento() {
		return codigoTratamiento;
	}
	public void setCodigoTratamiento(String codigoTratamiento) {
		this.codigoTratamiento = codigoTratamiento;
	}
	public String getCodigoMedicamento() {
		return codigoMedicamento;
	}
	public void setCodigoMedicamento(String codigoMedicamento) {
		this.codigoMedicamento = codigoMedicamento;
	}
	public Auditoria getAuditoria() {
		return auditoria;
	}
	public void setAuditoria(Auditoria auditoria) {
		this.auditoria = auditoria;
	}
	
	
}
