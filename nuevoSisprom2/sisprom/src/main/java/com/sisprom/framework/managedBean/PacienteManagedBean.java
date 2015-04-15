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
	
	public String nuevo(){
		try {
			paciente.setFechaCreacion(null);
			paciente.setPacienteSexo("M");
			paciente.setUsuarioCreacion("eflores");
			paciente.setPacienteEstadoCivil("soltero");
			paciente.setUsuarioModificacion(null);
			paciente.setFechaModificacion(null);
			paciente.setHistoriaClinicas(null);
			paciente.setPacienteFechaNacimiento(null);
			super.getServices().savePaciente(paciente);
			return "hecho";			
		} catch (Exception e) {
			//TODO
			//Se debe definir la vista cuando se produce un error
			return "errorGuardado";
		}
	}
	
}
