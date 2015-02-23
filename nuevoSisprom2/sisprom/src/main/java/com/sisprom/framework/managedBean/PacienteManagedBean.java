package com.sisprom.framework.managedBean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.sisprom.framework.dominio.Paciente;

@ManagedBean
@SessionScoped
public class PacienteManagedBean extends MasterManagedBean {

	private Paciente paciente = new Paciente();

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	
	
}
