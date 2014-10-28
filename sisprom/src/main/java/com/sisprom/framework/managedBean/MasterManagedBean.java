package com.sisprom.framework.managedBean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.sisprom.framework.dominio.Antecedente;
import com.sisprom.framework.dominio.Auditoria;
import com.sisprom.framework.dominio.Consulta;
import com.sisprom.framework.dominio.Diagnostico;
import com.sisprom.framework.dominio.HistoriaClinica;
import com.sisprom.framework.dominio.Medicamento;
import com.sisprom.framework.dominio.Medico;
import com.sisprom.framework.dominio.Paciente;
import com.sisprom.framework.dominio.Secretaria;
import com.sisprom.framework.dominio.TeaTratamientoMedicamento;
import com.sisprom.framework.dominio.TipoAntecedente;
import com.sisprom.framework.dominio.Tratamiento;
import com.sisprom.framework.dominio.Turno;
import com.sisprom.framework.model.services.Services;
import com.sisprom.framework.model.xml.context.Context;

@ManagedBean
@SessionScoped
public class MasterManagedBean {

	private Services services = Context.getBeanFacade();

	public String redireccionar() {
		Auditoria audi = new Auditoria(null, null, null, null);
		Secretaria secre = new Secretaria(1, "sole", "camus", "Los ceibos",
				"32234242", "1232345", "usuario1", "pass1", audi, null, null);
		// services.saveSecretaria(secre);

		Medico medi = new Medico(1, "Mariana", "Alcon", "dir1", "tel1", "dni1",
				"usuario2", "pass2", audi, "matricula1", "especialidad1", null,
				null);
		// services.updateMedico(medi);

		Paciente pac = new Paciente(1, "Jenifer", "kenvinson", "dir23",
				"tel23", "dni23", audi, "obraSocial1", "23");
		// services.deletePaciente(pac);

		Turno turn = new Turno(2, null, null, audi, pac, secre);
		// services.deleteTurno(turn);

		TipoAntecedente tipoAnt = new TipoAntecedente(2, "TipoA2",
				"descripcion2X", audi);
		// services.saveTipoAntecedente(tipoAnt);

		HistoriaClinica histC = new HistoriaClinica(1, "descripHC3x", audi,
				pac, medi);
		// services.saveHistoriaClinica(histC);

		Antecedente antec = new Antecedente(2, "descr22", audi, tipoAnt, histC);
		// services.saveAntecedente(antec);

		Medicamento medito = new Medicamento(1, "NomMedito", "Desc41", audi);
		// services.saveMedicamento(medito);

		Consulta cons = new Consulta(1, "descri61x", audi, histC);
		// services.deleteConsulta(cons);

		Diagnostico diag = new Diagnostico(2, "descri73x", audi, cons);
		// services.saveDiagnostico(diag);

		Tratamiento trata = new Tratamiento(2, "Trata2", "descr52x", audi, diag);
		// services.saveTratamiento(trata);

		TeaTratamientoMedicamento tea = new TeaTratamientoMedicamento(2, audi,
				trata, medito);
		//services.updateTeaTratamientoMedicamento(tea);
		return "segundaPagina";

	}

	public Services getServices() {
		return services;
	}

	public void setServices(Services services) {
		this.services = services;
	}

}
