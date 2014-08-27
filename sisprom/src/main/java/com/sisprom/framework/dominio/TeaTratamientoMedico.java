package com.sisprom.framework.dominio;

public class TeaTratamientoMedico {
	private String codigoTratamientoMedico;
	private String codigoTratamiento;
	private String codigoMedicamento;
	
	public TeaTratamientoMedico(String codigoTratamientoMedico,
			String codigoTratamiento, String codigoMedicamento) {
		super();
		this.codigoTratamientoMedico = codigoTratamientoMedico;
		this.codigoTratamiento = codigoTratamiento;
		this.codigoMedicamento = codigoMedicamento;
	}
	public String getCodigoTratamientoMedico() {
		return codigoTratamientoMedico;
	}
	public void setCodigoTratamientoMedico(String codigoTratamientoMedico) {
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
	
}
